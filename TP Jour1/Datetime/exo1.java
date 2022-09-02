import java.time.*;

public class exo1
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();
		LocalDate pdate = LocalDate.of(1999, 02, 11);
		Period diff = Period.between(pdate, now);

		System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
	}
}
