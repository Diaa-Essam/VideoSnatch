import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter YouTube URL: ");
        String url = scanner.nextLine();

        System.out.print("Choose quality [360|720|1080]: ");
        String quality = scanner.nextLine();

        String[] command = {
                "cmd", "/c", "yt-dlp",
                "-f", "best[height<=" + quality + "] ",
                url
        };
    }
}