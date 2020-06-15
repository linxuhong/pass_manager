package com.shangguan.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Code implements java.io.Serializable {
    public Code() {}
    private Integer cid;

    private String cname;
    private String cno;
    private String addre;

    private String clandlord;

    private String ctel;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtype() {
        return addre;
    }

    public void setCtype(String ctype) {
        this.addre = ctype;
    }



    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }



    public String getCtel() {
        return ctel;
    }

    public void setCtel(String ctel) {
        this.ctel = ctel;
    }



    public String getClandlord() {
        return clandlord;
    }

    public void setClandlord(String clandlord) {
        this.clandlord = clandlord;
    }


}