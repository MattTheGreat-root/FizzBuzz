public class Main {
    public static void main(String[] args) {
        int[] divisors = {3, 5};
        String[] words = {"Fizz", "Buzz"};

        for (int i = 1; i <= 50; i++) {
            String output = "";

            for (int j = 0; j < divisors.length; j++) {
                if (i % divisors[j] == 0) {
                    output += words[j];
                }
            }

            if (output.isEmpty()) {
                output += i;
            }

            System.out.println(output);
        }
    }
}
