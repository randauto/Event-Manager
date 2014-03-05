package com.vinilearning.eventmanager.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.vinilearning.eventmanager.greendao.Students;

import com.vinilearning.eventmanager.greendao.StudentsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig studentsDaoConfig;

    private final StudentsDao studentsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        studentsDaoConfig = daoConfigMap.get(StudentsDao.class).clone();
        studentsDaoConfig.initIdentityScope(type);

        studentsDao = new StudentsDao(studentsDaoConfig, this);

        registerDao(Students.class, studentsDao);
    }
    
    public void clear() {
        studentsDaoConfig.getIdentityScope().clear();
    }

    public StudentsDao getStudentsDao() {
        return studentsDao;
    }

}