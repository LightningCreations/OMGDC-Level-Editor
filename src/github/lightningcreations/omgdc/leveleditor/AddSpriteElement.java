package github.lightningcreations.omgdc.leveleditor;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class AddSpriteElement implements Runnable {

	private JFrame parent;

	public AddSpriteElement(JFrame parent) {
		this.parent = parent;
	}

	@Override
	public void run() {
		JDialog box = new JDialog(parent,"Add Sprite");
		
	}
	

}
