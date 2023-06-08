/*
 * 	An interface for the Client class
 *  
 *  by: Josiah Brough (22160417)
 */

package exercises;

public interface Play {
	public DigitalContent getCurrentStream();
	public void stream(String query);
	public void stop();
}
