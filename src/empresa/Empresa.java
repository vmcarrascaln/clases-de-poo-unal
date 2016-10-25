/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private String Empresa;
    
     private TreeMap<String,Empleado> emp;

     public ArrayList<Empleado> ListarTodosEmpleados(){
        ArrayList<Empleado> empleados= new ArrayList<>();
    for (Empleado e: this.emp.values())
        empleados.add (e);
    return empleados;
    
}
      public boolean agregarSucursal (Sucursal a){
          
        return false;
          
      }
}


