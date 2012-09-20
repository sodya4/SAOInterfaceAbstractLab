/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author vmware_xp
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private final String ERR_MSG = 
            "Error: courseNumber cannot be null of empty string";
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            //throw new IllegalArgumentException(ERR_MSG);
        }
        this.courseNumber = courseNumber;
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            //Move this part to a GUI.
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public final String getCourseName() {
        return courseName;
    }
    
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            //Move this part to a GUI.
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public final double getCredits() {
        return credits;
    }
    
    
    
    
    
}
