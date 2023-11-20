public class Lab02 {
    public static void main(String[] args){
        AirPurifier xiaomi = new AirPurifier("pro","blue", "8c88743f");
        System.out.println("xiaomi test");
        xiaomi.switchPushing();
        System.out.print("Air purifier number ");
        AirPurifier.printOverAll();
        System.out.println("xiaomi model");
        xiaomi.showModel();

        AirPurifier apple = new AirPurifier("pro max","blue sky", "k08jh");
        System.out.println("apple test");
        apple.sensorPm(128);
        apple.switchPushing();
        apple.showDisplay();
        System.out.print("Air purifier number ");
        AirPurifier.printOverAll();
        System.out.println("apple model");
        apple.showModel();
        apple.switchPushing();
        apple.showDisplay();

        AirPurifier philips = new AirPurifier("pro","black","ascjcz28");
        System.out.print("Air purifier number ");
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
