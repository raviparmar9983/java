import java.util.Scanner;

public class Armstrong {
    public static boolean armstro(int n){
        int sum=0;
        int x=n;
        while(n!=0){
            int last=n%10;
            sum+=Math.pow(last,3);
            n=n/10;
        }
        return sum==x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(armstro(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
