
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
		
		for(String number: numberArray) {
			if(!number.trim().isEmpty())
				sumValue+= Integer.parseInt(number);
		}
		
		
		return sumValue;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCalculator s = new StringCalculator();
		s.Add("");
	}

}
