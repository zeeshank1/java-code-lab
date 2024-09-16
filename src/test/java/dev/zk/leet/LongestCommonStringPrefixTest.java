package dev.zk.leet;

import main.java.dev.zk.leet.LongestCommonStringPrefix;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonStringPrefixTest {
    String[] inputArray_testcase_1 = {"flower", "flow", "fluid"};
    String[] inputArray_testcase_2 = {"dog", "warcars", "car"};

    @Test
    public void postiveTestcase() {
        assertEquals("fl", LongestCommonStringPrefix.longestPrefixFromStringArray(inputArray_testcase_1));
    }

    @Test
    public void negtiveTestcase() {
     assertEquals("", LongestCommonStringPrefix.longestPrefixFromStringArray(inputArray_testcase_2));
    }

}