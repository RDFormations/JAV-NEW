import java.util.*;

public class exo4 {
    public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5 , 5, 7, 5, 25, -5, -48, 99, 48, 12, 16, 17, 19, 80, 1, 8, 7, 3, 4, 9, 8, 15, 12, 17);
		list.stream().distinct().sorted().forEach(System.out::println);
	}
}
