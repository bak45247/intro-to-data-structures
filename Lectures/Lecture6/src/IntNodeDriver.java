
public class IntNodeDriver {

	public static void main(String[] args) {
		
			IntNode myList = new IntNode(10,null);
			myList = new IntNode(20,myList);
			myList = new IntNode(30,myList);
			myList = new IntNode(40,myList);
			myList.addNodeAfter(70);
			
			
			IntNode n = myList.getLink();
			n.addNodeAfter(90);
			
			//IntNode.display(n);
			
			
			myList.removeNodeAfter();
			//IntNode.display(n);
			n.removeNodeAfter();

			//IntNode.display(myList);
			
			//System.out.println(IntNode.listLength(myList));
			//System.out.println(IntNode.listLength(n));
			
			IntNode m = IntNode.listSearch(myList, 90);
			//IntNode.display(m);
			m.addNodeAfter(100);
		
			IntNode z = m.getLink();
			z.removeNodeAfter();
			
			IntNode.display(n);
			
			
			
	}

}
