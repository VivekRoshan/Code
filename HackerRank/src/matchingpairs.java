
import java.util.Stack;

public class matchingpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "ABbCcaAaBbb";
		Stack<Character> stack;
		int last = -1;
		stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++){
			if(Character.isUpperCase(s.charAt(i))){
				stack.push(s.charAt(i));
			}else if(!stack.isEmpty() && Character.toUpperCase(s.charAt(i)) == stack.peek() ){
				stack.pop();
				last = i;
				System.out.println(last);
			}else{
				break;
			}
		}
		System.out.println(last);
		

	}

}
