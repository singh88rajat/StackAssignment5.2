package myPack;

public class FixedStack implements Stack {

	int stacksize;
	int inputsize;

	public FixedStack(int inputsize)
	{
		this.stacksize = 5;
		push(inputsize);
	}
	
	@Override
	public void push(int l) {
		// TODO Auto-generated method stub
		this.inputsize = l;
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(this.inputsize>this.stacksize)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
	public void showstackmessage()
	{
		int result = pop();
		if(result == 1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			System.out.println("Stack size is fine");
		}
	}

}
