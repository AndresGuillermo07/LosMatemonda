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
                case 3:
                    desition_3(selection);
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

        sc.nextLine();

        System.out.print("¿Deseas hacer pruebas con la suma de los primeros 𝓷 números naturales? (si/no): ");
        hacerPrueba = sc.nextLine();

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
    public static void desition_3(int selection) {
        System.out.println("Bienvenido a Relaciones\n");

        boolean continuar = true;
        boolean[][] matrizRelacion = null;

        while (continuar) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Ingresar Relación");
            System.out.println("2. Mostrar Matriz de Relación");
            System.out.println("3. Mostrar Tipo de Relación");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

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
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static List<List<Integer>> solicitarRelacion() {
        List<List<Integer>> relaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los pares ordenados de la relación en el formato (número,letra):");
        System.out.println("Por ejemplo: (1,a), (2,b), etc.");
        System.out.println("Escriba 'fin' para terminar de ingresar la relación.");

        while (true) {
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            String[] partes = entrada.split(",");

            // Verificar si el formato de entrada es correcto (debe haber exactamente dos partes separadas por ',')
            if (partes.length != 2) {
                System.out.println("Formato de entrada incorrecto. Debe ingresar los pares ordenados en el formato '(número,letra)'.");
                continue;
            }

            try {
                int numero = Integer.parseInt(partes[0].replaceAll("[^0-9]", ""));
                int letra = (int) partes[1].charAt(0);
                relaciones.add(Arrays.asList(numero, letra));
            } catch (NumberFormatException e) {
                System.out.println("Formato de entrada incorrecto. El número debe ser un entero.");
                continue;
            }
        }

        return relaciones;
    }

    public static boolean[][] construirMatrizRelacion(List<List<Integer>> relaciones) {
        int maxNumero = 0;
        int maxLetra = 0;
        for (List<Integer> relacion : relaciones) {
            maxNumero = Math.max(maxNumero, relacion.get(0));
            maxLetra = Math.max(maxLetra, relacion.get(1));
        }

        boolean[][] matrizRelacion = new boolean[maxNumero][maxLetra];

        for (List<Integer> relacion : relaciones) {
            int numero = relacion.get(0) - 1;
            int letra = relacion.get(1) - 'a';
            matrizRelacion[numero][letra] = true;
        }

        return matrizRelacion;
    }


    public static void mostrarMatrizRelacion(boolean[][] matrizRelacion) {
        int maxColumna = 0;
        for (int numero = 0; numero < matrizRelacion.length; numero++) {
            for (int letra = 0; letra < matrizRelacion[0].length; letra++) {
                if (matrizRelacion[numero][letra] && letra > maxColumna) {
                    maxColumna = letra;
                }
            }
        }

        System.out.print("   ");
        for (int letra = 0; letra <= maxColumna; letra++) {
            System.out.printf("%3c", (char) ('a' + letra));
        }
        System.out.println();

        for (int numero = 0; numero < matrizRelacion.length; numero++) {
            System.out.printf("%3d", numero + 1);
            for (int letra = 0; letra <= maxColumna; letra++) {
                System.out.printf("%3s", matrizRelacion[numero][letra] ? "1" : "0");
            }
            System.out.println();
        }
    }

//   falta por arreglar errores en metodo de verificar si es transitiva

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

        if (n != matrizRelacion[0].length) {
            return false;
        }

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
        int filas = matrizRelacion.length;
        int columnas = matrizRelacion[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i != j && ((matrizRelacion[i][j] && matrizRelacion[j][i]) || (!matrizRelacion[i][j] && !matrizRelacion[j][i]))) {
                    return false;
                }
            }
        }
        return true;
    }



    public static boolean esTransitiva(boolean[][] matrizRelacion) {
        for (int i = 0; i < matrizRelacion.length; i++) {
            for (int j = 0; j < matrizRelacion[i].length; j++) {
                if (matrizRelacion[i][j]) {
                    for (int k = 0; k < matrizRelacion.length; k++) {
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
