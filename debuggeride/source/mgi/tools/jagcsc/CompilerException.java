package mgi.tools.jagcsc;

public class CompilerException extends Exception {

	private static final long serialVersionUID = 4847540547940793126L;

	public CompilerException(String string) {
		super(string);
	}
	
	public CompilerException(String string,Throwable t)
	{
		super(string,t);
	}

}
