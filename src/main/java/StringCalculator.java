
public class StringCalculator {
	
	
	
	public int Add(String numbers) {
		if(numbers == " ") {
			return 0;
		}
		int sumValue = 0;
		
		String[] numberArray = numbers.split(",|\n");
		
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
