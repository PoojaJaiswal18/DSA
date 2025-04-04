package LinkedList;

public class Node {
    int data;
    Node next;
    static Node head = null;
    static int size = 0;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
        } else if (index >= size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void remove() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public static void removeLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        }
    }

    public static void removeMiddle(int index) {
        if (index == 0) {
            remove();
        } else if (index >= size) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public static void reverse() {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    public static Node FindMidUsingSlowFast(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static boolean checkPalindrome(Node head){

        Node mid=FindMidUsingSlowFast(head);
        Node current = mid;
        Node prev = null;
        Node next=current.next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node ptr1=head;
        Node ptr2=prev;

        while(ptr2!=null){
            if(ptr1.data!= ptr2.data){
                return  false;
            }

            ptr1=ptr1.next;
            ptr2=ptr2.next;

        }
        return true;


    }

    public static boolean checkIfCycle(Node head){

        Node slow=head;
        Node fast=head;
        while(slow!=fast){
            if(fast==null||fast.next==null){

                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }

        return true;
    }

//    public static void mergeTwoSortedLists(Node Left,Node Right){
//
//        Node ptrRight=Right;
//        Node ptrLeft=Left;
//        Node dummy;
//        if(ptrLeft.data>ptrRight.data){
//            dummy=ptrRight;
//            ptrRight=ptrRight.next;
//            dummy.next=null;
//            ptrRight=ptrRight.next;
//
//        }
//        else{
//            dummy=ptrLeft;
//            ptrLeft=ptrLeft.next;
//        }
//    }
//
//
//
//    public static void mergeSort(Node left,Node right){
//
//       Node mid= FindMidUsingSlowFast(left;
//        right=mid.next;
//        mid.next=null;
//
//
//        mergeSort(left,right);
//        mergeSort(right,null);
//
//
//
//
//    }


public static void zizag(Node head){
Node newll = new Node(-1);
Node dum=newll;
        Node mid=FindMidUsingSlowFast(head);
    Node current = mid;
    Node prev = null;
    Node next=current.next;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    Node ptr1=head;
   Node ptr2=prev;

    while(ptr2!=null){
        dum.next=ptr1;
        ptr1= ptr1.next;
        dum=dum.next;
        dum.next=ptr2;
        ptr2= ptr2.next;
        dum=dum.next;

    }
    head = newll.next;


}


    public static void main(String[] args) {
      addFirst(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);
        display();
        zizag(head);
        display();





    }
}

