package jp.example.entity;

import java.time.LocalDate;

import lombok.Data;

/** 
 * アイテムエンティティです。
 * @author New Gradle Project Wizard (c) Pleiades MIT
 */
@Data
public class Item {
	
	public long id;
	public String name;
	public String releaseDate;
	public boolean faceAuth;
	public long companyId;
	public LocalDate createdDate;
}
