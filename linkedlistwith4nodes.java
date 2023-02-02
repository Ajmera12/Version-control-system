public class SinglyLinkedList{
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public Node head = null;
    public Node tail = null;
    //add node
    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
}
public void display(){
    Node current = head;

    if(head == null){
        System.out.println("list is empty");
        return;
    }

}
public static void main(String[] args){
    SinglyLinkedList slist = new SinglyLinkedList();
    
    s.List.addNodes(1);
    s.List.addNodes(2);
    s.List.addNodes(3);
    s.List.addNodes(4);

    s.List.display();





}
