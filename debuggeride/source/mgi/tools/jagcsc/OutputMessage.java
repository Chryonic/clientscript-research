	package mgi.tools.jagcsc;

	/**
	 * Small class containing message info.
	 */
	public class OutputMessage {
		/**
		 * Source file name which is associated with this message.
		 */
		public String sourceFile;
		/**
		 * Line number of source file which is associated with this message.
		 */
		public int line;
		/**
		 * Actual message.
		 */
		public String message;
		
		/**
		 * Creates message with no sourceFile and line info.
		 */
		public OutputMessage(String message) {
			this.message = message;
		}
		
		/**
		 * Creates full message with given info.
		 */
		public OutputMessage(String message,String sourceFile,int line)
		{
			this.message = message;
			this.sourceFile = sourceFile;
			this.line = line;
		}
		
		
		@Override
		public String toString()
		{
			if (this.sourceFile != null)
				return this.message + " (" + this.sourceFile + ":" + this.line + ")" + '\n';
			else
				return this.message + '\n';
		}
	}