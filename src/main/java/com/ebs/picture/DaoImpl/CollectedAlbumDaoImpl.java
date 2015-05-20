package com.ebs.picture.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ebs.picture.dao.CollectedAlbumDAO;
import com.ebs.picture.entity.CollectedAlbumEntity;

 
/**
 * @ClassName: CollectedAlbumDaoImpl
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:38:56
 * @version V1.0  
 */
@Repository
public class CollectedAlbumDaoImpl implements CollectedAlbumDAO{

	//Session factory injected by spring context
    private SessionFactory sessionFactory;
	
	/* (非 Javadoc)
	 * <p>Title: collectAlbum</p>
	 * <p>Description: </p>
	 * @param CollectedAlbum
	 * @see com.ebs.picture.dao.CollectedAlbumDAO#collectAlbum(com.ebs.picture.entity.CollectedAlbumEntity)
	 */
		
	@Override
	public void collectAlbum(CollectedAlbumEntity CollectedAlbum) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(CollectedAlbum);
	}

	
	/* (非 Javadoc)
	 * <p>Title: deleteCollectedAlbum</p>
	 * <p>Description: </p>
	 * @param ID
	 * @see com.ebs.picture.dao.CollectedAlbumDAO#deleteCollectedAlbum(int)
	 */
		
	@Override
	public void deleteCollectedAlbum(int ID) {
		// TODO Auto-generated method stub
		
	}

	
	/* (非 Javadoc)
	 * <p>Title: getAllCollectedAlbums</p>
	 * <p>Description: </p>
	 * @param userID
	 * @return
	 * @see com.ebs.picture.dao.CollectedAlbumDAO#getAllCollectedAlbums(java.lang.String)
	 */
		
	@SuppressWarnings("unchecked")
	@Override
	public List<CollectedAlbumEntity> getAllCollectedAlbums(String userID) {
		// TODO Auto-generated method stub
		String hql = "FROM CollectedAlbumEntity E WHERE E.userID = :user_id";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("user_id",userID);
		
		return query.list();
		
	}
	
	//This setter will be used by Spring context to inject the sessionFactory instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
