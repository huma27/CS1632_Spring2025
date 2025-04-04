package edu.pitt.cs;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitQuickcheck.class)
public class IntegerOpsTest {

	/**
	 * <pre>
	 * Preconditions: x and y are ints, where x >= 0 and y >= 0.
	 * Execution steps: Call IntegerOps.add(x, y).
	 * Invariants: The return value of call is >= 0.
	 * </pre>
	 * 
	 * @param x First integer generated by QuickCheck
	 * @param y Second integer generated by QuickCheck
	 */
	@Property(trials = 1000)
	public void testAdd(int x, int y) {
		/*
		 * You may be tempted to put an if statement here, but an if statement in a test
		 * case is always a code smell. The fact that you are performing different
		 * execution steps depending on a prior precondition says that you did not set
		 * up the preconditions properly. In this case, the preconditions should be that
		 * x >= 0 and y >= 0, but that precondition is not getting enforced, causing
		 * irrelevant values to flow into the execution steps. The @InRange QuickCheck
		 * annotation allows you to constrain generated values:
		 * 
		 * https://pholser.github.io/junit-quickcheck/site/1.0/usage/constraining.html
		 * 
		 * Please read the above URL to constain x, y values so that they are >= 0.
		 */

		 // System.out.println("testAdd x='" + x + "', y='" + y + "'");

		 // TODO: Fill in.
	}

	/**
	 * <pre>
	 * Preconditions: x and y are ints, where x >= y.
	 * Execution steps: Call IntegerOps.subtract(x, y).
	 * Invariants: The return value of call is >= 0.
	 * </pre>
	 * 
	 * @param x First integer generated by QuickCheck
	 * @param y Second integer generated by QuickCheck
	 */
	@Property(trials = 1000)
	public void testSubtract(int x, int y) {
		/*
		 * In this case, you cannot use the @InRange annotation since the constraint
		 * involves multiple parameters. There is no way to generate (x, y) tuples that
		 * satisfy x >= y in QuickCheck as each parameter is generated independently.
		 * For this, you will need to merge the two x, y parameters to a single
		 * parameter which is the tuple (x, y) and then write a custom tuple generator
		 * that satisfies that * constraint. But, we will not go that far. Instead, we
		 * will be satisfied using the assumeThat statement explained in the same page
		 * as above:
		 * 
		 * https://pholser.github.io/junit-quickcheck/site/1.0/usage/constraining.html
		 * 
		 * Using assumeThat will not constrain value generation, but will constrain
		 * values that reach the test case.
		 */

		 // System.out.println("testSubtract x='" + x + "', y='" + y + "'");

		 // TODO: Fill in.
	}

}
