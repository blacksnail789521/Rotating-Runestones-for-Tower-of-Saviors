import javax.swing.*;
import java.util.*;
import java.awt.*;


public class UITest
{
	public static void main(String[] args)
	{
		UI ui = new UI(); 
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setSize( 275, 250 ); // set frame size
		ui.setVisible(true); // display frame
	}
}