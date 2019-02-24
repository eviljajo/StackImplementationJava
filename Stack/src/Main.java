
public class Main {

	public static void main(String[] args) {
		
		
		Stack s = new Stack(10);
		
		for(int i =0; i<10; i++) {
			s.push(i);
		}
		
		s.view();
		
		System.out.println(s.isEmpty()); 
		
		s.view();
		s.pop();
		s.pop();
		s.view();
		System.out.println(s.peek()); 
	
	
	
	}

}
