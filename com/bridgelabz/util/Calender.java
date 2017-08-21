public class Calender {

    public static String days[] = {"S", "M", "T", "W", "T", "F", "S"};

    public static String months[] = {"Jan", "Feb", "March", "April", "May", "Jun", "July", "Aug", "Sep",
            "Oct", "Nov", "Dec"};

    public static int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int calendar[][] = new int[6][7];

    public static boolean georgianCal(int year) {
        boolean isLeapYear = (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0));
        return isLeapYear;
    }

    public static int dayOfWeek(int day, int month, int year) {
        int y0, x, m0, d0;
        y0 = year - ((14 - month) / 12);
        x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        m0 = month + (12 * ((14 - month) / 12)) - 2;
        d0 = (day + x + ((31 * m0) / 12)) % 7;
        return d0;
    }

    public static void display(int month, int year) {
        System.out.println(months[month - 1] + " " + year);
        for (int i = 0; i < 7; i++) {
            System.out.format("%3s", days[i]);   //format defines width of each value
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (calendar[i][j] == 0)
                    System.out.print("   ");
                else
                    System.out.format("%3d", calendar[i][j]);
            }
            System.out.println();
        }
    }

    public static void calenderDates(int month, int year) {
        int day = dayOfWeek(1, month, year);
        if (month == 2 && georgianCal(year))    //checking for leap year
            daysInMonth[month - 1] = 29;
        for (int i = 0, k = 1; i < 6 && k <= daysInMonth[month - 1]; i++) {
            if (i == 0) {   //for first row only
                for (int j = day; j < 7; j++, k++)
                    calendar[i][j] = k;
            } else {    //from 2nd row onward
                for (int j = 0; j < 7 && k <= daysInMonth[month - 1]; j++, k++)
                    calendar[i][j] = k;
            }
        }
        display(month, year);
    }

    public static void main(String args[]) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        calenderDates(month, year);
    }
}