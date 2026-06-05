package com.example.demo.dto;


import org.springframework.validation.annotation.Validated;

@Validated
public class BeeworkDTO {
	@NotBlank(message="不能为空")
	@Pattern(regexp="^\\d{2}$", message="格式错误")
	private String authority;
	
	@Email(message="邮箱格式不正确")
	@Size(min=1,max=255)
	private String userMail;
	
	@NotBlank(message="姓名不能为空")
	@Size(min=1,max=20)
	private String userName;
	
	@Pattern(regexp="^\\d{11}$", message="手机号格式错误")
	private String userTel;
	
    public String getAuthority() { return authority; }
    public void setAuthority(String authority) { this.authority = authority; }
	
    public String getUserMail() { return userMail; }
    public void setUserMail(String userMail) { this.userMail = userMail; }
	
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getUserTel() { return userTel; }
    public void setUserTel(String userTel) { this.userTel = userTel; }
}
