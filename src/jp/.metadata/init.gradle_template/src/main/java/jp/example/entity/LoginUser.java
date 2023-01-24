package jp.example.entity;

import lombok.Data;

/** 
 * ログインユーザーエンティティです。
 * @author New Gradle Project Wizard (c) Pleiades MIT
 */
@Data
public class LoginUser {
	
	public long id;
	public String username;
	public String password;
}
