import java.awt.*;
import javax.swing.*;

public class GameFrameP extends JFrame{

	GamePanelP panel;
	
	GameFrameP(){
		panel = new GamePanelP();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}