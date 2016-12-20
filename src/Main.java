public class Main{
	public static void main(String[] args) {
		Calc app = new Calc(); //создаем окно калькулятора на основе нашего класса
		app.setVisible(true); //доступ true - что бы был виден
		app.setLocationRelativeTo(null); //позиция окна
	}
}
