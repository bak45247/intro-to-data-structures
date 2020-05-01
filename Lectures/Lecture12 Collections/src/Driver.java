
public class Driver {

	public static void main(String[] args) {
		
		IntArrayBag myBag = new IntArrayBag(10);
		
		myBag.add(10);
		myBag.add(20);
		myBag.add(30);
		
		
		IntArraySequence s1 = new IntArraySequence();
		s1.addAfter(10);
		s1.addAfter(20);
		s1.addBefore(30);
		
		System.out.println(s1);
		
		
		
	}

}
