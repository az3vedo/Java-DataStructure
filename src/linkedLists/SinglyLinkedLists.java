package linkedLists;
/**
 * SinglyLinkedLists
 * È possível apenas avançar pelos nós sem a possibilidade de verificar o nó
 * anterior
 */

class SingleNode {
  public int value;
  public SingleNode next;
}

class SinglyLinkedLists {
  public static void main(String args[]) {
    SingleNode head = new SingleNode();

    SingleNode n1 = new SingleNode();

    SingleNode n2 = new SingleNode();
    head.value = 21;
    n1.value = 33;
    n2.value = 46;

    head.next = n1;
    n1.next = n2;
    n2.next = null;

    SingleNode currentNode = head;

    while (currentNode != null) {
      System.out.println(currentNode.value);
      currentNode = currentNode.next; // 21 33 46
    }

  }
}