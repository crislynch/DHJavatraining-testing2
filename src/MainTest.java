

import org.testng.annotations.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class MainTest {

    @Test
    public void testGetParse() {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.getParse(dateString);
        OffsetDateTime expectedDate = OffsetDateTime.parse(dateString);

        assertEquals(expectedDate, dateTime);
    }

    @Test
    public void testInvalidDate() {
        String invalidDateString = "Invalid Date";
        assertThrows(DateTimeException.class, () -> Main.getParse(invalidDateString));
    }

    @Test
    public void testFullFormattedDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedData = Main.fullFormattedDate(dateTime);
        String expectedFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        assertEquals(expectedFormattedDate, formattedData);
    }

    @Test
    public void testMediumFormattedDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedData = Main.mediumFormattedDate(dateTime);
        String expectedFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        assertEquals(expectedFormattedDate, formattedData);
    }

    @Test
    public void testShortFormattedDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedData = Main.shortFormattedDate(dateTime);
        String expectedFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        assertEquals(expectedFormattedDate, formattedData);
    }
}