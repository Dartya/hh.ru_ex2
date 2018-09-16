import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;  //столбцы
    static int m;  //строки
    public static void main(String[] args) {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();
        boolean string_exist = true;
        int iter = 0;
        String buf = new String();

        while (string_exist){
            try {
                buf = scanner.readLine();
            }
            catch (IOException e){
                System.out.println(e.toString());
            }
            if (buf.equals("")){
                string_exist = false;
                break;
            }
            else {
                list.add(buf);
                iter++;
            }
        }
        if (iter > 0)
        n = list.get(0).length();
        else n = 0;
        m = iter;
        System.out.println("n = "+n+", m = "+m);

        char[][] achar = new char[n][m];
        for (int i = 0; i < m; i++){
            achar[i] = list.get(i).toCharArray();
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                System.out.println(achar[i][j]);
            }
        }
    }
}