import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ddd = new BufferedReader(new InputStreamReader(System.in));
        int in = 0;
        int sum = 0;
        while (true) {
            in = Integer.parseInt(ddd.readLine());
            if(in == -1)
                break;
            System.out.println(sum);
            sum += in;
        }
    }
}