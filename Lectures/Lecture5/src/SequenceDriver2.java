
public class SequenceDriver2 {

	public static void main(String[] args) {
		
			IntArraySequence s1 = new IntArraySequence(10);
			
			
			s1.addAfter(10);
			s1.addAfter(20);
			s1.addAfter(30);
			s1.addAfter(40);
			
			System.out.println(s1);
			
			//calling the sequence's instance method reverse
			//IntArraySequence s1Reverse = s1.reverse();
			
			//System.out.println(s1Reverse);
			
			//calling the driver's static method reverse
			IntArraySequence sr = reverse(s1);
			
			System.out.println(sr);

	}
	
	
	public static IntArraySequence reverse(IntArraySequence s){
		
		
		IntArraySequence output = new IntArraySequence(s.size());
		int[] temp = new int[s.size()];
		
		s.start();
		for (int i = 0; i < s.size() ; i++){
			temp[i] = s.getCurrent();
			s.advance();
		}
		
		for (int i= s.size()- 1; i>= 0; i--)
			output.addAfter(temp[i]);
		return output;
	}
	

}
