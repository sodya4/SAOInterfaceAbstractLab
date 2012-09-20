/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vmware_xp
 */
public class InternetConnectWiFi implements InternetConnectBehavior{

    public void connectToInternet() {
        connectWiFi();
    }
    
    public void connectWiFi() {
        System.out.println("Connected to Internet through WiFi.");
    }
    
}
