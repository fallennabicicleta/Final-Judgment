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
public class Pistol extends Guns{

    
    public Pistol(String name, int weight, int capacity, int intensity) {
        super(name, weight, capacity, intensity);
    }

    @Override
    public void EquipGun(Survivor personagem) {
        personagem.setPrimaria(this);
        this.personagem = personagem;
    }
    
}
