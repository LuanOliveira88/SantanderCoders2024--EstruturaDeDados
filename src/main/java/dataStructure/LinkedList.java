package dataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
        }
    }

    // construtor da classe LinkedList
    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if (this.head == null){
            System.out.println("Lista vazia");
        } else{
            System.out.println("Head: "+ head.data);
        }
    }

    public void getTail(){
        if (this.tail == null){
            System.out.println("Lista vazia");
        } else {
            System.out.println("Tail: " + tail.data);
        }
    }

    public void getLength(){
        System.out.println("Length: "+ this.length);
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;

    }

    public void print(){
        Node temp = this.head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void append(String data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public void removeLast(){
        if (length == 0) {
            return;
        }
        Node pre = head;
        Node temp = null;
        while (pre.next != tail){
            pre = pre.next;
        }

        temp = tail;
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }

    }

    public void prepend(String data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, String data){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prepend(data);
            return true;
        }
        if (index == length){
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp =  get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean set(int index, String data){
        Node temp = get(index);

        if (temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }

    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;



    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.append("elemento 4");
        list.insert(2, "elemento 2.5");
        list.print();
    }

}
