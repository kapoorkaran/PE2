package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberVariableTest {

    @Test
    public void test1() {
        MemberVariable m1=new MemberVariable("Harry Potter",30,2500.3);
      String result=m1.var();
        assertEquals("Harry Potter 30 2500.3",result);
    }
    @Test
    public void test2() {
        MemberVariable m1=new MemberVariable("bob",400,2500.3);
          String result=m1.var();
            assertNotEquals("bob40002500.3",result);
        
    }
}
