package com.example.Final;

import java.util.ArrayList;
import java.util.List;

public class LoanTableService {
    private static List<LoanTable> todos = new ArrayList<>();
    private static int todoCount = 5;

    static{
        todos.add(new LoanTable("12","David",350,8,"Business"));
        todos.add(new LoanTable("123","James",2000,12,"Business"));
    }

    public List<LoanTable> retrieveTodos(){
        List<LoanTable> filteredTodos = new ArrayList<LoanTable>();
        for (LoanTable todo: todos){
            filteredTodos.add(todo);
        }
        return filteredTodos;
    }

    public void addTodo(String clientnumber, String clientname, double loanamount, int years, String loantype){
        todos.add(new LoanTable(clientnumber,clientname,loanamount,years,loantype));
    }

}
