/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thais
 */
public class TabuleiroTest {

    /**
     * Test of mostrar method, of class Tabuleiro.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Tabuleiro jogo = new Tabuleiro();
        String resultado = jogo.mostrar();
        Assert.assertEquals("  1  2  3\n" + "  4  5  6\n" + "  7  8  9\n", resultado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validacao method, of class Tabuleiro.
     */
    @Test
    public void testValidacao() {
        System.out.println("validacao");
        Tabuleiro instance = new Tabuleiro();
        boolean result = instance.validacao("3");
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of jogada method, of class Tabuleiro.
     */
    @Test
    public void testJogada() {
        Tabuleiro instance = new Tabuleiro();
        instance.jogada("1", "X");
        String resultado = instance.mostrar();
        Assert.assertEquals("  X  2  3\n" + "  4  5  6\n" + "  7  8  9\n", resultado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of vencedor method, of class Tabuleiro.
     */
    @Test
    public void testVencedor() {
        System.out.println("vencedor");
        Tabuleiro instance = new Tabuleiro();
        instance.jogada("1", "X");
        instance.jogada("2", "X");
        instance.jogada("3", "X");
        String result = instance.vencedor(3);
        Assert.assertEquals("jogador 1 venceu!", result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testEmpate() {
        Tabuleiro j = new Tabuleiro();
        String empate = j.vencedor(9);
        Assert.assertEquals("empate venceu!", empate);
    }

   // @Test
   // public void jogadaInvalida() {
      //  Tabuleiro j = new Tabuleiro();
       // String resultado = j.jogada( 2, "X");
        //Assert.assertEquals("Posição inválida, informe uma nova, por favor!", resultado);

    //}

}
