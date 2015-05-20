package com.ebs.picture.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.ebs.picture.entity.CollectedAlbumEntity;
import com.ebs.picture.service.CollectedAlbumManager;
import com.opensymphony.xwork2.ActionSupport;

 
/**
 * @ClassName: CollectedAlbumTestAction
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午2:54:16
 * @version V1.0  
 */

public class CollectedAlbumTestAction extends ActionSupport{
		
	private static final long serialVersionUID = 7601435898669298316L;
	private static Logger log = Logger.getLogger(CollectedAlbumTestAction.class);
	
	private CollectedAlbumManager collectedAlbumManager;

	public String add(){
		CollectedAlbumEntity ca = new CollectedAlbumEntity();
		ca.setUserID("gongjun");
		collectedAlbumManager.collectAlbum(ca);
		return SUCCESS;
	}
	
	public String list(){
		List<CollectedAlbumEntity> list = collectedAlbumManager.getAllCollectedAlbums("gongjun");
		for(int i = 0; i < list.size(); i ++)
			log.info(list.get(i).getUserID());
		return SUCCESS;
	}
	
	public void setCollectedAlbumManager(CollectedAlbumManager collectedAlbumManager) {
		this.collectedAlbumManager = collectedAlbumManager;
	}
	
	
}
