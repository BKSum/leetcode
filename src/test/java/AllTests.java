import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import bksum.leetcode.fb.array.ArrayTestSuite;
import bksum.leetcode.fb.treesandgraphs.TreesAndGraphsTestSuite;

@RunWith(Suite.class)
@SuiteClasses({ArrayTestSuite.class, TreesAndGraphsTestSuite.class})
public class AllTests {

}
