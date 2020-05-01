import java.util.LinkedList;
import java.util.Queue;

public class QueueDriver3 {

	public static void main(String[] args) {
		
			IntQueueInterface q1 = new IntArrayQueue(20);
			
			q1.add(10);
			q1.add(20);
			q1.add(30);
			q1.add(40);
			q1.add(50);
			
			System.out.println("q before removing element at index 3:" + q1);
			removeAtIndex1(q1,3);
			System.out.println("q after removing element at index 3:" + q1);
			
			////////////////////////////////
			
			Queue<Integer> q = new LinkedList();
			
			q.add(10);
			q.add(20);
			q.add(30);
			q.add(40);
			q.add(50);
			System.out.println("original q:" + q);
			Queue<Integer> aftertemving3 = removeAtIndex2(q,3);
			System.out.println("Output queue: "+aftertemving3);
			System.out.println("original q after removeAtIndex2:" + q);
			
			System.out.println("original q:" + q);
			int elementat3 = removeAtIndex3(q,3);
			System.out.println("Output element: "+elementat3);
			System.out.println("original q after removeAtIndex3:" + q);
			
			
			Queue<Integer>[] twoQueues = split();
			System.out.println("First queue: "+twoQueues[0]);
			System.out.println("Second queue: "+twoQueues[1]);

	}

	
	//this method changes the input queue by extracting the element
	//at position index where front is at index 1
	public static void removeAtIndex1(IntQueueInterface q, int index){
		
		IntLinkedQueue tempQ =  new IntLinkedQueue();
		
		int pos = 0;
		while (!q.isEmpty()){
			int num = q.remove();
			pos++;
			if (pos != index)
				tempQ.add(num);
		}
		
		while (!tempQ.isEmpty())
			q.add(tempQ.remove());
		
	}
	
	
		//this method does not change the input queue 
		//the method returns as output another queue that is the same
		//as the input queue but with the element at position index removed
		
		public static Queue<Integer> removeAtIndex2(Queue<Integer> q, int index){
			
			Queue<Integer> tempQ1 =  new LinkedList();
			Queue<Integer> tempQ2 = new LinkedList();
			
			int pos = 0;
			while (!q.isEmpty()){
				int num = q.remove();
				tempQ2.add(num);
				pos++;
				if (pos != index)
					tempQ1.add(num);
			}
			
			
			while (!tempQ2.isEmpty())
				q.add(tempQ2.remove());
			
			return tempQ1;
			
		}
		
		//this method returns the element at index as output
		//while maintaing the input queue not changed
		public static int removeAtIndex3(Queue<Integer> q, int index){
			
			Queue<Integer> tempQ =  new LinkedList();
			
			
			int pos = 0;
			int output = -1;
			while (!q.isEmpty()){
				int num = q.remove();
				pos++;
				tempQ.add(num);
				if (pos == index)
					output =  num;

			}
			
			
			while (!tempQ.isEmpty())
				q.add(tempQ.remove());
			
			return  output;
			
		}
		
		
		public static Queue<Integer>[] split(){
			
			Queue<Integer>[] output = new LinkedList[2];
			output[0] = new LinkedList();
			output[1] = new LinkedList();
			
			
			output[0].add(10);
			output[0].add(20);
			
			output[1].add(30);
			output[1].add(40);
			
			return output;
			
		}

}
