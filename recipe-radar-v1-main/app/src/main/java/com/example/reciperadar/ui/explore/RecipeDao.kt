

package com.example.recipeapp.data

import androidx.room.Dao
import android.room.Delete
import androidx.room.Insert
import android.room.Query
import androidx.room.Update

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipes")
    fun getAllRecipe(): Array<Recipe>
    @Insert
    fun insertRecipe(vararg Recipe: Recipe)
    @Update
    fun updateRecipe(Recipe: Recipe)
    @Delete
    fun deleteRecipe(Recipe: Recipe)