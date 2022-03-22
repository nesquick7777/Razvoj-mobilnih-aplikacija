package hr.ferit.bojandrezgic.lv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView = findViewById<TextView>(R.id.textView2)
        val textView2 = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)

        findViewById<Button>(R.id.button).setOnClickListener {
            textView.text = editText.text.toString()
            textView2.text = editText2.text.toString()
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            if (!editText4.text.toString().isDigitsOnly() or !editText3.text.toString().isDigitsOnly() or editText4.text.toString().isEmpty() or editText3.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter numbers only",
                    Toast.LENGTH_LONG).show()
            }else{
                val index = editText4.text.toString().toFloat() / ((editText3.text.toString().toFloat() / 100) * (editText3.text.toString().toFloat() / 100))
                Toast.makeText(applicationContext,index.toString(),
                    Toast.LENGTH_LONG).show()
            }

        }
    }

}