/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.interview;

import java.util.*;
import java.io.*;

public class MultiSort {

   
        String name;
        String lastname;
        int age;
        
        MultiSort(String name, String lastname, int age){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }
        
   
    
   
  

    public static void main(String[] args) {

        MultiSort h1 = new MultiSort("lo","ai", 12);
        MultiSort h2 = new MultiSort("lo", "atitch", 10);
        MultiSort h3 = new MultiSort("lo","ai", 2);
        
        List<MultiSort> lst = new LinkedList<>();
        lst.add(h1);
        lst.add(h2);
        lst.add(h3);
        //System.out.println(lst.get(0));
        lst.sort(new Comparator<MultiSort>(){
            @Override
            public int compare(MultiSort o1, MultiSort o2) {
               int result = o1.name.compareTo(o2.name);
               int result1 = o1.lastname.compareTo(o2.lastname);
               
               if(result == 0){
                   if(result1 == 0){
                       if(o1.age > o2.age){
                           return 1;
                       }else if(o1.age < o2.age){
                            return -1;
                        }
                       return 0;
                   }
                   return result1;
               }
               return result;
            }
        });
        
        for(MultiSort eachsort : lst){
            System.out.print(eachsort.name);
            System.out.print(eachsort.lastname);
            System.out.println(eachsort.age);
        }
        
        //System.out.println("hello");
        
    }

  
}


