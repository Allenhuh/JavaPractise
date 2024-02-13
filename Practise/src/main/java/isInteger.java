import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class isInteger {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i = 0; t_i < T; t_i++)
            {
                String N = br.readLine();

                String out_ = Check_Integer(N);
                System.out.println(out_);

            }

            wr.close();
            br.close();
        }
        static String Check_Integer(String N){
            // Write your code here
            String result = "";
            try{
                BigDecimal a = new BigDecimal(N);
                a.setScale(0, RoundingMode.UNNECESSARY);
                result = "YES";

            } catch(Exception e) {
                result = "NO";
            }

            return result;

        }
}
