package com.example.profilfakultasupn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detaill_fk.*

class DetailFk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detaill_fk)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var dtLogo = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var dtNama =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var dtDetail =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var dtTambahan =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            var dtContact =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_HTML_TEXT)
            logofk.setImageResource(dtLogo)
            fknama.text = dtNama
            fkdetail.text = dtDetail
            tbhdetail.text = dtTambahan
            fkcontact.text = dtContact
        }
    }
}