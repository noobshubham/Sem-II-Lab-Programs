import java.util.Scanner;

public class ExHandlingVowel {
    static void isVowel(String s) {
        String match = "aeiouAEIOU";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (match.contains(String.valueOf(s.charAt(i)))) {
                flag = true;
                break;
            }
        }
        if (!flag)
            throw new IllegalArgumentException("The String has no vowels!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to search for a Vowel?");
        String value = input.next();

        try {
            isVowel(value);
            System.out.println("Yes, it has the vowel!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
