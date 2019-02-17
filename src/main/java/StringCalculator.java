
public class StringCalculator {
	
	
	
	public int Add(String numbers) {
		if(numbers == " ") {
			return 0;
		}
		
		String[] numberArray = numbers.split(",");
		
		
		
		return Integer.parseInt(numbers);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCalculator s = new StringCalculator();
		s.Add("");
	}

}
