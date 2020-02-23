
public class IntNodeDriver {

	public static void main(String[] args) {
		
			IntNode n1 = new IntNode(20,null);
			IntNode n2 = new IntNode(30,n1);
			IntNode n3 = new IntNode(40,null);
			
			n2.setLink(n3);
			n3.setLink(n1);
			
			int sum = 0;
			
			IntNode cursor = n2;
			
			while (cursor!= null){
				sum = sum + cursor.getData();
				cursor = cursor.getLink();
			}
			
			System.out.println(sum);
			

	}

}
