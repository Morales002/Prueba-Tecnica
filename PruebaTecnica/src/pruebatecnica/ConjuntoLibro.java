package pruebatecnica;

public class ConjuntoLibro {

    public static void main(String[] args) {       
        Libro array[] ={
            new Libro("Cien Años de Soledad","Gabriel Garcia Marquez",325,7.5),
            new Libro("Cronicas de una muerte anunciada", "Gabriel Garcia Marquez",420,8)
        };
        
        for (int i = 0; i < array.length; i++){  
            System.out.println(array[i]);
        }
    }
}
