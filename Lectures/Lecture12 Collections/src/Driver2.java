
public class Driver2 {

	public static void main(String[] args) {
		IntArraySequence seq1 = new IntArraySequence(10);	
		seq1.addAfter(10);
		seq1.addAfter(20);
		seq1.addAfter(30);
		seq1.addAfter(40);	
		System.out.println(seq1);		
		seq1.start();
		seq1.advance();
		seq1.advance();
		seq1.advance();
		seq1.addBefore(50);
		System.out.println(seq1);		
		seq1.removeCurrent();
		System.out.println(seq1);

		

	}

}
