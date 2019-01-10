package model;

import java.sql.SQLException;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		DAOEmp daoe=new DAOEmp();
		
		Impiegato e=new Impiegato();
		
		// e.setEname("%L%");
		e.setEmpno(7499);
		List<Impiegato> l=daoe.getEmpList(e);
		
		for (Impiegato i: l) {
			System.out.println(i);
		}
		try {
			DBConnection.dbClose();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
