package com.anhnt.ThucHanh_AnhTester;

import com.anhnt.common.BaseTest;
import org.testng.annotations.Test;

public class CategoryTest extends BaseTest {

    @Test(priority = 1)
    public void testAddNewCategory(){
        System.out.println("Create Category");
    }

    @Test(priority = 2)
    public void getCategoryById(){
        System.out.println("Get Category");
    }

}
