package id.ac.amikom.ikanhias

import android.content.Context
import android.content.SharedPreferences

class SheredPref (context: Context){
    private val read: SharedPreferences = context.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)
    private val write: SharedPreferences.Editor = read.edit()

    // nilai input
    fun setData (key: String, value: Any?){
        when(value){
            is Boolean -> write.putBoolean(key, value)
            is Float -> write.putFloat(key, value)
            is Int -> write.putInt(key, value)
            is Long -> write.putLong(key, value)
            is String -> write.putString(key, value)
        }
        write.commit()
    }
    fun getBoolean(key: String, default: Boolean = false) = read.getBoolean(key, default)
    fun getFloat(key: String, default: Float = 0f) = read.getFloat(key, default)
    fun getInt(key: String, default: Int = 0) = read.getInt(key, default)
    fun getLong(key: String, default: Long = 0) = read.getLong(key, default)
    fun getString(key: String, default: String? = null) = read.getString(key, default)

    companion object{
        const val GRID_LAYOUT1 = "grid_layout"
        const val LATIN1 = "latin"
        const val APP_NAME1 = "app_name"
        const val COLUMN1 = "column"
        const val NAMA1 = "nama"
        const val GAMBAR1 = "gambar"
    }

    var gridLayout: Boolean
        set(value) = setData(GRID_LAYOUT1, value)
        get() = getBoolean(GRID_LAYOUT1)

    var latin: Boolean
        set(value) = setData(LATIN1, value)
        get() = getBoolean(LATIN1)

    var appName: String?
        set(value) = setData(APP_NAME1, value)
        get() = getString(APP_NAME1)

    var columns: Int
        set(value) = setData(COLUMN1, value)
        get() = getInt(COLUMN1)

    var nama: Boolean
        set(value) = setData(NAMA1, value)
        get() = getBoolean(NAMA1)

    var gambar: Boolean
        set(value) = setData(GAMBAR1, value)
        get() = getBoolean(GAMBAR1)
}