package com.example.Final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService implements DatabaseInterface{

    Connection con;
    public DatabaseService(Connection con){
        this.con = con;
    }
    @Override
    public void add(LoanTable loanTable) throws ClassNotFoundException, SQLException {
        String quer1 = "INSERT INTO loantable VALUES(?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(quer1);
        query.setString(1, loanTable.getClientnumber());
        query.setString(2, loanTable.getClientname());
        query.setDouble(3, loanTable.getLoanamount());
        query.setInt(4, loanTable.getYears());
        query.setString(5, loanTable.getClientnumber());

        query.executeUpdate();


    }

    @Override
    public LoanTable edit(LoanTable loanTable, String clientnumber) throws ClassNotFoundException, SQLException {
        PreparedStatement query;
        query = con.prepareStatement("UPDATE loantable SET clientnumber=?,clientname=?,loanamount=?,years=?,loantype=? WHERE clientnumber=?");
        query.setString(1, loanTable.getClientnumber());
        query.setString(2, loanTable.getClientname());
        query.setDouble(3, loanTable.getLoanamount());
        query.setInt(4, loanTable.getYears());
        query.setString(5, loanTable.getClientnumber());
        query.setString(6,clientnumber);

        return loanTable;
    }

    @Override
    public void delete(String clientnumber) throws ClassNotFoundException, SQLException {
        String quer1 = "DELETE FROM loantable WHERE clientnumber=?";
        PreparedStatement query = con.prepareStatement(quer1);
        query.setString(1, clientnumber);
        query.executeUpdate();
    }

    @Override
    public List<LoanTable> display() throws ClassNotFoundException, SQLException {
        List<LoanTable> loanTableList = new ArrayList<LoanTable>();
        String quer1= "SELECT * FROM loantable";
        PreparedStatement query = con.prepareStatement(quer1);
        ResultSet rs = query.executeQuery();
        LoanTable obj1;
        while(rs.next()){
            obj1 = new LoanTable(rs.getString("clientnumber"),rs.getString("clientname"),rs.getDouble("loanamount"),rs.getInt("years"),rs.getString("clientnumber"));
            loanTableList.add(obj1);
        }

        return loanTableList;
    }
}
