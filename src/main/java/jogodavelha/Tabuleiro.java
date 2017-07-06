/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Thais
 */
public class Tabuleiro {
    
    private String[][] tabuleiro= {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}};
    
    public String mostrar(){
        String l="";
        for(int li=0; li<3; li++){
            for(int co=0; co<3; co++){
              l = l + "  " + tabuleiro[li][co];
            }
            l = l + "\n"; 
        }
        return l;
    }
    
    
    public boolean validacao(String posicao){
        for(int li=0; li<3; li++){
            for(int co=0; co<3; co++){
                if(tabuleiro[li][co].equals(posicao)){
                    return true;
                } 
            }
        }
        return false;
    }
    
    public String jogada(String posicao, String jogador){
        if(posicao.equals("1"))
           return tabuleiro[0][0]=jogador;
        else if(posicao.equals("2"))
          return  tabuleiro[0][1]=jogador;
        else if(posicao.equals("3"))
           return tabuleiro[0][2]=jogador;
        else if(posicao.equals("4"))
            return tabuleiro[1][0]=jogador;
        else if(posicao.equals("5"))
           return tabuleiro[1][1]=jogador;
        else if(posicao.equals("6"))
           return tabuleiro[1][2]=jogador;
        else if(posicao.equals("7"))
           return tabuleiro[2][0]=jogador;
        else if(posicao.equals("8"))
           return tabuleiro[2][1]=jogador;
        else if(posicao.equals("9"))
           return tabuleiro[2][2]=jogador;
        return "";
    }
    
    public String vencedor(int jogada){
        String[] jogadas = new String[8];
        String vencedor = "null";
        if(jogada == 9){
            vencedor = "empate";         
        }
        //jogadas horizontais
        jogadas[0] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
        jogadas[1] = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
        jogadas[2] = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];
        
        //jogadas verticais
        jogadas[3] = tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0];
        jogadas[4] = tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1];
        jogadas[5] = tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2];
        
        jogadas[6] = tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2];
        jogadas[7] = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
        
        for(int i =0; i<jogadas.length; i++){
            if(jogadas[i].equals("XXX")){
                vencedor="jogador 1";
            }else if(jogadas[i].equals("OOO")){
                vencedor="jogador 2";
            }
        }
        return vencedor + " venceu!";
    }
}
