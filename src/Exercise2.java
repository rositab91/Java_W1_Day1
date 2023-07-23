
public class Exercise2 {

	public static void main(String[] args) {
		// a
		int x = 3;
		int y = 6;
		int result = multiplicate(x, y);
		System.out.println("Multiplying 'x' and 'y', our result will be: " + result + "\n------");

		// b
		String word = "Rosita";
		int number = 26;
		String concatenation = concatenate(word, number);
		System.out.println("Concatenating 'word' and 'number', our result will be: " + concatenation + "\n------");

		// c
		String[] array = { "alfa", "beta", "gamma", "delta", "omega" };
		String[] newArray = addToArray(array, "epsilon");
		for (int i = 0; i < 6; i++) {
			System.out.println(newArray[i]);
		}
	}

	public static int multiplicate(int x, int y) {
	return x * y;
	}

	public static String concatenate(String word, int number) {
		return word + number;
	}
		
	public static String[] addToArray(String[] stringArray, String s) {
			String[] newArray= new String[6];
			
			newArray[0]=stringArray[0];
			newArray[1]=stringArray[1];
			newArray[2]=s;
			newArray[3]=stringArray[2];
			newArray[4]=stringArray[3];
			newArray[5]=stringArray[4];
			
			return newArray;
		}
	}


