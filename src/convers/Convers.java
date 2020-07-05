package convers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author Lobiritus
 */
public class Convers {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
          try
          {
          System.out.print("Введите исходное число: ");
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String initialNumber = br.readLine();
          
          System.out.print("Введите основание исходного числа от 2 до 36: ");          
          String numberBase = br.readLine();
          int x = Integer.parseInt(numberBase);
          
          System.out.print("Введите основание системы счисления в которую вы хотите перевести от 2 до 36: ");
          String userNumberBase = br.readLine();
          int b = Integer.parseInt(userNumberBase);
        
          if (b>1 && b<37)
            {
          BigInteger a = new BigInteger(initialNumber,x);
          String s = a.toString(b);
          System.out.print("Перевод: " + initialNumber + " из: " + numberBase + " системы счисления "+ "в: " + userNumberBase + " систему счисления" + "\nРезультат: " + s + "\n");
            }
          else
            {
             System.out.print("Введите пожалуйста правильную систему счисления от 2 до 36: "); 
            }
          }
          catch(Exception e){
              System.out.print("Пожалуйста следуйте инструкции на консоли");
              
          }
    }
    
}
