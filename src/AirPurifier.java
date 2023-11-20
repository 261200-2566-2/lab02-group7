import java.sql.SQLOutput;

public class AirPurifier {
    //class variables
    static int overallCount;
    //instance variables
    String model;
    String serialNum;
    String color_case;
    int pm;
    boolean _switch;

    //class methods
    static void setOverallCount(){
        overallCount++;
    }
    static void printOverAll(){
        System.out.println(overallCount);
    }
    //instance methods
    public void switchPushing(){
        _switch = !_switch;
    }
    public void showDisplay(){
        System.out.println("status on/off " + _switch);
        System.out.println("pm " + pm);
    }
    public void sensorPm(int pm){
        this.pm = pm;
    }
    public void showModel(){
        System.out.println("Model Name "+ model);
        System.out.println("Serial Number "+serialNum);
        System.out.println("Color "+color_case);
    }
    AirPurifier(String model,String color,String serialNum){
        this.model =model ;
        this.color_case = color ;
        this.serialNum = serialNum;
        setOverallCount();
    }


}
