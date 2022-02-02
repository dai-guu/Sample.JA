
public class null1 {
public static void main(String args[]) {
	String s1;
	s1 = "あいう";
			System.out.println(s1 + "の文字数:" + s1.length());
	s1 = "";
	System.out.println(s1 + "の文字数:" + s1.length());
	
	s1 = null;
	System.out.println(s1 + "の文字数:" + s1.length());
}

}
