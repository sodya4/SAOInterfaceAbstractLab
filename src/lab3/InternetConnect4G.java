/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vmware_xp
 */
public class InternetConnect4G implements InternetConnectBehavior{

    public void connectToInternet() {
        connect4G();
    }
    
    public void connect4G() {
        System.out.println("Connected to Internet though 4G.");
    }
    
}
