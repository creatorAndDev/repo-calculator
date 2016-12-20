import javax.swing.JFrame;

public class Main extends JFrame{
	
	//fields
	int WIDTH = 250;
	int HEIGHT = 350;

	//constructor main for jframe
	public Main(){
		super("Калькулятор"); //заголовок окна
		
		setResizable(false); //запрещаем растягивать окно
		setSize(WIDTH, HEIGHT); //размер окна width, height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна по крестику
	}
	
	//main
	public static void main(String[] args) {
		Main app = new Main(); //создаем окно на основе нашего класса
		app.setVisible(true); //доступ true - что бы был виден
		app.setLocationRelativeTo(null); //позиция окна
	}

}
