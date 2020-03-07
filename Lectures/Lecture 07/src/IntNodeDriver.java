public class IntNodeDriver {

	public static void main(String[] args) {
		IntNode myList = new IntNode(10,null);
		myList = new IntNode(20,myList);
		myList = new IntNode(30,myList);
		myList = new IntNode(40,myList);
		myList.addNodeAfter(70);
		
		
		IntNode.insertkth(myList,4, 100);
		
		IntNode revList = IntNode.getReversedList(myList);
		
		IntNode.display(revList);
		
		

	}

}
