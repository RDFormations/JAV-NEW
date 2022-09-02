import java.util.stream.IntStream;

public class exo2 {
    public static void main(String[] args) {
		IntStream.range(0, 151).filter(x->{return (x >= 5 && x <= 15);}).forEach(System.out::println);
	}
}
