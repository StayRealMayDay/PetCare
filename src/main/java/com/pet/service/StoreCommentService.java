package com.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pet.common.BaseDao;
import com.pet.common.BaseService;
import com.pet.dao.StoreUserDao;
import com.pet.entity.StoreComment;


@Service
public class StoreCommentService extends BaseService<StoreComment>{

}
