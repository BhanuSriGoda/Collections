class Queue {   
      
    private static int front, rear, capacity;   
    private static int queue[];   
     
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
     
    // insert an element into the queue  
    static void queueEnqueue(int item)  {   
          
        if (capacity == rear) {      
            return;   
        }    
        else {   
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    }   
     
    //remove an element from the queue  
    static void queueDequeue()  {   
         
        if (front == rear) {      
            return;   
        }      
        else {   
            System.out.println(queue[0]);
            for (int i = 0; i < rear - 1; i++) {   
                
                queue[i] = queue[i + 1];   
            }   
     
         
      // set queue[rear] to 0  
            if (rear < capacity)   
                queue[rear] = 0;   
     
            // decrement rear   
            rear--;   
        }   
        return;   
    }   
     
    // print queue elements   
    static void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
     
        // traverse front to rear and print elements   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }   
     
     
  
}   
   
public class QueueT5 {  
    public static void main(String[] args) {   
        // Create a queue of capacity 4   
        Queue q = new Queue(6);     
        q.queueEnqueue(1);   
        q.queueEnqueue(3);   
        q.queueEnqueue(5);   
        q.queueEnqueue(7);
        q.queueEnqueue(8);
        q.queueEnqueue(2);   
     
        
        System.out.println("Queue after Enqueue Operation:");  
        q.queueDisplay();   
      
        System.out.printf("\ndeleted elements are:");   
        q.queueDequeue();   
        q.queueDequeue();   
        System.out.printf("\nQueue after two dequeue operations:");   
  
        q.queueDisplay();   
  
    }   
}  