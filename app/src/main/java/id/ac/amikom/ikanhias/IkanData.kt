package id.ac.amikom.ikanhias

//Data source
object IkanData {
    //data di database atau input manual
    val listIkData1: ArrayList<IkanIk>
        get(){
            val listIkData2: ArrayList<IkanIk> = arrayListOf()

            listIkData2.add(IkanIk(
                nama_ik = "Arwana",
                latin_ik = "Scleropages formosus",
                keterangan_ik = "Arwana Asia (Scleropages formosus), atau Siluk Merah adalah salah satu spesies ikan air tawar dari Asia Tenggara. Ikan ini memiliki badan yang panjang; sirip dubur terletak jauh di belakang badan. Arwana Asia umumnya memiliki warna keperak-perakan. Arwana Asia juga disebut \"Ikan Naga\" karena sering dihubung-hubungkan dengan naga dari Mitologi Tionghoa",
                url_ik = "https://id.wikipedia.org/wiki/Arwana_asia",
                gambar_ik = R.drawable.arwana
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Buntal",
                latin_ik = "Tetraodontidae ",
                keterangan_ik = "Tetraodontidae adalah sebuah famili dari ikan muara dan laut yang berasal dari ordo Tetraodontiformes..[1] Secara morfologi, ikan-ikan serupa yang termasuk dalam famili ini serupa dengan ikan landak yang memiliki tulang belakang luas yang besar (tidak seperti tulang belakang Tetraodontidae yang lebih tipis, tersembunyi, dan dapat terlihat ketika ikan ini menggembungkan diri). Nama ilmiah ini merujuk pada empat gigi besar yang terpasang pada rahang atas dan bawah yang digunakan untuk menghancurkan cangkang krustasea dan moluska, mangsa alami mereka.",
                url_ik = "https://id.wikipedia.org/wiki/Ikan_buntal",
                gambar_ik = R.drawable.buntal
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Cupang",
                latin_ik = "Betta sp",
                keterangan_ik = "Ikan Cupang (Betta sp.) adalah ikan air tawar yang habitat asalnya adalah beberapa negara di Asia Tenggara, antara lain Indonesia, Thailand, Malaysia, Brunei Darussalam, Singapura, dan Vietnam. Ikan ini mempunyai bentuk dan karakter yang unik dan cenderung agresif dalam mempertahankan wilayahnya. Di kalangan penggemar, ikan cupang umumnya terbagi atas tiga golongan, yaitu cupang hias, cupang aduan, dan cupang liar. Di Indonesia terdapat cupang asli, salah satunya adalah Betta channoides yang ditemukan di Pampang, Kalimantan Timur.",
                url_ik = "https://id.wikipedia.org/wiki/Cupang_(ikan)#:~:text=Ikan%20Cupang%20(Betta%20sp.),cenderung%20agresif%20dalam%20mempertahankan%20wilayahnya.",
                gambar_ik = R.drawable.cupang
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Discus",
                latin_ik = "Symphysodon spp",
                keterangan_ik = "Discus (Symphysodon spp.) adalah satu dari tiga spesies ikan air tawar cichlid yang berasal dari lembah Sungai Amazon.[1] Discus adalah sejenis ikan akuarium yang popular di beberapa negara Asia.",
                url_ik = "https://ms.wikipedia.org/wiki/Discus_(ikan)",
                gambar_ik = R.drawable.discus
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Gruppy",
                latin_ik = "Poecilia reticulata",
                keterangan_ik = "Gupi, ikan seribu, ikan cere, atau suwadakar (Poecilia reticulata), adalah salah satu spesies ikan hias air tawar yang paling populer di dunia. Karena mudahnya menyesuaikan diri dan beranak-pinak, di banyak tempat di Indonesia ikan ini telah menjadi ikan liar yang memenuhi parit-parit dan selokan. Dalam perdagangan ikan hias dikenal sebagai guppy atau juga millionfish[1], di berbagai daerlokal seperti gepi (Btw.), bungkreung (Sd.), cethul atau cithul (Jw.), klataw (Bjn.), dan lain-lain.",
                url_ik = "https://id.wikipedia.org/wiki/Gupi",
                gambar_ik = R.drawable.guppy
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Koi",
                latin_ik= "Cyprinus carpio",
                keterangan_ik = "Di Jepang, koi menjadi semacam simbol cinta dan persahabatan. Ini karena koi merupakan homofon untuk kata lain yang juga bermakna kasih sayang atau cinta. Ikan Koi adalah sejenis ikan yang termasuk ikan mas (Cyprinus carpio) yang mempunyai ornamen yang sangat indah dan jinak. Koi biasanya dipelihara sebagai hiasan dengan tujuan keindahkan dan keberuntungan di dalam rumah dan luar rumah (kolam koi atau taman air, karena ikan koi dipercaya membawa keberuntungan. Karena ikan koi sangat dekat berkerabat dengan ikan mas, dan oleh karena itu di Indonesia banyak orang menyebutnya ikan mas koi.",
                url_ik = "https://id.wikipedia.org/wiki/Koi",
                gambar_ik = R.drawable.koi
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Lopis",
                latin_ik = " Notopteridae",
                keterangan_ik = "Ikan lopis merupakan jenis ikan sungai yang tergolong dalam suku Notopteridae (ikan berpunggung pisau). Ikan ini lebih populer dengan nama ikan belida/belido, yang diambil dari nama salah satu sungai di Sumatra Selatan yang menjadi habitatnya. Orang Banjar menyebutnya ikan pipih.",
                url_ik = "https://id.wikipedia.org/wiki/Lopis#:~:text=Notopterus%20chitala%20H.B.,Orang%20Banjar%20menyebutnya%20ikan%20pipih.",
                gambar_ik = R.drawable.lopis
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Lou han",
                latin_ik = " Flowerhorn",
                keterangan_ik = "Ikan Lou Han (bahasa Inggris: Flowerhorn) ikan Louhan merupakan salah satu ikan hias terkenal yang dipelihara di dalam akuarium karena warna sisik mereka yang hidup serta benjolan kepala mereka yang berbentuk khas berjuluk \"benjol kelam\". Aslinya mereka hanya berhabitat di Malaysia dan Taiwan, namun saat ini banyak dipelihra oleh penggemar ikan di seluruh dunia.",
                url_ik = "https://id.wikipedia.org/wiki/Ikan_Lou_han#:~:text=Ikan%20Lou%20Han%20(bahasa%20Inggris,khas%20berjuluk%20%22benjol%20kelam%22.",
                gambar_ik = R.drawable.louhan
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Pelangi Merah",
                latin_ik = "Glossolepis incisus",
                keterangan_ik = "Ikan ini sudah terkenal di Eropa untuk ikan hias akuarium, Ikan ini pertama kali diperkenalkan oleh Max Weber yang melakukan ekspedisi Papua Barat antara tahun 1890 sampai 1900. Pada tahun 1973, A. Werner, Jr dari Munich, dan E. Frech dari Memmingen, Jerman mengumpulkan spesimen hidup selama penilitian di Jawa, Sulawesi, dan Papua Barat. Mereka mengambil sejumlah ikan berwarna-warni kembali ke Eropa, termasuk Incisus Glossolepis . Peneliti Werner dan Frech juga memperkenalkan ikan rainbowfish yang indah dan menarik bagi penghobi ikan akuarium.",
                url_ik = "https://id.wikipedia.org/wiki/Pelangi_merah",
                gambar_ik = R.drawable.pelangi
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Sepat mutiara",
                latin_ik = "Trichopodus leeri",
                keterangan_ik = "Sepat mutiara (Trichopodus leeri) adalah sejenis ikan hias air tawar anggota suku gurami (Osphronemidae). Dalam bahasa Inggris disebut Pearl gourami, Mosaic gourami atau Lace gourami merujuk pada pola warna berbintik-bintik indah dengan garis hitam di sisi tubuhnya.",
                url_ik = "https://id.wikipedia.org/wiki/Sepat_mutiara",
                gambar_ik = R.drawable.sepatmutiara
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Sumatra",
                latin_ik = "Puntius tetrazona",
                keterangan_ik = "Ikan sumatra (Puntius tetrazona) adalah sejenis ikan kecil anggota suku Cyprinidae anak-suku Cyprininae. Nama tersebut adalah nama perdagangannya sebagai ikan hias. Dalam bahasa Inggris, ikan ini dikenal sebagai sumatra barb atau tiger barb.",
                url_ik = "https://id.wikipedia.org/wiki/Ikan_sumatra",
                gambar_ik = R.drawable.sumatra
            ))

            listIkData2.add(IkanIk(
                nama_ik = "Zebra",
                latin_ik = "Danio rerio",
                keterangan_ik = "Ikan zebra (Danio rerio) adalah salah satu spesies ikan bermarga Danio dari keluarga siprinide.[1] Penggunaan nama umum \"ikan zebra\" pada Danio rerio didasari oleh adanya garis-garis pigmen horizontal pada tubuh ikan zebra yang menyerupai garis-garis pada tubuh zebra.[2] Ukuran tubuh ikan zebra sekitar 3–5 sentimeter dengan kulit belang berwarna biru kehitaman dan jingga kekuningan",
                url_ik = "https://id.wikipedia.org/wiki/Ikan_zebra",
                gambar_ik = R.drawable.zebra
            ))


            return listIkData2
        }
}