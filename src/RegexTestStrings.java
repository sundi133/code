import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestStrings {
	public static final String EXAMPLE_TEST = "h+   This is my small example "
			+ "string which I'm going to " + "use for pattern matching. 09/08/2112,  999-99-9999  999999999" +
					"172.26.155.241 - - [26/Feb/2001:10:56:03 -0500] \"GET /IsAlive.htm HTTP/1.0\" 200 15 "+
					"<font face=\"Arial, Serif\" size=\"+2\" color=\"red\">";

	public static void main(String[] args) {
		try{
			
		
		//Pattern pattern = Pattern.compile("\\d\\d[/]\\d\\d[/][2&0]\\d\\d");//date
			//Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");//ssn
			String comp="([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})\\s-\\s-\\s\\[([^\\]]+)\\]";//log
			comp="<\\s*font\\s+([^>]*)\\s*>";//font tag in html
			Pattern pattern = Pattern.compile(comp);
		// In case you would like to ignore case sensitivity you could use this
		// statement
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		// Check all occurance
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			String font = matcher.group(1);
			Pattern pattern2 = Pattern.compile("([a-z]+)\\s*=\\s*\"([^\"]*)\"");
			Matcher matcher2 = pattern2.matcher(font);
		
			while (matcher2.find()) {
				System.out.println(matcher2.group());
			}
			System.out.println();
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// Now create a new pattern and matcher to replace whitespace with tabs
		/*Pattern replace = Pattern.compile("\\s+");
		Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
		System.out.println(matcher2.replaceAll("\t"));*/
	
	}
}
