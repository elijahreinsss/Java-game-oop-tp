/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Administrator
 */
   public  interface Enemy {
        String getName();
                int getDefense();
        int attack();
        int getHealth();
        boolean canDodge();
    }
