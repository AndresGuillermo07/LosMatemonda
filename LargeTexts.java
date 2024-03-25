package main;

public class LargeTexts {
    public static final String DESCRIPTION =
            """
            | Bienvenido al programa de Matemáticas Discretas!                                                                        
            |                                                                                                                         
            | Este programa está diseñado para ayudarte a explorar conceptos fundamentales de matemáticas discretas como:             
            |                                                                                                                          
            |✠ inducción matemática.                                                                                                  
            |                                                                                                                          
            |✠ conjuntos.                                                                                                              
            |                                                                                                                           
            |✠ relaciones.                                                                                                              
            |                                                                                                                           
            |✠ funciones.                                                                                                               
            |                                                                                                                            
            | Con nuestra interfaz intuitiva y menú de opciones, podrás resolver problemas y visualizar conceptos de manera interactiva. 
            |
            | Desea continuar? si/no :
            ______________________________________________________________________________________________________________________________
            """;
    public static String DESCRIPTION_INDUCCION ="""
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
    public static final String MENU1="""
                ¡Explora el fascinante mundo de las matemáticas discretas con nuestro programa interactivo!
                
                1. Inducción Matemática
                2. Operaciones con Conjuntos 
                3. Explorar Relaciones
                4.Funciones Matemáticas
                _____________________________________________________________________________________________
                """;
    public static final String INDUCCTION_MENU= """
            | --------------------------------------------------------------------------------- |
            | 1.Suma de los primeros 𝓷 numeros naturales                                        |
            | 2.Calcular el factorial de un número utilizando recursión                         |
            | 3.Calcular la potencia de un número utilizando utilizando inducción               |
            | 4.Cambiar de tema                                                                 |
            | 5.Salir del programa                                                              |
            | --------------------------------------------------------------------------------- |
            """;
    public static final String INDUCCTION_MENU2 = """
            Deseas
            | ---------------------------------------------------------------------------------
            | 1. Explorar diferentes ejemplos                                                   |
            | 2.Cambiar de tema                                                                 |
            | 3. Salir                                                                          |
            | --------------------------------------------------------------------------------- |
            """;
}
