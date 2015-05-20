package com.ebs.picture.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.ebs.picture.entity.AlbumEntity;
import com.ebs.picture.service.AlbumManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

 
/**
 * @ClassName: AlbumTestAction
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午1:53:36
 * @version V1.0  
 */

public class AlbumTestAction extends ActionSupport {
		
	private static final long serialVersionUID = -1993987893459783425L;
	private static Logger log = Logger.getLogger(AlbumTestAction.class);
	private AlbumManager albumManger;

	public String addAlbum(){
		AlbumEntity album = new AlbumEntity();
		album.setUserID("gongjun");
		album.setClassID("a");
		album.setCover("dd");
		album.setIsDeleted((byte) 0);
		
		
		albumManger.addAlbum(album);
		return SUCCESS;
	}
	
	public String getAllAlbums(){
		List<AlbumEntity> list = albumManger.listAlbums("gongjun");
		for(int i = 0; i < list.size(); i ++){
			log.info(list.get(i).getUserID());
		}
		return SUCCESS;
	}
	
	public void setAlbumManger(AlbumManager albumManger) {
		this.albumManger = albumManger;
	}

	
	
	
}
