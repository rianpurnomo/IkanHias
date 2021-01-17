package id.ac.amikom.ikanhias

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//data class
@Parcelize
data class IkanIk(
 // data yang dimiliki Ikan
    var nama_ik:String,
    var latin_ik:String,
    var keterangan_ik:String,
    var url_ik:String,
    var gambar_ik:Int
) : Parcelable