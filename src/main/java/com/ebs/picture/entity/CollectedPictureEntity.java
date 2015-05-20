package com.ebs.picture.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

 
/**
 * @ClassName: CollectedPictureEntity
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:27:56
 * @version V1.0  
 */
@Entity
@Table(name="pictureStore")
public class CollectedPictureEntity {
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="userID")
	private String userID;
	
	@Column(name="pictureID")
	private String pictureID;
	
	@Column(name="tags")
	private String tags;
	
	@Column(name="storeTime")
	private Date storeTime;
	
	@Column(name="isDeleted")
	private byte isDeleted;
	
	@Column(name="albumID")
	private int albumID;

	//////////////////////////////////////////////////////////////////////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPictureID() {
		return pictureID;
	}

	public void setPictureID(String pictureID) {
		this.pictureID = pictureID;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Date getStoreTime() {
		return storeTime;
	}

	public void setStoreTime(Date storeTime) {
		this.storeTime = storeTime;
	}

	public byte getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getAlbumID() {
		return albumID;
	}

	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}
	
	
}
