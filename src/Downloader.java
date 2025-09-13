import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Downloader {
    public static void runCommand(String[] command) throws InterruptedException {
        ProcessBuilder pb = new ProcessBuilder(command);
        pb.directory(new File("C:\\Users\\SourcesNet\\Downloads"));

        try {
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with code: " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}