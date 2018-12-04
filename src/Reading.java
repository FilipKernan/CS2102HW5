public class Reading {

    Time time;
    double degrees;
    double deltaRainFall;

    public double getDegrees() {
        return degrees;
    }

    public double getDeltaRainFall() {
        return deltaRainFall;
    }



    public Reading() {
    }

    public Reading(Time time, double degrees, double deltaRainFall){
        this.time = time;
        this.degrees = degrees;
        this.deltaRainFall = deltaRainFall;
    }
}
