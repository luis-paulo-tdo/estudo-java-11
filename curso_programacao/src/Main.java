public class Main {

	public static void main(String[] args) {
		
		String textOriginal = "abcde FGHIJ ABC abc DEFG     ";
		String textLower = textOriginal.toLowerCase();
		String textUpper = textOriginal.toUpperCase();
		String textTrimmed = textOriginal.trim();
		
		String textSubstringOne = textOriginal.substring(2);
		String textSubstringTwo = textOriginal.substring(2, 9);
		
		String textReplacedOne = textOriginal.replace('a', 'x');
		String textReplacedTwo = textOriginal.replace("abc", "xy");
		
		int textIndex = textOriginal.indexOf("bc");
		int textLastIndex = textOriginal.lastIndexOf("bc");
		String[] textVector = textOriginal.split("bc");
		
		System.out.println("String Functions");
		System.out.println("==================================================");
		System.out.println("Original Value:\t\t[" + textOriginal + "]\n");
		
		System.out.println("Format toLowerCase:\t[" + textLower + "]");
		System.out.println("Format toUpperCase:\t[" + textUpper + "]");
		System.out.println("Format trim:\t\t[" + textTrimmed + "]\n");
		
		System.out.println("Cut substring(2):\t[" + textSubstringOne + "]");
		System.out.println("Cut substring(2, 9):\t[" + textSubstringTwo + "]\n");
		
		System.out.println("Replace a to x:\t\t[" + textReplacedOne + "]");
		System.out.println("Replace abc to xy:\t[" + textReplacedTwo + "]\n");
		
		System.out.println("Index of bc:\t\t[" + textIndex + "]");
		System.out.println("Last Index of bc:\t[" + textLastIndex + "]\n");
		
		System.out.println("Vector Index 0:\t\t[" + textVector[0] + "]");
		System.out.println("Vector Index 1:\t\t[" + textVector[1] + "]");
		System.out.println("Vector Index 2:\t\t[" + textVector[2] + "]");
	}
}
