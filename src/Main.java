import com.sun.java.accessibility.util.Translator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        Days days = Days.valueOf(scanner.nextLine().toUpperCase());
        switch (days) {
            case MONDAY -> System.out.println(Days.MONDAY);
            case SUNDAY -> System.out.println(Days.SUNDAY);
            case FRIDAY -> System.out.println(Days.FRIDAY);
            case TUESDAY -> System.out.println(Days.TUESDAY);
            case SATURDAY -> System.out.println(Days.SATURDAY);
            case WEDNESDAY -> System.out.println(Days.WEDNESDAY);
            case THURSDAY -> System.out.println(Days.THURSDAY);
        }
    }
}



