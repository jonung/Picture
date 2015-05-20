package com.ebs.picture.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ebs.picture.dao.CollectedAlbumDAO;
import com.ebs.picture.dao.CollectedPictureDAO;
import com.ebs.picture.entity.CollectedAlbumEntity;

 
/**
 * @ClassName: CollectedAlbumManagerImpl
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午1:37:21
 * @version V1.0  
 */

public class CollectedAlbumManagerImpl implements CollectedAlbumManager{

	private CollectedAlbumDAO collectedAlbumDao;
	
	/* (非 Javadoc)
	 * <p>Title: collectAlbum</p>
	 * <p>Description: </p>
	 * @param CollectedAlbum
	 * @see com.ebs.picture.service.CollectedAlbumManager#collectAlbum(com.ebs.picture.entity.CollectedAlbumEntity)
	 */
		
	@Override
	@Transactional
	public void collectAlbum(CollectedAlbumEntity CollectedAlbum) {
		// TODO Auto-generated method stub
		collectedAlbumDao.collectAlbum(CollectedAlbum);
	}

	
	/* (非 Javadoc)
	 * <p>Title: deleteCollectedAlbum</p>
	 * <p>Description: </p>
	 * @param ID
	 * @see com.ebs.picture.service.CollectedAlbumManager#deleteCollectedAlbum(int)
	 */
		
	@Override
	@Transactional
	public void deleteCollectedAlbum(int ID) {
		// TODO Auto-generated method stub
		
	}

	
	/* (非 Javadoc)
	 * <p>Title: getAllCollectedAlbums</p>
	 * <p>Description: </p>
	 * @param userID
	 * @return
	 * @see com.ebs.picture.service.CollectedAlbumManager#getAllCollectedAlbums(java.lang.String)
	 */
		
	@Override
	@Transactional
	public List<CollectedAlbumEntity> getAllCollectedAlbums(String userID) {
		// TODO Auto-generated method stub
		return collectedAlbumDao.getAllCollectedAlbums(userID);
	}


	//This setter will be used by Spring context to inject the sessionFactory instance
	public void setCollectedAlbumDao(CollectedAlbumDAO collectedAlbumDao) {
		this.collectedAlbumDao = collectedAlbumDao;
	}

	
	
}
