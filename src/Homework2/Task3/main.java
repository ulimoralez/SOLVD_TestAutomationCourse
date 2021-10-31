package Homework2.Task3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        String randomStringOf3Characters, randomStringOf10Characters;
        randomStringOf3Characters = generateRandomString(3);
        randomStringOf10Characters = generateRandomString(10);

        System.out.println(randomStringOf3Characters);
        System.out.println(randomStringOf3Characters.toLowerCase(Locale.ROOT));
        System.out.println(randomStringOf3Characters.toUpperCase(Locale.ROOT));
        System.out.println(randomStringOf3Characters.length());
        System.out.println(randomStringOf3Characters.charAt(0));
        System.out.println(randomStringOf3Characters.concat(randomStringOf10Characters));

        System.out.println("\nSecond String\n");

        System.out.println(randomStringOf10Characters);
        System.out.println(randomStringOf10Characters.contains("A"));
        System.out.println(randomStringOf10Characters.replace("A", "Z"));
        System.out.println(randomStringOf10Characters.startsWith("Z"));
        System.out.println(randomStringOf10Characters.isEmpty());
        System.out.println(randomStringOf10Characters.replaceFirst("T", "W"));
    }
    public static String generateRandomString(int sizeOfString){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        String templateString="QWERTYUIOPASDFGHJKLZXCVBNM";
        String[] generatedString = new String[sizeOfString];

        for(int i = 0; i < sizeOfString; i++){
            generatedString[i] = String.valueOf(templateString.charAt(random.nextInt(templateString.length())));
            stringBuilder.append(generatedString[i]);
        }

        return stringBuilder.toString();
    }
}
