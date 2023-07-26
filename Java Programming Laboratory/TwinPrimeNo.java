import java.util.ArrayList;

public class TwinPrimeNo {

    static boolean PrimeNo(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= 100; i++) {
            if (PrimeNo(i))
                list.add(i);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) + 2 == list.get(i + 1))
                System.out.println(list.get(i) + " and " + list.get(i + 1));
        }

    }
}
