package com.xm.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tearcher")
public class GroupOnClass3 {
    public void stu1() {
        System.out.println("GroupOnClass3中的tearcher1");
    }

    public void stu2() {
        System.out.println("GroupOnClass3中的tearcher2");
    }
}
