package builder_design_pattern;

/**
 * @author girishkumarkadambari
 */
public class Shope {
    public  static  void main(String args[]){

        Phone phone = new PhoneBuilder().setOs("Android")
                .setProcessor("SanpDragon")
                .setRam(2)
                .setScreenSize(6.6)
                .setDualSim(true)
                .getPhone();

        Phone phone2 = new PhoneBuilder().setOs("IOS")
                .setProcessor("MediaTech")
                .setRam(2)
                .getPhone();

        System.out.println(phone.toString());
        System.out.println(phone2.toString());


    }

}
