package com.example.prueba;

public class Main {
    public static void main(String[] args) {


      suma(10,20,30);


    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b+ c;

        Coche miCoche = new Coche();
        miCoche.addPuerta();
        miCoche.addPuerta();
        miCoche.addPuerta();
        miCoche.addPuerta();

        System.out.println(resultado);

        System.out.println(miCoche.Puerta);

    }
    static class Coche{
        public int Puerta = 0;
        public void addPuerta(){
            this.Puerta++;
        }
    }

    }



