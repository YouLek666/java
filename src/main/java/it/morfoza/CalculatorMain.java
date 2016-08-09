package it.morfoza;

/**
 * Created by widzew on 2016-08-09.
 */
public class CalculatorMain {
    public static void main (String[] args) {
        if (args.length > 0 && args[0].equals("texy")) {
            CalculatorConsole.runOnConsole(args);
        } else {
            CalcualtorSpringBoot.runOnSpringBoot(args);

        }
    }
}
