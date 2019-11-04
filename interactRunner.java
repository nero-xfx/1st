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
				System.out.println("Enter sign: ");
				String sign = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				if (sign.equals("+"))
					System.out.println("Result: " + calc.getResult_sum());
				if (sign.equals("-"))
					System.out.println("Result: " + calc.getResult_sub());
				if (sign.equals("*"))
					System.out.println("Result: " + calc.getResult_mult());
				if (sign.equals("/"))
					System.out.println("Result: " + calc.getResult_div());
				if (sign.equals("^"))
					System.out.println("Result: " + calc.getResult_pow());
				calc.cleanResult();
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
		}	finally {
			reader.close();
		}	
	}
}