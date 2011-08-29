/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ThreadSafeDiskBackedCache implements Runnable {
    private final DCyclicLinkedList queue = new DCyclicLinkedList();
    private Thread myThread;
    int remainingRequests = 0;
    private boolean stopped = false;

    final CacheDataRequest requestPut(DiskBackedCache cache, int id, byte[] data) {
        CacheDataRequest request = new CacheDataRequest();
        request.cache = cache;
        request.action = 2;
        ((DataRequest) request).aBoolean6238 = false;
        ((DoublyLinkedNode) request).id = (long) id;
        request.data = data;
        addRequest(request);
        return request;
    }

    final CacheDataRequest requestCacheAccess(int action, DiskBackedCache cache, int id) {
        CacheDataRequest request = new CacheDataRequest();
        request.cache = cache;
        request.action = action;
        ((DoublyLinkedNode) request).id = (long) id;
        ((DataRequest) request).aBoolean6238 = false;
        addRequest(request);
        return request;
    }

    final CacheDataRequest requestGet(DiskBackedCache cache, int id) {
        CacheDataRequest request = new CacheDataRequest();
        request.action = 1;
        synchronized (queue) {
            for (CacheDataRequest r = (CacheDataRequest) queue.getFirst(); r != null; r = ((CacheDataRequest) queue.getNext())) {
                if ((r.id == (long) id) && (r.cache) == cache && (r.action) == 2) {
                    ((DataRequest) request).inProcessing = false;
                    request.data = r.data;
                    return request;
                }
            }
        }
        request.data = cache.get(id);
        ((DataRequest) request).aBoolean6238 = true;
        ((DataRequest) request).inProcessing = false;
        return request;
    }

    public final void run() {
        while (!stopped) {
            CacheDataRequest dnode;
            synchronized (queue) {
                dnode = (CacheDataRequest) queue.remove();
                if (dnode != null)
                    this.remainingRequests--;
                else {
                    try {
                        queue.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                    continue;
                }
            }
            try {
                switch ((dnode.action)) {
                    case 2:
                        dnode.cache.put((int) (dnode.id), (dnode.data), (dnode.data).length);
                        break;
                    case 3:
                        dnode.data = (dnode.cache.get((int) (dnode.id)));
                        break;
                }
            } catch (Exception exception) {
                ErrorReporting.reportError(null, exception);
            }
            ((DataRequest) dnode).inProcessing = false;
        }
    }

    private void addRequest(CacheDataRequest request) {
        synchronized (queue) {
            queue.add(request);
            this.remainingRequests++;
            queue.notifyAll();
        }
    }

    final void shutdown() {
        stopped = true;
        synchronized (queue) {
            queue.notifyAll();
        }
        try {
            myThread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        myThread = null;
    }

    ThreadSafeDiskBackedCache(Signlink signlink) {
        SignlinkRequest signlinkRequest = signlink.requestThreadStart(this, 5);
        while (signlinkRequest.status == 0)
            Timing.sleep(10L);
        if (signlinkRequest.status == 2)
            throw new RuntimeException();
        myThread = (Thread) signlinkRequest.result;
    }
}
