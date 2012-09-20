/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vmware_xp
 */
public class GalaxyIII extends SamsungDevice implements PhonecallRingBehavior {

    public GalaxyIII() {
        internetConnectBehavior = new InternetConnect4G();
    }

    public void phoneRings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
