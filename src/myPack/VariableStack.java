package myPack;

public class VariableStack implements Stack {


	int stacksize;
	int inputsize;
	
	public VariableStack(int inputsize)
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
			this.stacksize = this.inputsize; // Assigning Variable Value
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
			System.out.println("Updated Stack Size is : "+this.stacksize);
			System.out.println("Stack has been updated with new no");
		}
		else
		{
			System.out.println("Stack size is fine");
		}
	}

}
