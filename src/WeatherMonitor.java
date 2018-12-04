import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    private LinkedList<IWeatherReport> reports;

    public WeatherMonitor() {
        this.reports = new LinkedList<>();
    }

    /**
     * Returns the average temp for a given month
     * @param month the month that you want the average for
     * @return the average temperature or -1 if there are no readings for that month
     *
     */
    public double averageTempForMonth(int month){
        int count = 0;
        double sum = 0;
        for (IWeatherReport report: reports) {
            if (report.getDate().get(GregorianCalendar.MONTH) == month){
                count++;
                sum += report.getAvgTemp();
            }
        }
        if (count < 1) {
            return -1;
        }
        return sum/count;

    }

    /**
     * The total rainfall for a given month
     * @param month The specified month
     * @return The railfall amount for that month
     */
    public double totalRailfallForMonth(int month){
        double sum = 0;
        for (IWeatherReport report: reports) {
            if (report.getDate().get(GregorianCalendar.MONTH) == month){
                sum += report.getTotalRain();
            }
        }
        return sum;
    }

    /**
     * adds a report to the weather monitor
     * @param report The report that is being added
     * @return the weather monitor
     */
    public WeatherMonitor addDailyReport(IWeatherReport report){
        reports.add(report);
        return this;
    }
}
