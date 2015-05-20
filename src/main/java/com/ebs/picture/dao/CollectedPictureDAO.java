package com.ebs.picture.dao;

import java.util.List;

import com.ebs.picture.entity.CollectedPictureEntity;

 
/**
 * @ClassName: CollectedPictureDAO
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:36:12
 * @version V1.0  
 */

public interface CollectedPictureDAO {
	//collect a picture
	public void addCollectedPicture(CollectedPictureEntity collectedPicture);
	//delete a collected picture by its id
	public void deleteCollectedPicture(int id);
	//get all collected pictures in a given albumID
	public List<CollectedPictureEntity> getAllCollectedPictures(int albumID);
	//get all collected pictures by albumId and userID
	//public List<CollectedPictureEntity> getCollectedPicturesByUserIDAndAlbumID(int albumID,String userID);
}
