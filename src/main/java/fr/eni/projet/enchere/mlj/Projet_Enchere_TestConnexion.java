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
            System.out.println("1");
            Connection con=DriverManager.getConnection(
                    "jdbc:sqlserver://127.0.0.1/PROJET_ENCHERE","user_enchere","1Aec5ff2cf");
            System.out.println("2");
            Statement stmt=con.createStatement();
            System.out.println("3");
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("4");
            System.out.println("Connected");  
            System.out.println("5");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}
