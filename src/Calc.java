import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Calc extends JFrame {
	
	//FIELDS
	private int WIDTH = 250;
	private int HEIGHT = 300;
	
	public long firstValue = 0;
//	private float floatValue = 0.0f;
	private String operation = "+";
	
	//Содержимое окна
//	JTextArea display = new JTextArea("", 1, 40); //дисплей калькулятора 
	//окно вывода посчета и чисел
	JTextField display = new JTextField(5);
	
	JPanel buttonPanel = new JPanel(new GridLayout(3,5)); //панель содержащая кнопки
	
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
		//задаем размер шрифта в поле ввода
		display.setFont(new Font("Serif",Font.PLAIN, 62));
		
		//убираем с поля ввода чисел возможность редактировать
		display.setEditable(false);
		//Направление ввода чисел
		display.setHorizontalAlignment(JTextField.RIGHT);
		
//		if(display.equals(4)){
//			display.setFont(new Font("Serif",Font.PLAIN, 22));
//		}
		
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
        //задаем размер шрифта кнопкам
        buttonSum.setFont(new Font("Serif",Font.PLAIN,24));
        buttonDel.setFont(new Font("Serif",Font.PLAIN,16));
        buttonDivide.setFont(new Font("Serif",Font.PLAIN,24));
        buttonSub.setFont(new Font("Serif",Font.PLAIN,24));
        buttonMul.setFont(new Font("Serif",Font.PLAIN,24));
        buttonStart.setFont(new Font("Serif",Font.PLAIN,32));
        
        //задаем размер кнопки =
        buttonStart.setPreferredSize(new Dimension(WIDTH, 46));
        
        //действия при клике
        //Добавление цифр в область textarea
        //слушатели
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
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

                //меняем шрифт если число становится больше окна
                if(display.getText().length() == 8){
        			display.setFont(new Font("Serif",Font.PLAIN, 42));
        	    } else if(display.getText().length() == 12) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
        	    } else if(display.getText().length() == 16) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
        	    } else if(display.getText().length() == 22) {
        	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
        	    }
                
                //включаем кнопки
                buttonStart.setEnabled(true);
                buttonSum.setEnabled(true);
                buttonDivide.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
            }
        });
        
        //кнопка "C" будет очищать поле
        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText("");
                display.setFont(new Font("Serif",Font.PLAIN, 62));
                
                //отключаем кнопки
                buttonSum.setEnabled(false);
    			buttonDivide.setEnabled(false);
    			buttonSub.setEnabled(false);
    			buttonMul.setEnabled(false);
    			buttonStart.setEnabled(false);
    			
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
                firstValue = Long.valueOf(display.getText());
                display.setText("");
                operation = "+";
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Long.valueOf(display.getText());
                display.setText("");
                operation = "*";
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Long.valueOf(display.getText());
//                floatValue = Float.valueOf(display.getText());
                
                display.setText("");
                operation = "/";
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Long.valueOf(display.getText());
                display.setText("");
                operation = "-";
                buttonStart.setEnabled(true); //включаем равно
            }
        });
        
        //2) реализация =
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long secondValue = Long.valueOf(display.getText());
                
                //для дробного вычисления
                float secondFloatValue = Float.valueOf(display.getText());
                
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
                	//создаем переменную дробных вычислений
                	float numResult = (float) (firstValue / secondFloatValue);
                	
                	//проверка на целое число и пересчет по типу
            		if(numResult % 1 == 0){
            			long numResultLong = (long) (firstValue / secondValue);
            			display.setText((numResultLong) + "");
            		} else {
            			display.setText((numResult) + "");
            		}
                }
                firstValue = 0;
                operation = "+";
            }
        });
	}	
}
