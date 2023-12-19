package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}

 @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void Case1() {
       assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void Case2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void Case3() {
      assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void Case4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void Case5() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void Case6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void Case7() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void Case8() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


