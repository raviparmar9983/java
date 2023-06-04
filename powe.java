import java.util.Scanner;

public class powe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        int n=sc.nextInt();
        System.out.println("enter the exponent");
        int b=sc.nextInt();
        int res=1;
        while(b>0){
            res*=n;
            b--;
        }
        System.out.println(res);

    }
}
