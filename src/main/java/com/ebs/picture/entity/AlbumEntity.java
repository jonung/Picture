package com.ebs.picture.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

 
/**
 * @ClassName: AlbumEntity
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:07:22
 * @version V1.0  
 */
@Entity
@Table(name="album")
public class AlbumEntity {
	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cover")
	private String cover;
	
	@Column(name="tags")
	private String tags;
	
	@Column(name="userID")
	private String userID;
	
	@Column(name="createTime")
	private Date createTime;
	
	@Column(name="isDeleted")
	private byte isDeleted;
	
	@Column(name="sharedCount")
	private int sharedCount;
	
	@Column(name="classID")
	private String classID;
	
	@Column(name="private")
	private int isPrivate;
	
	/////////////////////////////////////////////////////////////////////
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public byte getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}
	public int getSharedCount() {
		return sharedCount;
	}
	public void setSharedCount(int sharedCount) {
		this.sharedCount = sharedCount;
	}
	public String getClassID() {
		return classID;
	}
	public void setClassID(String classID) {
		this.classID = classID;
	}
	public int getIsPrivate() {
		return isPrivate;
	}
	public void setIsPrivate(int isPrivate) {
		this.isPrivate = isPrivate;
	}
	
	
}
