import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        String[] commands= input.trim().split("&");

        for(String s : commands){
            Process process= Runtime.getRuntime().exec("cmd /c"+s);
            BufferedReader content= new BufferedReader(new InputStreamReader(process.getInputStream()));

            while((s= content.readLine()) != null) {
                System.out.println(s);
           }
            content.close();
        }
    }
}
