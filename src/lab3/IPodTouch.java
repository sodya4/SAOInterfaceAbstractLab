/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vmware_xp
 */
public class IPodTouch implements AppleDevice{
    InternetConnectBehavior internetConnectBehavior;
    
    public IPodTouch() {}
    
    internetConnectBehavior = new InternetConnectWiFi();
    
    
}
