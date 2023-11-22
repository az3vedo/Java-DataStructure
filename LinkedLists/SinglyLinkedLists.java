/**
 * SinglyLinkedLists
 * È possível apenas avançar pelos nós sem a possibilidade de verificar o nó
 * anterior
 */

class Node {
  public int value;
  public Node next;
}

class SinglyLinkedLists {
  public static void main(String args[]) {
    Node head = new Node();

    Node n1 = new Node();

    Node n2 = new Node();
    head.value = 21;
    n1.value = 33;
    n2.value = 46;

    head.next = n1;
    n1.next = n2;
    n2.next = null;

    Node currentNode = head;

    while (currentNode != null) {
      System.out.println(currentNode.value);
      currentNode = currentNode.next; // 21 33 46
    }

  }
}