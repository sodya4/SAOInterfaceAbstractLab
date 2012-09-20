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
    
    InternetConnectBehavior internetConnectBehavior;
    PhonecallRingBehavior phonecallRingBehavior;
    
    public IPhoneDevice(){}
    
    public void connectToInternet(){
        internetConnectBehavior.connectToInternet();
    }
    
    public void phoneRings(){
        phonecallRingBehavior.phoneRings();
    }
}
