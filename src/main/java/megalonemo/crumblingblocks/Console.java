package megalonemo.crumblingblocks;

public class Console {
	/**
     * lmao
     */
	public static void log(Object stuff) {
		System.out.println(stuff);
	}

	/**
	 *epic randon function that i stole (inclusive)
	 * @return int
	 */
	public static int random(int min, int max){   //defining method for a random number generator

	    int range = (max - min) + 1;     
	    return (int)(Math.random() * range) + min;
	}
}
