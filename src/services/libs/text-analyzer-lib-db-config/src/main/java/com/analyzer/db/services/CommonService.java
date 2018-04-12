package com.analyzer.db.services;

import com.analyzer.db.models.CommonModel;

import java.util.List;

public interface CommonService<T extends CommonModel> {

    public void add(T object);
    public void update(T object);
    public T getById(Long id);
    public void remove(Long id);

    public List<T> getAll();


}
