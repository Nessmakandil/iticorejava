
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static int countOccurrence1(String s, String word){
        int count = 0;
        String[] strings = s.split("[\\s,.@!?*-+%$#]");
        for (String w: strings) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
    public static int countOccurrence2(String s, String word){
        int count = 0;
        int index = s.indexOf(word, 0);
        while (index > 0) {
            count++;
            index = s.indexOf(word, index+word.length());
        }
        return count;
    }
    public static int countOccurrence3(String s, String word){
        StringTokenizer tStringTokenizer = new StringTokenizer(s, " ");
        int count = 0;
        while (tStringTokenizer.hasMoreTokens()) {
            if (tStringTokenizer.nextToken().equals(word)) {
                count++;
            }
        }
        return count;
    }
    public static int countOccurrence4(String s, String word){
        int count = 0;
        Pattern sPattern = Pattern.compile("\\b"+word+"\\b"); 
        Matcher m = sPattern.matcher(s);
        while (m.find()) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec libero eget orci luctus vestibulum id nec justo. Pellentesque interdum porta eros, vitae accumsan massa lacinia dapibus. Sed pretium lacus vitae metus consequat, vel mattis mi mollis. Curabitur lectus est, blandit id metus at, molestie sollicitudin arcu. Curabitur felis eros, congue quis ante eget, pharetra porttitor eros. Fusce nec rutrum ligula. Fusce eros erat, pulvinar nec placerat ac, ornare sit amet dui. Nam non enim velit. Fusce in porta velit. Aenean metus ante, sollicitudin quis urna non, bibendum varius lorem. Donec at feugiat neque. Suspendisse urna ante, scelerisque vel tellus eu, tincidunt ullamcorper sapien. Mauris fermentum, arcu at sagittis imperdiet, eros dui pulvinar dolor, eget semper leo ex ut enim. In hac habitasse platea dictumst. Aenean vitae egestas metus.";
        String word = "sit";
        System.out.println(countOccurrence1(s, word));
        System.out.println(countOccurrence2(s, word));
        System.out.println(countOccurrence3(s, word));
        System.out.println(countOccurrence4(s, word));

    }
}