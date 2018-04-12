package com.analyzer.db;

import com.analyzer.db.config.JpaConfig;
import com.analyzer.db.models.impl.Word;
import com.analyzer.db.services.CommonService;
import com.analyzer.db.services.impl.WordServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                JpaConfig.class);

        CommonService wordServiceImpl = (CommonService) context.getBean("wordService");

        if (wordServiceImpl.getById(1L) == null){
            wordServiceImpl.add(new Word("Hello World", null, null, null));
        }
        wordServiceImpl.getAll();

        System.out.println(wordServiceImpl.getById(1L).getId());
    }
}
