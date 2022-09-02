public class Agenda {
	private int Month = 1;
	// static final int JANVIER = 1;
	// static final int FEVRIER = 2;
	// static final int MARS = 3;
	// static final int AVRIL = 4;
	// static final int MAI = 5;
	// static final int JUIN = 6;
	// static final int JUILLET = 7;
	// static final int AOUT = 8;
	// static final int SEPTEMBRE = 9;
	// static final int OCTOBRE = 10;
	// static final int NOVEMBRE = 11;
	// static final int DECEMBRE = 12;

	Agenda(int i)
	{
		this.Month = i;
	}

	boolean toSaison()
	{
		return switch (Month)
		{
			case 6, 7, 8:
				System.out.println("Été");
				yield true;
			case 9, 10, 11:
				System.out.println("automne");
				yield true;
			case 12, 1, 2:
				System.out.println("hiver");
				yield true;
			case 3, 4, 5:
				System.out.println("printemps");
				yield true;
			default:
				System.out.println("Bad input");
				yield false;
		};
	}
	public static void main(String[] args)
	{
		Agenda now = new Agenda(9);
		Agenda never = new Agenda(19);
		System.out.println(now.toSaison());
		System.out.println(never.toSaison());
	}
}
