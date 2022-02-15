package fr.eni.projet.enchere.mlj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Projet_Enchere_TestConnexion 

{
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:sqlserver://127.0.0.1/PROJET_ENCHERE","user_enchere","1Aec5ff2cf");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}
