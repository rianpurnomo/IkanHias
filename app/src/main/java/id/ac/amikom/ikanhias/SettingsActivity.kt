package id.ac.amikom.ikanhias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //mengubah title bar
        supportActionBar?.apply {
            title = "Setting"
            setDisplayHomeAsUpEnabled(true)
        }

        //mengatur output tampilan
        val sheredPref_sa = SheredPref(this)

        //meyimpan perubahan pada aplikasi
        settingGrid.isChecked = sheredPref_sa.gridLayout
        settingGrid.setOnCheckedChangeListener { buttonView, isChecked ->
            sheredPref_sa.gridLayout = isChecked
        }

        settingLatin.isChecked = sheredPref_sa.latin
        settingLatin.setOnCheckedChangeListener { buttonView, isChecked ->
            sheredPref_sa.latin = isChecked
        }

        settingAppName.setText(sheredPref_sa.appName)
        settingAppName.addTextChangedListener {
            sheredPref_sa.appName = it.toString()
        }
        settingColumn.setText(sheredPref_sa.columns.toString())
        settingColumn.addTextChangedListener {
            var cols = if (it.toString().length == 0) 1 else it.toString().toInt()
            cols = if (cols > 3) {
                3
            }  else if (cols < 1) {
                1
            } else {
                cols
            }
            sheredPref_sa.columns = cols
        }

        ///nama
        settingNama.isChecked = sheredPref_sa.nama
        settingNama.setOnCheckedChangeListener { buttonView, isChecked ->
            sheredPref_sa.nama = isChecked
        }

        ///Gambar
        settingGambar.isChecked = sheredPref_sa.gambar
        settingGambar.setOnCheckedChangeListener { buttonView, isChecked ->
            sheredPref_sa.gambar = isChecked
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}