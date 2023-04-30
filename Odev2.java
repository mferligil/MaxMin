import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Kaç tane sayı giriceksiniz:");
       int n=input.nextInt();
       int max=0;
       int min=0;

       for (int i=1; i<=n; i++){
           System.out.println(+i+".Sayı :");
          int number=input.nextInt();
           if(i==1){
               max=number;
               min=number;
           }
           if(number>max){
               max=number;
           }
           if(number<min){
               min=number;
           }



       }

        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);
    }

}
