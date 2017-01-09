package com.kinbiko.kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class JapaneseNameFormatterTest {

    //RED: Write failing tests first!!!!
    //GREEN: Write as little (main) code as needed to make test pass
    //Refactor
    private JapaneseNameFormatter target = new JapaneseNameFormatter();
    
    private void runTest(String expected, String unformatted) {
        assertEquals(expected, target.format(unformatted)); 
    }

    @Test
    public void givenNull_returnsEmptyString(){
        runTest("", null);
    }
    
    @Test
    public void givenEmptyString_returnsEmptyString(){
        runTest("", "");
    }
    
    @Test
    public void givenSingleName_returnSingleName(){
        runTest("Roger", "Roger");
    }

    @Test
    public void givenFirstLast_returnLastCommaFirst(){
        runTest("Guld, Roger", "Roger Guld");
    }

    @Test
    public void givenRedundantSpacing_returnSaneSpacing(){
        runTest("Guld, Roger", "   Roger    Guld   ");
    }

    @Test
    public void givenHyphenatedSurname_returnLastCommaFirst(){
        runTest("Guld-Jensen, Roger", "Roger Guld-Jensen");
    }

    @Test
    public void givenForenameTwoSurnames_returnOneSurnameCommaForename(){
        runTest("Guldbrandsen, Roger", "Roger Guldbrandsen Jensen");
    }

    @Test
    public void givenTitleForenameSurname_returnSurnameCommaForename(){
        runTest("Dickinson, Richard", "Dr. Richard Dickinson");
    }

    @Test
    public void integration() {
        runTest("Dally-wally, Ho", "     Mr. Dr. Prof. Ho Sir. Dally-wally Swissarmyknife   Something Hogsfather  ");
    }
}
