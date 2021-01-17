package id.ac.amikom.ikanhias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //mengambil dari SharedPref
    lateinit var sheredPref_ma: SheredPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /// menngunci setting
        sheredPref_ma = SheredPref(this)

        //layout_manager
        recycleView.layoutManager = LinearLayoutManager(this)
        val listMc = IkanData.listIkData1
        val adapterMc = IkanAdapter(listMc, sheredPref_ma)
        recycleView.adapter = adapterMc

        //klik listener layout retail
        adapterMc.onItemClickListener = {
            var intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("PSIKAN", it)
            startActivity(intent)
        }
    }

    // menentukan layoutmanager
    override fun onResume() {
        super.onResume()
            recycleView.layoutManager = if(sheredPref_ma.gridLayout){
                GridLayoutManager (this, sheredPref_ma.columns)
            } else {
                LinearLayoutManager(this)
            }
        supportActionBar?.title = sheredPref_ma.appName
    }

    // memunculan simpol pengaturan
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // goto activity setting
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuSetting -> startActivity(Intent(this, SettingsActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}