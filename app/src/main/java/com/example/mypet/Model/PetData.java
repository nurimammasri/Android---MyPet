package com.example.mypet.Model;

import com.example.mypet.R;

import java.util.ArrayList;

    public class PetData {
        private static String[] petNames = {
                "KUCING",
                "KUDA",
                "SINGA",
                "KAMBING",
                "KURA-KURA",
                "HARIMAU",
                "SAPI",
                "BERUANG KUTUB",
                "PAUS",
                "GORILA"
        };

        private static String[] petDetails = {
                "Kucing adalah salah satu hewan peliharaan terpopuler di dunia. Kucing yang garis keturunannya tercatat secara resmi sebagai kucing trah atau galur murni (pure breed), seperti persia, siam, manx, dan sphinx.             Kucing seperti ini biasanya dibiakkan di tempat pemeliharaan hewan resmi. Jumlah kucing ras hanyalah 1% dari seluruh kucing di dunia, sisanya adalah kucing dengan keturunan campuran seperti kucing liar atau kucing kampung.\n\n" +
                        "Kucing telah berbaur dengan kehidupan manusia paling tidak sejak 6.000 tahun SM, dari kerangka kucing di Pulau Siprus. Orang Mesir Kuno dari 3.500 SM telah menggunakan kucing untuk menjauhkan tikus atau hewan pengerat lain dari lumbung yang menyimpan hasil panen.",

                "Kuda (Equus caballus atau Equus ferus caballus) adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun.\n\n" +
                        "Kuda dapat ditunggangi oleh manusia dengan menggunakan sadel dan dapat pula digunakan untuk menarik sesuatu, seperti kendaraan beroda, atau bajak. Pada beberapa daerah, kuda juga digunakan sebagai sumber makanan. Walaupun peternakan kuda diperkirakan telah dimulai sejak tahun 4500 SM, bukti-bukti penggunaan kuda untuk keperluan manusia baru ditemukan terjadi sejak 2000 SM.",

                "Singa (bahasa Sanskerta: Siṃha, atau dalam bahasa Latin: Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalm penangkaran memungkinkan lebih dari 20 tahun.\n\n" +
                        "Singa betina jauh lebih aktif dalam berburu, sedangkan singa jantan lebih santai bersikap menunggu dan meminta jatah dari hasil buruan para betinanya. Singa jantan dipercaya lebih unggul dan perkasa dibandingkan dengan kucing besar lainnya, tetapi kelemahan singa ialah tidak bisa memanjat pohon sebagus kucing-kucing besar lainnya. Singa jantan ditumbuhi bulu tebal di sekitar tengkuknya, hal ini lebih menguntungkan untuk melindungi tengkuknya, terutama dalam perkelahian bebas antara kucing besar yang cenderung menerkam tengkuk untuk melumpuhkan musuhnya.\n\n" +
                        "Kucing besar lainnya, seperti citah dan macan tutul memiliki ukuran tubuh jauh lebih kecil dibanding singa. Walaupun berasal dari keluarga yang sama dengan harimau, singa tidak suka dengan air. Berbeda dengan harimau yang suka dengan air.\n\n" +
                        "Singa yang terkenal di dunia adalah Bongo. Singa yang menjadi bintang film dalam film George of the Jungle. Bongo adalah singa paling jinak yang meninggal karena sakit paru-paru. Singa kedua yang paling jinak di dunia adalah Zamba yang merupakan peliharaan Ralph Helfer.",

                "Kambing merupakan binatang memamah biak yang berukuran sedang. Kambing ternak (Capra aegagrus hircus) adalah subspesies kambing liar yang secara alami tersebar di Asia Barat Daya (daerah 'Bulan sabit yang subur' dan Turki) dan Eropa. Kambing liar jantan maupun betina memiliki tanduk sepasang, namun tanduk pada kambing jantan lebih besar. Umumnya, kambing mempunyai janggut, dahi cembung, ekor agak ke atas, dan kebanyakan berrambut lurus dan kasar. Panjang tubuh kambing liar, tidak termasuk ekor, adalah 1,3 meter - 1,4 meter, sedangkan ekornya 12 sentimeter - 15 sentimeter. Bobot kambing betina 50 kilogram - 55 kilogram, sedangkan yang jantan bisa mencapai 120 kilogram. Kambing liar tersebar dari Spanyol ke arah timur sampai India, dan dari India ke utara sampai Mongolia dan Siberia. Habitat yang disukainya adalah daerah pegunungan yang berbatu-batu.\n\n" +
                        "Kambing sudah dibudidayakan manusia kira-kira 8000 hingga 9000 tahun yang lalu. Biasanya, kambing hidup berkelompok 5 sampai 20 ekor. Dalam pengembaraannnya mencari makanan, kelompok kambing ini dipimpin oleh kambing betina yang paling tua. Sementara kambing-kambing jantan berperan menjaga keamanan kawanan. Waktu aktif mencari makannya siang ataupun malam hari. Makanan utamanya adalah rumput-rumputan dan dedaunan.",

                "Kura-kura dan penyu adalah hewan bersisik berkaki empat yang termasuk golongan reptil. Bangsa hewan yang disebut (ordo) Testudinata (atau Chelonians) ini khas dan mudah dikenali dengan adanya ‘rumah’ atau batok (bony shell) yang keras dan kaku.\n\n" +
                        "Batok kura-kura ini terdiri dari dua bagian. Bagian atas yang menutupi punggung disebut karapas (carapace) dan bagian bawah (ventral, perut) disebut plastron. Kemudian setiap bagiannya ini terdiri dari dua lapis. apis luar umumnya berupa sisik-sisik besar dan keras, dan tersusun seperti genting; sementara lapis bagian dalam berupa lempeng-lempeng tulang yang tersusun rapat seperti tempurung. Perkecualian terdapat pada kelompok labi-labi (Trionychoidea) dan jenis penyu belimbing, yang lapis luarnya tiada bersisik dan digantikan lapisan kulit di bagian luar tempurung tulangnya.\n\n" +
                        "Dalam bahasa Indonesia, kita mengenal tiga kelompok hewan yang termasuk bangsa ini, adalah penyu (bahasa Inggris: sea turtles), labi-labi atau bulus (freshwater turtles), dan kura-kura (tortoises). Dalam bahasa Inggris, dibedakan lagi antara kura-kura darat (land tortoises) dan kura-kura air tawar (freshwater tortoises atau terrapins).",

                "Harimau (bahasa Latin: Panthera tigris) adalah hewan yang tergolong dalam filum Chordata, subfilum vertebrata, kelas mamalia, pemakan daging (karnivora), keluarga felidae (kucing), genus panthera, dan tergolong dalam spesies tigris.\n\n" +
                        "Harimau adalah jenis kucing terbesar dari spesiesnya, bahkan lebih besar dari singa. Harimau juga adalah kucing tercepat kedua dalam berlari, setelah citah. Dalam keseluruhan karnivora, harimau adalah kucing karnivora terbesar dan karnivora terbesar ketiga setelah beruang kutub dan beruang coklat.\n\n" +
                        "Harimau biasanya memburu mangsa yang agak besar seperti rusa sambar, kijang, babi, atau kancil. Namun, harimau akan memburu hewan kecil seperti landak apabila mangsa yang agak besar itu tidak ada. Meskipun berasal dari keluarga yang sama, harimau berbeda dengan kucing biasa yang kecil, harimau sangat suka berenang, dan pada dasarnya kucing takut dengan air.",

                "Sapi merupakan mamalia berkaki empat dengan tapak belah. Kebanyakan sapi memiliki tanduk. Walaupun demikian, seleksi genetik telah membuat sapi tanpa tanduk tersebar di mana-mana.\n\n" +
                        "Sebagai hewan ruminansia, sapi memakan dan  mencerna tumbuhan melalui fermentasi dalam sistem pencernaannya. Lambung sapi terdiri atas empat ruangan, yaitu rumen, retikulum, omasum, dan abomasum. Pakan yang telah difermentasi dalam rumen kemudian diregurgitasi (dikembalikan ke mulut) untuk dikunyah lagi. Proses pengunyahan kembali inilah yang disebut ruminasi.\n\n" +
                        "Selain kawin secara alami, pada sapi juga dilakukan inseminasi buatan (IB) untuk pemuliaan hewan. IB dilakukan dengan menempatkan semen dari sapi jantan ke dalam rahim sapi betina pada masa estrus. Masa kebuntingan pada sapi berlangsung sekitar 9 bulan. Terkadang, terjadi kesulitan melahirkan yang disebut distokia. Di beberapa daerah di Indonesia, anak sapi yang baru lahir disebut pedet. Secara alami, pedet akan menyusu selama 7-8 bulan sebelum disapih.\n\n" +
                        "Sapi adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan lembu. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia. Hasil sampingannya seperti kulit, jeroan, tanduk, dan kotorannya juga dimanfaatkan untuk berbagai keperluan manusia. Di sejumlah tempat, sapi juga dipakai sebagai penggerak alat transportasi, pengolahan lahan tanam (bajak), dan alat industri lain (seperti peremas tebu). Karena banyak kegunaan ini, sapi telah menjadi bagian dari berbagai kebudayaan manusia sejak lama.\n\n",

                "Beruang Kutub (Inggris: polar bear) atau beruang es atau dalam nama ilmiahnya Ursus maritimus adalah mamalia besar dalam aturan marga keluarga biologi Ursidae. Dia termasuk spesies circumpolar yang terdapat di sekitar benua paling utara bumi, yaitu benua Artik dan termasuk beruang paling karnivora di antara keluarga beruang lainnya. Beruang kutub kadang-kadang juga diklasifikasi sebagai mamalia laut.\n\n" +
                        "Beruang kutub jantan memiliki berat antara 400 - 600 kilogram dan kadang-kadang dapat mencapai lebih dari 800 kg dengan tinggi mencapai lebih dari 2,5 meter. Sedangkan Beruang kutub betina hanya separuh dari berat beruang jantan dengan berat antara 200 – 300 kg dan tinggi sekitar 2 meter. Beruang kutub memiliki indra penciuman yang sangat tajam.Mereka dapat mencium bau bangkai paus atau anjing laut dari jarak 20 mil.\n\n" +
                        "Beruang kutub adalah perenang yang handal karena dapat berenang sejauh 60 mil tanpa berhenti. Mereka menggunakan tungkai depannya untuk berenang dan tungkai belakang sebagai kemudi. Kelenjar minyak pada kulitnya dapat meminyaki bulunya dengan baik sehingga tahan air dan membuat tubuhnya tetap kering selama berenang.\n\n" +
                        "Pada musim panas di Kutub Utara terutama pada bulan Mei - Juni, bulu - bulu beruang yang tebal mulai rontok untuk menjaga suhu tubuh tetap stabil.\n\n" +
                        "Beruang kutub adalah mamalia laut karena mereka menghabiskan waktu berbulan-bulan selama satu tahun di laut. Beruang kutub adalah satu-satunya 'mamalia laut' yang hidup dengan kekuatan, kaki dan telapak yang besar memungkinkan mereka berjalan dan berlari sejauh bermil-mil. Beruang Kutub pada dasarnya adalah hewan yang aktif dan sama sekali tidak takut terhadap kehadiran manusia.\n\n" +
                        "Makanan utama Beruang kutub adalah ikan dan anjing laut. Mereka adalah hewan yang sabar ketika berburu, menunggu mangsa(anjing laut) yang sedang menyelam selama berjam - jam hingga sang target melompat ke daratan dan kemudian langsung diterkam beruang. Kekuatan melumpuhkan mangsanya berada pada cakar beruang yang tajam dan pukulan yang kuat dari kaki depannya.",

                "Paus atau lodan (khusus yang bergigi dan bukan berukuran kecil) adalah kelompok mamalia yang hidup di lautan. Sebutan 'paus' diberikan pada anggota bangsa Cetacea yang berukuran besar. Paus bukan tergolong dalam keluarga ikan. Paus mempunyai ciri-ciri sebagai berikut:\n" +
                        "1. Bernapas menggunakan paru-paru\n" +
                        "2. Mempunyai rambut (sedikit, kebanyakan ada di paus dewasa)\n" +
                        "3. Berdarah panas\n" +
                        "4. Mempunyai kelenjar susu\n" +
                        "5. Mempuya jantung dengan empat ruang\n\n" +
                        "Paus purba berevolusi pada pertengahan tempo Eocene, kira-kira 50 juta tahun yang lalu. Salah satu paus terawal yang telah punah adalah Basilosaurus yang mempunyai kepala kecil bermoncong menonjol dan bergigi. Basilosaurus mempunyai panjang 25 meter.\n\n" +
                        "Fosil menunjukkan bahwa paus berasal dari hewan daratan berkuku, kemungkinan dari hewan seperti Mesonychid (hewan seperti serigala yang tinggal di pesisir pantai) yang berangsur-angsur kembali menghunii lautan sekitar 50 juta tahun yang lalu. Satu lagi kemungkinan hewan lain yang berubah menjadi paus, adalah Ambulocetus, mamalia seukuran anjing laut namun memiliki panjang 3 meter seberat 325 kilogram.\n\n" +
                        "Pada masa kini dikenal dua kelompok paus, yaitu paus bergigi (Odontoceti) dan paus tidak bergigi (Mysticeti). Paus Odontoceti yang bergigi merupakan pemangsa yang memakan ikan, sotong, dan mamalia laut, mempunyai satu lubang pernapasan. Paus bergigi berkerabat dekat dengan lumba-lumba dan pesut. Paus tidak bergigi berukuran lebih besar daripada paus bergigi dan mempunyai struktur yang dikenal sebagai balin yang berbentuk sikat. Struktur ini berguna untuk menyaring plankton, makanannya, di air. Paus berbalin mempunyai dua lubang pernapasan.",

                "Gorila adalah jenis primata yang terbesar. Makanan gorila terdiri dari sayur-sayuran, walaupun kadang juga makan serangga. Karena itu gorila dapat digolongkan sebagai binatang omnivora. Gorila berasal dari hutan tropis di Afrika. 97-98% DNA gorila identik dengan DNA manusia. Gorila adalah spesies kedua setelah simpanse yang terdekat dengan manusia. Ada dua spesies dalam genus gorila, yaitu gorila timur (eastern gorila) dan gorila barat (western gorila).\n\n" +
                        "Dibandingkan bentuk tubuh manusia, gorilla mempunyai tangan dan kaki yang panjang, dimana tangannya lebih panjang dari kaki. Dada gorila besar dan sebagian besar tubuhnya berbulu, kecuali jari-jemari, wajah, ketiak, telapak kaki dan telapak tangan. Kepala gorila besar, matanya kecil dan berwarna kecoklatan. Gorila tidak mempunyai ekor. Setiap ekor gorila mempunyai hidung yang unik, seperti manusia yang mempunyai sidik jari yang unik. Gigi gorila dewasa berjumlah 32. Panca indra gorila hampir serupa dengan manusia. Tubuh gorila jantan hampir dua kali besarnya dibandingkan gorila betina. Gorila kebanyakan makan tumbuh-tumbuhan. Setiap hari gorila butuh sekitar 25 kilogram makanan yang terdiri dari daun-daunan, bunga-bunga, biji-bijian, batang dan tangkai pohon, dan kuncup bunga. Kadang-kadang, gorila juga makan semut dan sejenis rayap. Karena mendapat cairan cukup dari makanannya, gorila sangat jarang minum.\n\n" +
                        "Gorila adalah binatang yang mempunyai tingkat kepandaian tinggi. Beberapa penyelidikan menunjukkan bahwa gorila bisa berkomunikasi dengan menggunakan bahasa sandi. Contohnya adalah gorila Koko dan Michael. Gorila adalah binatang yang pemalu dan sosial. Gorila biasanya hidup di dalam keluarga yang terdiri dar 6 sampai 7 gorila. Suatu keluarga gorila terdiri dari dominan gorila (sering juga disebut ‘silverback’ gorila, karena punggungnya yang berwarna keperakan), dua atau lebih gorila betina dan sisanya anak-anak gorila.\n\n" +
                        "Bila anak gorila dewasa, mereka biasanya pergi untuk mencari keluarga gorila yang lain. Setiap malam sebelum tidur, gorila membuat sarang tempat tidur yang terdiri dari daun-daunan, tangkai, ataupun rumput. Ilmuwan yang mempelajari gorila dengan gampang bisa menduga jumlah anggota keluarga gorila dengan menghitung jumlah sarang tempat tidurnya.\n\n" +
                        "Gorila bisa hidup sampai 50 tahun di kebun binatang. Di alam liar, gorila biasanya mencapai usai 35 tahun. Gorila bisa melakukan reproduksi saat berusia 10-12 tahun. Gorila betina mengandung sekitar 8 sampai 9.5 bulan dan bisa melahirkan tiga gorila selama hidupnya. Bayi gorila bisa merangkak di usia sekitar 2 bulan dan bisa berjalan di usia 9 bulan (jauh lebih awal dari bayi manusia)."
        };

        private static String[] moreDetailPet = {
                "Nama :\n Kucing\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nCarnivora\n\n" +
                        "Spesies :\nFelis catus",

                "Nama :\n Kuda\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nPerissodactyla\n\n" +
                        "Spesies :\nE. Caballus",

                "Nama :\n Singa\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nCarnivora\n\n" +
                        "Spesies :\nP. Leo",

                "Nama :\n Kambing\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nArtiodactyla\n\n" +
                        "Spesies :\nC. Aegagrus",

                "Nama :\n Kura-Kura\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nSauropsida\n\n" +
                        "Ordo :\nTestudinata\n\n" +
                        "Spesies :\n",

                "Nama :\n Harimau\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nCarnivora\n\n" +
                        "Spesies :\nP. Tigris",

                "Nama :\n Sapi\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nnArtiodactyla\n\n" +
                        "Spesies :\nB. Taurus",

                "Nama :\n Baruang Kutub\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nCarnivora\n\n" +
                        "Spesies :\nUrsus Maritinu",

                "Nama :\n Paus\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nCetacea\n\n" +
                        "Spesies :\n",

                "Nama :\n Gorila\n\n" +
                        "Kingdom :\nAnimalia\n\n" +
                        "Kelas :\nMammalia\n\n" +
                        "Ordo :\nPrimates\n\n" +
                        "Spesies :\n"
        };

        private static int[] petImages = {
                R.drawable.kucing,
                R.drawable.kuda,
                R.drawable.singa,
                R.drawable.kambing,
                R.drawable.kura,
                R.drawable.harimau,
                R.drawable.sapi,
                R.drawable.beruangkutub,
                R.drawable.paus,
                R.drawable.gorila
        };

        private static String[] ratingPet = {
                "9.9",
                "8.9",
                "9.9",
                "8.9",
                "7.9",
                "8.9",
                "8.9",
                "8.9",
                "8.9",
                "9.9"
        };

        public static ArrayList<Pet> getListData() {
            ArrayList<Pet> list = new ArrayList<>();
            for (int position = 0; position < petNames.length; position++) {
                Pet pet = new Pet();
                pet.setNamaHewan(petNames[position]);
                pet.setDetail(petDetails[position]);
                pet.setPhoto(petImages[position]);
                pet.setMoreDetailHewan(moreDetailPet[position]);
                pet.setRating(ratingPet[position]);
                list.add(pet);
            }
            return list;
        }
    }