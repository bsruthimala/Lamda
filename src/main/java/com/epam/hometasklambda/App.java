package com.epam.hometasklambda;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        int s=0,avg=0;
        a.add(10);
        a.add(12);
        a.add(14);
        a.add(11);
        a.add(13);
        a.add(15);
        a.add(17);
        a.add(67);
        a.add(89);
        a.add(65);
        for(int i:a) {
        	s+=i;
        }
        avg=s/10;
        System.out.println("Average of list of integers : "+avg);
    }
}
