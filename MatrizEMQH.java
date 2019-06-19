/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizeqh;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class MatrizEMQH {
 
    public int[][] trasformada26EMQH(int dim, int numInit){
    int cont=0; int[][] matriz=new int[dim][dim];
        for (int y = 0; y < matriz.length; y++) {
            if(cont%2==0){
                for (int x = matriz.length-1; x>=0;x--) {
                    matriz[y][x]=numInit;
                    numInit++;
                }
            }else{
                for (int x = 0; x < matriz.length; x++) {
                    matriz[y][x]=numInit;
                    numInit++;
                }
            }
            cont++;
        }    
        return matriz;
    }
        public int[][] trasformada30EMQH(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
            for (int dlx = c; dlx < dim-c-1; dlx++) {
                matriz[dlx][dim-1-c]=numInit;
                numInit++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;           
            }           
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;               
            }               
            
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit;
        }
        
        return matriz;
    }
        public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        MatrizEMQH ag=new MatrizEMQH();     
        ag.imprimirMatriz(ag.trasformada26EMQH(5,5));
        System.out.println("***************");
        ag.imprimirMatriz(ag.trasformada30EMQH(5,5));
        System.out.println("***************");
    }
}


