

@Database(entities = [Recipe::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao

    companion object {
        @Volatile
        private var INSTANCE: Database? = null
        fun getInstance(context: Context): Database {

            fun getInstance(context: Context): Database {
                return INSTANCE ?: synchronized(this) {
                    INSTANCE ?: Room.databaseBuilder(
                        context.applicationContext,
                        Database::class.java, "recipe_app_db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                        .also { INSTANCE = it }
                }
            }
        }

        }
    }

