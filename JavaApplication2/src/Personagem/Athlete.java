/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

/**
 *
 * @author 201604940043
 */
public class Athlete extends Survivor{ //Rapido

    public Athlete(String nome, int life, double infection, int precision, int agility, int fear){
        super(nome, life, infection, precision, agility * 2, fear);
    }
    
    
}
