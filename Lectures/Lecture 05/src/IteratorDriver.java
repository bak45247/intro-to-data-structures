public class IteratorDriver {

	public static void main(String[] args) {
		
			IntArraySequence s = new IntArraySequence();
			
			s.addAfter(10);
			s.addAfter(20);
			s.addAfter(30);
			s.addAfter(40);
			s.addAfter(50);
			/*
			Iterator<Integer> itr = s.iterator();
			while (itr.hasNext())
				System.out.print(itr.next());
			
			System.out.println("++++++++++++++");
			Iterator<Integer> itr2 = s.iterator();

			while (itr2.hasNext())
				System.out.print(itr2.next());
			*/
			/*
			for (int i:s)
				System.out.print(i);
			
			System.out.println();
			
			for (int i:s)
				System.out.print(i);
			*/
			s.start();
			for (int i= 0; i < 3; i++){
				int num = s.getCurrent();
				System.out.println(num);
				s.advance();
			}
			 
	}

}
