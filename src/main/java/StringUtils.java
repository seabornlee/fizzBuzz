import java.util.Random;

public class StringUtils {
    public static boolean isBlank(String string) {
        return string == null || string.length() == 0;
    }

    public static int randomAge(int max) {
        int age = new Random().nextInt(max);
        if (age == 0) {
            age = 1;
        }
        return age;
    }

    public static int randomAge() {
        return randomAge(300);
    }
}
