package com.sunle.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.sunle.entity.User;

public interface UserDao extends ElasticsearchRepository<User, Integer>{

}
