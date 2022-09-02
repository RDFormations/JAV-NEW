import java.util.Optional;

public class exo1 {
	Optional<String> Data = Optional.ofNullable(null);

	void SetData(String MyData)
	{
		Data = Optional.ofNullable(MyData);
	}

	void Search()
	{
		if (!Data.isPresent())
			System.out.println("Data is null");
		else
			System.out.println(Data.get());
	}
}
