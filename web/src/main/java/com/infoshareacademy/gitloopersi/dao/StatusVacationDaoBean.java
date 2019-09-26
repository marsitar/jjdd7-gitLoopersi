package com.infoshareacademy.gitloopersi.dao;

import com.infoshareacademy.gitloopersi.domain.entity.statistic.StatusVacation;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class StatusVacationDaoBean {

  @PersistenceContext
  private EntityManager entityManager;

  private Logger logger = LoggerFactory.getLogger(getClass().getName());

  public List<StatusVacation> getStatusVacations() {

    logger.info("StatusVacation objects are to be get from DB");
    Query query = entityManager
        .createNamedQuery("StatusVacation.findAll");

    return query.getResultList();
  }
}
