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
/**
 *
 *
 */
public class Inventory implements Serializable{
    
    //class instance variables
    private String inventoryType;
    private String quantityInStock;



    public Inventory() {
        
    }

    public Inventory(String inventoryType, String quantityInStock) {
        this.inventoryType = inventoryType;
        this.quantityInStock = quantityInStock;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(String quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.inventoryType);
        hash = 13 * hash + Objects.hashCode(this.quantityInStock);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.quantityInStock, other.quantityInStock)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
