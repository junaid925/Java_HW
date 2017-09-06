import java.util.*;

/**
 * @author junaid
 */
public class MainQ3 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            // randomly generate numbers from 1-12
            int month = (int) new Random().nextInt(12) +1;
            getMonthName(month);
        }

    }

    public static void getMonthName(int i) {

        ArrayList<String> months = new ArrayList<String>();
        months.add("");
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println(months.get(i));

    }
}
