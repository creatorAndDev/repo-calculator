import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
	
	//FIELDS
	private int WIDTH = 250;
	private int HEIGHT = 350;
	
	//Содержимое окна
	JTextArea display = new JTextArea(); //дисплей калькулятора
	
	JPanel buttonPanel = new JPanel(new GridLayout(3,5)); //панель с кнопками
	
    JButton button0 = new JButton("0"); //кнопка 0
    JButton button1 = new JButton("1"); //кнопка 1
    JButton button2 = new JButton("2"); //кнопка 2
    JButton button3 = new JButton("3"); //кнопка 3
    JButton button4 = new JButton("4"); //кнопка 4
    JButton button5 = new JButton("5"); //кнопка 5
    JButton button6 = new JButton("6"); //кнопка 6
    JButton button7 = new JButton("7"); //кнопка 7
    JButton button8 = new JButton("8"); //кнопка 8
    JButton button9 = new JButton("9"); //кнопка 9
    JButton buttonSum = new JButton("+"); //кнопка +
    JButton buttonBack = new JButton("C"); //кнопка С
    JButton buttonDivide = new JButton("/"); //кнопка /
    JButton buttonSub = new JButton("-"); //кнопка -
    JButton buttonMul = new JButton("*"); //кнопка *
    JButton buttonStart = new JButton("="); //кнопка =

	//CONSTRUCTOR MAIN FOR JFRAME CALC
	public Main(){
		super("Калькулятор"); //заголовок окна
		
		setResizable(false); //запрещаем растягивать окно
		setSize(WIDTH, HEIGHT); //размер окна width, height
//		setLayout(new BorderLayout()); //для расположения кнопок и полей
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна по крестику
		
		//расположение содержимого в окне
		add(display, BorderLayout.NORTH); //добавляем окно ввода textarea
		add(buttonPanel, BorderLayout.CENTER); //добавляем область для кнопок от 0 - 9 +=-/...
        add(buttonStart, BorderLayout.SOUTH); //добавляем кнопку =
        
        //добавляем кнопки
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
	}
	
	//MAIN
	public static void main(String[] args) {
		Main app = new Main(); //создаем окно на основе нашего класса
		app.setVisible(true); //доступ true - что бы был виден
		app.setLocationRelativeTo(null); //позиция окна
	}

}
