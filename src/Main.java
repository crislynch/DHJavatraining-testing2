import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni -Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = getParse(dateString);

        String fullFormattedDate = fullFormattedDate(dateTime);
        String mediumFormattedDate = mediumFormattedDate(dateTime);
        String shortFormattedDate = shortFormattedDate(dateTime);

        System.out.println("FULL Format: " + fullFormattedDate);
        System.out.println("MEDIUM Format: " + mediumFormattedDate);
        System.out.println("SHORT Format: " + shortFormattedDate);

    }

    static String shortFormattedDate(OffsetDateTime dateTime) {
        String shortFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        return shortFormattedDate;
    }

    static String mediumFormattedDate(OffsetDateTime dateTime) {
        String mediumFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return mediumFormattedDate;
    }

    static String fullFormattedDate(OffsetDateTime dateTime) {
        String fullFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return fullFormattedDate;
    }

    static OffsetDateTime getParse(String dateString) {
        return OffsetDateTime.parse(dateString);
    }
}