package com.example.a14_signinsignup.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.a14_signinsignup.entity.CategoryItems;

import java.util.List;

@Dao
public interface PheboDao {

    @Query("SELECT * FROM tests ORDER BY id DESC")
    LiveData<List<CategoryItems>> alltest();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTest(CategoryItems tests);
}
