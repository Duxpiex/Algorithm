import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();
        int s = 0;

        for( int i = 1 ; i <= N ; i++ ) s+=i;

        System.out.println(s);
    }
}