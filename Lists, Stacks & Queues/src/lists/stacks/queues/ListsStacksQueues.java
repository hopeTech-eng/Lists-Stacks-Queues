/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lists.stacks.queues;

/**
 *
 * @author HOPEWELL
 */

public class ListsStacksQueues {

    public static class ListNode{
        Object element;
        ListNode next;
        
        ListNode(Object element) {
            this.element = element;
            this.next = null;
        }
    }
    
    public static class LinkedList {
        private ListNode header;
        
        public LinkedList() {
            header = new ListNode(null);
        }
        
public boolean isEmpty() { // checks if a node is empty
    return header.next == null;
}

 public void addFirst(Object x) {
     ListNode n = new ListNode(x);
     n.next = header.next;
     header.next = n;
 }
 
 public void display() {
     ListNode current = header.next;
     while (current != null) {
         System.out.print(current.element + " -> ");
         current = current.next;
     }
     System.out.println("null");
 }
}
        public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.addFirst("A");
       list.addFirst("B");
       list.display();   // B -> A -> null
    }
}
