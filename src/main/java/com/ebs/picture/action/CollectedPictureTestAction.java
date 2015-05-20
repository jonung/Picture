package com.ebs.picture.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.ebs.picture.entity.CollectedPictureEntity;
import com.ebs.picture.service.CollectedPictureManager;
import com.opensymphony.xwork2.ActionSupport;

 
/**
 * @ClassName: CollectedPictureTestAction
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午2:54:32
 * @version V1.0  
 */

public class CollectedPictureTestAction extends ActionSupport{
	
	private static final long serialVersionUID = 1221821646256256766L;
	private static Logger log = Logger.getLogger(CollectedPictureTestAction.class);
	
	private CollectedPictureManager collectedPictureManager;

	public String add(){
		CollectedPictureEntity cp = new CollectedPictureEntity();
		cp.setAlbumID(1111);
		collectedPictureManager.addCollectedPicture(cp);
		return SUCCESS;
	}
	
	public String list(){
		List<CollectedPictureEntity> list = collectedPictureManager.getAllCollectedPictures(1111);
		log.info("list size: " + list.size());
		for(int i = 0; i < list.size(); i ++)
			log.info(list.get(i).getAlbumID());
		
		return SUCCESS;
	}
	
	public void setCollectedPictureManager(
			CollectedPictureManager collectedPictureManager) {
		this.collectedPictureManager = collectedPictureManager;
	}
	
	
}
