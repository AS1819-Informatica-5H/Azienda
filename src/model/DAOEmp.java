package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOEmp {
	List<Impiegato> getEmpList(Impiegato e) {
		List<Impiegato> li = new ArrayList<Impiegato>();
		String query="SELECT   a.EMPNO, a.ENAME, a.JOB,\r\n" + 
				"         b.ENAME AS MANAGER, a.HIREDATE, a.SAL,\r\n" + 
				"         a.COMM, d.DNAME\r\n" + 
				"FROM EMP a LEFT OUTER JOIN EMP b ON a.MGR=b.EMPNO\r\n" + 
				"           JOIN DEPT d ON a.DEPTNO=d.DEPTNO";
		
		
		Connection c;
		try {
			c = DBConnection.dbConnect("root", "root");
			PreparedStatement p;
			if ( e.getEmpno() !=0 ) {
				query +=" WHERE a.EMPNO=?";
				p=c.prepareStatement(query);
				p.setInt(1, e.getEmpno());
			} else if ( e.getEname() != null ) {
				query +=" WHERE a.ENAME LIKE ?";
				p=c.prepareStatement(query);
				p.setString(1, e.getEname());
			} else if ( e.getJob() != null) {
				query +=" WHERE a.JOB LIKE ?";
				p=c.prepareStatement(query);
				p.setString(1, e.getJob());
			} else {
				p=c.prepareStatement(query);
			}
			ResultSet rs=p.executeQuery();
			while (rs.next()) {
				Impiegato i=new Impiegato();
				i.setEmpno(rs.getInt("EMPNO"));
				i.setEname(rs.getString("ENAME"));
				i.setJob(rs.getString("JOB"));
				i.setManager(rs.getString("MANAGER"));
				if (rs.getDate("HIREDATE")!=null) {
		    	   i.setHiredate(rs.getDate("HIREDATE").toLocalDate());
				} else {
					i.setHiredate(null);
				}
				i.setSal(rs.getDouble("SAL"));
				i.setComm(rs.getDouble("COMM"));
				i.setDepartment(rs.getString("DNAME"));
				li.add(i);
			}	
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return li;
	}
	
}
