/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;
import edu.csueb.cs3520.bean.MapBean;
import edu.csueb.cs3520.bean.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.Connection;

/**
 *
 * @author Simi510
 */
public class DBUtils {
    public static Connection conn = null;
    private static String url="jdbc:mysql://localhost:3306/cs3520";
    private static String username = "root";
    private static String password = "simi";    
    
    
    public static Connection getConnection(){
        try{
       // if(conn == null){
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
       // }
    } catch(Exception e) {
        System.err.println(e.getMessage());
        e.printStackTrace();
      }
        return conn;
    }
    
    public static List<User> getUsers(){
        Connection connection;
        connection = getConnection();
        ResultSet rs =null;
        Statement statement = null;
        List<User> users = new ArrayList<User>();
        try{
        statement = connection.createStatement();
        rs = statement.executeQuery(
        "SELECT * FROM User " );
       // "WHERE Email = 'jsmith@gmail.com'");
       
        User user;
        while(rs.next()){
          //  System.out.println("Name: " + rs.getString("firstname") + " " + rs.getString("lastname"));
          user = new User(rs.getString("firstname"), rs.getString("lastname"), rs.getString("email"), rs.getString("username"), rs.getString("password"));
          users.add(user);
        }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
        
        return users;
        
    }
    public static boolean createUser(User user){
         Connection connection;
        connection = getConnection();
        ResultSet rs =null;
        Statement statement = null;
       // List<User> users = new ArrayList<User>();
        boolean status = false;
        
        try{
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate("INSERT INTO User (firstname, lastname, email, username, password, role_id)" + 
                    "VALUES ( '" + user.getFirstname() +
                  "', '" + user.getLastname() + "', '" + user.getEmail() + "', '" + 
                    user.getUsername() + "', '" + user.getPassword() + "', '2')" );
             
        
            if(rowCount>0){
                status = true;
                }
           } catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
            
            
        return status;    
            
       
        
        
    }
    
    public static boolean updateUser(User user){
         Connection connection;
        connection = getConnection();
        Statement statement = null;
        boolean status = false;
        
        try{
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate("UPDATE User SET firstname='" + user.getFirstname() +
                  "', lastname='" + user.getLastname() +
                    "', username='" + user.getUsername() +
                    "', password='" + user.getPassword() + "' "  +
                    "WHERE email='" + user.getEmail() + "'");
                    //"', email='" + user.getEmail() + 
                          
            if(rowCount>0){
                status = true;
                }
           } catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
            
            
        return status;    
            
       
        
        
    }
    

    public static boolean deleteUser(User user){
         Connection connection;
        connection = getConnection();
        Statement statement = null;
        boolean status = false;
        
        try{
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate("DELETE From User " +
                    "WHERE email='" + user.getEmail() + "'");

                          
            if(rowCount>0){
                status = true;
                }
           } catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
            
            
        return status;    
            
       
        
        
    }    
   
    
    
    
    
        public static boolean createEmail(User user){
         Connection connection;
        connection = getConnection();
        ResultSet rs =null;
        Statement statement = null;
       // List<User> users = new ArrayList<User>();
        boolean status = false;
        
        try{
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate("INSERT INTO email (firstname, lastname, email)" + 
                    "VALUES ( '" + user.getFirstname() +
                  "', '" + user.getLastname() + "', '" + user.getEmail() + " ')" );
             
        
            if(rowCount>0){
                status = true;
                }
           } catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
            
            
        return status;    
            
       
        
        
    }
    
        
                public static int createQuote(MapBean map){
         Connection connection;
        connection = getConnection();
        ResultSet rs =null;
        Statement statement = null;
                int quoteId = 0;
       // List<User> users = new ArrayList<User>();
        boolean status = false;
        
        try{
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate("INSERT INTO quote ( origin,  destination,  price,  mpg, distance,  gasType,  ppm,  gallons,  gasCost, ppmCost, totalCost) " + 
                    "VALUES ( '" + map.getOrigin() +
                  "', '" + map.getDestination() + 
                  "', '" + map.getPrice() +
                  "', '" + map.getMpg() +
                  "', '" + map.getDistance() +
                  "', '" + map.getGasType() +
                  "', '" + map.getPpm() +
                  "', '" + map.getGallons() +
                  "', '" + map.getGasCost() +
                  "', '" + map.getPpmCost() +
                  "', '" + map.getTotalCost() +
                    " ')", Statement.RETURN_GENERATED_KEYS );
            
        
 
     rs = statement.getGeneratedKeys();
    rs.next();
    quoteId = rs.getInt(1);
             
        
            if(rowCount>0){
                status = true;
                }
           } catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
            
            
        return quoteId;    
            
       
        
        
    }
                
                /*
                 public static int quoteId(){
        ResultSet rs =null;
        PreparedStatement ps = null;
        Connection con = null;
        int quoteId = 0;
        Statement stmt = null;
        

        
        try{
            
            
            
            stmt = conn.createStatement();
            
            String sql = "Insert INTO quote(name, age) (?, ?)";

    stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
 
     rs = stmt.getGeneratedKeys();
    rs.next();
    quoteId = rs.getInt(1);


           
                            String sql = "SELECT IDENT_CURRENT(‘quote’)";
                Connection connection=null;
     int generatedkey=0;
     ps=connection.prepareStatement(sql);
     rs=ps.getGeneratedKeys();
    if (rs.next()) {
       quoteId=rs.getInt(1);   
               System.out.println("Auto Generated Primary Key " + quoteId); 
    }
            
            

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
          con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/cs3520","root","simi");
          ps =con.prepareStatement
                             ("SELECT IDENT_CURRENT(‘quote’)");

         rs =ps.executeQuery();
        // quoteId = ps;
        
        
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(Exception e){
            
             }
        }
      return quoteId;
    }
        */
           
                 
    public static List<MapBean> getQuote(){
        Connection connection;
        connection = getConnection();
        ResultSet rs =null;
        Statement statement = null;
        List<MapBean> maps = new ArrayList<MapBean>();
        try{
        statement = connection.createStatement();
        rs = statement.executeQuery(
        "SELECT * FROM quote " );
       // "WHERE Email = 'jsmith@gmail.com'");
       
        MapBean map;
        while(rs.next()){  //id, origin,  destination,  price,  mpg, distance,  gasType,  ppm,  gallons,  gasCost, ppmCost, totalCost
          //  System.out.println("Name: " + rs.getString("firstname") + " " + rs.getString("lastname"));
          map = new MapBean(rs.getString("id"), rs.getString("origin"),
                rs.getString("destination"), rs.getString("price"), rs.getString("mpg"),
                rs.getString("distance"), rs.getString("gasType"), rs.getString("ppm"), 
                rs.getString("gallons"), rs.getString("gasCost"), rs.getString("ppmCost"),
                rs.getString("totalCost"));
          maps.add(map);
        }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
        
        return maps;
        
    }
                
        
        
   
    public static boolean updateQuote(MapBean map){
         Connection connection;
        connection = getConnection();
        Statement statement = null;
        boolean status = false;
        
        try{  //id, origin,  destination,  price,  mpg, distance,  gasType,  ppm,  gallons,  gasCost, ppmCost, totalCost
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate("UPDATE quote SET origin='" + map.getOrigin() +
                  "', destination='" + map.getDestination() +
                                        "', price='" +    map.getPrice() +
                                        "', mpg='" +      map.getMpg() + 
					"', distance='" + map.getDistance() +
					"', gasType='" +  map.getGasType() + 
					"', ppm='" +      map.getPpm() + 
					"', gallons='" +  map.getGallons() + 
					"', gasCost='" +  map.getGasCost() + 
					"', ppmCost='" +  map.getPpmCost() + 
					"', totalCost='" +map.getTotalCost() + "' "  +
                    "WHERE id='" + map.getId() + "'");
                    //"', id='" + map.getEmail() + 
                          
            if(rowCount>0){
                status = true;
                }
           } catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
            
            
        return status;    
            
       
        
        
    }
    

    public static boolean deleteQuote(MapBean map){
          Connection connection;
        connection = getConnection();
        Statement statement = null;
        boolean status = false;
        
        try{
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate("DELETE From quote " +
                    "WHERE id= '" + map.getId() + "'");

                          
            if(rowCount>0){
                status = true;
                }
           } catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(Exception e){
            
             }
        }
            
            
            
        return status;    
            
       
        
        
    }            
    
    
    
    
}


