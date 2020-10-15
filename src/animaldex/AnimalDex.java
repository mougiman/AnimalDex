/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaldex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mougi
 */
public class AnimalDex {    
    
    public static void main(String[] args) {
        ArrayList<animal> animals = new ArrayList<animal>();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Welcome to the AnimalDex");
        System.out.println("Accesible Commands:");
        System.out.println("list");
        System.out.println("newani");
        System.out.println("delani");
        System.out.println("editani");
        System.out.println("Please insert a command");
        input = scanner.next();
        getInput(input, animals);
        
        
        System.out.println("");
    }
    
    public static void getInput(String input, ArrayList<animal> animals){
        Scanner scanner = new Scanner(System.in);       
        switch(input){
            case "list":
                list(animals);
            break;
            case "newani":
                animals.add(newAnimal());     
            break;
            default:
                System.out.println("Please enter a valid command");
                
        }
        input = scanner.next();
        getInput(input, animals);
    }
    
     public static void list(ArrayList<animal> animals){
         for(animal animal : animals){
             System.out.println(""+animal.getName());
         }
     }
    
     public static animal newAnimal(){
         Scanner scanner = new Scanner(System.in);  
         System.out.println("Animal Name:");
         String name = scanner.next();
         System.out.println("Number of legs:");
         int legs = scanner.nextInt();
         animal newAnimal = new animal(name, legs);
         System.out.println(""+name+" has been added");
         return newAnimal;
     }
     
     public static void delAnimal(){
         
     }
     
     public static void editAnimal(){
         
     }
}

