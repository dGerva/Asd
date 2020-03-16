public class Main
{

	public static void main(String[] args) {
		String nome = "Hello World!";
		for(int i=0; i<=nome.length(); i++){
		    String str2 = nome.substring(0, nome.length() - i);
		    System.out.println(str2);
		}

	}
}
