package com.example.juego_del_uno;

import java.util.Scanner;

public class btalla_naval {
    static Scanner sc=new Scanner(System.in);
    static int tablero1[][];
    static int tablero2[][];
    static int eje_x,eje_y;
    static String ejey,ejex;
    static String comienzo, comienzoj1,comienzoj2;
    static String comienzobarcos,comienzodisparos;
    static int fila,columna;
    static String nom_j,nom_2;
    static int intentosj1,intentosj2=4;

    public static void main(String[]args){
        System.out.println("Bienvenido a Batlla Naval");
        System.out.println("A continuacion se te pedira el tamaño del tablero");
        System.out.println("Ingresa el tamaño de forma Horizontal");
        eje_x= sc.nextInt();
        System.out.println("ingresa el tamaño de forma vertical");
        eje_y=sc.nextInt();
        tablero1=new int[eje_x][eje_y];
        tablero2=new int[eje_x][eje_y];
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                tablero1[i][j]=0;
            }
        }
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                tablero2[i][j]=0;
            }
        }
        System.out.println("Tablero listo");
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                System.out.print(tablero1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("A continuacion ingresa el nombre de los jugador");
        System.out.println("Jugador 1: ");
        nom_j=sc.next();

        System.out.println("Desea comenzar el juego (si/no)");
        comienzo=sc.next();
        if (comienzo.equalsIgnoreCase("si")) {
            System.out.println("La partida comenzara despues de los siguientes pasos");
            System.out.println("A continuacion ingresaran sus barcos en el tablero");
            System.out.println("Estas listo para ingresar tus barcos Jugador "+ nom_j+" (si/no)");
            comienzoj1=sc.next();
            if (comienzoj1.equalsIgnoreCase("si")){
                tablero1partidacominezo();
            }
            System.out.println("Jugador 2: ");
            nom_2=sc.next();
            System.out.println("Jugador "+nom_2+" estas listo para ingresar tus barcos(si/no)");
            comienzoj2=sc.next();
            if (comienzoj2.equalsIgnoreCase("si")){
                tablero2partidacomienzo();
            }
            ataquesjugadores();
        }
    }
    public static void tablero1partidacominezo(){
        System.out.println("En que posicion debesea ingresar su primer barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
             int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

        System.out.println("De que manera desea poner su 2do barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 3er barco "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
           int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 4to barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")||comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

    }
    public static void tablero2partidacomienzo(){
        System.out.println("En que posicion debesea ingresar su primer barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

        System.out.println("De que manera desea poner su 2do barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero2[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 3er barco "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero2[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 4to barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero2[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
    }
    public static void ataquesjugadores(){
        System.out.println("Se Acabaron los preparativos es la hora de comenzar esta guerra");

        for (int i=0; i<eje_x; i++)
            for (int j=0; j<eje_y; j++)

                for (int w=0; w<eje_x; w++)
                    for (int z=0; z<eje_y; z++)
                        while (tablero1[i][j]==1 && tablero2[w][z]==1){
                            System.out.println(nom_j+" es tu turno de atacar");

                                System.out.println("Ingresa la coordenada de forma horizontalque deseas atacar");
                                int h= sc.nextInt();
                                System.out.println("Ingresa la coordenada q desea atacar de forma vertical");
                                int v= sc.nextInt();
                            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ) {
                                if (tablero2[v][h] == 1) {

                                    for (int t = 0; t < 1; t++) {
                                        tablero2[v][h] = 5;
                                    }

                                    for (int e = 0; e < eje_x; i++) {
                                        for (int o = 0; o < eje_y; j++) {
                                            System.out.print(tablero2[e][o] + " ");
                                        }
                                        System.out.println("");
                                    }

                                    System.out.println("Genial le diste sigue asu");

                                } else if (tablero2[v][h] == 0) {

                                    for (int t = 0; t < 1; t++) {
                                        tablero2[v][h] = 5;
                                    }

                                    for (int e = 0; e < eje_x; i++) {
                                        for (int o = 0; o < eje_y; j++) {
                                            System.out.print(tablero2[e][o] + " ");
                                        }
                                        System.out.println("");
                                    }

                                    System.out.println("Lastima no habia nadie ahy");
                                }
                            }

                            System.out.println("Jugador 2 " +nom_2+ " es tu de atacar");


                                System.out.println("ingresa la coordenada de manera horizontal para atacar");
                                 h= sc.nextInt();
                                System.out.println("ingresa la coordenada de manera vertical");
                                 v= sc.nextInt();
                            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ) {
                                if (tablero1[v][h] == 1) {

                                    for (int t = 0; t < 1; t++) {
                                        tablero1[v][h] = 5;
                                    }

                                    for (int e = 0; e < eje_x; i++) {
                                        for (int o = 0; o < eje_y; j++) {
                                            System.out.print(tablero1[e][o] + " ");
                                        }
                                        System.out.println("");
                                    }

                                    System.out.println("Genial le diste sigue asu");

                                } else if (tablero1[v][h] == 0) {

                                    for (int t = 0; t < 1; t++) {
                                        tablero1[v][h] = 5;
                                    }

                                    for (int e = 0; e < eje_x; i++) {
                                        for (int o = 0; o < eje_y; j++) {
                                            System.out.print(tablero1[e][o] + " ");
                                        }
                                        System.out.println("");
                                    }

                                    System.out.println("Lastima no habia nadie ahy");
                                }
                            }
                        }
        for (int i=0; i<eje_x; i++)
            for (int j=0; j<eje_y; j++)

                for (int w=0; w<eje_x; w++)
                    for (int z=0; z<eje_y; z++)
                        if (tablero1[i][j]==1 ||tablero2[w][z]==1){
                            if (tablero1[i][j]==1){
                                System.out.println(nom_j+" perdiste mejor suerte la proxima");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(tablero1[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }else{
                                System.out.println(nom_j+ " Has Ganado");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(tablero1[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }
                            if (tablero2[i][j]==1){
                                System.out.println(nom_2+ " mejor suerte la proxima");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(tablero2[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }else {
                                System.out.println(nom_2 + " has ganado");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(tablero2[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }
                        }
    }
}
