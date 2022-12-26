package webserver;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReader1 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        System.out.println(a);

        br.close();
    }
}