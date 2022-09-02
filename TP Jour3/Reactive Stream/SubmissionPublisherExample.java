import java.util.concurrent.*;
import java.util.*;

public class SubmissionPublisherExample {

    public static void main(String... args) throws InterruptedException {

        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        publisher.subscribe(new PrintSubscriber());

        System.out.println("Submitting items...");
		List<Integer> items = List.of(0, 1, 2, 3, 4, 5);

		items.forEach(publisher::submit);
        Thread.sleep(1000);
        publisher.close();
    }
}
