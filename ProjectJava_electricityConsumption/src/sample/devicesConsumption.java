package sample;

public class devicesConsumption {


    protected String deviceName;
    protected double timeUsed;

    //setter and getter
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public double getTimeUsed() {
        return timeUsed;
    }
    public void setTimeUsed(double timeUsed) {
        this.timeUsed = timeUsed;
    }

    //Constructor
    public devicesConsumption(String deviceName, double timeUsed){
        this.deviceName = deviceName;
        this.timeUsed = timeUsed;
    }

    public String toString(){
        return String.format("%s\t\t%.2f", deviceName, timeUsed);
    }



}
