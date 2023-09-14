public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {

            boolean divisionBy3 = i % 3 == 0;
            boolean divisionBy5 = i % 5 == 0;

            if (divisionBy5) {

                count += 1;

            } else if (divisionBy3) {

                count += 1;

            }
        }
        System.out.println(count);
    }
}
