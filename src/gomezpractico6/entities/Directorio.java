/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezpractico6.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Rodrigo
 */
public class Directorio {
//    private HashSet<Cliente> clientes = new HashSet<>();
    private TreeMap<String,Cliente> clientes = new TreeMap<>();
    
    public Cliente agregarCliente(Cliente cliente,String telefono){
        return clientes.put(telefono, cliente);
    }
    
    public Cliente buscarCliente(String telefono){
        for(String tel:clientes.keySet()){
            if(tel.equals(telefono))return clientes.get(tel);
        }
        
        System.out.println("No se encontro un cliente asociado a ese numero telefonico");
        
        return null;
        
    }
    
    // buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
    // teléfono asociados a dicho apellido.
    public ArrayList<String> buscarTelefono(String apellido){
        ArrayList<String> toRet = new ArrayList<>();
        
        for(String tel:clientes.keySet()){
            if(clientes.get(tel).getApellido().equals(apellido))toRet.add(tel);
        }
        
        return toRet;
    }
    
    // buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes
    // asociados a dicha ciudad
    public ArrayList<Cliente> buscarClientes(String ciudad){
        ArrayList<Cliente> toRet = new ArrayList<>();
        
        for(String tel:clientes.keySet()){
            Cliente auxClient = clientes.get(tel);
            if(auxClient.getCiudad().equals(ciudad))toRet.add(auxClient);
        }
        
        return toRet;
    }
    
    // borrarCliente() que en base a un dni
    // elimina el cliente del directorio.
    public TreeMap<String,Cliente> borrarCliente(int dni){
        TreeMap<String,Cliente> toRet = new TreeMap<String, Cliente>();
        for(String tel:clientes.keySet()){
            Cliente auxClient = clientes.get(tel);
            
            if(auxClient.getDni() == dni){
                toRet.put(tel, clientes.remove(tel));
            };
        }
        
        return toRet;
    }
    
}
