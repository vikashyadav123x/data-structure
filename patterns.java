/*
****
****
****
****
 */
/*
import java.util.*;
class a{
    void b(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
public class patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a obj = new a();
        obj.b(n);
    
} */
 class A{
    public int digits(int x){
        return(int)Math.floor(Math.log10(x)+1);
    }
}

public class patterns{
    
    public static void main(String[] args){
        //int x=9999;
        int x=999334449;
        A obj = new A();
        System.out.println(obj.digits(x));
    }
}