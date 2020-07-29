import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime localDateTime;
    public Gigasecond(LocalDate moment) {
        this.localDateTime = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.localDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        LocalDateTime localDateTime = this.localDateTime;
        return localDateTime.plusSeconds(1000000000);
    }
}
