import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main extends JFrame{
	
	//FIELDS
	private int WIDTH = 250;
	private int HEIGHT = 350;
	
	private int firstValue = 0;
	private String operation = "+";
	
	//Содержимое окна
	JTextArea display = new JTextArea(); //дисплей калькулятора
	
	JPanel buttonPanel = new JPanel(new GridLayout(3,5)); //панель с кнопками
	
	//создаем обьекты кнопок
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
        
        //добавляем кнопки на панель buttonPanel
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
        
        //действия при клике
        //Добавление цифр в область textarea
        //слушатели
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });
        
        //кнопка "C" будет удалять
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0, temp.length() - 1));
            }
        });
        
        //действия выполнения операции над цифрами
        //1) очищаем поле при действии операции над цифрами * + - /
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "+";
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "*";
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "/";
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "-";
            }
        });
        
        //2) реализация =
//        try{
//        	buttonStart.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    int secondValue = Integer.valueOf(display.getText());
//                    if("+".equals(operation)){
//                        display.setText((firstValue + secondValue) + "");
//                    }
//                    if("-".equals(operation)){
//                        display.setText((firstValue - secondValue) + "");
//                    }
//                    if("*".equals(operation)){
//                        display.setText((firstValue * secondValue) + "");
//                    }
//                    if("/".equals(operation)){
//                        display.setText((firstValue / secondValue) + "");
//                    }
//                    firstValue = 0;
//                    operation = "+";
//                }
//            });
//        } catch(NumberFormatException e){
//        	System.out.println("Пусто!");
//        }
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.valueOf(display.getText());
                if("+".equals(operation)){
                    display.setText((firstValue + secondValue) + "");
                }
                if("-".equals(operation)){
                    display.setText((firstValue - secondValue) + "");
                }
                if("*".equals(operation)){
                    display.setText((firstValue * secondValue) + "");
                }
                if("/".equals(operation)){
                    display.setText((firstValue / secondValue) + "");
                }
                firstValue = 0;
                operation = "+";
            }
        });
	}
	
	//MAIN
	public static void main(String[] args) {
		Main app = new Main(); //создаем окно калькулятора на основе нашего класса
		app.setVisible(true); //доступ true - что бы был виден
		app.setLocationRelativeTo(null); //позиция окна
	}

}
