import java.util.Scanner;
public class Ain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double i=sc.nextInt();
        double j=sc.nextInt();
        double z=(i*i)+(j*j);
        System.out.printf("%.2f",Math.sqrt(z));
    }
}