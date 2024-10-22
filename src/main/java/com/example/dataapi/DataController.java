package com.example.dataapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/")
    public String home() {
        return "Bienvenido a la API de datos. Visita /datos para ver la información.";
    }

    @GetMapping("/datos")
    public List<DataModel> obtenerDatos() {
        List<DataModel> datos = dataService.obtenerDatos();
        
        // Imprimir los datos en la consola
        System.out.println("Datos obtenidos:");
        for (DataModel dato : datos) {
            System.out.println(dato.getId() + ": " + dato.getNombre() + ", " + dato.getEdad() + " años");
        }
        
        return datos;
    }
}
