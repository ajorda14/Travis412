package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b)
	{
		return b - a;
	}
	
	public int multiply(int a, int b)
	{
		return a * b;
	}
	
	public Integer divide(int a, int b)
	{
		if (a == 0)
		{
			return null;
		}
		else
		{
			return b/a;
		}
	}
}
