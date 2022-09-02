import java.util.stream.*;;

public class Main {

	public static void main(String[] args) {
		int [] myIntArray = IntStream.rangeClosed(0, 10000).toArray();
		System.out.println(Sum.sumArray(myIntArray));
	}
}
