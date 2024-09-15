/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.ArrayList;
/**
 *
 * @author Win10
 */
public class cliente {
    public String Codigo;
    public String Dui;
    public String Departamento;
    public ArrayList<llamada> Illamada;
    
    
    public cliente(String pCodigo, String pDui, String pDepartamento){
        this.Codigo = pCodigo;
        this.Dui = pDui;
        this.Departamento = pDepartamento;
           
    }
}
