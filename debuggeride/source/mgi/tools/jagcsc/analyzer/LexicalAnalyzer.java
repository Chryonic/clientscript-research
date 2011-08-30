package mgi.tools.jagcsc.analyzer;

import java.io.*;

import mgi.tools.jagcsc.Compiler;
import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.OutputMessage;
import mgi.tools.jagcsc.tokens.*;
import mgi.utilities.Bag;

/**
 * Lexical analyzer purpose is to scan the text in source file
 * and convert it to Atomic units.
 */
public class LexicalAnalyzer {

	/**
	 * Contains all readed tokens.
	 */
	public Bag<AbstractToken> tokens;
	/**
	 * Stream from which data is readed.
	 */
	public BufferedReader stream;
	

	public LexicalAnalyzer()
	{
		this.tokens = new Bag<AbstractToken>();
	}
	
	/**
	 * Analyzes given source file and fills tokens bag.
	 * @param sourceFile
	 * File from which tokens should be readed.
	 * @throws CompilerException
	 * If there's parsing error such as unterminated string or char tokens.
	 * @throws IOException
	 * If there's any i/o error or sourceFile is not existing or readable.
	 */
	public void analyze(File sourceFile) throws CompilerException,IOException
	{
		this.stream = new BufferedReader(new FileReader(sourceFile));
		if (!this.stream.markSupported())
			throw new CompilerException("Mark method is not available,updating java should solve this.");
		
		for (;;)
		{	
			/**
			 * Info is read char by char until end of stream is reached.
			 */
			int c = this.stream.read();
			if (c == -1)
				break;
			char rchar = (char)c;
			
			/**
			 * If current char is '"' it starts reading string constant
			 * it reads it until it is terminated by another '"'
			 */
			if (rchar == '"') // string token.
			{
				StringBuilder builder = new StringBuilder();
				for (;;)
				{
					int ca = this.stream.read();
					if (ca == -1)
						throw new CompilerException("Unterminated string - " + builder.toString());
					char caa = (char)ca;
					if (caa == '"')
						break;
					builder.append(caa);
				}
				this.tokens.Put(new StringToken(builder.toString()));
			}
			/**
			 * If current char is "'" it starts reading char constant
			 * it reads it until it is terminated by another "'"
			 */
			else if (rchar == new String("'").charAt(0)) // char token
			{
				StringBuilder builder = new StringBuilder();
				for (;;)
				{
					int ca = this.stream.read();
					if (ca == -1)
						throw new CompilerException("Unterminated character - " + builder.toString());
					char caa = (char)ca;
					if (caa == new String("'").charAt(0))
						break;
					builder.append(caa);
				}
				this.tokens.Put(new CharToken(builder.toString()));
			}
			/**
			 * If current char starts with number
			 * it reads it until it encounters char which is not letter
			 * and not number.
			 */
			else if (isNumber(rchar))
			{
				StringBuilder builder = new StringBuilder();
				builder.append(rchar);
				for (;;)
				{
					this.stream.mark(1);
					int ca = this.stream.read();
					if (ca == -1)
					{
						this.stream.reset();
						break;
					}
					char caa = (char)ca;
					if (!isLetterOrNumber(caa))
					{
						this.stream.reset();
						break;
					}
					else
					{
						builder.append(caa);
					}
				}
				this.tokens.Put(new NumericToken(builder.toString()));
			}
			/**
			 * If current char is symbol it reads it and converts to SymbolToken.
			 */
			else if (isSymbol(rchar))
			{
				/**
				 * We have exceptional check for /
				 * because if next char is / or * , it means it's comment
				 */
				boolean isComment = false;
				if (rchar == '/')
				{
					this.stream.mark(1);
					int data = this.stream.read();
					if (data == -1) {
						this.stream.reset();
					}
					else {
						char second = (char)data;
						if (second == '/') {
							isComment = true;
							for (;;) {
								data = this.stream.read();
								if (data == -1)
									break;
								second = (char)data;
								if (second == '\n')
									break;
							}
						}
						else if (second == '*') {
							isComment = true;
							for (;;) {
								data = this.stream.read();
								if (data == -1)
									break;
								second = (char)data;
								int thirdData = this.stream.read();
								if (thirdData == -1)
									break;
								char third = (char)thirdData;
								if (second == '*' && third == '/') {
									break;
								}
							}
						}
						else {
							this.stream.reset();
						}
					}
				}
				if (!isComment) {
					this.tokens.Put(new SymbolToken(new StringBuilder().append(rchar).toString()));
				}
			}
			/**
			 * If current char is letter then it reads it until it encounters char
			 * which is not number or letter or symbol
			 * When done reading letter it checks if it's keyword 
			 * If it is , it writes KeywordToken , else - NameToken
			 */
			else if (isLetter(rchar))
			{
				StringBuilder builder = new StringBuilder();
				builder.append(rchar);
				for (;;)
				{
					this.stream.mark(1);
					int ca = this.stream.read();
					if (ca == -1)
					{
						this.stream.reset();
						break;
					}
					char caa = (char)ca;
					if (!isLetterOrNumber(caa))
					{
						this.stream.reset();
						break;
					}
					else
					{
						builder.append(caa);
					}
				}
				this.tokens.Put(isKeyword(builder.toString()) ? new KeywordToken(builder.toString()) : 
					(isExpressionKeyword(builder.toString()) ? new ExpressionKeywordToken(builder.toString()) : new NameToken(builder.toString())));
			}
		}
		
		this.stream.close();
		/**
		 * Once we are done with reading and analyzing, flip the tokens bag
		 * so it's prepared for reading.
		 */
		this.tokens.Flip();
	}

	
	public boolean isLetter(char s)
	{
		return matchesTable(s,"qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");
	}
	
