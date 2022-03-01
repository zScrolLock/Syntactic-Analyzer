/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algumaparser;
import analisadorlexico.AnalisadorLex;

public class Principal {
    public static void main(String args[]) {
        AnalisadorLex lex = new AnalisadorLex(args[0]);
        AlgumaParser parser = new AlgumaParser(lex);
        parser.programa();
    }
}
