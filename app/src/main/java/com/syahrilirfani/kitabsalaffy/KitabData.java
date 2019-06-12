package com.syahrilirfani.kitabsalaffy;

import java.util.ArrayList;

public class KitabData {
    public static String[][] data = new String[][]{

            {"Kitab Al-Ajurumiyah", "Nahwu", "https://ecs7.tokopedia.net/img/cache/700/product-1/2017/4/2/7879344/7879344_64bc4889-4f43-4a6a-b5e3-721a972dd8cd_722_1024.jpg",
                    "Salah satu kitab dasar yang mempelajari ilmu nahwu. Setiap santri yang menginginkan belajar kitab kuning wajib belajar dan memahami kitab ini terlebih dahulu. Karena tidak mungkin bisa membaca kitab kuning tanpa belajar kitab Jurumiyah, ppedoman dasar dalam ilmu nahwu. ",
                    "Pondok Pesantren Al Amien Prenduan Sumenep"},
            {"Kitab  Amtsilah At-Tashrifiyah", "Shorof", "https://ecs7.tokopedia.net/img/cache/200-square/product-1/2019/4/23/5597150/5597150_5c8bf7a1-019a-468c-a3fa-283a336ec142_780_1040.jpeg",
                    "Jika nahwu adalah bapaknya, maka shorof ibunya. Begitulah hubungan kesinambungan antara dua jenis ilmu itu. Keduanya tak bisa dipisahkan satu sama yang lainnya dalam mempelajari kitab kuning. ",
                    "Pondok Pesantren Al Falah Kediri"},
            {"Kitab Mushtholah Al-hadits ", "Hadis", "https://ecs7.tokopedia.net/img/cache/200-square/product-1/2018/12/29/63274/63274_672361d3-72ef-4e60-b46e-a42467576e2f_400_400.jpg"
                    , "Kitab dasar selanjutnya adalah Kitab Mushtholah Al-Hadits yang mempelajari ilmu mengenai seluk beluk ilmu hadits. Mulai dari macam-macam hadits, kriteria hadits, syarat orang yang berhak meriwayatkan hadits dan lain-lain dapat dijadikan bukti kevalidan suatu matan hadits. ",
                    "Pondok Pesantren Al Fatah Temboro Magetan"},
            {"Kitab Arba’in Nawawi", "Hadis", "https://ecs7.tokopedia.net/img/cache/200-square/product-1/2019/2/28/646796/646796_6e13fdb2-b4e3-4b97-8fa6-07c43e47b0e5_800_800.png"
                    ,"Pada kitab yang telah disebutkan di atas merupakan kitab dasar dalam menspesifikasikan kedudukan hadits. Berbeda lagi dengan kitab matan hadits yang harus dipelajari di dunia pesantren, yaitu Kitab Arba’in Nawawi karangan Abu Zakariya Yahya bin Syaraf bin Murri Al Nizami An-Nawawi yang berisi 42 matan hadits.",
                    "Pondok Pesantren Al Khairaat Malang "},
            {"Kitab At-Taqrib", "Fiqih", "https://ecs7.tokopedia.net/img/cache/200-square/product-1/2019/3/18/161147/161147_f893f63c-a1d1-40c9-8664-ddd0d3070f14_964_964.jpg"
                    , "Fiqh merupakan hasil turunan dari Al-Quran dan Al-Hadist setelah melalui berbagai paduan dalam ushul fiqh. Kitab Taqrib yang dikarang oleh Al-Qodhi Abu Syuja’ Ahmad bin Husain bin Ahmad Al-Ashfahaniy adalah kitab fiqh yang menjadi rujukan dasar dalam mempelajari ilmu fiqh. ",
                    "Pondok Pesantren An Nuqayah Guluk-guluk Sumenep"},
            {"Kitab Aqidatul Awam", "Akhlaq", "https://ecs7.tokopedia.net/img/cache/200-square/product-1/2018/5/30/2401856/2401856_69987202-2bd7-4d2e-83a7-af6598021432_810_810.jpg"
                    , "Hal mendasar dalam agama adalah kepercayaan atau aqidah. Apabila aqidah sudah mantap, kuat dan benar maka dalam menjalani syariat agama tidak akan menyeleweng dari aturan syariat yang telah ditentukan. Kitab dasar aqidah yang dipelajari dipesantren adalah kitab Aqidatul Awam karangan Syaikh Ahmad Marzuqi Al-Maliki berisi 57 bait nadzom.",
                    "Pondok Pesantren As Salafi Al Fitrah Surabaya"},
            {"Kitab Ta’limul Muta’alim", "Akhlaq", "https://ecs7.tokopedia.net/img/cache/200-square/product-1/2017/11/30/0/0_0a45ce43-b4c1-4210-9e88-88eefcd3b8f6_384_512.jpg"
                    , "Sepandai apapun manusia serta sebanyak apapun ilmu yang dikuasainya, semuanya tidak akan bisa menghasilkan sarinya ilmu tanpa adanya akhlaq. Hal dasar bagi para pencari ilmu agar ilmunya manfaat dan barokah adalah harus mengutamakan akhlaq. Kitab dasar yang menerangkan mengenai akhlaq di dunia pesantren adalah kitab Ta’limul-Muta’alim karangan Syaikh Burhanuddin Az-Zarnuji",
                    "Pondok Pesantren Bata-bata Pamekasan"},
    };

    public static ArrayList<Kitab> getListData(){
        Kitab kitab = null;
        ArrayList<Kitab> list = new ArrayList<>();
        for (String[] aData : data) {
            kitab = new Kitab();
            kitab.setKitab(aData[0]);
            kitab.setKategori(aData[1]);
            kitab.setGambar(aData[2]);
            kitab.setDeskripsi(aData[3]);
            kitab.setPesantren(aData[4]);

            list.add(kitab);
        }

        return list;
    }
}
