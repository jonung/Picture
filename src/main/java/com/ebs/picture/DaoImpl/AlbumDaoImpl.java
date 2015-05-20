package com.ebs.picture.DaoImpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ebs.picture.dao.AlbumDAO;
import com.ebs.picture.entity.AlbumEntity;

 
/**
 * @ClassName: AlbumDaoImpl
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:38:38
 * @version V1.0  
 */
@Repository
public class AlbumDaoImpl implements AlbumDAO{

	//Session factory injected by spring context
    private SessionFactory sessionFactory;
	
	
	/* (非 Javadoc)
	 * <p>Title: addAlbum</p>
	 * <p>Description: </p>
	 * @param album
	 * @see com.ebs.picture.dao.AlbumDAO#addAlbum(com.ebs.picture.entity.AlbumEntity)
	 */
		
	@Override
	public void addAlbum(AlbumEntity album) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(album);
	}

	
	/* (非 Javadoc)
	 * <p>Title: deleteAlbum</p>
	 * <p>Description: </p>
	 * @param albumID
	 * @see com.ebs.picture.dao.AlbumDAO#deleteAlbum(int)
	 */
		
	@Override
	public void deleteAlbum(int albumID) {
		// TODO Auto-generated method stub
		
	}

	
	/* (非 Javadoc)
	 * <p>Title: listAlbums</p>
	 * <p>Description: </p>
	 * @param userID
	 * @return
	 * @see com.ebs.picture.dao.AlbumDAO#listAlbums(java.lang.String)
	 */
		
	@SuppressWarnings("unchecked")
	@Override
	public List<AlbumEntity> getAllAlbums(String userID) {
		// TODO Auto-generated method stub
		String hql = "FROM AlbumEntity E WHERE E.userID = :user_id";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("user_id",userID);
		
		return query.list();
	}

	
	//This setter will be used by Spring context to inject the sessionFactory instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
