/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import java.util.ArrayList;

/**
 *
 * @author ian
 */
public class Backpack {
    
    private int limitWeight;
    private int limitCapacity;
    private int actualyWeight;
    private int actualyCapacity;
    private ArrayList<Item> items;
    
    
    public Backpack(int limitWeight, int limitCapacity){
        this.limitWeight = limitWeight;
        this.limitCapacity = limitCapacity;
        items = new ArrayList<>(limitCapacity);
        actualyWeight = 0;
        actualyCapacity = 0;
    }

    public boolean insertItem(Item item){
        System.out.println("Inserting Item...");
        if(actualyCapacity >= limitCapacity){
            return false;
        }
        if(actualyWeight+item.getWeight() > limitWeight){
            return false;
        }
        items.add(item);
        actualyWeight+=item.getWeight();
        actualyCapacity++;
        return true;
        
    }
    
    public Item removeItem(int indice){
        try{
            Item item = items.remove(indice);
            actualyWeight -= item.getWeight();
            actualyCapacity--;
            return item;
        }catch (ArrayIndexOutOfBoundsException e){
            return null;
        }
    }

    
    public String[] listItems(){
        String[] itens = new String[actualyCapacity];
        for (int i=0; i<actualyCapacity; i++) {
            itens[i] = this.items.get(i).getName();
        }
        return itens;
    }
    
    
}
