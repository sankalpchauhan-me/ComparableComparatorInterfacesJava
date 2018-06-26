/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparablecomparatordemo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author sankalp
 */
public class ComparableComparatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new Employee("Vijay", 101);
        Employee e2 = new Employee("Tony", 102);
        Employee e6 = new Employee("Robert", 106);
        Employee e3 = new Employee("Thanos", 103);
        Employee e4 = new Employee("Peter", 104);
        Employee e5 = new Employee("Turing", 105);
        Employee e7 = new Employee("Peter", 104);
        
        // This is our default sorting order
        TreeSet ts = new TreeSet();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);
        ts.add(e7);
        System.out.println(ts);
        
        //If the programmer does not want default sorting order than he will implement Comparator i.e. Customized sorting
        // thsis can be implemented using Anonymous Inner Class
       TreeSet ts1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Employee e1 = (Employee) o1;
               Employee e2 = (Employee) o2;
               String s1 = e1.getName();
               String s2 = e2.getName();
               return s1.compareTo(s2);
               
            }
        });
       
        ts1.add(e1);
        ts1.add(e2);
        ts1.add(e3);
        ts1.add(e4);
        ts1.add(e5);
        ts1.add(e6);
        ts1.add(e7);
        
        System.out.println(ts1);
        
    }
    
}
