package com.analyzer.db.dao;

import com.analyzer.db.Actions;
import com.analyzer.db.models.CommonModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Objects;

public abstract class AbstractDao<T extends CommonModel>{

    protected Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private SessionFactory sessionFactory;
    public void add(T objectModel) {
        getSession().persist(objectModel);

    }
    public void update(T objectModel) {
        getSession().update(objectModel);
    }
    public T getById(Long id) {
        return getSession().load(getModelClass(), id);
    }
    public void remove(Long id) {
        Session session = getSession();
        T modelObject = getById(id);

        if (Objects.nonNull(modelObject)) {
            session.delete(modelObject);
        }
        session.flush();
    }
    public List getAll(final Class<T> type) {
        CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(type);
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery.select(root);
        Query query = getSession().createQuery(criteriaQuery);
        return query.list();
    }
    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    private void loggerAction(T objectModel, Actions action) {
        logger.info(objectModel.getClass().getName() + "with Id: " + objectModel.getId() + " was saved");
    }

    protected Class<T> getModelClass() {
        return (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), AbstractDao.class);
    }
}
