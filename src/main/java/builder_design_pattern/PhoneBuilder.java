package builder_design_pattern;

/**
 * @author girishkumarkadambari
 */
public class PhoneBuilder {
    private String os;
    private Integer ram;
    private Double ScreenSize;
    private  String processor;
    private Boolean dualSim;


    public PhoneBuilder setOs(String os) {
        this.os = os;
        return  this;
    }

    public PhoneBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(Double screenSize) {
        this.ScreenSize = screenSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setDualSim(Boolean dualSim) {
        this.dualSim = dualSim;
        return this;
    }


    public Phone getPhone(){
        Phone phone = new Phone(os,ram,ScreenSize,processor,dualSim);
        return phone;
    }



}
