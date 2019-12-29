


         import java.sql.Connection;
         import java.sql.DriverManager;
         import java.sql.PreparedStatement;
         import java.sql.SQLException;
         import java.util.Scanner;


         public class Main {

             public static void main(String[] args) throws ClassNotFoundException, SQLException {
                 Scanner scanner=new Scanner(System.in);
                 Scanner scanner2=new Scanner(System.in);
                 Scanner scanner3=new Scanner(System.in);
                 Scanner scanner4=new Scanner(System.in);
                 Scanner scanner5=new Scanner(System.in);
                 Scanner scanner6=new Scanner(System.in);




                 int code;
                 String user;
                 String email;
                 int pass;
                 int age;
                 String degree;


                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection connection =
                                 DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                                         , "sarvin","myjava123");
                 PreparedStatement preparedStatement =
                                 connection.prepareStatement("insert into Bank (code,user,email,pass,age,degree) values (?,?,?,?,?,?,?,?)");
                 for (int i=0;i<5;i++) {
                         System.out.println(" code : ");
                         code=scanner.nextInt();
                         System.out.println("user : ");
                         user=scanner2.nextLine();
                         System.out.println(" email : ");
                         email=scanner3.nextLine();
                         System.out.println(" pass : ");
                         pass=scanner4.nextInt();
                         System.out.println(" age : ");
                         age=scanner5.nextInt();
                         System.out.println(" degree : ");
                         degree=scanner6.nextLine();


                         preparedStatement.setLong(1, code);
                         preparedStatement.setString(2, user);
                         preparedStatement.setString(3, email);
                         preparedStatement.setLong(4, pass);
                         preparedStatement.setLong(5, age);
                         preparedStatement.setString(6, degree);


                         preparedStatement.executeUpdate();


                     }


                 preparedStatement.close();
                 connection.close();


             }

