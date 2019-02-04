/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dmadero
 */
public class Company {
    private String name;
    private ArrayList <Asset> assets;
    private HashMap <Integer, Client> clients;

    public Company(String name, ArrayList<Asset> assets, HashMap<Integer, Client> clients) {
        this.name = name;
        this.assets = assets;
        this.clients = clients;
    }

    public boolean addClient (int id, String name, String lastName, String email){
    this.clients.put(id, new Client(id, name, lastName, email ));
    return false;
}    

}  
    
    

