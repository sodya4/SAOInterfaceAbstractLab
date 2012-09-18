/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author vmware_xp
 */
public interface ProgrammingCourse {
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public abstract void setCredits(double credits);
    
    public abstract String getCourseNumber();
    
    public abstract String getCourseName();
    
    public abstract void setCourseName(String courseName);
        
}