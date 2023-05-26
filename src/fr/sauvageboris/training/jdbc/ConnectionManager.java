package fr.sauvageboris.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// SINGLETON
public final class ConnectionManager {

    private static final String URL = "jdbc:mysql://localhost:8889/example?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection S_INSTANCE;

    private ConnectionManager() {
        // Empecher l'instanciation directe
    }

    public static void close(){
        try {
            if(S_INSTANCE != null && !S_INSTANCE.isClosed()){
                S_INSTANCE.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection get() {
        if(S_INSTANCE == null){
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                S_INSTANCE = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.err.println("Error Connection.get()");
                e.printStackTrace();
            }
        }
        return S_INSTANCE;
    }
}
