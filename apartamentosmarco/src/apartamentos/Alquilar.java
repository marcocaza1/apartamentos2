package apartamentos;
/*
 *
 * Created on 28 de enero de 2008, 17:45
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


/**
 * @author marco caza
 *
 */


public class Alquilar {
    private int numero;
    private int metros;
    private double precio;
    private boolean alquilado;
    private static double total=0;
    
    /**
     * constructor de la clase alquilar
     * @param n es el numero
     * @param m son los metros
     * @param pre es el precio
     */
    public Alquilar(int n,int m,double pre) {
        numero=n;
        metros=m;
        precio=pre;
        alquilado=false;
    }
    
    /**
     * muestra el numero
     * @return numero
     */
    public int getNumero() {
		return numero;
	}

	

	/**muestra los metros 
	 * @return metros
	 */
	public int getMetros() {
		return metros;
	}

	

	/**
	 * muestra el precio
	 * @return precio
	 */
	public double getPrecio() {
		return precio;
	}

	

	/**
	 * muestra si esta alquilado
	 * @return true or false
	 */
	public boolean isAlquilado() {
		return alquilado;
	}

	

	/**
	 * muestra el total
	 * @return total
	 */
	public static double getTotal() {
		return total;
	}

	
    
    /**
     * metodo para saber si esta alquilado o no
     * @return verdadero o falso
     */
    public boolean alquilado(){
        if (alquilado)
            return false;
        alquilado=true;
        total+=precio;
        return true;
    }
     
    
    /**
     * metodo que nos sube el precio al alquiler
     * @param porcentaje
     * @return total
     */
    public double subirPrecio(double porcentaje){
        total=precio+porcentaje*precio/100;
        return total;
    }
    

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alquilar [numero=" + numero + ", metros=" + metros + ", precio=" + precio + ", alquilado=" + alquilado
				+ "]";
	}
    
    

	

	

	
	
	
    
    
   
}
