
package bibliotecaexamen;

import java.util.Scanner;


public class BibliotecaExamen {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opcion = 0; 
        int contadorLibro = 0;
        Libro libros[]  = new Libro[10];
        Autor autores[] = new Autor[10];
        
    
        do{
            
            System.out.println("###BIBLIOTECA PERSONAL###");
            System.out.println("1.-Registrar libro ");
            System.out.println("2.-Imprimir libro favoritos");
            System.out.println("3.-Contar libros de cada Autor");
            System.out.println("4.-Salir ");
            opcion = scan.nextInt();
            
            switch(opcion){
            case 1:
                if (contadorLibro== 10){
                        System.out.println("La biblioteca llena");
                        break;
                    }
                
                System.out.println("Ingrese la informacion del libro ");
                scan.nextLine();
                System.out.println("Titulo: ");
                String titulo = scan.nextLine();
            
                System.out.println("Año: ");
                int anio = scan.nextInt();
                
                System.out.println("Favorito: ");
                boolean favorito =scan.nextBoolean();
                                
                Autor au[] = new Autor[1];
                scan.nextLine();
                System.out.println("Nombre del Autor: ");
                String nomAutor = scan.nextLine();
                
                System.out.println("Pais del Autor: ");
                String paisAutor = scan.nextLine();
                
                Autor autor = new Autor(nomAutor, paisAutor);
                au[0] = new Autor(nomAutor, paisAutor);
                autores[contadorLibro] = autor;
                //autores[0] = new Autor(nomAutor, paisAutor);
                
                Libro libro = new Libro(titulo, au, anio, favorito);
                
                libros[contadorLibro] = libro;
                System.out.println(libros[contadorLibro] );     
                                
                contadorLibro++;            
                
                
                break;
            case 2:
                if(contadorLibro == 0){
                    System.out.println("####No existen libros Registrados####");
                }else{
                    for (int i=0; i< contadorLibro; i++){
                        if (libros[i].isFavorito() == true ){
                            System.out.println("ListA de los libros favoritos");
                            System.out.println((i+1)+ " "+ libros[i].getTitulo());
                        }
                        
                    }
                }
  
                break;
            case 3:
                System.out.println("Lista de los Autores");
                for (int i=0; i< contadorLibro; i++){
                    int contador = 0;
                    for(int j=0; j<contadorLibro; j++){
                        if (autores[i] != null && libros[j] != null){
                            //System.out.println(i+" "+j);
                            //System.out.println(autores[i].getNombre());
                            //System.out.println(libros[j].getAutor()[0].getNombre());
                            if(autores[i].getNombre().equals(libros[j].getAutor()[0].getNombre()) ){
                                contador++;
                                System.out.println((i+1)+ ". "+ autores[i].getNombre()+"("+contador+")");
                                //System.out.println(contador);                                
                            }
                            //System.out.println((i+1)+ ". "+ libros[j].getAutor()[0].getNombre());
                            //System.out.println((i+1)+ ". "+ autores[i].getNombre());
                        }
                    }
                        
                }
                
                break;
            case 4:
                System.out.println("###GRACIAS###");
                System.exit(0);
                break;
            default:
               System.out.println("La opcion incorrecta!!! "); 
            }
        }while (opcion != 4);
        
        
        
        
        
        
    }
    
}
