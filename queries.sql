-- Query per selezionare la lista impiegati

SELECT   a.EMPNO, a.ENAME, a.JOB,
         b.ENAME, a.HIREDATE, a.SAL,
         a.COMM, d.DNAME
FROM EMP a LEFT OUTER JOIN EMP b ON a.MGR=b.EMPNO
           JOIN DEPT d ON a.DEPTNO=d.DEPTNO