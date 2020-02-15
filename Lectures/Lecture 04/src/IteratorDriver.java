public class IteratorDriver {

	public static void main(String[] args) {
		
		/*
		IntArrayBag l1 = new IntArrayBag();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		System.out.println(l1.size());
		
		int sum1 = 0;
	
		for (int element: l1){
			System.out.println(element);
			sum1 = sum1 + element;
		}
		
		*/
		
		IntArraySequence l3 = new IntArraySequence();
		
		l3.addAfter(10);
		l3.addAfter(20);
		l3.addAfter(30);
		int sum2 = 0;
		
		for (Integer element: l3)
			sum2 = sum2 + element;
			
		
		/*
		System.out.println(l3.size());
		
		int sum3 = 0;
		l3.start();
		for (int i=0; i < l3.size(); i++){
			sum3 = sum3 + l3.getCurrent();
			l3.advance();
		}
		
		System.out.println(sum3);
		
		*/

	}

}
