/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ContactManagement;
import model.Contact;

/**
 *
 * @author A
 */
public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        
        new ContactManagement(contact).run();
    }
    
}
