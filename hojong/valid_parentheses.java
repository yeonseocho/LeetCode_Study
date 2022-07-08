import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isValid(String s) {
        Pattern pattern = Pattern.compile("(\\(\\))|(\\[\\])|(\\{\\})");
        StringBuffer stringBuffer = new StringBuffer();

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "");
            matcher.appendTail(stringBuffer);
            matcher = pattern.matcher(stringBuffer.toString());
            stringBuffer.delete(0, stringBuffer.length());
        }
        matcher.appendTail(stringBuffer);
        
        return stringBuffer.length() == 0;
    }
}
