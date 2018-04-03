//Mohammed Awan 1/18/17 HHB 5037

package SinglyLinkedList;

public class NodeList {
  protected Node head;
  protected Node tail;

  public int size;

  public NodeList(){
    head = null;
    tail = null;
    size = 0;
  }

//function that adds a node to the end of the list
  public void add(int data){
    Node node = new Node(data, null);

    if (head == null){
        head = node;
        tail = node;
    }
    else{
        tail.next = node;
        tail = node;
    }
  }

//function that taverses in the list
  public void traverse(){
    Node nptr;

    nptr = head;

    while(nptr != null){
      size++;  //The size will increase as it traverses each node
      nptr = nptr.next;
    }
    System.out.print("The size is " + size);

  }
}
