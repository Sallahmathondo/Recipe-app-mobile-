package com.example.reciperadar.ui.explore

//data class Recipe(
//    var meal_type: String, var number_of_people: Int,
//    var difficulty:String, var ingredients:String,
////    ingredient amount,
//    var preparation_steps:String,
//    var imageId: Int
import androidx.room.Entity
import androidx.room.primaryKey
@Entity(tableName = "recipes")
data class Recipe(

    @PrimaryKey(autoGenerate = true) val id:Long = 0,
    var meal_type: String,
    var recipe_title: String,
    var number_of_people: Int,
    var difficulty:String,
    var ingredients:String,
    var preparation_steps:String,
    var imageId: Int
)
