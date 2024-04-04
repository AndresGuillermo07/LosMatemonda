package main;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.LargeTexts.*;

public class MathProject {
    static Scanner sc = new Scanner(System.in);
    static String user;
    static int selection = 0;
    static int numeroN = 0;
    static String decision="";
    static int result = 1;
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
            ciclo_eleccion_menu1(user);
        }
    }
    public static void ciclo_eleccion_menu1(String user){
        menu1();
        switch (eleccion_menu1()){
            case 1:
                desition_1(user);
                break;
            case 2:
                desition_2(user);
                break;
            case 3:
                desition_3(user);
                break;
            case 4:
                desition_4(user);
        }
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
    public static String preguntaEjemplo1(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("Deseas hacer pruebas con la suma de los primeros 𝓷 numeros naturales? si/no : ");
        String hacerPrueba = sc.nextLine(); // problema - bug, no lee el scanner
        String preguntaPrueba = sc.nextLine();
        return preguntaPrueba;
    }
    public static void desition_1(String user){
        clearScreen();
        System.out.println(DESCRIPTION_INDUCCION);

        ifAndElsesDesition1(user,preguntaEjemplo1());


    } // induccion
    public static void ifAndElsesDesition1(String user,String preguntaPrueba){
        if (preguntaPrueba.equalsIgnoreCase("si")) {
            ejemplo1();
            System.out.println();
            algoMasFuncion();
        }else{
            algoMasFuncion();
        }
    }
    public static void algoMasFuncion(){
        System.out.println();
        System.out.print("Deseas intentar algo mas? (si/no): ");
        String bugPregunta2 = sc.nextLine();
        String pregunta2 = sc.nextLine();

        if (bugPregunta2.equalsIgnoreCase("si") || pregunta2.equalsIgnoreCase("si")){
            inducctionMenu(user);
        }else
            inducctionMenu2(user);
    }
    public static void inducctionMenu(String user){
        clearScreen();
        System.out.println(INDUCCTION_MENU);
        System.out.print("Elija alguna opcion: ");
        int preguntaMenuInducction = sc.nextInt();
        switch (preguntaMenuInducction){
            case 1:
                ejemplo1();
                break;
            case 2:
                ejemplo2();
                break;
            case 3:
                ejemplo3();
                break;
            case 4:
                clearScreen();
                ciclo_eleccion_menu1(user);
                break;
            case 5:
                clearScreen();
                mensajeDespedida(user);
        }
    } // el de los 3 ejemplos
    public static void inducctionMenu2(String user){
        clearScreen();
        System.out.println(INDUCCTION_MENU2);
        System.out.print("Qué opcion elige?: ");
        int pregunta3 = sc.nextInt();
        switch (pregunta3) {
            case 1:
                clearScreen();
                inducctionMenu(user);
                break;
            case 2:
                clearScreen();
                ciclo_eleccion_menu1(user);
                break;
            case 3:
                clearScreen();
                mensajeDespedida(user);
                break;
        }

    } // el de las 3 opciones
    public static int ejemplo1_process(int numeroN){
        //caso base
        if(numeroN == 1){
            System.out.println("Su resultado es " + numeroN);
            return 1;
        }
        // paso inductivo
        int result = numeroN + ejemplo1_process(numeroN - 1);
        clearScreen();
        System.out.println("Su resultado es " + result);
        return result;
    }
    public static void ejemplo1(){
        clearScreen();
        System.out.print("ingrese los primeros 𝓷 numeros que desea sumar: ");
        numeroN = sc.nextInt();
        ejemplo1_process(numeroN);
        algoMasFuncion();
    }
    public static int ejemplo2_process(int numeroN){
        if (numeroN == 0 || numeroN == 1) {
            return 1; // El factorial de 0 y 1 es 1
        } else {
            for (int i = 2; i <= numeroN; i++) {
                result *= i;
            }
//             long mostrarNumeros = numeroN * ejemplo2_process(numeroN - 1); // Llamada recursiva
//            System.out.println("Su el factorial de su numero es " + numeroN);
        }
        System.out.println(result);
        result = 1;
        return result;
    }
    public static void ejemplo2(){
        clearScreen();
        System.out.print("ingrese su número 𝓷 : ");
        numeroN = sc.nextInt();
        ejemplo2_process(numeroN);
        algoMasFuncion();
    }
    public static long ejemplo3_process(int base, int exponente){
        // Caso base: cualquier número elevado a 0 es 1
        if (exponente == 0) {
            return 1;
        }
        // Paso inductivo: base^exponente = base * base^(exponente-1)
        long result = base * ejemplo3_process(base, exponente - 1);
        clearScreen();
        System.out.println("Su resultado es: " + result);
        return result;

    }
    public static void ejemplo3(){
        clearScreen();
        System.out.print("ingrese la base: ");
        int base = sc.nextInt();
        System.out.println();
        System.out.print("ingrese el Exponente: ");
        int exponente = sc.nextInt();
        ejemplo3_process(base,exponente);
        algoMasFuncion();

    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void desition_2(String user){
        Scanner scanner = new Scanner(System.in);
        clearScreen();
        System.out.println("¡BIENVENIDO AL MODULO DE OPERACIONES DE CONJUNTOS!\n");

        do {
            realizarOperacionesConConjuntos();

            System.out.print("\n¿Desea Continuar? (si/no): ");
            String bug = sc.nextLine();
            String pregunta = sc.nextLine();
            if(pregunta.equalsIgnoreCase("si")) {
                clearScreen();

                switch (menu1Conjuntos()) {
                    case "1":
                        clearScreen();
                        break;
                    case "2":
                        clearScreen();
                        ciclo_eleccion_menu1(user);
                        return;
                    case "3":
                        mensajeDespedida(user);
                        return;
                    default:
                        clearScreen();
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.\n");
                }
            }else{
                mensajeDespedida(user);
            }
        } while (true);
    }// conjuntos

    public static String menu1Conjuntos(){
        System.out.println(MENUCONJUNTOS1);
         decision = sc.nextLine().trim().toLowerCase();
        clearScreen();
        return decision;
    }
    public static void realizarOperacionesConConjuntos() {
        Set<Integer> conjunto1 = solicitarConjunto("primer");
        Set<Integer> conjunto2 = solicitarConjunto("segundo");

        mostrarResultadosConjuntos(conjunto1, conjunto2);
    }
    public static void mostrarResultadosConjuntos(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);

        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);

        Set<Integer> complemento = calcularComplemento(conjunto1, conjunto2);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Unión: " + union);
        System.out.println("Intersección: " + interseccion);
        System.out.println("Diferencia (Conjunto1 - Conjunto2): " + diferencia);
        System.out.println("Complemento de Conjunto1 respecto a Conjunto2: " + complemento);
    }
    public static Set<Integer> solicitarConjunto(String ordinal) {
        Set<Integer> conjunto = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del " + ordinal + " conjunto: ");
        int tamaño = sc.nextInt();
        System.out.println("Ingrese los elementos del " + ordinal + " conjunto, uno por uno (SOLO NUMEROS):");
        for (int i = 0; i < tamaño; i++) {
            conjunto.add(MathProject.sc.nextInt());
        }
        return conjunto;
    }
    public static Set<Integer> calcularComplemento(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> complemento = new HashSet<>(conjunto2);
        complemento.removeAll(conjunto1);
        return complemento;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void desition_3(String user) {
        clearScreen();
        System.out.println("Bienvenido a Relaciones\n");

        boolean continuar = true;
        boolean[][] matrizRelacion = null;

        while (continuar) {
            System.out.println(MENURELACIONES);

            int opcion;
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                sc.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    List<List<Integer>> relaciones = solicitarRelacion();
                    matrizRelacion = construirMatrizRelacion(relaciones);
                    break;
                case 2:
                    if (matrizRelacion != null) {
                        mostrarMatrizRelacion(matrizRelacion);
                    } else {
                        System.out.println("Advertencia: La relación está vacía. Por favor, ingrese una relación primero.");
                    }
                    break;
                case 3:
                    if (matrizRelacion != null) {
                        mostrarTipoRelacion(matrizRelacion);
                    } else {
                        System.out.println("Advertencia: La relación está vacía. Por favor, ingrese una relación primero.");
                    }
                    break;
                case 4:
                    clearScreen();
                    ciclo_eleccion_menu1(user);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static List<List<Integer>> solicitarRelacion() {
        List<List<Integer>> relaciones = new ArrayList<>();
        sc.nextLine();
        System.out.println("Ingrese los pares ordenados de la relación en el formato (número1,número2):");
        System.out.println("Por ejemplo: (1,2), (3,4), etc.");
        System.out.println("Escriba 'fin' para terminar de ingresar la relación.");

        while (true) {
            String entrada = sc.nextLine().trim();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            String[] partes = entrada.split(",");

            // Verifico si el formato de entrada es correcto (debe haber exactamente dos partes separadas por ',')
            if (partes.length != 2) {
                System.out.println("Formato de entrada incorrecto. Debe ingresar los pares ordenados en el formato (número1,número2).");
                continue;
            }

            try {
                int numero1 = Integer.parseInt(partes[0].trim());
                int numero2 = Integer.parseInt(partes[1].trim());
                relaciones.add(Arrays.asList(numero1, numero2));
            } catch (NumberFormatException e) {
                System.out.println("Formato de entrada incorrecto. Ambos valores deben ser números enteros.");
                continue;
            }
        }

        return relaciones;
    }

    public static boolean[][] construirMatrizRelacion(List<List<Integer>> relaciones) {
        int maxNumero = 0;
        for (List<Integer> relacion : relaciones) {
            maxNumero = Math.max(maxNumero, Math.max(relacion.get(0), relacion.get(1)));
        }

        boolean[][] matrizRelacion = new boolean[maxNumero][maxNumero];

        for (List<Integer> relacion : relaciones) {
            int numero1 = relacion.get(0) - 1;
            int numero2 = relacion.get(1) - 1;
            matrizRelacion[numero1][numero2] = true;
        }

        return matrizRelacion;
    }

    public static void mostrarMatrizRelacion(boolean[][] matrizRelacion) {
        System.out.println("Matriz de Relación:");
        System.out.print("    ");
        for (int i = 1; i <= matrizRelacion.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < matrizRelacion.length; i++) {
            System.out.printf("%4d", i + 1);
            for (int j = 0; j < matrizRelacion[i].length; j++) {
                System.out.printf("%4s", matrizRelacion[i][j] ? "1" : "0");
            }
            System.out.println();
        }
    }

    public static void mostrarTipoRelacion(boolean[][] matrizRelacion) {
        boolean reflexiva = esReflexiva(matrizRelacion);
        boolean simetrica = esSimetrica(matrizRelacion);
        boolean antisimetrica = esAntisimetrica(matrizRelacion);
        boolean transitiva = esTransitiva(matrizRelacion);

        if (reflexiva && simetrica && transitiva) {
            System.out.println("La relación es una relación de equivalencia.");
        } else if (reflexiva && antisimetrica && transitiva) {
            System.out.println("La relación es una relación de orden parcial.");
        } else if (reflexiva && antisimetrica && !transitiva) {
            System.out.println("La relación es una relación de orden total.");
        } else {
            System.out.println("La relación no tiene un tipo definido.");
        }
    }

    public static boolean esReflexiva(boolean[][] matrizRelacion) {
        for (int i = 0; i < matrizRelacion.length; i++) {
            if (!matrizRelacion[i][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean esSimetrica(boolean[][] matrizRelacion) {
        int n = matrizRelacion.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrizRelacion[i][j] != matrizRelacion[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esAntisimetrica(boolean[][] matrizRelacion) {
        int n = matrizRelacion.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matrizRelacion[i][j] && matrizRelacion[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean esTransitiva(boolean[][] matrizRelacion) {
        int n = matrizRelacion.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrizRelacion[i][j]) {
                    for (int k = 0; k < n; k++) {
                        if (matrizRelacion[j][k] && !matrizRelacion[i][k]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------

public static void desition_4(String user){}
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void clearScreen(){
        for (int i = 0; i < 80; i++) {
            System.out.println();
        }
    }
    public static String mensajeDespedida(String user){
        clearScreen();
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