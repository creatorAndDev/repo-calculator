import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main{
	
	//MAIN
	public static void main(String[] args) {
		Calc app = new Calc(); //создаем окно калькулятора на основе нашего класса
		app.setVisible(true); //доступ true - что бы был виден
		app.setLocationRelativeTo(null); //позиция окна
	}

}
