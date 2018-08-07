public class FizzBuzz {
    public static String of(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.of(1));
        System.out.println(FizzBuzz.of(3));
        System.out.println(FizzBuzz.of(5));
        System.out.println(FizzBuzz.of(6));
        System.out.println(FizzBuzz.of(10));
        System.out.println(FizzBuzz.of(15));
    }
}
