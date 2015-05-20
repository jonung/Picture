package com.ebs.picture.service;

import java.util.List;

import com.ebs.picture.entity.AlbumEntity;

 
/**
 * @ClassName: AlbumManager
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午1:34:34
 * @version V1.0  
 */

public interface AlbumManager {
	//add a album
	public void addAlbum(AlbumEntity album);
	//delete a album by sits ID
	public void deleteAlbum(int albumID);
	//list all albums by its userID
	public List<AlbumEntity> listAlbums(String userID);
}
