package model;

import java.util.ArrayList;
import java.util.List;

public class DAOEmp {
	List<Impiegato> getEmpList(Impiegato e) {
		List<Impiegato> li = new ArrayList<Impiegato>();
		String query="SELECT   a.EMPNO, a.ENAME, a.JOB,\r\n" + 
				"         b.ENAME, a.HIREDATE, a.SAL,\r\n" + 
				"         a.COMM, d.DNAME\r\n" + 
				"FROM EMP a LEFT OUTER JOIN EMP b ON a.MGR=b.EMPNO\r\n" + 
				"           JOIN DEPT d ON a.DEPTNO=d.DEPTNO";
		
		
		return li;
	}
	
}
