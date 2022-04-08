/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecnica;

/**
 *
 * @author Morales Zabala
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double calificacion;
    
    public Libro(String tit,String aut, int pag, double cal){
        titulo = tit;
        autor = aut;
        paginas = pag;
        calificacion = cal;
    }
    public void setTitulo(String ntitulo){
        titulo = ntitulo;
    }
    public void setAutor(String nautor){
        autor=nautor;
    }
    public void setPaginas(int npaginas){
        paginas=npaginas;
    }
    public void setCalificacion(double ncalificacion){
        calificacion=ncalificacion;
        if (calificacion >10){
            calificacion = Integer.parseInt("calificacion fuera de rango");
        }
        if (calificacion <0){
            calificacion = Integer.parseInt("calificacion fuera de rango");
        }        
    }
    
    public String getTitulo(){
        return titulo;
    } 
    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
    public double getCalificacion(){
        return calificacion;
    }
    @Override
    public String toString(){
        return titulo+","+autor+","+paginas+","+calificacion;
        
    }
}
