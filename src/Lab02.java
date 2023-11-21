public class Lab02 {
    public static void main(String[] args){

        System.out.println("----------------xiaomi test---------------------");
        // sample of construct
        AirPurifier xiaomi = new AirPurifier("xiaomi","pro","blue", "8c88743f");

        // sample of printOverAll() as class variable
        System.out.print("Overall air purifier count: ");
        AirPurifier.printOverAll();
        System.out.println("xiaomi model");
        xiaomi.showModel();
        xiaomi.switchPushing();

        System.out.println("----------------apple test---------------------");
        AirPurifier apple = new AirPurifier("apple","pro max","blue sky", "k08jh");
        System.out.println("apple model");
        apple.showModel();
        apple.switchPushing();
        apple.sensorPm(128);
        apple.showDisplay();
        apple.switchPushing();
        apple.showDisplay();
        System.out.print("Overall air purifier count: ");
        AirPurifier.printOverAll();

        System.out.println("----------------phillips test---------------------");
        AirPurifier philips = new AirPurifier("philips","pro","black","ascjcz28");
        System.out.print("Overall air purifier count: ");
        AirPurifier.printOverAll();
        System.out.println("philips model");
        philips.showModel();
        System.out.println("philips test");
        philips.showDisplay();
        philips.switchPushing();
        philips.sensorPm(51);
        philips.showDisplay();
        philips.sensorPm(21);
        philips.showDisplay();
    }
}
