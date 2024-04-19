package util;

import java.util.Random;

public class RandomUtil {
    private static Random rand = new Random();

    public static String getValidPassword() {
        String token = "A2aя";
        return getRandomString(10) + token;
    }

    public static String getRandomMail() {
        String mail;

        do {
            mail = getRandomString(15).toLowerCase();
        } while (!mail.contains("a"));

        return mail;
    }

    public static String getRandomDomain() {
        return getRandomString(4).toLowerCase();
    }

    public static int getRandomInt(int size) {
        return rand.nextInt(size);
    }

    private static String getRandomString(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (str.length() * Math.random());
            sb.append(str.charAt(index));
        }

        return sb.toString();
    }
}

