import java.util.LinkedList;
import java.util.Queue;

public class JavaQueueDriver {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.remove());
		q.add(40);
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.add(50);
		System.out.println(q);


	}

}
