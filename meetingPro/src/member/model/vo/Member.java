package member.model.vo;

import java.sql.Date;

//  회원 정보 테이블
public class Member {

    //  회원번호
    private Integer unum;

    //  회원아이디
    private String uid;

    //  회원비밀번호
    private String upwd;

    //  회원이름
    private String uname;

    //  회원성별
    private String ugender;

    //  회원전화번호
    private String uphone;

    //  회원이메일
    private String uemail;

    //  회원생일
    private Date ubirth;

    //  회원주소
    private String uaddress;

    //  회원가입일자
    private Date ujoindate;

    //  회원등급
    private Integer ulevel;

    public Integer getUnum() {
        return unum;
    }

    public void setUnum(Integer unum) {
        this.unum = unum;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Date getUbirth() {
        return ubirth;
    }

    public void setUbirth(Date ubirth) {
        this.ubirth = ubirth;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Date getUjoindate() {
        return ujoindate;
    }

    public void setUjoindate(Date ujoindate) {
        this.ujoindate = ujoindate;
    }

    public Integer getUlevel() {
        return ulevel;
    }

    public void setUlevel(Integer ulevel) {
        this.ulevel = ulevel;
    }
}