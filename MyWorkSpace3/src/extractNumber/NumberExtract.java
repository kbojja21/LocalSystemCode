package extractNumber;

public class NumberExtract {
public String  extractNumber(String emailValue)
	{
		String emailValue1=emailValue.trim();
		String digits="";
		for (int i = 0; i < emailValue1.length(); i++) {
            char chrs = emailValue1.charAt(i);              
            if (Character.isDigit(chrs))
                digits = digits+chrs;
        }
        return digits;
	}
}
