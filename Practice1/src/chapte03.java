
public class chapte03 {
	public static void main(String[] args) {
		String s1 = " Java programming ";
		System.out.println("文字列s1の3文字以降は" + s1.substring(3));
		System.out.println("文字列s1の3〜8文字目は" + s1.substring(3, 8));
		System.out.println("文字列s1の大文字=>小文字は" + s1.toLowerCase());
		System.out.println("文字列s1の小文字=>大文字は" + s1.toUpperCase());
		System.out.println(s1.trim());
	}
}
