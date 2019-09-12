package com.Puma.demo;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Cliente {

    private @Id @GeneratedValue Long id;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Direccion;
    private String Correo;


    Cliente() {}

    Cliente(String Nombre, String Apellido ,String Telefono,String Direccion,String Correo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo= Correo;
    }
}

