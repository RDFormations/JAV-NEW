import java.util.*;

public class exo1 {
    public static void main(String[] args) {
		List<String> list = Arrays.asList("un", "deux", "trois", "quatre");
		System.out.println(list.stream().count());
	}
}
