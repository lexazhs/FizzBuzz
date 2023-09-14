public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;
        while (i > 0) {

            boolean oven = i % 2 == 0;

            if (oven) {

                i = i / 2;
                count += 1;

            } else {

                i = i - 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
