/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ambient;

/**
 *
 * @author 201604940043
 */
public abstract class Ambient {
    
   
    int monsters; // falta ver se é isso mesmo que tem que fazer, se vai ser public/private/protected...
    //Pensei assim, deixa um int monsters, ai esse valor que for passado no parametro 
    //vai ser uma string de monstros que vai ser criado na main :D
    
    //
    // To pensando em a gente fazer ja pre definido futuramente, colocando um for e tal... mas vou ter que ver como criam varios objetos com valores diferentes da mesma classe.
    public Ambient(int monsters){
        this.monsters = monsters;

    }
    public int setMonsters(){
        return this.monsters;
    }
    
    
    
    
    
    
    
    
}
