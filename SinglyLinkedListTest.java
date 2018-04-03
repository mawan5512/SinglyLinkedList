//Mohammed Awan 1/18/17 HHB 5037

package SinglyLinkedList;

public class SinglyLinkedListTest {

    public static void main(String [] args){

      NodeList list = new NodeList();

      System.out.println("Function has started");
      System.out.println("Creating List");
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      System.out.println("Getting list size");
      list.traverse();
      System.out.println("");
    }
}
