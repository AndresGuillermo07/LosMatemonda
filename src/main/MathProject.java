package main;
import java.util.*;

public class MathProject {
    static Scanner sc = new Scanner(System.in);
    static String user;
    static final String description =
            """
            Bienvenido al programa de Matemáticas Discretas!
                        
            Este programa está diseñado para ayudarte a explorar conceptos fundamentales de matemáticas discretas como:
            
            ✠inducción matemática.
            
            ✠conjuntos.
            
            ✠relaciones.
            
            ✠funciones.
            
            Con nuestra interfaz intuitiva y menú de opciones, podrás resolver problemas y visualizar conceptos de manera interactiva.
            
            Desea continuar? si/no :
            __________________________________________________________________________________________________________________________
            """;
    static String description_inducction="""
                    ¡Bienvenido al mundo de la Inducción Matemática!
                                        
                    La inducción matemática es como un superhéroe de las matemáticas, ¡siempre viene al rescate para
                    demostrar la veracidad de nuestras afirmaciones! Imagina que tienes una escalera infinita y quieres
                    probar que puedes subirla paso a paso. ¿Cómo lo haces? ¡Con la inducción matemática!
                                        
                    Primero, demuestras que puedes dar el primer paso (llamado caso base). Digamos que puedes subir el primer escalón sin problema.
                    Luego, asumes que si puedes subir un escalón cualquiera, también puedes subir el siguiente (paso inductivo).
                    Así, demuestras que, si puedes subir el escalón 𝓀, entonces puedes subir el escalón 𝓀 + 1.
                                        
                    Veámoslo con un ejemplo: queremos demostrar que la suma de los primeros 𝓷 números naturales es\s
                                        
                    n(n+1)
                    ------
                      2
                    Para eso, primero verificamos que la fórmula funciona para 𝓷 = 1 (caso base: 1 =\s
                                        
                    1(1+1)
                    ------
                      2
                    Después, asumimos que la fórmula es válida para 𝓷 = 𝓴 y demostramos que es válida para 𝓷 = 𝓴 + 1.
                                        
                    ¡Así de poderosa es la inducción matemática! Nos permite resolver problemas de manera estructurada y confiable, escalón por escalón
                    """;
    static int selection = 0;
    static int numeroN = 0;
    static String hacerPrueba = "";
    public static void main(String[] args) {

        System.out.print("Bienvenido, por favor ingrese su nombre: ");
        user = sc.nextLine();
        if(user.equalsIgnoreCase("")) {
            validarNombre(user);

        }

        //---------------------------------------------------------------
        clearScreen();
        // start
        if (welcome(user,description)){
            clearScreen();
            switch (menu1()){
                case 1:
                    desition_1(selection);
                    break;
                case 2:
                    desition_2(selection);
                    break;
            }
        }
    }
    // ---------------------------------------------------------------
    public static boolean welcome(String user ,String description){
        System.out.print(description);
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
    public static int menu1(){
        System.out.println("""
                ¡Explora el fascinante mundo de las matemáticas discretas con nuestro programa interactivo!
                
                1. Inducción Matemática
                2. Operaciones con Conjuntos 
                3. Explorar Relaciones
                4.Funciones Matemáticas
                _____________________________________________________________________________________________
                """);
         System.out.print("Elige una opción del menú para comenzar (1 - 4): ");
         selection = sc.nextInt();
         if(selection < 1 || selection > 4) {
             validacionSeleccionMenu1(selection);
             return selection;
         }
        return selection;
    }
    // ----------------------------------------------------------------------------------------------
    public static void desition_1(int selection){
        clearScreen();
            System.out.println(description_inducction);

            System.out.print("Deseas hacer pruebas con la suma de los primeros 𝓷 numeros naturales? si/no : ");
            hacerPrueba = sc.nextLine(); // problema - bug, no lee el scanner

            verEjemplo1(hacerPrueba);

    } // induccion
    public static int ejemplo1(int numeroN){
        //caso base
    if(numeroN == 1){
        System.out.println("Su resultado es " + numeroN);
        return 1;
    }
    // paso inductivo
    int result = numeroN + ejemplo1(numeroN - 1);
    System.out.println("Su resultado es " + result);
    return result;
}
    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void desition_2(int selection){
        System.out.println("¡Bienvenido al módulo de Operaciones con Conjuntos!\n");

        // Solicitar al usuario los conjuntos
        Set<Integer> conjunto1 = solicitarConjunto("primer");
        Set<Integer> conjunto2 = solicitarConjunto("segundo");

        // Realizar operaciones
        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);

        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);

        // Mostrar resultados
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Unión: " + union);
        System.out.println("Intersección: " + interseccion);
        System.out.println("Diferencia (Conjunto1 - Conjunto2): " + diferencia);
    }  // conjuntos
    public static Set<Integer> solicitarConjunto(String ordinal) {
        Set<Integer> conjunto = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del " + ordinal + " conjunto: ");
        int tamaño = scanner.nextInt();
        System.out.println("Ingrese los elementos del " + ordinal + " conjuntos, uno por uno:");
        for (int i = 0; i < tamaño; i++) {
            conjunto.add(scanner.nextInt());
        }
        return conjunto;
    }
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
    public static void verEjemplo1(String hacerPrueba){

        if (hacerPrueba.equalsIgnoreCase("si")) {
            System.out.print("ingrese los primeros 𝓷 numeros que desea sumar: ");
            numeroN = sc.nextInt();
            ejemplo1(numeroN);
        }
    }
}
