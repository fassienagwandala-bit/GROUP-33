package assignment;
public class StudentAssignment {
	
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        int n = 1;

	        // 1. DO-WHILE LOOP:
	        do {

	            // 2. FOR LOOP:
	            for (int K = 1; K <= 10; K++) {

	                // 3. TERNARY STATEMENT:
	            	int score = K * 10 + 25;
	                String results = (score >= 55) ? "passed" : "failed";

	                // 4. WHILE LOOP:
	                int f = 6;
	                while (f <= 8) {
	                    System.out.println("Student ID " + K + " Attempt " + f + " Status: " + results);
	                    f++;
	                }

	            }

	            n++;

	        } while (n <= 2);

	    }

	}