import java.awt.*;
import java.applet.*;

public class Dealer extends Player {

	

	public Dealer() {
		super();
		
	}

	public void draw(Graphics g) {
		int xOffset = 50;
		for (int i=0; i<numbCards; i++) {
			if (i == 0) {
				theHand[i].drawBack(g, new Rectangle(xOffset, 355, 150, 300));
			} else {
				theHand[i].draw(g, new Rectangle(xOffset, 355, 150, 300));
				
			}
			xOffset += 50;	
		}
	}
}