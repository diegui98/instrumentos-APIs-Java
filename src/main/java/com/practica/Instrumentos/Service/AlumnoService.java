
package com.practica.Instrumentos.Service;

import com.practica.Instrumentos.Model.Alumno;
import java.util.ArrayList;
import java.util.List;


public class AlumnoService {
    
    List <Alumno> listaAlum = new ArrayList<>();
    
    public void addAlumno(Alumno alum){
        
        listaAlum.add(alum);
        
    }
    
    public List getAlumList(){
        
        return listaAlum;
        
    }
    
}
