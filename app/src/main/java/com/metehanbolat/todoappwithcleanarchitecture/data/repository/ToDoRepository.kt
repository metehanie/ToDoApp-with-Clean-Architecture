package com.metehanbolat.todoappwithcleanarchitecture.data.repository

import androidx.lifecycle.LiveData
import com.metehanbolat.todoappwithcleanarchitecture.data.ToDoDao
import com.metehanbolat.todoappwithcleanarchitecture.data.models.ToDoData

class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()
    val sortByHighPriority: LiveData<List<ToDoData>> = toDoDao.sortByHighPriority()
    val sortByLowPriority: LiveData<List<ToDoData>> = toDoDao.sortByLowPriority()

    fun insertData(toDoData: ToDoData){
        toDoDao.insertData(toDoData)
    }

    fun updateData(toDoData: ToDoData){
        toDoDao.updateData(toDoData)
    }

    fun deleteItem(toDoData: ToDoData){
        toDoDao.deleteItem(toDoData)
    }

    fun deleteAll(){
        toDoDao.deleteAll()
    }

    fun searchDatabase(searchQuery: String) : LiveData<List<ToDoData>>{
        return toDoDao.searchDatabase(searchQuery)
    }
}