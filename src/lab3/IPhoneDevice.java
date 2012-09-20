/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vmware_xp
 */
public abstract class IPhoneDevice implements AppleDevice, PhonecallRingBehavior{
    
    private InternetConnectBehavior internetConnectBehavior;
    private PhonecallRingBehavior phonecallRingBehavior;

    public InternetConnectBehavior getInternetConnectBehavior() {
        return internetConnectBehavior;
    }

    public void setInternetConnectBehavior(InternetConnectBehavior internetConnectBehavior) {
        this.internetConnectBehavior = internetConnectBehavior;
    }

    public PhonecallRingBehavior getPhonecallRingBehavior() {
        return phonecallRingBehavior;
    }

    public void setPhonecallRingBehavior(PhonecallRingBehavior phonecallRingBehavior) {
        this.phonecallRingBehavior = phonecallRingBehavior;
    }
    
    public IPhoneDevice(){}
    
    public void connectToInternet(){
        internetConnectBehavior.connectToInternet();
    }
    
    public void phoneRings(){
        phonecallRingBehavior.phoneRings();
    }
}