	public boolean isNumber(char n)
	{
		return matchesTable(n,"0123456789");
	}
	
	public boolean isLetterOrNumber(char n)
	{
		return isLetter(n) || isNumber(n);
	}
	
	public boolean isSymbol(char s)
	{
		return matchesTable(s,"!@#$%^&*()_-+=|\\{[}]:;'" + '"' + "<,>.?/");
	}
	
	public boolean isKeyword(String s)
	{
		return matchesStringTable(s,
				new String[] 
				{
					// types
					"void","int","boolean","long","char","string",// types
					// script keywords
					"definition","unsafe","const","opcode","cs2","assemblymacro",
					"include","includeonce",
					// function keywords
					"return","continue","break","while", "ASM","if","else",
				} 
		);
	}
	
	public boolean isExpressionKeyword(String s)
	{
		return matchesStringTable(s,
				new String[]
				{
					// value keywords
					"true", "false",
	            }
		);
	}
	
	public boolean isType(String s)
	{
		return matchesStringTable(s,
				new String[]
				{
					"void","int","boolean","long","char","string",
				}
		);
	}
	
	/**
	 * Loops trough all chars of cTable and checks if s is equal to atleast one of those.
	 * @param s
	 * Character which is being checked.
	 * @param cTable
	 * 'Table' containing characters to check s with.
	 * @return
	 * Returns true if s matches atleast one char of table.
	 */
	public boolean matchesTable(char s,String cTable)
	{
		for (int i = 0; i < cTable.length(); i++) {
			if (cTable.charAt(i) == s) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Loops trough all strings of sTable and checks if s is equal to atleast one of those.
	 * @param s
	 * String which is being checked.
	 * @param sTable
	 * 'Table' containing strings to check s with.
	 * @return
	 * Returns true if s matches atleast one string of table.
	 */
	public boolean matchesStringTable(String s,String[] sTable)
	{
		for (int i = 0; i < sTable.length; i++) {
			if (sTable[i].equals(s))
				return true;
		}
		return false;
	}
}
