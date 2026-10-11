/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists.stacks.queues;

/**
 *
 * @author HOPEWELL
 */
public class Stack {
    int nums[] = new int[8];
    int top = 0;
    
    public void push(int x){
        nums[top] = x;
        top++;
    }
    
    public int pop(){
        int data;
        top--;
        data = nums[top];
        nums[top] = 0;
        
        return data;
    }
    public void display(){
        for (int i : nums){
            System.out.print(i + " ");
        }
    }
}
