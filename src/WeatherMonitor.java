import java.util.LinkedList;

public class WeatherMonitor {

    LinkedList<DailyWeatherReport> reports;

    public WeatherMonitor() {
        this.reports = new LinkedList<>();
    }

    public double averageTempForMonth(int month){
        return 0.0;
    }

    public double totalRailfallForMonth(int month){
        return 0.0;
    }

    public WeatherMonitor addDailyReport(DailyWeatherReport report){
        reports.add(report);
        return this;
    }
}
