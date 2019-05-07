package ravivarmathirukamu.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var addNumber:String? = ""
    var numberOne:Float? = null
    var numberTwo:Float? = null
    var result:String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationFunction(view:View) {

        var editText: EditText = findViewById(R.id.show_number)

        
        when(view.id) {

            R.id.button_one -> {
                addNumber += "1"
                editText.setText(addNumber)
            }

            R.id.reset_button -> {
                addNumber = ""
                editText.setText("")
            }

            R.id.add_button -> {
               
            }

        }
    }
}
