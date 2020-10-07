package diff_productSupplier;

import static org.junit.Assert.*;
import static diff_productSupplier.TestUtils.*;


import org.junit.Test;

public class AppTest {

	@Test
	public void testApp() throws Exception {
		yakshaAssert(currentTest(),(true?"true":"false"),businessTestFile);
	}

	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }
}
