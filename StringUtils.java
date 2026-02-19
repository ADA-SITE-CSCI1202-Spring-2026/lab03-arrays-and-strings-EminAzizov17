import java.util.Arrays;

public class StringUtils {

    // 7. Reverse a string
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // 8. Exploded string
    public static String exploded(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            result.append(s.substring(0, i + 1));
        }
        return result.toString();
    }

    // 9. Sort letters in a string
    public static String sort(String s){
        char[] c_array = s.toCharArray();
        Arrays.sort(c_array);
        return new String(c_array);
    }

    // 10. Check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2){
        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    // 11. Swap first and last character of each word
    public static String swapFirstLast(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words){
            if (word.length() > 1){
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                result.append(last).append(middle).append(first);
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args){
        StringUtils utils = new StringUtils();

        // Test reverse
        String s1 = "Hello";
        System.out.println("Reversed: " + utils.reverse(s1));

        // Test exploded
        String s2 = "Baku";
        System.out.println("Exploded: " + exploded(s2));

        // Test sort
        String s3 = "suiretan";
        System.out.println("Sorted: " + sort(s3));

        // Test anagrams
        String a1 = "listen";
        String a2 = "silent";
        System.out.println("Are anagrams: " + areAnagrams(a1, a2));

        // Test swap first-last
        String sentence = "This is PP2 Spring 2026";
        System.out.println("Swapped words: " + swapFirstLast(sentence));
    }
}
