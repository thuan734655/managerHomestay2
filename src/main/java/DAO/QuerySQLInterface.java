package DAO;

import java.util.ArrayList;

public interface QuerySQLInterface<T> {
    public ArrayList<T> selectALL();
    public ArrayList<T> selectByConditon(String Condition,String content);
    public int update (T t);
    public int delete(T t);
    public int add(T t);


}
