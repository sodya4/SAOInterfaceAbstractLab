/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vmware_xp
 */
public class IPhone4S extends IPhoneDevice{

    public IPhone4S() {
        setInternetConnectBehavior(new InternetConnectWiFi());
        setInternetConnectBehavior(new InternetConnect4G());
        setPhonecallRingBehavior(new PhonecallRingChime());
    }
 
}
