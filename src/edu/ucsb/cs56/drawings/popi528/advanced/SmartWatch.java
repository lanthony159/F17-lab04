package edu.ucsb.cs56.drawings.popi528.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A House
      
   @author Austin Liang 
   @version for CS56, F17, UCSB
   
*/
public class SmartWatch extends Watch implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public SmartWatch(double x, double y, double width, double height)
    {
	// construct the basic watch shell
	super(x,y,width,height);

	// declare the size of location of each application
    double distance = 0.15;    
    
    double app_w = (1 - 3 * distance) * width / 2;
    double app_h = (1 - 3 * distance) * width / 2;   
    
    double app1_x = x + distance * width;
    double app1_y = y + distance * height;
    double app2_x = app1_x + app_w + distance * width;
    double app2_y = app1_y;

    double app3_x = app1_x;
    double app3_y = app1_y + app_h + distance * height;
    double app4_x = app2_x;
    double app4_y = app3_y;

    // add application graph on watch shell    
    Rectangle2D.Double firstApp = 
            new Rectangle2D.Double(app1_x, app1_y,
				   app_w, app_h);
    
    Rectangle2D.Double secondApp = 
            new Rectangle2D.Double(app2_x, app2_y,
				   app_w, app_h);

    Rectangle2D.Double thirdApp = 
            new Rectangle2D.Double(app3_x, app3_y,
				   app_w, app_h);
    Rectangle2D.Double fourthApp = 
            new Rectangle2D.Double(app4_x, app4_y,
				   app_w, app_h);

    // add the apps to the watch

	
        GeneralPath wholeWatch = this.get();
        wholeWatch.append(firstApp, false);
        wholeWatch.append(secondApp, false);
	wholeWatch.append(thirdApp, false);
	wholeWatch.append(fourthApp, false);
    }    
}
