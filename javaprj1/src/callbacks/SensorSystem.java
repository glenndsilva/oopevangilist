package callbacks;

import java.util.Enumeration;
import java.util.Vector;

public class SensorSystem {
    private Vector listeners = new Vector();

    public void register(AlarmListner alarmListener) {
        listeners.addElement(alarmListener);
    }

    public void soundTheAlarm() {
    	System.out.println("Coming");
        for (Enumeration e = listeners.elements(); e.hasMoreElements();) {
            ((AlarmListner) e.nextElement()).alarm();
        }
    }
	
	
    	   public static void main(String args[]) {
    		   
    		     SensorSystem st = new SensorSystem();
    		     st.register(new AlarmListner() {
    				public void alarm() {
    					System.out.println("This is it");
    				}
    			});
    			 st.soundTheAlarm();
    		}
       
}
