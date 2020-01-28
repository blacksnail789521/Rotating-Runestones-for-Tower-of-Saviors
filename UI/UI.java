import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
//package 

public class UI extends JFrame
{
	private JTextField textField;
	private JCheckBox is_8_dir;
	
	public UI()
	{
		super( "Auto TOS!!!" );
		setLayout( new FlowLayout() );

		textField = new JTextField(20);
		textField.setEditable( false );
		add(textField);

		is_8_dir = new JCheckBox( "8_dir" );
		add(is_8_dir);

		CheckBoxHandler handler = new CheckBoxHandler();
		is_8_dir.addItemListener(handler);
		
		//path = "Runestone/" +  + ".jpg";
	}
	
	private class CheckBoxHandler implements ItemListener 
	{
		public void itemStateChanged(ItemEvent event)
		{
			if (is_8_dir.isSelected())
				textField.setText("allow_8_dir !");
			else
				textField.setText("not_allow_8_dir !");	
		}
	}
}