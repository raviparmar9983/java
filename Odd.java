import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2!=0){
                System.out.println(i+" ");
            }
            i++;
        }
    }
}
