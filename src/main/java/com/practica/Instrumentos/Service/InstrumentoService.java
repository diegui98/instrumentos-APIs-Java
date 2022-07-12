
package com.practica.Instrumentos.Service;

import com.practica.Instrumentos.Model.Instrumento;
import java.util.ArrayList;
import java.util.List;


public class InstrumentoService {
    
    List <Instrumento> listaInstru = new ArrayList<>();
    
    public void addInstru(Instrumento instru){
        
        listaInstru.add(instru);
        
    }
    
    public List getInstruList(){
        
        return listaInstru;
        
    }
    
    public Instrumento getInstru(int id){
        
        return listaInstru.get(id);
        
    }
    
}
