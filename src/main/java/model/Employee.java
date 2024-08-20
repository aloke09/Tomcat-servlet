package model;

public class Employee {
    private int EMPNO;
    private String ENAME;
    private String JOB;
    private Float SAL;
    private int DEPTNO;

    public Employee(int EMPNO, String ENAME, String JOB, Float SAL, int DEPTNO) {
        this.EMPNO = EMPNO;
        this.ENAME = ENAME;
        this.JOB = JOB;
        this.SAL = SAL;
        this.DEPTNO = DEPTNO;
    }

    public Employee() {
    }

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public float getSAL() {
        return SAL;
    }

    public void setSAL(float SAL) {
        this.SAL = SAL;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EMPNO=" + EMPNO +
                ", ENAME='" + ENAME + '\'' +
                ", JOB='" + JOB + '\'' +
                ", SAL='" + SAL + '\'' +
                ", DEPTNO=" + DEPTNO +
                '}';
    }
}

