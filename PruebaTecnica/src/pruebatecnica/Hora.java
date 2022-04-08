
package pruebatecnica;
public class Hora {
    private int hora ;
    private int minutos ;
    private int segundos ;   
    public Hora(){    
    }    
    
    public Hora(int newhora, int newminutos, int newsegundos){ 
        hora = newhora;
        minutos = newminutos;
        segundos= newsegundos;
        if (hora > 23){
            hora=0;
            minutos=0;
            segundos=0;
        }   
        if (minutos > 59){
            hora=0;
            minutos=0;
            segundos=0;
        }
        if (segundos >59){
            hora=0;
            minutos=0;
            segundos=0;
        } 
    }   
   
    //Nota* no supe usar la precondición para los metodos, opté por usar el condicoinal si// 
    public void setHora(int nhora,int nminutos,int nsegundos){
        hora=nhora;
        minutos=nminutos;
        segundos=nsegundos;
        if (hora > 23){
            hora=0;
            minutos=0;
            segundos=0;
        }
        if (minutos > 59){
            hora=0;
            minutos=0;
            segundos=0;
        }
        if (segundos >59){
            hora=0;
            minutos=0;
            segundos=0;
        }
    }     
    public String getHora(){
        return hora+":"+minutos+":"+segundos;
    }  
     
    public void imprimirHora(){
        System.out.println(hora+":"+minutos+":"+segundos);
    }    
}
