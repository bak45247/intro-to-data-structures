
public class BagSequenceDriver {

	public static void main(String[] args) {
		
		IntArrayBag b1 =  new IntArrayBag(10);
		
		b1.add(10);
		b1.add(50);
		b1.add(30);
		b1.add(40);
		
		b1.remove(50);
		
		System.out.println(b1);
		
		/*
		IntArraySequence s1 = new IntArraySequence(20);
		
		s1.addAfter(10);
		s1.addAfter(20);
		s1.start();
		s1.addAfter(100);
		s1.addBefore(60);
		
		
		System.out.println(s1);
		
		*/
	}

}
