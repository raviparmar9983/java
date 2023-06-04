import java.util.Scanner;

public class HCF {
    public static int hcf(int a,int b){
        int hcf=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the second number");
        int n1 = sc.nextInt();
        System.out.println(hcf(n, n1));
    }
}
