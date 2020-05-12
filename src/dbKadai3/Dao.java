package dbKadai3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    public static List<EmployeeInfoBean> selectWorkInfo(String sql) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        EmployeeInfoBean bean;
        List<EmployeeInfoBean> beanList = new ArrayList<>();

        //接続文字列
        String url = "jdbc:postgresql://127.0.0.1:5432/Kensyu2020";
        String user = "postgres";
        String password = "postgres";

        try{
            // DBがうまく接続できないときはこの１行を追加する
            // Class.forName("org.postgresql.Driver");
            //PostgreSQLへ接続
            conn = DriverManager.getConnection(url, user, password);

            //自動コミットOFF
            conn.setAutoCommit(false);

            //SELECT文の実行
            stmt = conn.createStatement();
            rset = stmt.executeQuery(sql);

            //SELECT結果の受け取り
            while (rset.next()) {
                bean = new EmployeeInfoBean();
                bean.setId(rset.getInt(1));
                bean.setName(rset.getString(2));
                bean.setBranch(rset.getString(3));
                bean.setDepartment(rset.getString(4));
                bean.setPosition(rset.getString(5));
                bean.setJoinDate(rset.getDate(6));
                bean.setAge(rset.getInt(7));

                beanList.add(bean);
            }

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if(rset != null)rset.close();
                if(stmt != null)stmt.close();
                if(conn != null)conn.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
		return beanList;
    }

}