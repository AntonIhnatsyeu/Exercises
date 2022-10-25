public class SmartDate {

    final int day;
    final int month;
    final int year;

    public SmartDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String dayOfTheWeek() {
        int m = month;
        int y = year;
        if (m == 1 || m == 2) {
            m = m + 12;
            y = y - 1;
        }
        int week = (int) (y - 2000 + Math.floor((y - 2000) / 4) + 5 - 40 + Math.floor(26 * (m + 1) / 10) + day - 1);
        int weekday = week % 7;
        String[] w = {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
        return w[weekday];
    }

    @Override
    public String toString() {
        return "Day = " + day +
                ", month = " + month +
                ", year = " + year;
    }
}
