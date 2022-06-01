package factory_design_pattern.server_application;

/**
 * @author girishkumarkadambari
 */
public class TestLabsFactory {

    public  TestLabs getInstance(String labs){
        if(labs.equals("Web App")){
            return new  BrowserStackLab();
        }else if(labs.equals("Mobile App")){
            return new BrowserStackLab();
        }else{
            return new TestSigmaLab();
        }
    }


}
