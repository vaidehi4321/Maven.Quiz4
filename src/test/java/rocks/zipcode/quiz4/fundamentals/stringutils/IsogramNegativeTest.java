package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

/**
 * @author leon on 02/01/2019.
 */
public class IsogramNegativeTest {
    @Test
    public void test1() {
        String input = "AA";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test2() {
        String input = "AAA";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test3() {
        String input = "ZZ";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test4() {
        String input = "ZZZ";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }


    @Test
    public void test5() {
        String input = "Bere";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test6() {
        String input = "Meared";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test7() {
        String input = "Prown Pox";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }
}