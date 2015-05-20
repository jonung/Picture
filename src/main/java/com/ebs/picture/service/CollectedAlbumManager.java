package com.ebs.picture.service;

import java.util.List;

import com.ebs.picture.entity.CollectedAlbumEntity;

 
/**
 * @ClassName: CollectedAlbumManager
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午1:34:51
 * @version V1.0  
 */

public interface CollectedAlbumManager {
	//collect a album
	public void collectAlbum(CollectedAlbumEntity CollectedAlbum);
	//delete a collected album by its id
	public void deleteCollectedAlbum(int ID);
	//get all collected albums by its owner
	public List<CollectedAlbumEntity> getAllCollectedAlbums(String userID);
}
