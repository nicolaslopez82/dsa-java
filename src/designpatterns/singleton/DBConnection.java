package designpatterns.singleton;

public class DBConnection {
    private static DBConnection instance;
    private DBConnection() {}
    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
