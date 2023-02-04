import java.util.TimeZone;

public class brazilTimeZone {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println("Time zone ID: " + timeZone.getID());
        System.out.println("Time zone display name: " + timeZone.getDisplayName());
        System.out.println("Time zone offset (in milliseconds): " + timeZone.getRawOffset());
    }
}
