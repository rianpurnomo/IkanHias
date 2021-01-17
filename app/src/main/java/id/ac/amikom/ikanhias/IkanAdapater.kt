package id.ac.amikom.ikanhias

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_ikan.view.*


//adapter
class IkanAdapter(val listIkan_ia: List<IkanIk>, val sheredPref_ia: SheredPref) : RecyclerView.Adapter<IkanAdapter.ViewHolder>() {

    var onItemClickListener: ((IkanIk) -> Unit)? = null

    //set view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(ikan : IkanIk) {
            with(itemView){
                lyItemImage.setImageResource(ikan.gambar_ik)
                lyItemNama.setText(ikan.nama_ik)
                lyItemLatin.setText(ikan.latin_ik)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView1 = LayoutInflater.from(parent.context).inflate(R.layout.item_ikan, parent, false)
        return ViewHolder(itemView1)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ikan = listIkan_ia.get(position)
        holder.bind(ikan)
        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(ikan)
        }
        //latin
        holder.itemView.lyItemLatin.visibility = if(sheredPref_ia.latin) View.GONE  else View.VISIBLE

        //nama
        holder.itemView.lyItemNama.visibility = if (sheredPref_ia.nama) View.GONE  else View.VISIBLE

        //gambar
        holder.itemView.lyItemImage.visibility = if (sheredPref_ia.gambar) View.GONE  else View.VISIBLE
    }

    override fun getItemCount(): Int {
        return listIkan_ia.size
    }
}
