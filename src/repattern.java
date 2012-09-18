import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class repattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Pattern pattern;
		Matcher matcher;
		
		
		pattern = Pattern.compile("<([a-zA-Z][a-zA-Z0-9]*)(()| [^>]*)>(.*)</\1>");
		matcher = pattern.matcher("<font size=\"2\">TopCoder is the</font> <b>best</b>");
		boolean found = false;
		while(matcher.find()) {
		  System.out.println("Found the text \"" + matcher.group() +  "\" starting at index " + matcher.start() +
		      " and ending at index " + matcher.end() + ".");
		  found = true;
		}

		if(!found){
		  System.out.println("No match found.");
		}

	}

}
