package regress;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import regress.ca.sqlpower.architect.swingui.SaveLoadTest;
import regress.ca.sqlpower.architect.swingui.TestArchitectFrame;
import regress.ca.sqlpower.architect.swingui.TestAutoLayoutAction;
import regress.ca.sqlpower.architect.swingui.TestPlayPen;
import regress.ca.sqlpower.architect.swingui.TestUndoManager;

public class ArchitectSwingTestSuite extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for Architect's Swing GUI");
		//$JUnit-BEGIN$
		suite.addTestSuite(SaveLoadTest.class);
		suite.addTestSuite(TestArchitectFrame.class);
		suite.addTestSuite(TestAutoLayoutAction.class);
		suite.addTestSuite(TestPlayPen.class);
		suite.addTestSuite(TestUndoManager.class);
		//$JUnit-END$
		return suite;
	}

}
