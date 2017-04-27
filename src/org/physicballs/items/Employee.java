/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.physicballs.items;

/**
 *
 * @author Liam-Portatil
 */
import java.io.*;
import java.util.*;

public class Employee implements Serializable {

   private int employeeNumber;
   private String employeeName;

   public Employee(int num, String name) {
      employeeNumber = num;
      employeeName= name;
   }

    public int getEmployeeNumber() {
      return employeeNumber ;
   }

   public void setEmployeeNumber(int num) {
      employeeNumber = num;
   }

   public String getEmployeeName() {
      return employeeName ;
   }

   public void setEmployeeName(String name) {
      employeeName = name;
   }
}