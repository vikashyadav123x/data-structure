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

private static Node insertPosition(Node head,int el,int k){
  if(head==null){
    if(k==1){
      return new Node(el);
    }else{
      return head;
    }
  }
  if(k==1){
    return new Node(el,head);
  }


  Node temp=head;
  int cnt=0;
  while(temp!=null){
    cnt++;
    if(cnt==(k-1)){
      Node x = new Node(el,temp.next);
      temp.next = x;
      break;
    }
    temp=temp.next;
  }
  return head;
}

  
  // public static void main(String[] args){
  //   int[] arr = {12,5,8,7};
  //   Node head = convert2LL(arr);
  //   // head = deleteHead(head);
  //   // head = deleteTail(head);
  //   // head = insertHead(head, 1000);
  //   head = insertPosition(head, 1000,2);
  //   print(head);
  // }


  private static Node reverse(Node head){
    Node temp = head;
    Node prev=null;
    
    while(temp!=null){
      Node front = temp.next;
      temp.next = prev;
      prev = temp;
      temp=front;
    }
    return prev;

  }
  private static boolean isPalindrome(Node head){
    Node slow =head;
    Node fast = head;
    if(head==null || head.next==null)return true;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast = fast.next.next;
    }
    Node newHead = reverse(slow.next);

    Node first = head;
    Node second  = newHead;
    while(second!=null){
      if(first.data!=second.data)return false;
      first=first.next;
      second=second.next;
    }
    return true;
  }

  public static void main(String[] args){
    int[] arr = {12,77,5,8,5,77,12};
    Node head = convert2LL(arr);
    System.out.println(isPalindrome(head));
  }
}
