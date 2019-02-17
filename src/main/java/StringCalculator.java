import java.awt.List;
import java.util.ArrayList;

public class StringCalculator {
	
	
	
	public int Add(String numbers) {
		if(numbers == " ") {
			return 0;
		}
		int sumValue = 0;
		String delimiter = ",|\n";
		String numbersWithOutDelimiter = numbers;
		if(numbers.startsWith("//")) {
			delimiter = numbers.substring(numbers.indexOf("//")+2,numbers.indexOf("//")+3);
			numbersWithOutDelimiter = numbers.substring(numbers.indexOf("n")+1);
		}
		
		String[] numberArray = numbersWithOutDelimiter.split(delimiter);
		ArrayList negativeNumbers = new ArrayList();
		
		for(String number: numberArray) {
			if(!number.trim().isEmpty()) {
				int numberInt = Integer.parseInt(number.trim());
				if(numberInt< 0) {
					negativeNumbers.add(numberInt);
				}
				sumValue+= Integer.parseInt(number);
			}
		}
		if(negativeNumbers.size()>0) {
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
		}
		
		return sumValue;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCalculator s = new StringCalculator();
		System.out.println(s.Add(""));
	}

}
