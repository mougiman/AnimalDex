/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaldex;

import java.util.ArrayList;

/**
 *
 * @author Mougi
 */
public class animals {
    private ArrayList<animal> list = new ArrayList<animal>();
 
    public ArrayList<animal> getAnimals() {
        return list;
    }
    
    public void addAnimal(animal animal) {
        list.add(animal);
    }
    public void removeAnimal(animal animal) {
        list.remove(animal);
    }
    
    public animal getAnimal(String name) {
        for (animal animal : list) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
}

