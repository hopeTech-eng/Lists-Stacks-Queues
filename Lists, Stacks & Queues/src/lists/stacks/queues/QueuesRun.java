/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists.stacks.queues;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author HOPEWELL
 */
public class QueuesRun {   

     public static void main(String[] args) {
    Queues q = new Queues(3);
    
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    
         System.out.println(q.getFront());
    q.dequeue();
    
         System.out.println(q.getFront());
         System.out.println(q.getRear());
         
    q.enqueue(40);
         System.out.println(q);
     }
}
