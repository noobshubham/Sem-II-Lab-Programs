import java.util.Scanner;

public class RecursivePalindrome {
    static boolean palind(String val, int s, int e) {
        if (val.length() == 0 || val.length() == 1)
            return true;
        if (s <= e && val.charAt(s) != val.charAt(e))
            return false;
        else if (s <= e && val.charAt(s) == val.charAt(e))
            return palind(val, s + 1, e - 1);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to check for palindrom!");
        String str = sc.next();
        System.out.println(palind(str, 0, str.length() - 1));
        sc.close();
    }
}
