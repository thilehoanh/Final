package com.example.Final;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface {
    public void add(LoanTable loanTable) throws ClassNotFoundException, SQLException;
    public LoanTable edit(LoanTable loanTable, String clientnumber) throws ClassNotFoundException, SQLException;
    public void delete(String clientnumber) throws ClassNotFoundException, SQLException;
    public List<LoanTable> display() throws ClassNotFoundException, SQLException;;

}
