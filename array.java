//reverse an array
// we can use this after sorting an array to ascending order to make it descending array.
/*import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
*/

// to check if string is palindrome after removing all spaces and converting in lower case
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int length = s.length();
        int start=0;
        int end=length-1;
        boolean isPalindrome=true;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome);
    }
    }

*/
// using hashing to check frequency of number elements:
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int hash[]=new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        int q=sc.nextInt();
        int queries[] = new int[q];
        for(int i=0;i<q;i++){
            queries[i] = sc.nextInt();
        }
        for(int i=0;i<q;i++){
            System.out.println(hash[queries[i]]);
        }

    }
}*/
//using hashing to print frequency of character
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int hash[] = new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        int q = sc.nextInt();
        char queries[] = new char[q];
        for(int i=0;i<q;i++){
            queries[i]=sc.next().charAt(0);
        } 
        for(int i=0;i<q;i++){
            System.out.println(hash[queries[i]]);
        }

    }
}*/


//practice
import java.util.*;
public class array{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int length=s.length();
        int hash[] = new int[256];
        for(int i=0;i<length;i++){
            hash[s.charAt(i)]++;
        }
        // int start=0;
        // int end=length-1;
        // boolean isPalindrome=true;
        // while(start<end){
        //     if(s.charAt(start)!=s.charAt(end)){
        //         isPalindrome=false;
        //         break;
        //     }
        //     start++;
        //     end--;
        // }
        //System.out.println(isPalindrome);
        boolean isSameFreq=true;
        int a=0;
        for(int i=0;i<length;i++){
            if(hash[s.charAt(0)]!=hash[s.charAt(i)]){
                isSameFreq=false;
                break;
            }
        }
        System.out.println(isSameFreq);
    }
}