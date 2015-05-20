package com.ebs.picture.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ebs.picture.dao.AlbumDAO;
import com.ebs.picture.entity.AlbumEntity;

 
/**
 * @ClassName: AlbumManagerImpl
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午1:37:01
 * @version V1.0  
 */

public class AlbumManagerImpl implements AlbumManager{

	private AlbumDAO albumDao;
	
	/* (非 Javadoc)
	 * <p>Title: addAlbum</p>
	 * <p>Description: </p>
	 * @param album
	 * @see com.ebs.picture.service.AlbumManager#addAlbum(com.ebs.picture.entity.AlbumEntity)
	 */
		
	@Override
	@Transactional
	public void addAlbum(AlbumEntity album) {
		// TODO Auto-generated method stub
		albumDao.addAlbum(album);
	}

	
	/* (非 Javadoc)
	 * <p>Title: deleteAlbum</p>
	 * <p>Description: </p>
	 * @param albumID
	 * @see com.ebs.picture.service.AlbumManager#deleteAlbum(int)
	 */
		
	@Override
	@Transactional
	public void deleteAlbum(int albumID) {
		// TODO Auto-generated method stub
		
	}

	
	/* (非 Javadoc)
	 * <p>Title: listAlbums</p>
	 * <p>Description: </p>
	 * @param userID
	 * @return
	 * @see com.ebs.picture.service.AlbumManager#listAlbums(java.lang.String)
	 */
		
	@Override
	@Transactional
	public List<AlbumEntity> listAlbums(String userID) {
		// TODO Auto-generated method stub
		return albumDao.getAllAlbums(userID);
	}

	//This setter will be used by Spring context to inject the dao's instance
	public void setAlbumDao(AlbumDAO albumDao) {
		this.albumDao = albumDao;
	}

	
}
