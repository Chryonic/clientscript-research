package mgi.tools.jagcsc.tokens;

public abstract class AbstractToken {

	
	/**
	 * String containing token data.
	 */
	private String data;
	
	public AbstractToken(String data)
	{
		this.data = data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}
	
	@Override
	public String toString()
	{
		return this.data;
	}
	
}
