
public class Main {
	public static void main(String[] args) {
		String a = "ab";
		String b = new String("ab");
		String c = "a" + "b";
		
		System.out.println(a == b);
		System.out.println(a == c);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.intern());
	}
}
