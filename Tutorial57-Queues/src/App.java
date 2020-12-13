import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

//Lets assume the text below is a queue of people. Normally, people would enter the queue and the back, and leave at the front. In programming, the 
//front of the queue is called the head, and the end of the queue is called the tail. A queue is a first in first out structure, meaning that the 
//first item that you remove from a queue is also the first item that you added. You add to the tail and remove from the head. LinkedList implements
//the queue interface. Just like in real life, a queue can have a maximum size. 
//(head)<- oooooooooooooooooooooooooo <- (tail)

//The queue interface has three methods. Add, remove, and element. Add and remove are straight forward, while element returns the head of the 
//que(number at the start)

	public static void main(String[] args) {

		// Like for sets, queues need to point to a child class of itself, it can't
		// point to itself. In arrayblocking queue, you can set the size of the queue in
		// the brackets, e.g the one below has a max size of 3
		Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(3);

		// This won't work because I set the max size to 3. It doesn't tell me to handle
		// this exception, therefore it is a runtime exception.
		queue1.add(10);
		queue1.add(20);
		queue1.add(30);

		System.out.println("Head of queue is " + queue1.element());
		
		// Obviously this exception wouldn't happen with a linkedList because it doesn't
		// have a maximum sizeed
		try {
			queue1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue");
		}

		// Use this to see what is in your arrayBlocking queue
		for (Integer value : queue1) {
			System.out.print("Queue value is " + value + ", ");
		}

		System.out.println();

		// The two lines below show that the remove method removes the element in the
		// head of the queue.
		Integer value = queue1.remove();

		// Prints out the old head of the queue, 10
		System.out.println("The number " + value + " was removed from the queue");

		// Checks if the queue contains the value written inside of the brackets
		System.out.println(queue1.contains(1));

		// Removing last 2 values. Make sure you only remove two, by setting integer to
		// 0, making it go to less than 2. If not, the for loop will attempt to remove 3
		// elements, which there is none. It will throw a NoSuchElementException.
		try {
			for (int i = 0; i < 2; i++) {
		
			System.out.print("The number " + queue1.remove() + " was removed from the queue, ");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Too many values attempted to be removed ");
		}
	}

}
