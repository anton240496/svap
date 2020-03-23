package com.company;

import org.junit.Assert;
import org.junit.Test;


public class testprinter {
    @Test
    public void testC() throws Exception {
        Printer print = new Printer();
        Integer[]a = {-10000,250,-490};
        print.<Integer>print(a);
        System.out.println("-----------------------");
        Integer[]c={a[0],a[2],a[1]};
        print.<Integer>print(c);

        System.out.println("-----------------------");
        Integer[]d={a[1],a[0],a[2]};
        print.<Integer>print(d);

    }

}


