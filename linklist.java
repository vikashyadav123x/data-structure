import java.util.*;

class Node{
  int data;
  Node next;

  // Node(int data){
  //   this.data = data;
  //   this.next = null;
  // }


  //First constructor lets you create a node and directly connect it to another:
  Node(int data1,Node next1){
    this.data = data1;
    this.next = next1;
  }

  //Second constructor is simpler, useful when you just want to create a new node with no next yet:
  Node(int data1){
    this.data = data1;
    this.next = null;
  }
}




public class linklist {
  private static Node convert2LL(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i=1;i<arr.length;i++){
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  public static void main(String[] args){
    int[] arr = {112,5,6,8};
    // Node y = new Node(arr[3]);
    // System.out.println(y.data);
    Node head = convert2LL(arr);
    // System.out.println(head.data);
    //Node head = new Node(arr[0]);
    Node temp = head;
    int cnt=0;
    while(temp!=null){
      System.out.print(temp.data+" ");
      if(temp.data==5)System.out.println('1');
      temp = temp.next;
      cnt++;
    }
    System.out.println(head.data);


  }
}
