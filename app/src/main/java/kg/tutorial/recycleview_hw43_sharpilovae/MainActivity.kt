package kg.tutorial.recycleview_hw43_sharpilovae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kg.tutorial.recycleview_hw43_sharpilovae.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        myAdapter = MyAdapter(mutableListOf())
        bindingClass.myRecyclerView.adapter = myAdapter
        bindingClass.myRecyclerView.layoutManager = LinearLayoutManager(this)

        bindingClass.btnAdd.setOnClickListener{
            val title = bindingClass.edItem.text.toString()
            if (title.isNotEmpty()){
                val list = List1(title)
                myAdapter.addItem(list)
                bindingClass.edItem.text.clear()
            }
        }
    }
}
