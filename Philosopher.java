package OSProj2;
/**
 * Philosopher.java
 *
 * This class represents each philosopher thread.
 * Philosophers alternate between eating and thinking.
 *
 */


public class Philosopher implements Runnable
{
	Object leftFork;
	Object rightFork;
	
	public Philosopher(Object leftFork, Object rightFork)
	{
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}
	
	@Override
	public void run() 
	{
		while(true) 
		{
			System.out.println("Forks are with philosopher");
			synchronized (leftFork) 
			{
				//This philosopher picks up their left fork
				synchronized (rightFork)
				{
					//This philosopher picks up their right fork and started eating
					//This philosopher drops their right fork
				}
				//This philosopher drops their left fork and is thinking
			}
		}

	}
}
