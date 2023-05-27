/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kotlinlexanalyzer;

import KotlinParser.KotlinLexer;
import java.util.Objects;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

/**
 * Clase que nos permite mostrar el arbol sintactico en consola
 * @author Wilmer Torres
 */
public class TreePrinter {
    /**
     * 
     * @param tree
     * @throws Exception 
     */
    public static void printRule(ParseTree tree) throws Exception{
        char[] ruleName = tree.getClass().getSimpleName().replaceFirst("Context", "").toCharArray();
        ruleName[0] = Character.toLowerCase(ruleName[0]);
        System.out.println(ruleName);
    }
    
    /**
     * 
     * @param node
     * @return
     * @throws Exception 
     */
    public static int getNodeTypeNumber(TerminalNodeImpl node) throws Exception{
        return node.getSymbol().getType();
    }
    
    /**
     * 
     * @param node
     * @param lexer
     * @throws Exception 
     */
    public static void printNode(TerminalNodeImpl node, KotlinLexer lexer) throws Exception{
        String nodeType = lexer.getVocabulary().getSymbolicName(getNodeTypeNumber(node));
        String nodeText = node.getText();
        
        if (Objects.equals(nodeType, "NL")) {
            nodeText = "\\n";
        }
        
        System.out.println("PsiElement" + "(" + nodeType + ")" + "('" + nodeText + "')");
    }
    
    /**
     * 
     * @param indentation
     * @throws Exception 
     */
    public static void printIndentation(int indentation) throws Exception{
        String output = "";
        
        for (int i = 0; i < indentation; i++) {
            output += "  ";
        }
        
        System.out.print(output);
    }
    
    /**
     * 
     * @param tree
     * @param indentation
     * @param lexer
     * @throws Exception 
     */
    public static void printTree(ParseTree tree, int indentation, KotlinLexer lexer) throws Exception{
        printIndentation(indentation);
        String treeClassName = tree.getClass().getSimpleName();
        
        
        if (Objects.equals(treeClassName, "TerminalNodeImpl")) {
            TerminalNodeImpl node = (TerminalNodeImpl)tree;
            printNode(node, lexer);
        } else {
            printRule(tree);
            
            if (tree.getChildCount() == 0) {
                printIndentation(indentation);
                System.out.println("  <empty list>");
            }
            
            for (int i = 0; i < tree.getChildCount(); i++) {
                printTree(tree.getChild(i), indentation + 1, lexer);
            }
        }
    }
}
