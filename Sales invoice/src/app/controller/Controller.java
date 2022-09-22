package app.controller;

import app.view.AppFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller implements ActionListener {

    private AppFrame frame; 
    

    public Controller(AppFrame frame) {
        this.frame = frame;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Welcome");

        switch (e.getActionCommand()) {

            case "New Invoice":
                newInvoice();
                break;
            case "Delete Invoice":
                delteInvoice();
                break;

            case "New Item":
                newItem();
                break;

            case "Delete Item":
                deleteItem();
                break;

            case "Load Files":
                loadFiles();
                break;

            case "Save Data":
                saveData();
                break;
        }
    }

    private void newInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void delteInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void newItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadFiles()  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    private void saveData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
