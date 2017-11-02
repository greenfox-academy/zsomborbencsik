package com.greenfox.mysql.repository;

import com.greenfox.mysql.Assignee;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface AssigneeRepository extends CrudRepository <Assignee,Integer> {


}
