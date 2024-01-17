/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import data.ConnectData;
import java.awt.event.ActionEvent;//lam event
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.LoginModel;


import java.io.File;

/**
 *
 * @author ACER NITRO 5
 */
public class Song {
    private File source;
    private String sonName;

    public Song(File source, String sonName) {
        this.source = source;
        this.sonName = sonName;
    }

    public File getSource() {
        return source;
    }

    public void setSource(File source) {
        this.source = source;
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }
    
}
