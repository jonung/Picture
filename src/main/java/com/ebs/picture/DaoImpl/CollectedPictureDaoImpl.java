package com.ebs.picture.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ebs.picture.dao.CollectedPictureDAO;
import com.ebs.picture.entity.CollectedPictureEntity;

 
/**
 * @ClassName: CollectedPictureDaoImpl
 * @Description: 
 * @author GongJun
 * @date 2015-5-20 下午12:39:12
 * @version V1.0  
 */
@Repository
public class CollectedPictureDaoImpl implements CollectedPictureDAO{

	//Session factory injected by spring context
    private SessionFactory sessionFactory;
	
	/* (非 Javadoc)
	 * <p>Title: addCollectedPicture</p>
	 * <p>Description: </p>
	 * @param collectedPicture
	 * @see com.ebs.picture.dao.CollectedPictureDAO#addCollectedPicture(com.ebs.picture.entity.CollectedPictureEntity)
	 */
		
	@Override
	public void addCollectedPicture(CollectedPictureEntity collectedPicture) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(collectedPicture);
	}

	
	/* (非 Javadoc)
	 * <p>Title: deleteCollectedPicture</p>
	 * <p>Description: </p>
	 * @param id
	 * @see com.ebs.picture.dao.CollectedPictureDAO#deleteCollectedPicture(int)
	 */
		
	@Override
	public void deleteCollectedPicture(int id) {
		// TODO Auto-generated method stub
		
	}

	
	/* (非 Javadoc)
	 * <p>Title: getAllCollectedPictures</p>
	 * <p>Description: </p>
	 * @param albumID
	 * @return
	 * @see com.ebs.picture.dao.CollectedPictureDAO#getAllCollectedPictures(int)
	 */
		
	@SuppressWarnings("unchecked")
	@Override
	public List<CollectedPictureEntity> getAllCollectedPictures(int albumID) {
		// TODO Auto-generated method stub
		String hql = "FROM CollectedPictureEntity E WHERE E.albumID = :album_id";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("album_id",albumID);
		
		return query.list();
	}

	//This setter will be used by Spring context to inject the sessionFactory instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
