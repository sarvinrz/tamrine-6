package com.company;


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
                 int code;
                 String name;
                 int year;
                 int moaddel;
                 int counter=1;


                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection connection =
                          DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                         , "sarvinrz","myjava123");
                 PreparedStatement preparedStatement =
                                 connection.prepareStatement("insert into Students (code,name,enteryear,moaddel) values (?,?,?,?)");
                 for (int i=0;i<5;i++) {
                         System.out.println("enter your student code : ");
                         code=scanner.nextInt();
                     System.out.println("enter your name : ");
                         name=scanner2.nextLine();
                         System.out.println("enter your enter year : ");
                         year=scanner3.nextInt();
                         System.out.println("enter your average : ");
                         moaddel=scanner4.nextInt();
                         preparedStatement.setLong(counter, code);
                         preparedStatement.setString(counter+1, name);
                         preparedStatement.setLong(counter+2, year);
                         preparedStatement.setLong(counter+3, moaddel);
                         counter=counter+4;
                         preparedStatement.executeUpdate();
                         preparedStatement.close();
                         connection.close();
                     }




        49     }
50 }

