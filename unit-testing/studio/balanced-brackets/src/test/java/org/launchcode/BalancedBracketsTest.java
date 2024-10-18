package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void notBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void returnsTrueWithNonbracketCharactersWhenBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[{]}{[}]}"));
    }

    @Test
    public void returnsTrueWhenBalancedIfStartsWithClosingBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void returnsTrueWithNumbersWhenBracketsBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[12]123"));
    }

    @Test
    public void returnsTrueWithLettersWhenBracketsBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abdc]abdcd[]"));
    }

    @Test
    public void returnsTrueWhenBracketsAreBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void returnsFalseWhenBracketsAreNotBalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void validateNotNull() {
        assertNotNull(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void returnsFalseWhenMoreClosingBracketsThanOpening() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]]["));
    }

    @Test
    public void returnsFalseWhenMoreOpeningBracketsThanClosing() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[[[[[]"));
    }

    @Test
    public void returnsTrueWhenNoBracketsPassedIn() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

//    @Test
//    public void bracketsS() {
//        assertTrue(BalancedBrackets.brackets == 0);
//    }
}