import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String,Feelings> perception;
    private static String inputString;
    private static int reputation;
    private static Happy happy;
    private static Aggressive aggressive;
    private static Default aDefault;
    private static Sad sad;
    private static Scared scared;

    public static void main(String[] args) {
        perception.put("hello", happy);
        perception.put("bey", scared);
        perception.put("")
        Scanner sc = new Scanner(System.in);
        inputString = sc.nextLine();
    }
}
