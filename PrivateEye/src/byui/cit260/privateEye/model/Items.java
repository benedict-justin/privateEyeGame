/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateEye.model;

import java.io.Serializable;

/**
 *
 * @author Justin
 */
import java.util.Objects;

public class Items implements Serializable{
    
    private String addToInventory;

    public Items() {
    }

    public String getAddToInventory() {
        return addToInventory;
    }

    public void setAddToInventory(String addToInventory) {
        this.addToInventory = addToInventory;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.addToInventory);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (!Objects.equals(this.addToInventory, other.addToInventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "addToInventory=" + addToInventory + '}';
    }
    
    

}
