package com.example.profilfakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = createFk()
        list_fakultas.layoutManager = LinearLayoutManager(this)
        list_fakultas.setHasFixedSize(true)
        list_fakultas.adapter = AdapterFk(data, { onItem: DataFk ->
            onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataFk) {
        val showDetailActivityIntent = Intent(this, DetailFk::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.fkImage)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.fkName)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.fkDesk)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.fkDet)
        showDetailActivityIntent.putExtra(Intent.EXTRA_HTML_TEXT, onItem.ctDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFk(): List<DataFk> {
        val fkList = ArrayList<DataFk>()
        fkList.add(
                DataFk(
                        R.drawable.foto_fik,
                        "FAKULTAS ILMU KOMPUTER",
                        "Fakultas Ilmu Komputer merupakan salah satu dari 8 fakultas di UPN \"Veteran\" Jawa Timur. yang terdiri dari program studi: \n",
                        "1. Progdi S1 Teknik Informatika\n" + "Teknik Informatika merupakan salah satu dari 2 program studi pada fakultas ilmu komputer.\n" + "Contact:\n" + "Email: informatika@upnjatim.ac.id\n" + "Website: https://if.upnjatim.ac.id/\n\n"
                                + "2. Progdi S1 Sistem Informasi\n" + "Sistem Informasi merupakan salah satu dari 2 program studi pada fakultas ilmu komputer.\n" + "Contact:\n" + "Email: piasifo@upnjatim.ac.id\n" + "Website: http://sisfo.upnjatim.ac.id/\n",
                        "Contact: \n" + "Email: fik@upnjatim.ac.id\n" + "Website: https://fik.upnjatim.ac.id/"
                )
        )

        fkList.add(
                DataFk(
                        R.drawable.foto_ft,
                        "FAKULTAS TEKNIK",
                        "Fakultas Teknik merupakan salah satu dari 8 fakultas di UPN \"Veteran\" Jawa Timur. yang terdiri dari program studi: \n",
                        "1. Progdi S1 Teknik Kimia\n" + "Teknik Kimia merupakan salah satu dari 5 program studi pada fakultas teknik.\n" + "Contact:\n" + "Website: http://tekkimia.upnjatim.ac.id/\n\n"
                                + "2. Progdi S1 Teknik Industri\n" + "Teknik Industri merupakan salah satu dari 5 program studi pada fakultas teknik.\n" + "Contact:\n" + "Website: http://tekindustri.upnjatim.ac.id/\n\n"
                                + "3. Progdi S1 Teknik Sipil\n" + "Teknik Sipil merupakan salah satu dari 5 program studi pada fakultas teknik.\n" + "Contact:\n" + "Website: http://teksipil.upnjatim.ac.id/\n\n"
                                + "4. Progdi S1 Teknik Lingkungan\n" + "Teknik Lingkungan merupakan salah satu dari 5 program studi pada fakultas teknik.\n" + "Contact:\n" + "Email: teknik.lingkungan@upnjatim.ac.id\n" + "Website: http://teklingk.upnjatim.ac.id/\n\n"
                                + "5. Progdi S1 Teknologi Pangan\n" + "Teknik Kimia merupakan salah satu dari 5 program studi pada fakultas teknik\n" + "Contact:\n" + "Website: http://tekpangan.upnjatim.ac.id/\n",
                        "Contact: \n" + "Email: ft@upnjatim.ac.id\n" + "Website: http://ft.upnjatim.ac.id/"
                )
        )

        fkList.add(
                DataFk(
                        R.drawable.foto_feb,
                        "FAKULTAS EKONOMI DAN BISNIS",
                        "Fakultas Ekonomi merupakan salah satu dari 8 fakultas di UPN \"Veteran\" Jawa Timur. yang terdiri dari program studi:\n",
                        "1. Progdi S1 Ekonomi Pembangunan\n" + "Ekonomi Pembangunan merupakan salah satu dari 3 program studi pada fakultas ekonomi dan bisnis.\n" + "Contact:\n" + "Email: helpdesk@upnjatim.ac.id\n" + "Website: http://ekbang.upnjatim.ac.id/\n\n"
                                + "2. Progdi S1 Akuntansi\n" + "Akutansi merupakan salah satu dari 3 program studi pada fakultas ekonomi dan bisnis.\n" + "Contact:\n" + "Email: akuntansi@upnvjatim.ac.id\n" + "Website: http://akuntansi.upnjatim.ac.id/\n\n"
                                + "3. Progdi S1 Manajemen\n" + "Manajemen merupakan salah satu dari 3 program studi pada fakultas ekonomi dan bisnis.\n" + "Contact:\n" + "Website: http://manajemen.upnjatim.ac.id/\n",
                        "Contact: \n" + "Email: feb@upnjatim.ac.id\n" + "Website: http://febis.upnjatim.ac.id/"
                )
        )

        fkList.add(
                DataFk(
                        R.drawable.foto_pt,
                        "FAKULTAS PERTANIAN",
                        "Fakultas Pertanian merupakan salah satu dari 8 fakultas di UPN \"Veteran\" Jawa Timur. yang terdiri dari program studi:\n",
                        "1. Progdi S1 Agroteknologi\n" + "Agroteknologi merupakan salah satu dari 2 program studi pada fakultas pertanian.\n" + "Contact:\n" + "Website: http://agrotek.upnjatim.ac.id/\n\n"
                                + "2. Progdi S1 Agribisnis\n" + "Agribisnis merupakan salah satu dari 2 program studi pada fakultas pertanian.\n" + "Contact:\n" + "Website: http://agribis.upnjatim.ac.id/\n",
                        "Contact: \n" + "Website: http://faperta.upnjatim.ac.id/"
                )
        )
        fkList.add(
                DataFk(
                        R.drawable.foto_profil,
                        "PROFIL SAYA",
                        "Nama: Muhammad Hilman\n"+
                                "TTL: Surabaya, 20 Oktober 2000\n" +
                                "Alamat: Perumahan Graha Penta Block AH-21, Bluru Kidul Sidoarjo\n" +
                                "Riwayat Pendidikan : \n" +
                                "1) SD Muhammadiyah 2, Jetis Sidoarjo\n" +
                                "2) SMP Muhammadiyah 1, Sidoarjo \n" +
                                "3) SMK Muhammadiyah 2, Taman Sepanjang Sidoarjo \n",
                        "Penghargaan : -\n",
                        "Contact: \n" + "No.HP: 082132129437\n" + "Email: VSX.KiryuuSento@gmail.com\n" + "Profil Github: https://github.com/VSX13"
                )
        )
        return fkList
    }

    fun fkgmail(view: View) { val launchGmail = packageManager.getLaunchIntentForPackage("com.google.android.gm")
        startActivity(launchGmail)}

    fun website(view: View) {val fkweb = Intent(this@MainActivity, webview::class.java)
        startActivity(fkweb)}
}