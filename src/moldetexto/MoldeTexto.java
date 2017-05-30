/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moldetexto;

/**
 *
 * @author danilo.martinez
 */
public class MoldeTexto {
      
    public static String Molde(String texto){
        String quebra[]= texto.split ("\n");
        String molde = "";
        String addEspaco = "";
        String addTeto = "";
        int tamanhoMaximo=0,tamlinha=0;
       
         
         for (int i=0;i < quebra.length;i++){
             
           //  tamlinha = quebra[i].length();
         //   System.out.println(tam);
             if (tamlinha <= quebra[i].length()){
                 tamanhoMaximo = quebra[i].length();
             }
             tamlinha = tamanhoMaximo;
             System.out.println(tamanhoMaximo);
         }
         
        for (int i = 0;i < quebra.length;i++){
            int tamanho = quebra[i].length();
            int medidorEspacos = tamanhoMaximo - tamanho;
            System.out.println(medidorEspacos);
            addEspaco="";
                for (int j =0;j < medidorEspacos;j++){
                    
                    addEspaco = addEspaco +" ";
                }
            quebra[i] = "║   "+ quebra[i];    
            quebra [i] = quebra[i]+addEspaco+"   ║";
            molde = molde +quebra[i]+"\n";
            }
        for (int h =0;h < tamanhoMaximo;h++){
            addTeto=addTeto+ "=";
        }
        molde ="╔"+ addTeto+"======"+"╗"+"\n" + molde+"╚"+addTeto+"======"+"╝"; 
        
      return molde;
    }
    
    public static void main(String[] args) {
        String texto = "jksdkjdsgfowuifgwouifgwert53sdfn \n fdbsafad564fafsdkjgsçkjbnskjBGSFBOSHO´FGOafddbdbd \n wsfgnswogfjwsog \n feqwffsadfsdgsgsgsdgiwejfoiwjf\n";
        System.out.println(Molde(texto));
        
        
    }
    
}
