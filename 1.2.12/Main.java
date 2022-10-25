public class Main {
    public static void main(String[] args) {
        String date;
        SmartDate smartDate = new SmartDate(19, 10, 2022);
        System.out.println(smartDate);
        date = smartDate.dayOfTheWeek();
        System.out.println(date);
    }
}