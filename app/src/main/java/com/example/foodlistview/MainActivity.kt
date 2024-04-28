package com.example.foodlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val foodName = arrayOf<String>(
        "Ilish Curry (Hilsa Curry)",
        "Kacchi Biryani ( Raw meat Biryani)",
        "Bhuna Khichuri",
        "Shami Kebab",
        "Dal",
        "Bhorta",
        "Fuchka",
        "Chom-Chom"
    )

    val foodFullDescp = arrayOf<String>(
        "The majority of people in Bangladesh consume fish on a regular basis. Hilsa can be made in a number of different ways. Ilish Curry is the most common way to enjoy this delectable fish in Bengali cuisine. It’s a hearty meal of Hilsa fish cooked in a savory mustard sauce and served over white rice. The mustard is spiced with a variety of spices to give it a spicy flavor. When the mustard has thickened to the consistency of gravy, add the Hilsa fish and cook until tender. This is a tasty dish that is popular throughout the country.Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                "\n" +
                "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.",
        "Biriyani is an essential component of South Asian cuisine. If you’re familiar with this meal, you’ve probably heard of a few variations served in India and Pakistan as well. Unlike a typical Biriyani, the meat in this dish is marinated with spices and placed at bottom of the cooking utensil raw. Before the meat and rice are cooked together, the rice is rinsed and spiced before being put on top. Make sure to get yourself a plate if you visit Bangladesh.",
        "Bhuna Khichuri, a nutritious rice dish and beloved comfort meal in Bengali cuisine, is a traditional rainy-day mainstay. Khichuri also referred to as Khichdi in India, is a yellow dish made up of rice and lentils. The rice and lentils are well rinsed before being cooked with a few spices, turmeric, and ghee. It’s a flexible meal that goes well with omelets, onions and green chiles, fried eggplant, and pickles. It goes well with chicken or beef curries. If you visit Bangladesh during the monsoon season, you will almost certainly be offered this delicious delicacy. A significantly modified form of Bhuna Khichuri is served with veggies, eggs, and occasionally meat.",
        "Shami kebabs are extremely popular throughout Bangladesh and the Indian subcontinent. While there are many various types of kebabs available in Bangladesh, Shami kebabs are unquestionably the most popular. They are frequently offered on important occasions, demonstrating their popularity. Beef is the most usually utilized meat, however, lamb/mutton can also be used. The beef is shaped into a burger-like patty and seasoned with garlic, onion, turmeric, garam masala, and chilies. The patty is then shallow-fried till done before being served with onions, spicy sauce or chili sauce, tomato, onion, and salad.",
        "Dal is a staple in most people’s diets. Masoor and Moong Dal are the two most common types of cooked dal. Dal can be prepared in two ways. One is somewhat soupier, while the other is thicker, and closer to porridge. Chocchori Dal is the name given to the latter. The inclusion of coriander gives this meal a fresh flavor.",
        "Another meal is consumed on a regular basis in a Bangladeshi household. Smashed vegetables are combined with aromatic herbs and spices. On a daily basis, it serves as a side dish for Rice, Dal, and Bhaji.",
        "Fuchkas are little, spherical shells that have a sticky substance within. A single Fuchka may be eaten in one mouthful. The exterior shell is formed of a semolina and wheat blend. The filling is made up of boiling and mashed chickpeas, potatoes, and a spice and coriander mixture. As a garnish, grated carrots or cooked eggs are occasionally added, and Fuchka is frequently topped with a sweet-and-spicy tamarind sauce. No hangout is complete without a platter of this delectable Bangladeshi cuisine.",
        "Chom-Chom is similar to Rasogolla, but it is cooked for a longer period of time, resulting in a darker outer layer and a richer flavor. It is topped with dried fruits and served with sugar syrup. This sweet dish is widely available in sweet shops around the country and is frequently given as a gift at traditional celebrations like weddings."
    )

    val foodDes = arrayOf<String>(
        "Hilsa can be made in a number of different ways",
        "Biriyani is an essential component of South Asian cuisine.",
        "It goes well with chicken or beef curries",
        "There are many various types of kebabs available in Bangladesh",
        "Dal is a staple in most people’s diets.",
        "On a daily basis, it serves as a side dish for Rice, Dal, and Bhaji.",
        "Fuchkas are little, spherical shells that have a sticky substance within.",
        "Chom-Chom is similar to Rasogolla, but it is cooked for a longer period of time."

    )

    val images = arrayOf<Int>(
        R.drawable.ilish_curry,
        R.drawable.kacchi_biriyani,
        R.drawable.vuna_khichuri,
        R.drawable.shami_kebab,
        R.drawable.dal,
        R.drawable.bhorta,
        R.drawable.fuchka,
        R.drawable.chom_chom
    )
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            listView = findViewById(R.id.listView)

            val myListAdapter = MyListAdapter(this, foodName, foodDes, images)

            listView.adapter = myListAdapter

            listView.setOnItemClickListener { parent, view, position, id ->
                Toast.makeText(
                    this,
                    "Clicked At ${parent.getItemAtPosition(position)}",
                    android.widget.Toast.LENGTH_SHORT
                ).show()

                var intent= Intent(this, full_descp::class.java)
                intent.putExtra("name",foodName[position])
                intent.putExtra("image",images[position])
                intent.putExtra("descp",foodFullDescp[position])
                startActivity(intent)
            }


        }
    }
