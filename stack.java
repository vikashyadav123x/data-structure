import java.util.*;

public class stack {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size of array: ");
    int n  = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<n;i++){
      st.push(arr[i]);
    }
    st.pop();
    // System.out.println(st.size());
    // System.out.println(st.peek());
    System.out.println("good boy' ");
    System.out.println(st);
  }
}
