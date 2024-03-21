package main;
import java.util.*;

import static main.LargeTexts.*;

public class MathProject {
    static Scanner sc = new Scanner(System.in);
    static String user;
    static int selection = 0;
    static int numeroN = 0;
    public static void main(String[] args) {
    start(user);
    }
    public static void name(){
        System.out.print("Bienvenido, por favor ingrese su nombre: ");
        user = sc.nextLine();
        if(user.equalsIgnoreCase("")) {
            validarNombre(user);
        }
        clearScreen();
    }
    // ---------------------------------------------------------------
    public static boolean welcome(String user ,String DESCRIPTION){
        System.out.print(DESCRIPTION);
        System.out.print("--> ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("si")){
            return true;
        }else
            clearScreen();
            mensajeDespedida(user);
            return false;
    }
    // -----------------------------------------------------------------
    public static void start(String user){
        name();
        if (welcome(user,DESCRIPTION)){
            clearScreen();
            menu1();
            switch (eleccion_menu1()){
                case 1:
                    desition_1(user);
            }
        }
//        clearScreen();
    }
    public static void menu1(){
        System.out.println(MENU1);
    }
    public static int eleccion_menu1(){
        System.out.print("Elige una opción del menú para comenzar (1 - 4): ");
        selection = sc.nextInt();

        if(selection < 1 || selection > 4) {
            validacionSeleccionMenu1(selection);
            return selection;
        }
        return selection;
    }
    // ----------------------------------------------------------------------------------------------
    public static void desition_1(String user){
        clearScreen();
            System.out.println(DESCRIPTION_INDUCCION);
        System.out.println("---------------------------------------------------------------------------------");
            System.out.print("Deseas hacer pruebas con la suma de los primeros 𝓷 numeros naturales? si/no : ");
            String hacerPrueba = sc.nextLine(); // problema - bug, no lee el scanner
            String preguntaPrueba = sc.nextLine();

        if (preguntaPrueba.equalsIgnoreCase("si")) {
            ejemplo1();
            clearScreen();
            System.out.print("Deseas intentar algo mas? (si/no): ");
            String pregunta2 = sc.nextLine();

            if (pregunta2.equalsIgnoreCase("si")){
                inducctionMenu();
            }else
                mensajeDespedida(user);
        }else{
            switch (inducctionMenu2()) {
                case 1:
                    menu1();
                case 2:
                    mensajeDespedida(user);
            }
        }
    } // induccion
    public static void inducctionMenu(){
        System.out.println(INDUCCTION_MENU);
        int preguntaMenuInducction = sc.nextInt();
        switch (preguntaMenuInducction){
            case 1:
                ejemplo1();
        }
    }
    public static int inducctionMenu2(){
        clearScreen();
        System.out.println(INDUCCTION_MENU2);
        System.out.print("Qué opcion elige?: ");
        int pregunta3 = sc.nextInt();
        return pregunta3;
    }
    public static int ejemplo1_process(int numeroN){
        //caso base
    if(numeroN == 1){
        System.out.println("Su resultado es " + numeroN);
        return 1;
    }
    // paso inductivo
    int result = numeroN + ejemplo1_process(numeroN - 1);
    System.out.println("Su resultado es " + result);
    return result;
}
    public static void ejemplo1(){
            System.out.print("ingrese los primeros 𝓷 numeros que desea sumar: ");
            numeroN = sc.nextInt();
            ejemplo1_process(numeroN);
    }
    public static int ejemplo2_desition1(int NumeroN){
        return 0;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void desition_2(int selection){} // conjuntos
    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void desition_3(int selection){} // relaciones
    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void desition_4(int selection){} // funciones
    //----------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void clearScreen(){
        for (int i = 0; i < 80; i++) {
            System.out.println();
        }
    }
    public static String mensajeDespedida(String user){
        System.out.println("Muchas gracias por tu tiempo " + user + " Esperamos verte de vuelta");
        return user;
    }
    public static String validarNombre(String user){
            System.out.print("Por favor, ingrese su nombre, gracias: ");
            user = sc.nextLine();
        return user;
    }
    public static int validacionSeleccionMenu1(int selection){
            System.out.print("Elige una opcion dentro del rango, por favor: ");
            selection = sc.nextInt();
        return selection;
    }

}
