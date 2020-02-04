package com.spartaglobal.cob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringAnagramTest {
    @Test
    void testToCheckStringAnagramsAreTrue(){
        StringAnagram stringAnagram = new StringAnagram();
        stringAnagram.checkStringAnagram("army", "mary");
    }
}
