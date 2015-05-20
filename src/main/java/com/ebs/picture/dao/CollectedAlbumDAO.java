package com.ebs.picture.dao;

import java.util.List;

import com.ebs.picture.entity.CollectedAlbumEntity;

 
/**
 * @ClassName: CollectedAlbumDAO
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:35:50
 * @version V1.0  
 */

public interface CollectedAlbumDAO {
	//collect a album
	public void collectAlbum(CollectedAlbumEntity CollectedAlbum);
	//delete a collected album by its id
	public void deleteCollectedAlbum(int ID);
	//get all collected albums by its owner
	public List<CollectedAlbumEntity> getAllCollectedAlbums(String userID);
}
