package com.shangguan.spring.beans;

import java.util.Date;

public class Pass implements java.io.Serializable {

    /**
     * 无参数构造器
     */
    public Pass(){
    }

    private Integer id;
    private String cno;
    private String pno;     // 身份证

    private Date createtime;   // 原籍地址
    private String type = "2";



    private String remark  ;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
