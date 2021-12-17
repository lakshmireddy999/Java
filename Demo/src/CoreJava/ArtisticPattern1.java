package CoreJava;
import java.util.*;
public class ArtisticPattern1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Diamond");
        int n=sc.nextInt();
        //Line 1
        for(int i=1;i<=2*n+2;i++){
            if(i==1 || i==2*n+2){
                System.out.print("+");
            }else{
                System.out.print("-");
            }
        }
        System.out.println();

        //Upper part
        if(n>1){

            for(int i=1;i<=n-1;i++){
                System.out.print("|");
                for(int s=n-2;s>=i;s--){
                    System.out.print(" ");
                }
                System.out.print(" ");
                if(i%2==0){
                    System.out.print("/");
                    for(int j=1;j<=2*i-2;j++){
                        System.out.print("-");
                    }
                    System.out.print("\\");
                }else{
                    System.out.print("/");
                    for(int j=1;j<=2*i-2;j++){
                        System.out.print("=");
                    }
                    System.out.print("\\");
                }
                for(int s=n-1;s>=i;s--){
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.println();
            }
        }


        //center part
        System.out.print("|");
        System.out.print("<");
        if(n%2==0){
            for(int i=1;i<=2*n-2;i++){
                System.out.print("-");
            }
        }else{
            for(int i=1;i<=2*n-2;i++){
                System.out.print("=");
            }
        }
        System.out.print(">");
        System.out.print("|");

        System.out.println();

        //down part
        if(n>1){
            for(int i=n-1;i>=1;i--){
                System.out.print("|");
                for(int s=n;s>=i+2;s--){
                    System.out.print(" ");
                }


                System.out.print(" ");
                if(i%2==0){
                    System.out.print("\\");
                    for(int j=1;j<=2*i-2;j++){
                        System.out.print("-");
                    }
                    System.out.print("/");
                }else{
                    System.out.print("\\");
                    for(int j=1;j<=2*i-2;j++){
                        System.out.print("=");
                    }
                    System.out.print("/");
                }
                for(int s=n;s>=i+2;s--){
                    System.out.print(" ");
                }
                System.out.print(" |");

                System.out.println();
            }
        }

        //Last Line
        for(int i=1;i<=2*n+2;i++){
            if(i==1 || i==2*n+2){
                System.out.print("+");
            }else{
                System.out.print("-");
            }
        }

    }
}
