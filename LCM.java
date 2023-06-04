import java.util.Scanner;

public class LCM {
    public static int lcm(int a,int b){
        int lcm=0;
        
        for(int i=1;i<=a;i++){
            lcm=b*i;
            for(int j=1;j<=b;j++){
                if(lcm==j*a){
                    return lcm;
                }
            }
        }
        return 0;
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n = sc.nextInt();
        System.out.println("enter the second number");
        int n1 = sc.nextInt();
        System.out.println(lcm(n, n1));
    }
}
