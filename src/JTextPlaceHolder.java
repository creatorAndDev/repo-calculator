import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class JTextPlaceHolder extends JTextField implements FocusListener {
	
	private String placeholder;
	private Color colorHit = getForeground();
	private boolean showHit;
	
	public JTextPlaceHolder(String placeholder) {
		super(placeholder);
		this.placeholder = placeholder;
		this.showHit = true;
		this.addFocusListener(this);
		this.setColorHit(new Color(255, 255, 255));
//		this.setColumns(15);
		this.setForeground(colorHit);
	}
	
	public Color getColorHit(){
		return colorHit;
	}
	public void setColorHit(Color colorHit){
		this.colorHit = colorHit;
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		if(this.getText().isEmpty()){
			super.setText("");
			showHit = false;
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(this.getText().isEmpty()){
			super.setText(placeholder);
			showHit = true;
		}
	}
	
	public String getText() {
		return showHit ? "" : super.getText();
	}

}
