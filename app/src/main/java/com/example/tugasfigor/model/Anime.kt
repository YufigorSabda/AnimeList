package com.example.tugasfigor.model

import com.example.tugasfigor.R

enum class Status {
    COMPLETE,
    ONGOING
}

enum class Type {
    SERIES,
    MOVIE
}

data class Anime (
    val id: Int,
    val title: String,
    val rating: Double,
    val viewer: Int,
    val genre: String,
    val status: Status,
    val type: Type,
    val imageUrl: Int,
    val desc: String
) {
    companion object {
        fun getAllAnime(): List<Anime> {
            return listOf(
                Anime(1,
                    "Weathering with You",
                    4.5,
                    12500,
                    "Romance",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_1,
                    "Seorang remaja yang melarikan diri ke Tokyo bertemu dengan gadis yang memiliki kekuatan untuk mengubah cuaca, membawa mereka pada petualangan yang mengubah hidup."
                ),
                Anime(2,
                    "Tunnel to Summer",
                    4.4,
                    12100,
                    "Slice of Life",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_2,
                    "Dua remaja menemukan terowongan misterius yang membawa mereka kembali ke masa lalu, memaksa mereka untuk menghadapi kenyataan tentang kehilangan dan perpisahan"
                ),
                Anime(3,
                    "I Want to Eat your Pancreas",
                    4.3,
                    14600,
                    "Drama",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_3,
                    "Seorang siswa yang introvert menemukan rahasia seorang teman sekelas yang sakit parah, dan mereka mulai menjalani waktu bersama untuk menikmati hidup."
                ),
                Anime(4,
                    "Suzume",
                    4.2,
                    12520,
                    "Fantasy",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_4,
                    "Seorang gadis muda terjebak dalam petualangan magis untuk menutup pintu yang mengancam dunia, sambil berhadapan dengan kenangan dan kehilangan."
                ),
                Anime(5,
                    "Josee the Tiger and Fish",
                    4.1,
                    12512,
                    "Fantasy",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_5,
                    "Kisah cinta antara seorang pemuda dan gadis yang terkurung di kursi roda, berjuang untuk mengatasi perbedaan dan membangun impian bersama."
                ),
                Anime(6,
                    "A Silent Voice",
                    4.0,
                    12560,
                    "Romance",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_6,
                    "Seorang mantan pembuli berusaha untuk menebus kesalahannya dengan meminta maaf kepada gadis tuli yang pernah dia ganggu di masa lalu."
                ),
                Anime(7,
                    "Your Name",
                    4.6,
                    12501,
                    "Romance",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_7,
                    "Dua remaja yang tidak saling mengenal secara misterius bertukar tubuh dan mencoba memahami keterhubungan mereka yang lebih dalam."
                ),
                Anime(8,
                    "The Boy and The Heron",
                    4.7,
                    11230,
                    "Action",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_8,
                    "Seorang anak muda berpetualang ke dunia fantasi yang penuh keajaiban dan misteri, mengungkap rahasia besar tentang kehidupan dan kematian."
                ),
                Anime(9,
                    "Violet Evergarden Movie",
                    4.8,
                    12570,
                    "Action",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_9,
                    "Violet yang dulu seorang prajurit berusaha menemukan makna dari kata-kata terakhir yang diucapkan oleh orang yang ia cintai, melalui pekerjaannya sebagai penulis surat."
                ),
                Anime(10,
                    "5 Centimeter per Second",
                    4.9, 12540,
                    "Romance",
                    Status.COMPLETE,
                    Type.MOVIE,
                    R.drawable.movie_10,
                    "Kisah cinta yang perlahan pudar seiring berjalannya waktu dan jarak yang semakin memisahkan dua remaja yang saling mencintai."
                ),

                Anime(11,
                    "One Piece",
                    4.9,
                    12313,
                    "Adventure",
                    Status.ONGOING,
                    Type.SERIES,
                    R.drawable.series_1,
                    "Luffy dan kru bajak lautnya berkeliling dunia untuk mencari harta karun legendaris, One Piece, dalam petualangan yang penuh tantangan dan persahabatan."
                ),
                Anime(12,
                    "Jujutsu Kaisen",
                    4.8,
                    12313,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_2,
                    "Seorang pelajar yang terinfeksi kutukan bergabung dengan sekolah sihir untuk melawan makhluk jahat dan menyelamatkan dunia dari kehancuran."
                ),
                Anime(13,
                    "Dragon Ball Z",
                    4.7,
                    12313,
                    "Fantasy",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_3,
                    "Goku dan teman-temannya melawan musuh kuat dari luar angkasa untuk melindungi bumi, sambil mengejar kekuatan yang lebih besar melalui latihan dan pertarungan epik."
                )
                ,
                Anime(14,
                    "Muskoku Tense",
                    4.6,
                    45654,
                    "Action",
                    Status.ONGOING,
                    Type.SERIES,
                    R.drawable.series_4,
                    "Seorang pria yang terlahir kembali di dunia fantasi berusaha untuk memperbaiki kesalahan hidupnya dan memulai perjalanan baru penuh petualangan."
                ),
                Anime(15,
                    "Naruto Shipuden",
                    4.5,
                    34345,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_5,
                    "Seorang ninja muda bernama Naruto Uzumaki berjuang untuk menjadi Hokage dan mendapatkan pengakuan dari desa yang tidak mempercayainya."
                ),
                Anime(16,
                    "Bleach",
                    4.3,
                    12313,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_6,
                    "Ichigo Kurosaki, seorang remaja dengan kemampuan melihat roh, menjadi seorang Soul Reaper untuk melindungi dunia manusia dari roh jahat."
                ),
                Anime(17,
                    "Darling in the Franxx",
                    4.1,
                    12379,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_7,
                    "Seorang pemuda dan rekannya di sebuah dunia pasca-apokaliptik bertarung menggunakan robot untuk melindungi umat manusia dari makhluk misterius."
                ),
                Anime(18,
                    "Haikyuu"
                    , 4.2,
                    67567,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_8,
                    "Cerita tentang semangat dan persahabatan dalam dunia voli SMA, di mana Shoyo Hinata berjuang untuk mengatasi keterbatasannya dan membawa timnya menuju kemenangan."
                ),
                Anime(19,
                    "Attack on Titan",
                    4.7,
                    34534,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_9,
                    "Dalam dunia yang dihancurkan oleh raksasa pemakan manusia, Eren Yeager dan teman-temannya berjuang untuk melindungi umat manusia dan mengungkap kebenaran di balik keberadaan para raksasa."
                ),
                Anime(20,
                    "Kakegurui",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.series_10,
                    "Di sebuah sekolah elit yang penuh dengan pertarungan judi, seorang gadis cerdas dengan keinginan untuk menang tanpa henti menantang para pemain terbaik dalam permainan berisiko tinggi."
                ),

                Anime(21,
                    "The Healer Who Was Banished from his Party is in Fact the Strongest",
                    4.3,
                    21452,
                    "Fantasy",
                    Status.ONGOING,
                    Type.SERIES,
                    R.drawable.anime1,
                    "Seorang penyembuh yang diusir dari kelompoknya berjuang untuk menemukan tujuan baru sambil mencoba membuktikan bahwa dirinya lebih dari sekadar penyembuh."
                ),
                Anime(22,
                    "SAO Alternative GGO",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime2,
                    "Dalam dunia permainan virtual Gun Gale Online, seorang pemain wanita berjuang untuk menemukan jati dirinya sambil terlibat dalam turnamen tembak-menembak yang mematikan."
                ),
                Anime(23,
                    "You Are Ms. Servant",
                    4.3,
                    21452,
                    "Action",
                    Status.ONGOING,
                    Type.SERIES,
                    R.drawable.anime3,
                    "Seorang wanita yang dipaksa menjalani kehidupan sebagai pelayan setelah ditarik ke dunia yang penuh dengan berbagai tantangan."
                ),
                Anime(24,
                    "Demon Lord 2099",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime4,
                    "Setelah berakhirnya perang besar, seorang Raja Iblis yang terlahir kembali di dunia masa depan mencoba untuk beradaptasi dengan peradaban modern yang penuh dengan teknologi."
                ),
                Anime(25,
                    "Shangri La Frontier",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime5,
                    "Seorang gamer berbakat menyelami dunia game VR yang penuh dengan tantangan dan monster, mencari petualangan dan mengungkap misteri di balik permainan tersebut."
                ),
                Anime(26,
                    "Tensei Kizoku Kantei Skill",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime6,
                    "Seorang pria yang terlahir kembali dalam keluarga bangsawan yang kaya dan menggunakan keterampilan detektif untuk memecahkan misteri di dunia baru."
                ),
                Anime(27,
                    "The Most Notorious \"Talker\" Runs the World's Greatest Clan",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime7,
                    "Seorang pemain video game dengan keterampilan komunikasi yang luar biasa mengendalikan klan terbesar di dunia, meskipun ia hanya berbicara."
                ),
                Anime(28,
                    "Arifureta: From Commonplace to World's Strongest",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime8,
                    "Seorang remaja yang terlempar ke dunia fantasi dan dipandang remeh oleh teman-temannya, tetapi akhirnya menjadi sangat kuat untuk bertahan hidup dan melindungi orang-orang yang dia cintai."
                ),
                Anime(29,
                    "Let This Grieving Soul Retire!",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime9,
                    "Seorang petualang berpengalaman yang merasa lelah dan ingin pensiun, tetapi harus menghadapi banyak tantangan dan berjuang untuk mencapai kedamaian."
                ),
                Anime(30,
                    "Blue Lock",
                    4.3,
                    21452,
                    "Action",
                    Status.COMPLETE,
                    Type.SERIES,
                    R.drawable.anime10,
                    "Serangkaian pelatih elit mengumpulkan para penyerang muda dari seluruh Jepang untuk berlomba-lomba menjadi yang terbaik dalam permainan sepak bola, dengan taruhan yang tinggi untuk masa depan mereka."
                ),
            )
        }

        fun showAnime(id: Int): List<Anime> {
            return getAllAnime().filter { it.id == id }
        }

        fun filterMovie(): List<Anime> {
            return  getAllAnime().filter { it.type == Type.MOVIE }
        }

        fun filterSeries(): List<Anime> {
            return  getAllAnime().filter { it.type == Type.SERIES }
        }

        fun searchAnime(keyword: String): List<Anime> {
            return getAllAnime().filter { it.title.contains(keyword, ignoreCase = true) }
        }
    }
}