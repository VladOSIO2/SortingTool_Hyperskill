package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            numbers.add(number);
        }

        numbers.sort(Long::compareTo);
        long max = numbers.get(numbers.size() - 1);

        System.out.println("Total numbers: " + numbers.size());
        System.out.println("The greatest number: " + max + "(" + Collections.frequency(numbers, max) + " time(s))");
    }
}
