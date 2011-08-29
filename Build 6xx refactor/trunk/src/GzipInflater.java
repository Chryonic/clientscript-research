/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.Inflater;

final class GzipInflater {
    private Inflater ourInflater;

    final byte[] decompress(byte[] input) {
        Packet inputPacket = new Packet(input);
        inputPacket.pos = input.length - 4;
        int size = inputPacket.g4i();
        byte[] output = new byte[size];
        inputPacket.pos = 0;
        inflate(output, inputPacket);
        return output;
    }

    final void inflate(byte[] output, Packet input) {
        if ((input.data[input.pos]) != 31 || (input.data[input.pos + 1]) != -117)
            throw new RuntimeException("Invalid GZIP header!");
        if (ourInflater == null)
            ourInflater = new Inflater(true);
        try {
            ourInflater.setInput(input.data, input.pos + 10, (input.data.length - 10 - input.pos - 8));
            ourInflater.inflate(output);
        } catch (Exception exception) {
            ourInflater.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        ourInflater.reset();
    }

    public GzipInflater() {
        this(-1, 1000000, 1000000);
    }

    private GzipInflater(int argument_11_, int argument_12_, int argument_13_) {
        /* empty */
    }

}
