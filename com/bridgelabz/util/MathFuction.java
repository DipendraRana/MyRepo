public class MathFuction {

    public static double harmonic(int xValue) {
        double harmonic = 0;
        for (double i = 1; i <= xValue; i++)
            harmonic = harmonic + (1 / i);
        return harmonic;
    }

    public static double sin(double xValue) {
        xValue = xValue % (2 * Math.PI);
        double sinValue = xValue - Math.pow(xValue, 3) / factorial(3) +
                Math.pow(xValue, 5) / factorial(5) - Math.pow(xValue, 7) / factorial(7);
        return sinValue;
    }

    public static double cosine(double sinValue) {
        double cosine = 1 / sinValue;
        return cosine;
    }

    public static int[] convertToBinary(int decimalNo) {

        int copyOfDecimalNo = decimalNo;
        int count = 0;
        while (copyOfDecimalNo != 0) {
            copyOfDecimalNo = copyOfDecimalNo / 2;
            count++;
        }
        int storeBin[] = new int[count];
        while (decimalNo != 0 && count >= 0) {
            count--;
            storeBin[count] = decimalNo % 2;
            decimalNo = decimalNo / 2;
        }
        return storeBin;
    }

    public static double sqrt(double c) {
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }
        return t;
    }

    public static double sqrt(double c, double epsilon) {
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }
        return t;
    }

    public static boolean isPrime(int number) {
        int count = 0;
        if (number == 0 || number == 1)
            System.out.println("Entered number is not prime");
        else {
            for (int i = 2; i < (number / 2); i++) {
                if (number % i == 0)
                    count++;
            }
        }
        if (count > 0)
            return true;
        else
            return false;
    }

    public static long factorial(int number) {
        int factorial = 1;
        if (number == 0 || number == 1)
            System.out.println(1);
        else {
            System.out.println(number + "! = ");
            for (int i = 1; i <= number; i++)
                factorial = factorial * i;
        }
        return factorial;
    }

    public static double futureValue(int principal, double time, double rate) {
        double futureValue = 1;
        futureValue = principal * Math.pow(1 + rate / 100, time);
        return futureValue;
    }

    public static double presentValue(int amount, double time, double rate) {
        double presentValue = 1;
        presentValue = amount / Math.pow(1 + rate / 100, time);
        return presentValue;
    }

    public static int maxValue(int source[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < source.length; i++) {
            if (max < source[i])
                max = source[i];
        }
        return max;
    }

    public static int minValue(int source[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < source.length; i++) {
            if (min > source[i])
                min = source[i];
        }
        return min;
    }

    public static String maxValue(String source[]) {
        String max = source[0];
        for (int i = 1; i < source.length; i++) {
            if (max.length() < source[i].length())
                max = source[i];
        }
        return max;
    }

    public static String minValue(String source[]) {
        String min = source[0];
        for (int i = 0; i < source.length; i++) {
            if (min.length() > source[i].length())
                min = source[i];
        }
        return min;
    }

    //point A=(x1,y1), B=(x2,y2) and c=(x3,y3)
    public static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB=(y2-y1)/(x2-x1);
        double slopeBC=(y3-y2)/(x3-x2);
        double slopeAC=(y3-y1)/(x3-x1);
        boolean isCollinear=(slopeAB==slopeAC&&slopeAB==slopeBC);
        return isCollinear;
    }

    public static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int x12=x1-x2;
        int x23=x2-x3;
        int y12=y1-y2;
        int y23=y2-y3;
        boolean isCollinear=(0.5*((x12*y23)-(x23-y12))==0);
        return isCollinear;
    }
}