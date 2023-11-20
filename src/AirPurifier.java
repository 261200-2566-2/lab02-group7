public class AirPurifier {
  //class variables
    static int overallCount;

    //instance variables
    String model;
    String serialNum;
    String _case;
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
      AirPurifier(String model,String colors,String serialNum){
         this.model =model ;
         this._case = colors ;
         this.serialNum = serialNum;
         setOverallCount();
         printOverAll();
      }
}
