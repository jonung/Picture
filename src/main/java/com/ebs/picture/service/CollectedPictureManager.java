package com.ebs.picture.service;

import java.util.List;

import com.ebs.picture.entity.CollectedPictureEntity;

 
/**
 * @ClassName: CollectedPictureManager
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午1:35:11
 * @version V1.0  
 */

public interface CollectedPictureManager {
	//collect a picture
	public void addCollectedPicture(CollectedPictureEntity collectedPicture);
	//delete a collected picture by its id
	public void deleteCollectedPicture(int id);
	//get all collected pictures in a given albumID
	public List<CollectedPictureEntity> getAllCollectedPictures(int albumID);
}
