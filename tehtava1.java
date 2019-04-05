package algoritmit;

import java.util.*;

public class tehtava1 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		String eka = "Hepo";
		String toka = "Kisu1";
		int tulos = eka.compareTo(toka);
		System.out.println(tulos);

		boolean onko = eka.equals(toka);
		System.out.println(onko);
		return tulos;
		
	}
	
	 public int evaluate(String expression) {
		    int sum = 0;
		    for (String summand: expression.split("\\+"))
		      sum += Integer.valueOf(summand);
		    return sum;
		  }

}
