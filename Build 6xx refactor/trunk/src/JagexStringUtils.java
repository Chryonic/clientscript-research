/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 7/16/11
 * Time: 5:56 AM
 * To change this template use File | Ssettings | File Templates.
 */
public class JagexStringUtils {

    static final String replaceAll(String string, String search, String replace) {
        for (int anLocalInt = string.indexOf(search); anLocalInt != -1; anLocalInt = string.indexOf(search, replace.length() + anLocalInt))
            string = (string.substring(0, anLocalInt) + replace + string.substring(search.length() + anLocalInt));
        return string;
    }

    static final String[] split(String argument, int argument_14_, char argument_15_) {
	int anLocalInt
	    = Statics.method769((byte) 119, argument_15_, argument);
	String[] strings = new String[anLocalInt + 1];
	int anLocalInt_16_ = argument_14_;
	int anLocalInt_17_ = 0;
	for (int anLocalInt_18_ = 0; anLocalInt > anLocalInt_18_;
	     anLocalInt_18_++) {
	    int anLocalInt_19_;
	    for (anLocalInt_19_ = anLocalInt_17_;
		 argument.charAt(anLocalInt_19_) != argument_15_;
		 anLocalInt_19_++) {
		/* empty */
	    }
	    strings[anLocalInt_16_++]
		= argument.substring(anLocalInt_17_, anLocalInt_19_);
	    anLocalInt_17_ = anLocalInt_19_ + 1;
	}
	strings[anLocalInt] = argument.substring(anLocalInt_17_);
	return strings;
    }

    static final int parseInt(String input, int radix) {
	if (radix < 2 || radix > 36)
	    throw new IllegalArgumentException("Invalid radix:" + radix);
	boolean anLocalBoolean = false;
	boolean anLocalBoolean_14_ = false;
	int anLocalInt = 0;
	int anLocalInt_15_ = input.length();
	for (int anLocalInt_16_ = 0; anLocalInt_16_ < anLocalInt_15_;
	     anLocalInt_16_++) {
	    int anLocalInt_17_ = input.charAt(anLocalInt_16_);
	    if (anLocalInt_16_ == 0) {
		if (anLocalInt_17_ == 45) {
		    anLocalBoolean = true;
		    continue;
		}
		if (anLocalInt_17_ == 43)
		    continue;
	    }
	    if (anLocalInt_17_ >= 48 && anLocalInt_17_ <= 57)
		anLocalInt_17_ -= 48;
	    else if (anLocalInt_17_ < 65 || anLocalInt_17_ > 90) {
		if (anLocalInt_17_ >= 97 && anLocalInt_17_ <= 122)
		    anLocalInt_17_ -= 87;
		else
		    throw new NumberFormatException();
	    } else
		anLocalInt_17_ -= 55;
	    if (anLocalInt_17_ >= radix)
		throw new NumberFormatException();
	    if (anLocalBoolean)
		anLocalInt_17_ = -anLocalInt_17_;
	    int anLocalInt_18_ = anLocalInt_17_ + radix * anLocalInt;
	    if (anLocalInt != anLocalInt_18_ / radix)
		throw new NumberFormatException();
	    anLocalInt = anLocalInt_18_;
	    anLocalBoolean_14_ = true;
	}
	if (!anLocalBoolean_14_)
	    throw new NumberFormatException();
	return anLocalInt;
    }

    static final int parseInt(String argument_1_) {
	return parseInt(argument_1_, 10);
    }

    static final int parseInt2(String input, int radix) {
	return parseInt(input, radix);
    }

    static final String concatenate(String[] strings, int startIndex, int count) {
        if (count == 0)
            return "";
        if (count == 1) {
            String string = strings[startIndex];
            if (string == null)
                return "null";
            return string;
        }
        int endIndex = count + startIndex;
        int resultLength = 0;
        for (int stringPtr = startIndex; stringPtr < endIndex; stringPtr++) {
            String string = strings[stringPtr];
            if (string == null)
                resultLength += 4;
            else
                resultLength += string.length();
        }
        StringBuffer stringbuffer = new StringBuffer(resultLength);
        for (int stringPtr = startIndex; stringPtr < endIndex; stringPtr++) {
            String string = strings[stringPtr];
            if (string != null)
                stringbuffer.append(string);
            else
                stringbuffer.append("null");
        }
        return stringbuffer.toString();
    }

    static final char parseCharacter(byte data) {
        int charInt = data & 0xff;
        if (charInt == 0)
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(charInt, 16) + " provided");
        if (charInt >= 128 && charInt < 160) {
            int newChar = KeyHandler.miscPrintableChars[charInt - 128];
            if (newChar == 0)
                newChar = 63;
            charInt = newChar;
        }
        return (char) charInt;
    }

    static final int strlenp1(String argument, byte argument_4_) {
        return argument.length() + 1;
    }
}
