/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

import java.util.ArrayList;

/**
 *
 * @author dmadero
 */
public class Client {
    private int id;
    private String name;
    private String lastName;
    private int telefono;
    private int edad;
    private String email;
    private Asset[] assets;

    public Client(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.assets = new Asset[10];
        
    }

    public Client(int id, String name, String lastName, int telefono, int edad, String email, Asset[] assets) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.assets = assets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }
    
}
