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

public class addingdeletinginll {
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

  private static void print(Node head){
    while(head!=null){
      System.out.print(head.data+" ");
      head = head.next;
    }
    System.out.println();
  }

private static Node deleteHead(Node head){
  if(head==null)return null;
  // Node temp = head;
  head = head.next;
  return head;
}

private static Node deleteTail(Node head){
  Node temp = head;
  if(head==null || head.next==null)return null;
  while(temp.next.next!=null){
    temp=temp.next;
  }
  temp.next=null;
  return head;
}

private static Node insertHead(Node head,int val){
  return new Node(val,head);
}

  
  public static void main(String[] args){
    int[] arr = {12,5,8,7};
    Node head = convert2LL(arr);
    // head = deleteHead(head);
    // head = deleteTail(head);
    head = insertHead(head, 1000);
    print(head);
  }
}
