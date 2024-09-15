package Entidades;

import java.util.Date;

/**
 *
 * @author Win10
 */
public class llamada {
    public Date FechaHora;
    public int Duracion;
    public String NumeroOrigen;
    public String NumeroDestino;
    public double CostoLlamada;
    
    public llamada(Date pFechaHora, int pDuracion, String pNumeroOrigen, String pNumeroDestino, double pCostoLlamada ){
        this.FechaHora = pFechaHora;
        this.Duracion = pDuracion;
        this.NumeroOrigen = pNumeroOrigen;
        this. NumeroDestino = pNumeroDestino;
        this.CostoLlamada= pCostoLlamada;
    }
    
}
