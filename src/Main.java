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
        ArrayList<Integer> columns = new ArrayList();
        ArrayList<Integer> rows = new ArrayList();
        int count_o = 0;
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
        if ((n > 100)|| (m > 100)) return;

        char[][] achar = new char[n][m];
        for (int i = 0; i < m; i++){
            achar[i] = list.get(i).toCharArray();
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                //System.out.print(achar[i][j]);
                if (achar[i][j] == 'o') {
                    count_o++;
                    columns.add(j);
                    rows.add(i);
                }
                else continue;
            }
        }
        System.out.println("Элементов \"о\": "+count_o);
        for (int i = 0; i < count_o; i++) {
            System.out.println(""+(i+1)+"-й член \"о\": "+rows.get(i)+", "+columns.get(i)+".");

        }
    }
}