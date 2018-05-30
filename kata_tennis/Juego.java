/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata_tennis;

/**
 *
 * @author Miguel
 */
public class Juego {
    String marcador;
    
    static Juego J1 =new Juego();
    static Juego J2 = new Juego();
    static boolean match=false;
    static int i=0, j=0;
    static String puntos[]={"0","15","30","40","A","GANADOR"};
    static public String vencedor;
    
   
    
    public static void jugadas(String player){
        matchpoint(i,j, player);
        if(match==true){
            i=3;
            j=3;
           J1.marcador=puntos[i];
           J2.marcador=puntos[j];
        }else{
            incrementar(player);
            if(J1.marcador=="GANADOR"){
                vencedor="Jugador 1";
                Win.main(puntos);
            }else if(J2.marcador=="GANADOR"){
                vencedor="Jugador 2";
                Win.main(puntos);
            }
                
        }
        
    }
    
    public static boolean matchpoint(int a,int b, String player){
        if((a==3&&b==4)&& player=="Jugador 1"){
            match=true;
        }
        else if((a==4&&b==3)&& player=="Jugador 2"){
            match=true;
        }
        else{
            match =false;
        }
        return match;
    }
    
    public static void incrementar(String player){
        if(player=="Jugador 1"){
            i++;
            J1.marcador=puntos[i];
        }if(player=="Jugador 2"){
            j++;
            J2.marcador=puntos[j];
        }
    }
}
