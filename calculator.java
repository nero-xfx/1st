import java.lang.Math;
//Класс калькулятор
public class calculator{
	private double result_sum; //результат
	private double result_sub;
	private double result_mult;
	private double result_div;
    private double result_pow;
	public void add(double ... params) {
		
			this.result_sum = params[0]+params[1];
			this.result_sub = params[0]-params[1];
			this.result_mult = params[0]*params[1];
			this.result_div = params[0]/params[1];
			this.result_pow = Math.pow(params[0], params[1]);
		
	}
	public double getResult_sum() { //получить результат
		return this.result_sum;
	}
	public double getResult_sub() { //получить результат
		return this.result_sub;
	}
	public double getResult_mult() { //получить результат
		return this.result_mult;
	}
	public double getResult_div() { //получить результат
		return this.result_div;
	}
	public double getResult_pow() { //получить результат
		return this.result_pow;
	}
	public void cleanResult() { //очистить результат
		this.result_sum = 0;
		this.result_sub = 0;
		this.result_mult = 0;
		this.result_div = 0;
		this.result_pow = 0;
	}
}