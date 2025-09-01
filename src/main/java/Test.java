import factory.ConnectionFactory;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        try{
        Connection connection= new ConnectionFactory().getConnection();
            System.out.println("Connection Successful !!!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
