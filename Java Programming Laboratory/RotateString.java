public class RotateString {
    static String Rotate(String s, int i) {
        if (i == 0 && !s.isEmpty())
            return s.substring(i + 1, s.length()) + s.charAt(i);
        else if (i == s.length() - 1 && !s.isEmpty())
            return s.charAt(i) + s.substring(0, i);
        else
            return s.substring(i + 1, s.length()) + s.charAt(i) + s.substring(0, i);
    }

    public static void main(String[] args) {
        String name = "SHUBHAM";
        System.out.println("String is     : " + name);
        System.out.println("Rotate from S : " + Rotate(name, 0));
        System.out.println("Rotate from B : " + Rotate(name, 3));
        System.out.println("Rotate from M : " + Rotate(name, name.length() - 1));
    }
}
