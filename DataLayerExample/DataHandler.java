package view;
import java.sql.Connection;
//the OracleDataSource is not found. I have
//to add the .jar files via the project properties
//then the classpath and libraries.
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {
    public DataHandler() {
        super();
    }
    
    /*
     * These variables will be used in the application 
     * to contain values supplied by the user at login
     * to authenticate the user and to create a connection
     * to the database. The jdbcUrl variable is used to
     * hold the URL of the database that you will connect
     * to. The userid and password variables are used to 
     * authenticate the user and identify the schema to 
     * be used for the session.
     */
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1522:orcl";
    String userid = "hr";
    String password = "hr";
    
    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    
    public void closeAll(){
        if(rset != null){
            try{
                rset.close();
            }
            catch(Exception ex){
                rset = null;
            }
        }
        if(stmt != null){
            try{
                stmt.close();
            }
            catch(Exception ex){
                stmt = null;
            }
        }
        if(conn != null){
            try{
                conn.close();
            }
            catch(Exception ex){
                conn = null;
            }
        }
    }
    
    public void logException(SQLException ex){
        while(ex != null){
            ex.printStackTrace();
            ex.getNextException();
        }
    }
    public String deleteEmployeeById(int id) throws SQLException{
        try{
        getDBConnection();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                                    ResultSet.CONCUR_READ_ONLY);
        sqlString = "DELETE FROM Employees WHERE employee_id = " + id;
        System.out.println("\nExecuting: " + sqlString);
        
        stmt.execute(sqlString);
        }
        catch (SQLException e){
            e.printStackTrace();
            return "failure";
        }
        finally{
            //closeAll();
        }
        return "success";
    }
    
    public String addEmployee(String first_name, 
      String last_name, String email, 
      String phone_number, String job_id, int salary) throws SQLException {
        
        try{
        getDBConnection();
        
        stmt =
          conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                               ResultSet.CONCUR_READ_ONLY);
        sqlString =
          "INSERT INTO Employees VALUES (EMPLOYEES_SEQ.nextval, '" + 
          first_name + "','" + 
          last_name + "','" + 
          email + "','" + 
          phone_number + "'," +
          "SYSDATE, '" + 
          job_id + "', " + 
          salary + ",.30,100,80)";
        
        System.out.println("\nInserting: " + sqlString);
          stmt.execute(sqlString);
        }
        catch(Exception ex){
            ex.printStackTrace();
            return "failure";
        }
        finally{
            //closeAll();
        }
          return "success";
        
     
    }
    public String updateEmployee(int employee_id, String first_name,
                                 String last_name, String email,
                                 String phone_number, String salary,
                                 String job_id) throws SQLException {
        try{
            System.out.println("In the updateEmployee() function.....");
            Employee oldEmployee = findEmployeeById(employee_id);
            getDBConnection();
            stmt =
              conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                                   ResultSet.CONCUR_READ_ONLY);
            StringBuffer columns = new StringBuffer( 255 );
            if ( first_name != null && 
                 !first_name.equals(oldEmployee.getFirstName() ) ){
                columns.append( "first_name = '" + first_name + "'" );
            }
            if ( last_name != null && 
                  !last_name.equals(oldEmployee.getLastName() ) ) {
                if ( columns.length() > 0 ) {
                  columns.append( ", " );
                }
                columns.append( "last_name = '" + last_name + "'" );
            }
            //email
            if ( email != null && 
                  !email.equals(oldEmployee.getEmail() ) ) {
                if ( columns.length() > 0 ) {
                  columns.append( ", " );
                }
                columns.append( "email = '" + email + "'" );
            }
            //phone_number
            if ( phone_number != null && 
                  !phone_number.equals(oldEmployee.getPhoneNumber() ) ) {
                if ( columns.length() > 0 ) {
                  columns.append( ", " );
                }
                columns.append( "phone_number = '" + phone_number + "'" );
            }
            if ( salary != null && 
                  !salary.equals( oldEmployee.getSalary().toString() ) ) {
                if ( columns.length() > 0 ) {
                  columns.append( ", " );
                }
                columns.append( "salary = '" + salary + "'" );
            } //The tutorial forgot to add the last curly brace in this code segment
            
            // The job_id was also skipped in the tutorial... adding logic now
            if ( job_id != null && 
                  !job_id.equals( oldEmployee.getJobId() ) ) {
                if ( columns.length() > 0 ) {
                  columns.append( ", " );
                }
                columns.append( "job_id = '" + job_id + "'" );
            }
            if ( columns.length() > 0 )
            {
            sqlString = "update Employees SET " + columns.toString() + 
                    " WHERE employee_id = " + employee_id;
            System.out.println("\nExecuting: " + sqlString);
            stmt.execute(sqlString);
            }
            else
            {
            System.out.println( "Nothing to do to update Employee Id: " + 
                                employee_id);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            return "failure";
        }
        finally{
            //closeAll();
        }
        return "success";
    }
    
    public Employee findEmployeeById(int id) throws SQLException {
        Employee selectedEmp = new Employee();
        try{
            getDBConnection();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                           ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM Employees WHERE employee_id = " + id;
            System.out.println("\nExecuting: " + query);
            rset = stmt.executeQuery(query);
            
            while (rset.next()) {
              selectedEmp.setEmployeeId(new Integer(rset.getInt("employee_id")));
              selectedEmp.setFirstName(rset.getString("first_name"));
              selectedEmp.setLastName(rset.getString("last_name"));
              selectedEmp.setEmail(rset.getString("email"));
              selectedEmp.setPhoneNumber(rset.getString("phone_number"));
              selectedEmp.setHireDate(rset.getDate("hire_date"));
              selectedEmp.setSalary(new Double(rset.getDouble("salary")));
              selectedEmp.setJobId(rset.getString("job_id"));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            //closeAll();
        }
        return selectedEmp;
    }
    
    public boolean authenticateUser(String jdbcUrl,
                                    String userid,
                                    String password,
                                    HttpSession session) throws SQLException{
        this.jdbcUrl = jdbcUrl;
        this.userid = userid;
        this.password = password;
    
        try{
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
           
        }
        catch(SQLException ex){
            System.out.println("Invalid user credentials");
            session.setAttribute("loginerrormsg", "Invalid Login. Try Again...");
            this.jdbcUrl = null;
            this.userid = null;
            this.password = null;
            return false;
        }
        finally{
            closeAll();
        }
        return true;
      
    }
    
    public ResultSet getEmployeesByName(String name) throws SQLException{
        name = name.toUpperCase();
        getDBConnection();
        
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query = "SELECT * FROM Employees WHERE UPPER(first_name) LIKE \'%" + name + "%\'" +
            " OR UPPER(last_name) LIKE \'%" + name + "%\' ORDER BY employee_id";
        //print a trace message
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
        return rset;
    }
    
    public ResultSet getAllEmployees() throws SQLException{
        try{
        getDBConnection();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query = "SELECT * FROM Employees ORDER BY employee_id";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
        }
        catch (SQLException e){
            e.printStackTrace();   
        }
        return rset;
    }
    
    public void getDBConnection() throws SQLException{
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        
        conn = ds.getConnection(userid, password);
        
    }
}
