/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

/**
 *
 * @author Akhmad
 */import java.io.*;

public class serialisasi {
    public static void main(String[] args) {
        Settings settings = new Settings();
        

        // Serialisasi
        try {
            FileOutputStream fileOut = new FileOutputStream("settings.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(settings);
            out.close();
            fileOut.close();
            System.out.println("Serialisasi berhasil.");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialisasi
        Settings deserializedSettings = null;
        try {
            FileInputStream fileIn = new FileInputStream("settings.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedSettings = (Settings) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Settings class tidak ditemukan");
            c.printStackTrace();
            return;
        }

       
    }
}
