public class Main {
    public static void main(String[] args) {
        String date;
        SmartDate smartDate = new SmartDate(14,02,2012);
        System.out.println(smartDate);
        date = smartDate.dayOfTheWeek();
        System.out.println(date);
    }
}