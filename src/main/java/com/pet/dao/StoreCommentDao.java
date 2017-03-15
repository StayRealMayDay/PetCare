package com.pet.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pet.common.BaseDao;
import com.pet.entity.StoreComment;

@Repository
public class StoreCommentDao extends BaseDao<StoreComment>{

}
