package OSProj2;
/**
 * DiningPhilosophers.java
 *
 * This program starts the dining philosophers problem.
 *
 */


public class DiningPhilosophers
{  
   public static void main(String args[])
   {
	 //Create two arrays, one for five Philosopher objects and another for five objects to represent forks
     Philosopher[] philosopher = new Philosopher[5];
     Object[] fork = new Object[5];
     
     //Create objects that represent forks for the array
     for (int i = 0; i < fork.length; i++)
     {
    	 fork[i] = new Object();
     }
     
     //Create and assign the forks for the left and right side of philosopher[4]
     Object leftFork = fork[4];
     Object rightFork = fork[0];
     
     philosopher[4] = new Philosopher(leftFork, rightFork);
     System.out.println("Fork #4 is on the left of philosopher #4");
     System.out.println("Fork #0 is on the right of philosopher #4 ");
     
     //Assign the forks for the left and right side of the other philosophers
     for (int i = 0; i < philosopher.length - 1; i++)
     {
    	 leftFork = fork[i];
    	 rightFork = fork[i+1];
    	 
    	 philosopher[i] = new Philosopher(leftFork, rightFork);
         System.out.println("Fork #" + i + " is on the left of philosopher #" + i);
         System.out.println("Fork #" + i+1 + " is on the right of philosopher #" + i );
     }
     
     //Create the threads for each philosopher and start it
     for (int i = 0; i < philosopher.length; i++)
     {
    	 Thread p = new Thread(philosopher[i], "Philosopher " + i);
    	 p.start();
     }

   }
}
