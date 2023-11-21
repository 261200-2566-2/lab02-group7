
public class AirPurifier {
    //class variables
    private static int overallCount;

    //instance variables
    String name;
    String model;
    String serialNum;
    String color_case;
    int AQI;
    boolean _switch = false;

    //class methods
    private static void setOverallCount(){
        overallCount++;
    }
    static void printOverAll(){
        System.out.println(overallCount);
    }
    //instance methods
    public void switchPushing(){
        _switch = !_switch;
        System.out.println("(switch is pushed!!!!!)");
    }
    public void showDisplay(){
        if (_switch){
            System.out.println("status: on");
            System.out.println("AQI: " + AQI);
        }
        else System.out.println("status: off");

    }
    public void sensorPm(int pm){
        this.AQI = pm;
        System.out.println("(sensor detected !!!!)");
    }

    public void showModel(){
        System.out.println("Model Name: "+ model);
        System.out.println("Serial Number: "+serialNum);
        System.out.println("Color: "+color_case);
    }
    // construct
    AirPurifier(String name,String model,String color,String serialNum){
        this.name = name;
        this.model =model ;
        this.color_case = color ;
        this.serialNum = serialNum;
        setOverallCount();
        System.out.println("(" + name + " " + model + " is made!!!!)");
    }
}
