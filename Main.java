package com.company;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Printer print = new Printer();
       Integer[]a = {-1,2,0};
            print.<Integer>print(a);
        System.out.println("-----------------------");
        Integer[]c={a[0],a[2],a[1]};
        print.<Integer>print(c);

        }

    }
