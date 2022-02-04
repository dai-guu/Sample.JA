
public class Capter01 {
	public static void main(String[] args) {
		String s1 = "Java ";
		String s2 = "java";
		String s3 = "Java";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");

		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");

		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {

		}
		System.out.println("s1は空文字です");

	}
}
