package com.analyzer.db.services;

import com.analyzer.db.models.CommonModel;

import java.util.List;

public interface CommonService<T extends CommonModel> {

    public void addAuthor(T object);
    public void updateAuthor(T object);
    public T getById(Long id);
    public void remove(Long id);

    public List<T> getAll();


}
