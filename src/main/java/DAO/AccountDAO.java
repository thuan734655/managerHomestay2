package DAO;

import Connect_database.Connect;
import Model.AccountManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AccountDAO implements QuerySQLInterface<AccountManager>{
    Connect connect = new Connect();
    @Override
    public ArrayList<AccountManager> selectALL() {
        return null;
    }

    @Override
    public ArrayList<AccountManager> selectByConditon(String Condition, String content) {
        return null;
    }

    @Override
    public int delete(AccountManager accoutManager) {
        return 0;
    }

    @Override
    public int add(AccountManager accoutManager) {
        return 0;
    }

    @Override
    public int update(AccountManager accoutManager) {
        Connection connection = connect.getConnection();

        int checkPerform = 0;

        try{
            String querySql = "UPDATE account SET email = ?  WHERE username = ?";
            PreparedStatement st = connection.prepareStatement(querySql);
            st.setString(1,accoutManager.getEmail());
            st.setString(2,accoutManager.getUser());

            checkPerform = st.executeUpdate();

            connect.closeConnection(connection);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerform;
    }


    public int updatePass(AccountManager accoutManager) {
        Connection connection = connect.getConnection();

        int checkPerform = 0;

        try{
            String querySql = "UPDATE account SET password = ?  WHERE user = ?";
            PreparedStatement st = connection.prepareStatement(querySql);
            st.setString(1,accoutManager.getPassword());
            st.setString(2,accoutManager.getUser());

            checkPerform = st.executeUpdate();

            connect.closeConnection(connection);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerform;
    }


    public AccountManager selectAccount() {

        Connection connection = connect.getConnection();
        AccountManager accoutManager = new AccountManager("","","");

        try{
            String querySql = "SELECT * FROM account";
            PreparedStatement st = connection.prepareStatement(querySql);

             ResultSet rs = st.executeQuery();

             rs.next();
             String user = rs.getString(1);
             String pass =rs.getString(2);
             String email = rs.getString(3);

             accoutManager.setUser(user);
             accoutManager.setPassword(pass);
             accoutManager.setEmail(email);


            connect.closeConnection(connection);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return accoutManager;

    }


}
