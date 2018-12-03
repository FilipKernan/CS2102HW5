public class Reading {

    Time time;
    double degrees;

    public double getDegrees() {
        return degrees;
    }

    public double getDeltaRainFall() {
        return deltaRainFall;
    }

    double deltaRainFall;

    public Reading() {
    }

    public Reading(Time time, double degrees, double deltaRainFall){
        this.time = time;
        this.degrees = degrees;
        this.deltaRainFall = deltaRainFall;
    }
}
