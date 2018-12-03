import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
    GregorianCalendar date;
    LinkedList<Double> temperatures;
    LinkedList<Double> rainfall;

    public DailyWeatherReport(GregorianCalendar theDate, LinkedList<Reading> theReadings) {
        this.date = theDate;
        LinkedList<Double> tempReadings = new LinkedList<>();
        LinkedList<Double> rainReadings = new LinkedList<>();
        for(int i = 0; i < theReadings.size(); i++) {
            tempReadings.add(theReadings.get(i).getDegrees());
            rainReadings.add(theReadings.get(i).getDeltaRainFall());
        }
        this.temperatures = tempReadings;
        this.rainfall = rainReadings;
    }

    public double getAvgTemp() {
        double totalTemp = 0;
        double numTemps = 0;
        for(int i = 0; i < this.temperatures.size(); i++) {
           totalTemp += this.temperatures.get(i);
           numTemps += 1;
        }
        return totalTemp/numTemps;
    }

    public double getTotalRain() {
        double totalRain = 0;
        for(int i = 0; i < this.rainfall.size(); i++) {
            totalRain += this.rainfall.get(i);
        }
        return totalRain;
    }


}
