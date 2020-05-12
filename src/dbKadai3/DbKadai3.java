package dbKadai3;

import java.util.List;

public class DbKadai3 {

	public static void main(String[] args) {
	    String sql = "SELECT * FROM public.employee_master ";
        List<EmployeeInfoBean> list = Dao.selectWorkInfo(sql);

        for(EmployeeInfoBean bean : list) {
            System.out.println(bean.toString());
        }

	}
}
