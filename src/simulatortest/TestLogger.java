package simulatortest;

import junit.framework.TestCase;
import simulator.Logger;

public class TestLogger extends TestCase {
  /*
   *
   * @see junit.framework.TestCase#setUp()
   */

  @Override
  public void setUp() {}

  public void testConstructor() {
	  Logger logger = new Logger("logger");
	  assertNotNull(logger);
  }

  public void testCreateLog() {
	  
	  Logger logger = new Logger("log");
	  boolean result = Logger.createLog("test");
	  
	  assertEquals(result, true);
  }

}