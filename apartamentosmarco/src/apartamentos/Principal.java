package apartamentos;


import java.io.*;
public class Principal {
	/**
	 * @author marco caza
	 */
    
     /**
     * @param es la clase principal
     */
    /**
     * @param args
     * @throws IOException
     */
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        int metros, metros2;
        int num, num2;
        double precio, precio2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /**
         * anota el numero 
         * anota metros
         * anota precio
         * da de alta a un alquilado
         */
        System.out.println("Anota el numero");
        num=Integer.parseInt(br.readLine());
        metros =validarMetros(br);
        System.out.println("Anota el precio:");
        precio=Double.parseDouble(br.readLine());
        Alquilar alquilado1=new Alquilar(num,metros,precio);
        /**
         * anota el numero 
         * anota metros
         * anota precio
         * da de alta a un alquilado
         */
         System.out.println("Anota el numero");
        num2=Integer.parseInt(br.readLine());
        metros2=validarMetros(br);
        System.out.println("Anota el precio:");
        precio2=Double.parseDouble(br.readLine());
        Alquilar alquilado2=new Alquilar(num2,metros2,precio2);
        
        /**
         * verifica esta alquilado
         * y se sube de precio
         * y si no muestra q no esta alquilado
         */
        if (alquilado1.alquilado()==true) { 
        System.out.println("Anota el porcentaje a subir:");
        double porcentaje=Double.parseDouble(br.readLine());
        alquilado1.subirPrecio(porcentaje);
        }
        else
        	System.out.println("no esta alquilado"); 
        
        
        System.out.println(alquilado1.toString());
        System.out.println(alquilado2.toString());
        System.out.println("Ganancias totales:"+Alquilar.getTotal());
        
    }

	/**
	 * @param br para escrobir
	 * @return mtros
	 * @throws IOException
	 */
	public static int validarMetros(BufferedReader br) throws IOException {
		int metros;
		do{
            System.out.println("Anota los metros:");
            metros=Integer.parseInt(br.readLine());
        }while(metros<40 || metros>100);
		return metros;
	}
    
}
