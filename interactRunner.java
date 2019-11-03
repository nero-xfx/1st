import java.util.Scanner;
//Класс для запуска калькулятора с поддержкой ввода
public class interactRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try 
		{
			calculator calc = new calculator();
			String exit = "no";
			while(!exit.equals("yes")) 
			{
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
		}	finally {
			reader.close();
		}	
	}
}