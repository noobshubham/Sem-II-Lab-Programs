public class ReverseString {

    static String Iterative(String s) {
        int len = s.length(), index = 0;
        char[] charArray = new char[len];
        for (int i = len - 1; i >= 0; i--) {
            charArray[index++] = s.charAt(i);
        }
        return new String(charArray);
    }

    static void Recursive(String s, int index) {
        if (index < s.length()) {
            Recursive(s, index + 1);
            System.out.print(s.charAt(index));
        }
    }

    static StringBuffer StringBufferrr(StringBuffer s) {
        return s.reverse();
    }

    public static void main(String[] args) {
        String name = "SHUBHAM";
        System.out.println("Reverse using Iterative : " + Iterative(name));
        System.out.print("Reverse using Recursive : ");
        Recursive(name, 0);
        System.out.println();
        System.out.println("Reverse using StringBuffer : " + StringBufferrr(new StringBuffer(name)));
    }
}
