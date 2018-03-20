public class GravityCalculator {
	public static double multi(double a,double b){
	// method for multiplication
		return a*b;
	}
	public static double squere(double a){
	// method for multiplication
		return a*a;
	}
	public static double summation(double a,double b){
	// method for multiplication
		return a+b;
	}
	// add 2 more methods for powering to square and summation (similar to multiplication)
	public static void outline(double result,int time, String typ, String unit){
		System.out.println("The object's "+ typ +" after " + time + " seconds is " + result +" " + unit + ".");
	// method for printing out a result
	}

		public static void main(String[] arguments){
			double gravity =-9.81; // Earth's gravity in m/s^2
			int fallingTime = 10;
			double initialVelocity = 0.0;
			double finalVelocity = summation(multi(gravity,(double)fallingTime),initialVelocity);
			double initialPosition = 0.0;
			double finalPosition = summation(summation(multi(0.5,multi(gravity,squere((double)fallingTime))),multi(initialVelocity,(double)fallingTime)),initialPosition);
			// Add the formulas for position and velocity
			outline(finalPosition,fallingTime,"position","m");
			// Add output line for velocity (similar to position)
			outline(finalVelocity,fallingTime,"velocity","m/sec");
			}
	}