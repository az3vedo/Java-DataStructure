/**
 * Doubly LinkedList
 * É possível navegar pelos itens conectados diretamente (próximo, anterior)
 */
class Node {
  public int value;
  public Node prev;
  public Node next;
}

public class DoublyLinkedList {
  public static void main(String args[]) {
    Node first = new Node();
    Node second = new Node();
    Node third = new Node();

    first.value = 11;
    first.prev = null;
    first.next = second;

    second.value = 22;
    second.prev = first;
    second.next = third;

    third.value = 33;
    third.prev = second;
    third.next = null;

    Node currentNode = first;
    System.out.println(currentNode.value); // 11

    currentNode = currentNode.next;
    System.out.println(currentNode.value); // 22

    currentNode = currentNode.next;
    System.out.println(currentNode.value); // 33

    currentNode = currentNode.prev;
    System.out.println(currentNode.value); // 22

    currentNode = currentNode.prev;
    System.out.println(currentNode.value); // 11
  }
}