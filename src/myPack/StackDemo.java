package myPack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack fs = new FixedStack(5); 
		fs.showstackmessage();
		
		VariableStack vs = new VariableStack(10);
		vs.showstackmessage();

	}

}
