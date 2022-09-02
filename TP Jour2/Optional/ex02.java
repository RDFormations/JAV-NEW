import java.util.Optional;

public class ex02 {
	static Optional<String> Data = Optional.ofNullable(null);

	static void  ResetData()
	{
		Data = Optional.ofNullable(String.valueOf("Book"));
	}

	void SetData(String MyData)
	{
		Data = Optional.ofNullable(MyData);
	}

	void Search()
	{
		Data.ifPresentOrElse(x->x.isBlank(), ex02::ResetData);
		System.out.println(Data.get());
	}
}
