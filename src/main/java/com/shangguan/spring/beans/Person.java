package com.shangguan.spring.beans;

public class Person implements java.io.Serializable {

    public Person(){
    }

    private Integer pid;
    //人员姓名
    private String pname;
    // 身份证
    private String pno;

    private String paddress;   // 原籍地址
    private String ptel;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel;
    }

}
