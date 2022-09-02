import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class exo2 {
	public static void main(String[] args) throws IOException {
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("notepad.exe");
		try {
			Process process = processBuilder.inheritIO().start();
			ProcessHandle.Info info = process.info();
			String np = "absent";
			System.out.println("le pid du process est " + process.pid());
			System.out.println("Nom de la commande " + info.command().orElse(np));
			System.out.println("Ligne de commande " + info.commandLine().orElse(np));
			process.waitFor(5, TimeUnit.SECONDS);
			process.destroy();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
