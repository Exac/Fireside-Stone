import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;

/**
 * The Viewer from the MVC pattern, this should be instantiated 
 * inside Model, and should only do graphics, not computation.
 * <p>All the graphical output should be routed through this 
 * class. It is UPDATED by the Model.
 * 
 * @author      Exac
 * @version		%I%, %G%
 * @since		0.01
 */
public class Viewer
{
	Viewer()
	{
		
	}
	/**
     * Console log.
     *
     * @param string_	The string to be output to the console.
     * @author			Exac
     * @since			1.0
     */
	public static void out(String string_)
	{
		System.out.println(string_);
	}
	/**
     * Create OpenGL Window
     *
     * @param win_x		Window width
     * @param win_		Window height
     * @param win_name	Window's name
     * @author			Exac
     * @since			1.0
     */
	public void create(int win_x, int win_y, String win_name)
	{
		try {
			Display.setDisplayMode(new DisplayMode(win_x, win_y));
			Display.setVSyncEnabled(true);
			Display.setTitle(win_name);
			Display.create();
			out("Window created.");
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
}
