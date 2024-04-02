/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;

/**
 *
 * @author Akhmad
 */
public class Settings implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient String tempPassword;

    public static String applicationName = "MyApp";

    public final String version = "1.0";

    private String userName;
    private String userEmail;

    
}
