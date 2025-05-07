import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFile {

    public void write(double before, String base, double after, String target, double rate) throws IOException {
        LocalDateTime rawDateAndTime = LocalDateTime.now();
        DateTimeFormatter dateAndTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateAndTime = rawDateAndTime.format(dateAndTimeFormat);

        try (FileWriter logActivity = new FileWriter("log.txt", true)) {
            logActivity.write("[" + formattedDateAndTime + "]" + String.format(" Converted %.2f %s to %.2f %s", before, base, after, target) + String.format(" (Rate: 1 %s = %.4f %s)", base, rate, target) + "\n");
        }
    }
}