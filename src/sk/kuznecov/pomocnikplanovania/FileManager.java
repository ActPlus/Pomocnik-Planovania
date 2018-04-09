/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.kuznecov.pomocnikplanovania;

/**
 *
 * @author Ja
 */
import sk.kuznecov.pomocnikplanovania.ludia.Uzivatel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    public static void registrovat(String email, String meno, String heslo) {
        ObjectOutputStream os = null;

        try {
            os = new ObjectOutputStream(new FileOutputStream("uzivatelia.ser"));
            os.writeObject(new Uzivatel(email, meno, heslo));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static Uzivatel prihlasit(String email, String heslo) throws IOException {
        ArrayList<Uzivatel> uzivatelia = nacitajUzivatelov();

        for (Uzivatel uzivatel : uzivatelia) {
            if (email.equalsIgnoreCase(uzivatel.getEmail()) && heslo.equals(uzivatel.getHeslo())) {
                System.out.println(uzivatel.getEmail());
                return uzivatel;
            }
        }
        System.out.println("not found");

        return null;

    }

    public static ArrayList<Uzivatel> nacitajUzivatelov() throws FileNotFoundException, IOException {

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("uzivatelia.ser"));
        ArrayList<Uzivatel> uzivatelia = new ArrayList();

        try {
            while (true) {
                uzivatelia.add((Uzivatel) is.readObject());
            }
        
        } catch (EOFException eee) {
            return uzivatelia;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            is.close();
        }
        return uzivatelia;
        
    }

}
