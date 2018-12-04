import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    private LinkedList<IWeatherReport> reports;

    public WeatherMonitor() {
        this.reports = new LinkedList<>();
    }

    public double averageTempForMonth(int month) throws ArithmeticException{
        int count = 0;
        double sum = 0;
        for (IWeatherReport report: reports) {
            if (report.getDate().get(GregorianCalendar.MONTH) == month){
                count++;
                sum += report.getAvgTemp();
            }
        }
        return sum/count;

    }

    public double totalRailfallForMonth(int month){
        double sum = 0;
        for (IWeatherReport report: reports) {
            if (report.getDate().get(GregorianCalendar.MONTH) == month){
                sum += report.getTotalRain();
            }
        }
        return sum;
    }

    public WeatherMonitor addDailyReport(IWeatherReport report){
        reports.add(report);
        return this;
    }
}
