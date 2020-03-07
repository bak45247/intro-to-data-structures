
public class SequenceDriver {

	public static void main(String[] args) {
		IntArraySequence s1 = new IntArraySequence(10);
		s1.addAfter(10);
		s1.addAfter(20);
		s1.addAfter(30);
		System.out.println(s1);
		s1.start();
		s1.advance();
		s1.addAfter(40);
		System.out.println(s1);
		s1.addBefore(50);
		System.out.println(s1);
		s1.start();
		s1.advance();
		s1.addAfter(60);
		System.out.println(s1);
		s1.advance();
		s1.removeCurrent();
		System.out.println(s1);
		s1.start();
		s1.addAfter(70);
		
		System.out.println(s1);

	}

}
