package kotlinlexanalyzer;

import KotlinParser.KotlinLexer; // Agregamos los documentos generados por ANTLR
import KotlinParser.KotlinParser; // Agregamos los documentos generados por ANTLR
import java.io.IOException;
import java.util.Scanner;
import static kotlinlexanalyzer.TreePrinter.printTree; // Llamamos al Tree Printer
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 *
 * @author Wilmer Torres
 */
public class KotlinLexAnalyzer {
    // NOTA: Los archivos .g4 para generar las clases java correspondientes al Lexer y el Parser de Kotlin se encuentran en la carpeta grammars
    // Definimos una constante con el root path del proyecto

    private final static String ROOT = "/Users/andres/Documents/Netbeans/KotlinLexAnalyzer/kotlin/";
    
    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
        // Creamos las variables con las rutas de los archivos
        String path = KotlinLexAnalyzer.ROOT + "Test.kt";
        String variables = KotlinLexAnalyzer.ROOT + "variables.kt";
        String asignaciones = KotlinLexAnalyzer.ROOT + "asignaciones.kt";
        String condicionales = KotlinLexAnalyzer.ROOT + "condicionales.kt";
        String funciones = KotlinLexAnalyzer.ROOT + "funciones.kt";
        String ciclos = KotlinLexAnalyzer.ROOT + "ciclos.kt";
        Scanner in = new Scanner(System.in);
        int opcion = 1;
 
        // Inicializamos las variables del lexer y el parser
        KotlinLexer lexer = new KotlinLexer(new ANTLRFileStream(path));
        TokenStream tokens = new CommonTokenStream(lexer);
        KotlinParser parser = new KotlinParser(tokens);
        
        System.out.println("----- Bienvenido al analizador lexico de Kotlin -----\n\n");
        System.out.println("----- Carnet: 7690-18-1321 -----\n\n");
        
        do {
            System.out.println("Las opciones que puedes verificar son las siguientes: \n1. Variables\n2. Asignaciones\n3. Condicionales\n4. Funciones\n5. Ciclos\n0. Salir");
            System.out.print("Por favor ingresa la opcion que deseas analizar: ");
            
            opcion = in.nextInt();
            
            // Basado en el valor de opcion generamos el lexer del archivo indicado
            switch(opcion) {
                case 1:
                    lexer = new KotlinLexer(new ANTLRFileStream(variables));
                    break;
                case 2:
                    lexer = new KotlinLexer(new ANTLRFileStream(asignaciones));
                    break;
                case 3:
                    lexer = new KotlinLexer(new ANTLRFileStream(condicionales));
                    break;
                case 4:
                    lexer = new KotlinLexer(new ANTLRFileStream(funciones));
                    break;
                case 5:
                    lexer = new KotlinLexer(new ANTLRFileStream(ciclos));
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            if (opcion > 0 && opcion <= 5) {
                tokens = new CommonTokenStream(lexer); // Generemos los tokens del lexer
                parser = new KotlinParser(tokens); // Parseamos los tokens en el parser
               
                System.out.println("\n--- Inicio de arbol sintactico ---\n");
                printTree(parser.kotlinFile(), 0, lexer); // Mostramos el arbol
                System.out.println("\n--- Fin de arbol sintactico ---\n");   
            }
        } while(opcion > 0);
        
        System.out.println("\n\n ----- Gracias por usar este programa, Me llamo Andres xd -----");
    }
}
