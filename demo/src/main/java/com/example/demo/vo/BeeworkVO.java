package com.example.demo.vo;

public class BeeworkVO {
    private String authority;
    private Integer companyID;
    private String photoAddress;
    private String sex;
    private String updateTime;
	private Integer userID;
	private String userMail;
    private String userName;
    private String userStatus;
    private String userTel;
    
    public Integer getUserID() { return userID; }
    public void setUserID(Integer userID) { this.userID = userID; }
    
    public Integer getCompanyID() { return companyID; }
    public void setCompanyID(Integer companyID) { this.companyID = companyID; }
    
    public String getAuthority() { return authority; }
    public void setAuthority(String authority) { this.authority = authority; }
    
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }
    
    public String getUserTel() { return userTel; }
    public void setUserTel(String userTel) { this.userTel = userTel; }
    
    public String getUserMail() { return userMail; }
    public void setUserMail(String userMail) { this.userMail = userMail; }
    
    public String getPhotoAddress() { return photoAddress; }
    public void setPhotoAddress(String photoAddress) { this.photoAddress = photoAddress; }
    
    public String getUserStatus() { return userStatus; }
    public void setUserStatus(String userStatus) { this.userStatus = userStatus; }
    
    public String getUpdateTime() { return updateTime; }
    public void setUpdateTime(String updateTime) { this.updateTime = updateTime; }
}
