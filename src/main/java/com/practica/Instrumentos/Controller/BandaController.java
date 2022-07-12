
package com.practica.Instrumentos.Controller;

import com.practica.Instrumentos.DTO.InstruAlumDTO;
import com.practica.Instrumentos.Model.Alumno;
import com.practica.Instrumentos.Model.Instrumento;
import com.practica.Instrumentos.Service.AlumnoService;
import com.practica.Instrumentos.Service.InstrumentoService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 @RestController
public class BandaController {
    
     InstrumentoService instruServ = new InstrumentoService();
     AlumnoService alumServ = new AlumnoService();
     
     
     @GetMapping("instrumentos/traerI")
     public List getInstruList(){
         
         return instruServ.getInstruList();
         
     }
     
     @GetMapping("instrumentos/traerA")
     public List getAlumList(){
         
         return alumServ.getAlumList();
         
     }
     
     @GetMapping("instrumentos/traer/{id}")
     public Instrumento getInstru(@PathVariable int id){
         
         return instruServ.getInstru(id);
         
     }
     
     @GetMapping("instrumentos/traer/lista/{nombre_instru}")
     public InstruAlumDTO getAlumTocanInstru(@PathVariable String nombre_instru){
         
         InstruAlumDTO insAluDTO = new InstruAlumDTO();
         
         List <Instrumento> instruList = instruServ.getInstruList();
         List <Alumno> alumList = alumServ.getAlumList();
         for ( int i = 0; i < instruList.size(); i++ ){
             Instrumento instru = instruList.get(i);
             if (instru.getNombre() == nombre_instru){
                 
                 insAluDTO.setId_instru(instru.getId());
                 insAluDTO.setNombre_instru(instru.getNombre());
                 
                 Alumno alumno3 = alumList.get(3);
                 
                 insAluDTO.setNombre_alum(alumno3.getNombre());
                 insAluDTO.setApellido_alum(alumno3.getApellido());
                 
                 
             }
         }
         return insAluDTO;
         
        
         
     }
     
     
     @PostMapping("instrumentos/crearI")
     public String newInstru(@RequestBody Instrumento instru){
         
         instruServ.addInstru(instru);
         return "Se añadio un nuevo instrumento a su lista";
     }
     
     @PostMapping("instrumentos/crearA")
     public String newAlum(@RequestBody Alumno alum){
         
         alumServ.addAlumno(alum);
         return "Se añadio un nuevo alumno a su lista";
         
     }
     
}
