
public class IntNodeDriver {

	public static void main(String[] args) {
		
			IntNode list = new IntNode(10,null);
			IntNode node2 = new IntNode(20,null);
			list.setLink(node2);
			IntNode n3 = new IntNode(5,list);
			list = n3;
			node2.addNodeAfter(50);
			list.addNodeAfter(70);
			
			IntNode.display(list);
			System.out.println("Changing the value in node2 from 20 to 200");
			node2.setData(200);
			
			IntNode.display(list);
			System.out.println("Deleting the list head");
			
			list = list.getLink();
			IntNode.display(list);

			System.out.println("Deleting a node after head");
			list.removeNodeAfter();
			IntNode.display(list);


	}

}
