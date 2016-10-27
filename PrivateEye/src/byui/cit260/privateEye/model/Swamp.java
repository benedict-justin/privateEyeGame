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
import java.util.Objects;/**
 *
 *
 */
public class Swamp implements Serializable{

    //class instance variables
    private String description; 
    private String width;
    private String length;

    
    public Swamp(){
        
    }

    public Swamp(String description, String width, String length) {
        this.description = description;
        this.width = width;
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + Objects.hashCode(this.width);
        hash = 61 * hash + Objects.hashCode(this.length);
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
        final Swamp other = (Swamp) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.width, other.width)) {
            return false;
        }
        if (!Objects.equals(this.length, other.length)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Swamp{" + "description=" + description + ", width=" + width + ", length=" + length + '}';
    }

    
    
    
    
    
}
