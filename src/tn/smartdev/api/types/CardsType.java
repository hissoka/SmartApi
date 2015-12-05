/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.smartdev.api.types;

/**
 *
 * @author HP
 */
public enum CardsType {
    VISA,MASTER_CARD,AmericainExpress,JCB,Discover;

    public static CardsType getVISA() {
        return VISA;
    }

    public static CardsType getMASTER_CARD() {
        return MASTER_CARD;
    }

    public static CardsType getAmericainExpress() {
        return AmericainExpress;
    }

    public static CardsType getJCB() {
        return JCB;
    }

    public static CardsType getDiscover() {
        return Discover;
    }
    
}
