import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Player {
    private static final int ADULT_AGE = 18;
	private String name;
    private int age;

    public Player(int age, String namePlayer) {
        this.age = age;
		this.name = namePlayer;
    }

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }

	public void display() {
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		List<Player> ListedePlayer = Arrays.asList(new Player(15, "adam"), new Player(25, "eve"), new  Player(19, "chris"), new Player(2, "rayan"));

		var enfant = ListedePlayer.stream().filter(Predicate.not(Player::isAdult)).collect(Collectors.toList());
		var adult = ListedePlayer.stream().filter(Player::isAdult).collect(Collectors.toList());

		System.out.println("enfant :");
		enfant.stream().forEach((var x)->x.display());
		System.out.println("\nadult :");
		adult.stream().forEach((var x)->x.display());
	}
}

