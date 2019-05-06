package ravivarmathirukamu.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationFunction(view:View) {
        
        when(view.id) {
            R.id.button_one -> Toast.makeText(this,"Button 1 works",Toast.LENGTH_SHORT).show()
        }
    }
}
