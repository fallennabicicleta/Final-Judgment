/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import Personagem.Survivor;

/**
 *
 * @author ian
 */
public class BaseballBat extends Weapons{
    
    public BaseballBat(String name, int weight, int capacity, int intensity) {
        super(name, weight, capacity, intensity);
    }

    @Override
    public void EquipWeapon(Survivor personagem) {
        personagem.setSecundaria(this);
        this.personagem = personagem;
    }

    @Override
    public int usar(Item item, Survivor personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
