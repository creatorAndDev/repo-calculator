import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Calc extends JFrame {
	
	//FIELDS
	private int WIDTH = 250;
	private int HEIGHT = 350;
	
	private int firstValue = 0;
	private String operation = "+";
	
	//Содержимое окна
	JTextArea display = new JTextArea("", 3, 99); //дисплей калькулятора
	
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
    JButton buttonDel = new JButton("C"); //кнопка С
    JButton buttonDivide = new JButton("/"); //кнопка /
    JButton buttonSub = new JButton("-"); //кнопка -
    JButton buttonMul = new JButton("*"); //кнопка *
    JButton buttonStart = new JButton("="); //кнопка =

	//CONSTRUCTOR MAIN FOR JFRAME CALC
	public Calc(){
		super("Калькулятор"); //заголовок окна
		
		setResizable(false); //запрещаем растягивать окно
		setSize(WIDTH, HEIGHT); //размер окна width, height
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
       
      //создаем кнопки и отключаем операции (кнопки) до активации ввода чисел
        buttonPanel.add(buttonSum).setEnabled(false);
        buttonPanel.add(buttonDel);
        buttonPanel.add(buttonDivide).setEnabled(false);
        buttonPanel.add(buttonSub).setEnabled(false);
        buttonPanel.add(buttonMul).setEnabled(false);
        
        //задаем размер кнопки =
        buttonStart.setPreferredSize(new Dimension(WIDTH, 50));
        
        //действия при клике
        //Добавление цифр в область textarea
        //слушатели
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        
        //кнопка "C" будет удалять
        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText("");
              //проверка, пустое ли поле ввода
//                if (temp.equals("")) {
//                	//отключаем кнопки
//                	buttonSum.setEnabled(false);
//                	buttonBack.setEnabled(false);
//                	buttonDivide.setEnabled(false);
//                	buttonSub.setEnabled(false);
//                	buttonMul.setEnabled(false);
//                } else {
////                display.setText(temp.substring(0, temp.length() - 1)); //убираем по одной
//                	display.setText(""); // сразу пустое место
//                }
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
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "*";
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "/";
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "-";
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        
        //2) реализация =
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
                
                //отключаем кнопки
                buttonStart.setEnabled(false);
                buttonSum.setEnabled(false);
                buttonDivide.setEnabled(false);
                buttonSub.setEnabled(false);
                buttonMul.setEnabled(false);
            }
        });
	}	
}
