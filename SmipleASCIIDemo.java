class SmipleASCIIDemo{
	public static void main(String args[]){
	//CHAR -> ASCII
	char ch='A';
	System.out.println("'"+ch+"'=>ASCII:"+(int)ch);
	//ASCII->CHAR
	int code = 99;
	System.out.println("ASCII"+code+(char)code+"'");
	//Find ASCII difference between A and a
	System.out.println("Difference between 'A' and 'a':"+('a' - 'A'));
	//Check if a char is digit
	char test = '5';
	System.out.println("'"+test +"' is digit:"+(test >= '0'&& test <= '9'));
	}
	}