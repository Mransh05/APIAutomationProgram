package com.testAcademy.Crud.testNg;

import org.testng.annotations.*;

public class Testng02 {
    @BeforeSuite
    void demo1() {
        System.out.println("BeforeSuite : Read the data from the MySQL");

    }

    @BeforeTest
    void demo2() {
        System.out.println("BeforeTest : Data in Matrix, Test case before ");

    }

    @BeforeClass
    void demo3() {
        System.out.println("BeforeClass");

    }

    @BeforeMethod
    void demo4() {
        System.out.println("BeforeMethod");

    }

    @Test
    void demo10() {
        System.out.println("This is test");
    }

    @AfterMethod
    void demo5() {
        System.out.println("AfterSuite");

    }

    @AfterClass
    void demo6() {
        System.out.println("AfterTest");

    }

    @AfterTest
    void demo7() {
        System.out.println("AfterClass");

    }

    @AfterSuite
    void demo8() {
        System.out.println("AfterMethod");
        System.out.println("Close the everything");

    }

 /*   void demo9() {
        System.out.println("");

    }


    }

*/

}
