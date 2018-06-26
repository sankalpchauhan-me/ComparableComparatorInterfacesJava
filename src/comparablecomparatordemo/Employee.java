/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparablecomparatordemo;

/**
 *
 * @author sankalp
 */
public class Employee implements Comparable {
   
    private String mName;
    private Integer mID;
    
    //Required Constructor:-
    public Employee(String Name, Integer ID){
        mName = Name;
        mID = ID;
    }
    
    /*
    Getter Methods of Name and ID
    */
    
    public String getName(){
        return mName;
    }
    
    public Integer getID(){
        return mID;
    }
    
    /*
    Overriding existing toString() method
    for our own implementation
    */
    
                                                        //How it is applying toString() Method internally???
    
    @Override
    public String toString(){
        return mID+" "+ mName;
    }

    /*
    Here exist the default sorting order
    */
    @Override
    public int compareTo(Object o) {
         int ID1 = mID;
         Employee e =(Employee) o;
         int ID2 = e.getID();
         if(ID1<ID2)
             return -1;
         else if (ID1>ID2)
             return 1;
         else 
             return 0;
    }
}
