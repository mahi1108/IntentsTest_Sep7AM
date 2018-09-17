package cubex.mahesh.intentstest_sep7am

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dial.setOnClickListener {

            var i = Intent( )
         /*   i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:"+et1.text.toString()) */
         /*   i.action = Intent.ACTION_VIEW
            i.data = Uri.parse(et1.text.toString()) */
            i.action = Intent.ACTION_GET_CONTENT
            i.type = "image/*"
            startActivity(i)

        } // dial button

        next.setOnClickListener {

                var i = Intent(this@MainActivity,
                                    WelcomeActivity::class.java)
                startActivity(i)

        } // next button
        whatsapp.setOnClickListener {

                    var i = packageManager.
                        getLaunchIntentForPackage("com.whatsapp")
                    if(i!=null){
                            startActivity(i)
                    }else{
                        var i = Intent( )
                        i.action = Intent.ACTION_VIEW
                        i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")
                        startActivity(i)
                    }

        } // whatsapp button
    } // onCreate( )
}
