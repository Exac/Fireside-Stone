
/**
 * The Model from the MVC pattern. 
 * 
 * <p>This is the logical part of the program.
 * <p>Model is the APPLICATION. It UPDATES the Viewer.
 * 
 * @author      Exac
 * @version		%I%, %G%
 * @since		0.01
 */
public class Model 
{
	private Viewer v;
	
	Model()
	{
		//Open game window
		v.create(640, 480, "Fire Side Stone");
	}
}
