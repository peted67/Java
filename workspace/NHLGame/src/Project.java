import java.applet.Applet;

import java.awt.MediaTracker;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;

public class Project extends Applet
{
    private Image logo = null;

    public void init()
    {
        // Load the Logo
        try 
        {
            MediaTracker imageWait = new MediaTracker(this);
            logo = this.getImage(getClass().getResource("images/logo.png"));
            imageWait.addImage(logo, 0);
            // Wait for the image to load
            imageWait.waitForAll();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        // TODO: Initialization things here.
    }
    
    /**
     * This is where things will get drawn to the screen within your applet.
     */
    public void paint(Graphics g)
    {
        // Draw our hello world
        g.setColor(new Color(236, 236, 236));
        g.fillRect(0, 0, 640, 480);
        g.setColor(Color.BLACK);
        g.drawString("Hello world from compilr.com with Java!", 25, 25);
        g.drawImage(logo, 0, 50, null);
    }
}






