/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists.stacks.queues;

/**
 *
 * @author HOPEWELL
 */
public class STACKrun {
    
     public static void main(String[] args) {
    Stack nums = new Stack();
    
         nums.push(5);
         nums.push(8);
         nums.push(12);
         nums.push(1000);
         nums.push(56);
         
         System.out.println(nums.pop());
         nums.display();
     }
}
