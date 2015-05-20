package com.ebs.picture.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ebs.picture.dao.CollectedPictureDAO;
import com.ebs.picture.entity.CollectedPictureEntity;

 
/**
 * @ClassName: CollectedPictureManagerImpl
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午1:37:38
 * @version V1.0  
 */

public class CollectedPictureManagerImpl implements CollectedPictureManager{

	private CollectedPictureDAO collectedPictureDao;
	/* (非 Javadoc)
	 * <p>Title: addCollectedPicture</p>
	 * <p>Description: </p>
	 * @param collectedPicture
	 * @see com.ebs.picture.service.CollectedPictureManager#addCollectedPicture(com.ebs.picture.entity.CollectedPictureEntity)
	 */
		
	@Override
	@Transactional
	public void addCollectedPicture(CollectedPictureEntity collectedPicture) {
		// TODO Auto-generated method stub
		collectedPictureDao.addCollectedPicture(collectedPicture);
	}

	
	/* (非 Javadoc)
	 * <p>Title: deleteCollectedPicture</p>
	 * <p>Description: </p>
	 * @param id
	 * @see com.ebs.picture.service.CollectedPictureManager#deleteCollectedPicture(int)
	 */
		
	@Override
	@Transactional
	public void deleteCollectedPicture(int id) {
		// TODO Auto-generated method stub
		
	}

	
	/* (非 Javadoc)
	 * <p>Title: getAllCollectedPictures</p>
	 * <p>Description: </p>
	 * @param albumID
	 * @return
	 * @see com.ebs.picture.service.CollectedPictureManager#getAllCollectedPictures(int)
	 */
		
	@Override
	@Transactional
	public List<CollectedPictureEntity> getAllCollectedPictures(int albumID) {
		// TODO Auto-generated method stub
		return collectedPictureDao.getAllCollectedPictures(albumID);
	}

	//This setter will be used by Spring context to inject the sessionFactory instance
	public void setCollectedPictureDao(CollectedPictureDAO collectedPictureDao) {
		this.collectedPictureDao = collectedPictureDao;
	}

	
}
