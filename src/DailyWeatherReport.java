import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DailyWeatherReport implements IWeatherReport{
    public GregorianCalendar getDate() {return date;}
    public LinkedList<Double> getTemperatures() {return temperatures;}
    public LinkedList<Double> getRainfall() {return rainfall;}

    private GregorianCalendar date;
    private LinkedList<Double> temperatures;
    private LinkedList<Double> rainfall;

    public DailyWeatherReport(){
        LinkedList<Double> tempReadings = new LinkedList<>();
        LinkedList<Double> rainReadings = new LinkedList<>();
    }


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
    @Override
    public double getAvgTemp() throws ArithmeticException{
        double totalTemp = 0;
        double numTemps = 0;
        for(int i = 0; i < this.temperatures.size(); i++) {
           totalTemp += this.temperatures.get(i);
           numTemps += 1;
        }
        return totalTemp/numTemps;
    }
    @Override
    public double getTotalRain() {
        double totalRain = 0;
        for(int i = 0; i < this.rainfall.size(); i++) {
            totalRain += this.rainfall.get(i);
        }
        return totalRain;
    }


}
