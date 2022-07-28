package com.example.prueba;

public class Coche {
    public static void main(String[] args) {

        Auto miAuto = new Auto();
        miAuto.addPuerta();
        miAuto.addPuerta();
        miAuto.addPuerta();
        miAuto.addPuerta();
        System.out.println(miAuto.Puerta);
    }
   static class  Auto{
        public int Puerta = 0;
        public void addPuerta(){
            this.Puerta++;
        }
    }
}
