import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 1990;
        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        String text = "";
        Calendar rightNow = Calendar.getInstance();
        int currentYear = rightNow.get(Calendar.YEAR);
        int currentDay = rightNow.get(Calendar.DATE);
        int currentMonth = rightNow.get(Calendar.MONTH);
        Calendar rightNowNew = Calendar.getInstance();
        rightNowNew.set(currentYear, currentMonth, currentDay);
        month = month - 1;

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(year, month, day);

        Locale localeEng = new Locale("en");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy - EE", localeEng);
        if (rightNowNew.getTime().before(dateOfBirth.getTime())) {
            text = "";
        } else {
            int countYears = year;
            int countEachYear = 0;
            while (countYears <= currentYear && (dateOfBirth.getTime().before(rightNowNew.getTime()) ||
                    (dateOfBirth.getTime().equals(rightNowNew.getTime())))) {
                text += countEachYear + " - " + format.format(dateOfBirth.getTime()) + System.lineSeparator();
                countEachYear++;
                countYears++;
                dateOfBirth.set(countYears, month, day);
            }
        }
        return text;
    }
}