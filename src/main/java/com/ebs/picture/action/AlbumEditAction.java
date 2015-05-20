package com.ebs.picture.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.ebs.picture.entity.AlbumEntity;
import com.ebs.picture.service.AlbumManager;
import com.ebs.picture.service.CollectedAlbumManager;
import com.ebs.picture.service.CollectedPictureManager;
import com.opensymphony.xwork2.ActionSupport;

 
/**
 * @ClassName: AlbumEditAction
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午3:25:08
 * @version V1.0  
 */

public class AlbumEditAction extends ActionSupport{
		
	private static final long serialVersionUID = 4012409378303261134L;
	private static Logger log = Logger.getLogger(AlbumEditAction.class);
	
	//userid
	private String userid="gongjun";
	//albumList
	private List<AlbumEntity> albumList=new ArrayList<AlbumEntity>();
	//albumPrivate
	private int albumPrivate;	
	
	AlbumManager albumManager;
	CollectedPictureManager collectedPictureManager;
	
	
	public String listAlbums(){
		//userid = getUserName();
		List<AlbumEntity> albums = albumManager.listAlbums(userid);
		for(int i = 0; i < albums.size(); i ++){
			
		}
		
		return SUCCESS;
	}
	
	/*
	private String getUserName() {
		// TODO Auto-generated method stub
		String username="";
		HttpServletRequest request=ServletActionContext.getRequest();
		Object object = request.getSession().getAttribute("_const_cas_assertion_");
		if(object != null) {

		    Assertion assertion = (Assertion)object;
		    username = assertion.getPrincipal().getName();
		}
		return username;
	}
	*/
	///////////
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public List<AlbumEntity> getAlbumList() {
		return albumList;
	}
	public void setAlbumList(List<AlbumEntity> albumList) {
		this.albumList = albumList;
	}
	public int getAlbumPrivate() {
		return albumPrivate;
	}
	public void setAlbumPrivate(int albumPrivate) {
		this.albumPrivate = albumPrivate;
	}
	
	//注入
	public void setAlbumManager(AlbumManager albumManager) {
		this.albumManager = albumManager;
	}
	//注入
	public void setCollectedPictureManager(
			CollectedPictureManager collectedPictureManager) {
		this.collectedPictureManager = collectedPictureManager;
	}
	
	
}
