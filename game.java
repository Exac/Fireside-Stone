import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class game extends Applet implements MouseListener
{
	int i = 0;
 	AudioClip soundFile1;
	AudioClip soundFile2;
	Image snoopy;
	Image background;
	public void init()
	{
		soundFile1 = getAudioClip(getDocumentBase(),"BEAST_FICTION.wav");
		soundFile2 = getAudioClip(getDocumentBase(),"shootS.au");
		snoopy = getImage(getDocumentBase(),"snoopy.gif");
		background = getImage(getDocumentBase(),"back.jpg");
      // When the applet gets here the sounds are loaded.
      // Add the mouselistener
		addMouseListener(this);
		soundFile1.play();
	}
	public void paint(Graphics g)
	{
		g.drawString("Epicest Game Ever",20,20);
		g.drawImage(background,0-i,0,this);
		g.drawImage(background,697-i,0,this);
		g.drawImage(snoopy,300,180,this);
		if(i<697)
			i++;
		else
			i=0;
	}

     // Play the second sound on a click.
	public void mouseClicked(MouseEvent evt)
	{
		soundFile2.play();
	}

	public void mousePressed(MouseEvent evt) {}
	public void mouseReleased(MouseEvent evt) {}
	public void mouseEntered(MouseEvent evt) {}
	public void mouseExited(MouseEvent evt) {}
	public void update(Graphics g)
	{
		paint(g);
	}
}

