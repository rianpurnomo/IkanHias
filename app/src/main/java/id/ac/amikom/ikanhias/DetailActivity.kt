package id.ac.amikom.ikanhias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //membaca data dari main
        val bunga = intent.getParcelableExtra<IkanIk>("PSIKAN")
        bunga?.apply {
            lyDetailIamge.setImageResource(gambar_ik)
            lyDetailNama.setText(nama_ik)
            lyDetailLatin.setText(latin_ik)
            lyDetailKeterangan.setText(keterangan_ik)
            lyDetailUrl.setText(url_ik)
        }
    }
}