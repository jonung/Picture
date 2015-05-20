package com.ebs.picture.dao;

import java.util.List;

import com.ebs.picture.entity.AlbumEntity;

 
/**
 * @ClassName: AlbumDAO
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:35:37
 * @version V1.0  
 */

public interface AlbumDAO {
	//add a album
	public void addAlbum(AlbumEntity album);
	//delete a album by sits ID
	public void deleteAlbum(int albumID);
	//list all albums by its userID
	public List<AlbumEntity> getAllAlbums(String userID);
}
