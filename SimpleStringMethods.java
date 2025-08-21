class SimpleStringMethods{
	public static void main (String args[]){
	String text = " Hello World";
	System.out.println("Length:"+ text.length());
	System.out.println("First 'o' at index:"+text.indexOf('o'));
	System.out.println("Sunstring(0,6):"+text.substring(0,6));
	System.out.println("Trimmed:"+text.trim()+"'");
	System.out.println("Uppercase:"+text.toUpperCase());
	String other = "hello world";
	System.out.println("Equals ignore case:"+text.trim().equalsIgnoreCase(other));
	}
}