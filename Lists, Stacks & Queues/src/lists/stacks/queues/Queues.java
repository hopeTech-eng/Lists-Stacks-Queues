/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists.stacks.queues;

/**
 *
 * @author HOPEWELL
 */
class Queues {
    private int[] thisArray;
    private int capacity;
    private int size;
    
    //Constructor
    public Queues(int capacity){
        this.capacity = capacity;
        thisArray = new int[capacity];
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull(){
        return size == capacity;
    }
    
    //Enqueue
    public void enqueue(int x){
        if(isFull()) {
            System.out.println("Queue is full!");
           return;
        }
          thisArray[size] = x;
        size++;
        
    }
    
    //Dequeue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        } 
              for (int i = 1; i < size; i++) {
            thisArray[i-1] = thisArray[i];
        }
        size--;
        
    }
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return thisArray[0];
    }
     public int getRear() {
    if (isEmpty()) {
        System.out.println("Queue is empty!");
        return -1;
    }
    return thisArray[size - 1];
    }
}
