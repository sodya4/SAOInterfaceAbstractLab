/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vmware_xp
 */
public class Startup {
    public static void main(String[] args) {
        IPhoneDevice scottsphone = new IPhone4S();
        scottsphone.connectToInternet();
        scottsphone.phoneRings();
    }
}
