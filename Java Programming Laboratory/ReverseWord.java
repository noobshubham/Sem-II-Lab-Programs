public class ReverseWord {
    public static void main(String[] args) {
        String str = "Java Programming";
        String[] list = str.split(" ");
        for (int i = 0; i < list.length; i++) {
            StringBuffer s = new StringBuffer(list[i]);
            list[i] = new String(s.reverse());
            System.out.print(list[i] + " ");
        }
    }
}
