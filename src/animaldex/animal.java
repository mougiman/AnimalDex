/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaldex;

/**
 *
 * @author Mougi
 */
public class animal {
    String name;
    int legs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }
    
    
}
