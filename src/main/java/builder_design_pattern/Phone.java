package builder_design_pattern;

/**
 * @author girishkumarkadambari
 */
public class Phone {
    private String os;
    private Integer ram;
    private Double ScreenSize;
    private  String processor;
    private Boolean dualSim;


    public Phone(String os, Integer ram, Double screenSize, String processor, Boolean dualSim) {
        this.os = os;
        this.ram = ram;
        ScreenSize = screenSize;
        this.processor = processor;
        this.dualSim = dualSim;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", ScreenSize=" + ScreenSize +
                ", processor='" + processor + '\'' +
                ", dualSim=" + dualSim +
                '}';
    }
}
