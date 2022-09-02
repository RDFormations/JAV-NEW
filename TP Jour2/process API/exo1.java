import java.io.IOException;

public class exo1 {
	public static void main(String[] args) throws IOException {
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("notepad.exe");
		try {
			Process process = processBuilder.inheritIO().start();
			ProcessHandle.Info info = process.info();
			String np = "absent";
			System.out.println("le pid du process est " + process.pid());
			System.out.println("Ligne de commande " + info.command().orElse(np));
			System.out.println("Nom de la commande " + info.commandLine().orElse(np));
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
