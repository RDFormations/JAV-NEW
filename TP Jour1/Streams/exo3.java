import java.util.*;

public class exo3 {
	public static boolean IsVoyelle(String str)
	{
		char c = str.charAt(0);
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
	}
    public static void main(String[] args) {
		List<String> list = Arrays.asList("un", "deux", "trois", "quatre", "cinq", "eleven");
		list.stream().filter(exo3::IsVoyelle).forEach(System.out::println);
	}
}
