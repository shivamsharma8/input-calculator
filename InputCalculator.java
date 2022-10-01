import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0, counter = 0 , avg=0;
        double average = 0;
        while (true) {
            boolean hasnextint = scanner.hasNextInt();
            if ( hasnextint) {
                int number = scanner.nextInt();
                counter++;
                sum+= number;
                average = (double) sum / counter;
                average=Math.round(average);
                avg = (int) average;

            }else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }

        }
        scanner.close();
    }
}
