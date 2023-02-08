package com.driver;
import java.util.*;
public class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      RWOnly rw = new RWOnly();
      // name has private access in com.driver.RWOnly
      rw.setName(sc.nextLine());
      rw.getName();
  }
}