package com.lianxi.java4.jihe1;

import java.util.*;

public class HashTableDemo {

   public static void main(String args[]) {

      Hashtable hashtable = new Hashtable();
      Enumeration names;
      String str;
      double double1;
//    Ìí¼Ó  String  Double
      hashtable.put("Zara", new Double(3434.34));
      hashtable.put("Mahnaz", new Double(123.22));
      hashtable.put("Ayan", new Double(1378.00));
      hashtable.put("Daisy", new Double(99.22));
      hashtable.put("Qadir", new Double(-19.08));


      names = hashtable.keys();//¼ü
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " +hashtable.get(str));
      }
	  
      System.out.println();

      double1 = ((Double)hashtable.get("Zara")).doubleValue();
      hashtable.put("Zara", new Double(double1+1000));
      System.out.println("Zara's new hashtable: " +hashtable.get("Zara"));
   }
}