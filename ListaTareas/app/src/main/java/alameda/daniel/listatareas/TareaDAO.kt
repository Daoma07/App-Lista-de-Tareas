package alameda.daniel.listatareas

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TareaDAO {

    @Query("SELECT * FROM tareas")
    fun obtenerTareas(): List<Tarea>

    @Insert
    fun agregarTarea(tarea: Tarea)

    @Delete
    fun elimiarTarea(tarea: Tarea)

    @Update
    fun actualizarTarea(tarea: Tarea)
}