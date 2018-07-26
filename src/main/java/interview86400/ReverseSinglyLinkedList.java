package interview86400;

public class ReverseSinglyLinkedList {

	public static void print(Node node) {
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		// three node single linked list
		Node node = new Node();
		node.value = 1;
		node.next = new Node();
		node.next.value = 2;
		node.next.next = new Node();
		node.next.next.value = 3;
		
		print(node);
		Node reversed = reverse(node);
		print(reversed);
		
		
	}
	
	public static Node reverse(Node head) {
		Node prev = null;
		while (head != null) {
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

}

class Node {
	Node next;
	int value;
}
