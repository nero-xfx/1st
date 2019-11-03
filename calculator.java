//Класс калькулятор
public class calculator{
	private int result; //результат
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	public int getResult() { //получить результат
		return this.result;
	}
	public void cleanResult() { //очистить результат
		this.result = 0;
	}
}