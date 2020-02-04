package com.spartaglobal.cob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringAnagramTest {
    @Test
    void testToCheckStringAnagramsAreTrue(){
        StringAnagram stringAnagram = new StringAnagram();
        stringAnagram.checkStringAnagram("army", "mary");
    }

    @Test
    void testToCheckStringAnagramsCanBeFalse(){
        StringAnagram stringAnagram = new StringAnagram();
        stringAnagram.checkStringAnagram("beth","mary");
    }

    @Test
    void testToCheckStringAnagramsCannotBeNull(){ //NEEDS LOOKED AT
        StringAnagram stringAnagram = new StringAnagram();
        stringAnagram.checkStringAnagram("","");
    }

    @Test
    void testToCheckToLowerCaseWorks(){
        StringAnagram stringAnagram = new StringAnagram();
        stringAnagram.checkStringAnagram("MARY","marY");
    }
}
