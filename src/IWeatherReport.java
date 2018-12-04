import java.util.GregorianCalendar;

public interface IWeatherReport {
    public GregorianCalendar getDate();
    public double getTotalRain();
    public double getAvgTemp();
}
