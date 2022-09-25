package lab_06;

public class Exercise_61 {
    public static void main(String[] args) {
        String input = "2hrs and 5 minutes";
        int hour = Integer.parseInt(input.substring(0, input.indexOf("hrs")));
        String inputMinute = input.substring(input.indexOf("and"), input.length());
        int minutes = Integer.parseInt(inputMinute.substring(inputMinute.indexOf(" "), inputMinute.indexOf("minutes")).trim());
        System.out.println((hour * 60 + minutes) + " minutes");
    }
}
