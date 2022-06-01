package factory_design_pattern.client_application;

import factory_design_pattern.server_application.TestLabs;
import factory_design_pattern.server_application.TestLabsFactory;
import factory_design_pattern.server_application.TestSigmaLab;

/**
 * @author girishkumarkadambari
 */
public class ClientApp {

    public  static  void main(String args[]){

        TestLabs ts = new TestSigmaLab();




        TestLabs testLabs = new TestLabsFactory().getInstance("Mobile App");
        testLabs.specifications();
        TestLabs testLabs1 = new TestLabsFactory().getInstance("Web App");
        testLabs1.specifications();
        TestLabs testLabs2 = new TestLabsFactory().getInstance("Api Testing");
        testLabs2.specifications();
    }

}
