import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
public class Calc extends JFrame {
	
	//FIELDS
	private int WIDTH = 250;
	private int HEIGHT = 300;
	
	public long firstValue = 0;
//	private float floatValue = 0.0f;
	private String operation = "+";

	//CONSTRUCTOR MAIN FOR JFRAME CALC
	public Calc(){
		//Содержимое окна
//		JFrame frame = new JFrame();
//		JTextArea display = new JTextArea("", 1, 40); //дисплей калькулятора 
		//окно вывода посчета и чисел
		JTextField display = new JTextField(5);
		//панель содержащая кнопки
		JPanel buttonPanel = new JPanel(new GridLayout(3,5)); 
		
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
	    
		setTitle("Калькулятор"); //заголовок окна
		
		setResizable(false); //запрещаем растягивать окно
		setSize(WIDTH, HEIGHT); //размер окна width, height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна по крестику
		
		//цвет заднего фона панели
		getContentPane().setBackground(Color.GRAY);
		//цвет заднего фона кнопок
		buttonPanel.setBackground(Color.GRAY);
		
		//WINDOW FIELD
		//расположение содержимого в окне
		add(display, BorderLayout.NORTH); //добавляем окно ввода textarea
//		add(new JTextPlaceHolder("0"), BorderLayout.NORTH);
		//задаем размер шрифта в поле ввода
		display.setFont(new Font("Cosmic",Font.PLAIN, 62));
		//цвет фона окна ввода/вывода
//		display.setBackground(new Color(0, 0, 0));
		display.setBackground(Color.GRAY);
		//цвет ввода/вывода
		display.setForeground(Color.WHITE);
		//цвет бордера
		display.setBorder(new LineBorder(Color.GRAY, 1));
		//убираем с поля ввода чисел возможность редактировать
		display.setEditable(false);
		//Направление ввода чисел
		display.setHorizontalAlignment(JTextField.RIGHT);
		
//		getContentPane().add(new JTextPlaceHolder("0"), BorderLayout.LINE_START);
//		
		//ввод с клавиатуры. слушатель кнопок с помощью свитчера
//	    display.addKeyListener(new KeyAdapter() {
//	    	public void keyPressed(KeyEvent e) {
//	    		switch (e.getKeyCode() ) {
//	    			case KeyEvent.VK_0:
//	            	 	//добавляем цифру
//	            	 	display.setText(display.getText() + "0");
//	            	 	
//	            	 	//проверяем на длину и меняем шрифт
//	            	 	if(display.getText().length() == 8){
//                 			display.setFont(new Font("Serif",Font.PLAIN, 42));
//                 	    } else if(display.getText().length() == 12) {
//                 	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//                 	    } else if(display.getText().length() == 16) {
//                 	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//                 	    } else if(display.getText().length() == 22) {
//                 	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//                 	    }
//	            	 	
//	            	 	//включаем кнопки
//	            	 	buttonStart.setEnabled(true);
//                        buttonSum.setEnabled(true);
//                        buttonDivide.setEnabled(true);
//                        buttonSub.setEnabled(true);
//                        buttonMul.setEnabled(true);
//                        
//	            		break;
//	    			case KeyEvent.VK_1:
//	    				display.setText(display.getText() + "1");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_2:
//	    				display.setText(display.getText() + "2");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_3:
//	    				display.setText(display.getText() + "3");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_4:
//	    				display.setText(display.getText() + "4");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_5:
//	    				display.setText(display.getText() + "5");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_6:
//	    				display.setText(display.getText() + "6");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_7:
//	    				display.setText(display.getText() + "7");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_8:
//	    				display.setText(display.getText() + "8");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	    			case KeyEvent.VK_9:
//	    				display.setText(display.getText() + "9");
//
//	                    //меняем шрифт если число становится больше окна
//	                    if(display.getText().length() == 8){
//	            			display.setFont(new Font("Serif",Font.PLAIN, 42));
//	            	    } else if(display.getText().length() == 12) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 32));
//	            	    } else if(display.getText().length() == 16) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 22));
//	            	    } else if(display.getText().length() == 22) {
//	            	    	display.setFont(new Font("Serif",Font.PLAIN, 16));
//	            	    }
//	                    
//	                    //включаем кнопки
//	                    buttonStart.setEnabled(true);
//	                    buttonSum.setEnabled(true);
//	                    buttonDivide.setEnabled(true);
//	                    buttonSub.setEnabled(true);
//	                    buttonMul.setEnabled(true);
//	            		break;
//	           }
//		    }
//        });
		
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
        buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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

                //меняем размер шрифта если число становится больше окна
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
//                buttonStart.setEnabled(false);
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
                
    			buttonDivide.setEnabled(false);
    			buttonSub.setEnabled(false);
    			buttonMul.setEnabled(false);
//    			buttonStart.setEnabled(false);
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Long.valueOf(display.getText());
                display.setText("");
                operation = "*";
                buttonStart.setEnabled(true); //включаем равно
                
                buttonSum.setEnabled(false);
    			buttonDivide.setEnabled(false);
    			buttonSub.setEnabled(false);
//    			buttonStart.setEnabled(false);
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
                
                buttonSum.setEnabled(false);
    			buttonSub.setEnabled(false);
    			buttonMul.setEnabled(false);
//    			buttonStart.setEnabled(false);
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Long.valueOf(display.getText());
                display.setText("");
                operation = "-";
                buttonStart.setEnabled(true); //включаем равно
                
                buttonSum.setEnabled(false);
    			buttonDivide.setEnabled(false);
    			buttonMul.setEnabled(false);
//    			buttonStart.setEnabled(false);
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
