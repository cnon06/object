package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
          var ff1 = cartcurt()
        var ff2 = cartcurt()
        var ff3 = cartcurt()
         */

        println("Artır: ${cartcurt.arttir()}")
        println("Artır: ${cartcurt.arttir()}")
        println("Artır: ${cartcurt.arttir()}")
        println("Artır: ${cartcurt.arttir()}")
        println("Artır: ${cartcurt.arttir()}")

        
        var ccr=cartcurt

        println("Artır: ${ccr.arttir()}")
        println("Artır: ${ccr.arttir()}")
        println("Artır: ${ccr.arttir()}")
        println("Artır: ${ccr.arttir()}")
        println("Artır: ${ccr.arttir()}")
        
        
        var cc2=cartcurt2()
        println("Compannion object örneği: ${cc2.arttir()}")


       var cc3=cartcurt2()
        println("Compannion object örneği: ${cc3.arttir()}")
        var cc4=cartcurt2()
        println("Compannion object örneği: ${cc4.arttir()}")
        var cc5=cartcurt2()
        println("Compannion object örneği: ${cc5.arttir()}")


        

    }
}


/*
object java daki static gibi çalışır. class yerine object yazılır.  object te class gibi constructor olmaz
 */



object cartcurt
{
    var top=0


    fun arttir() : String
    {
        return "${top++}"
    }



}

class cartcurt2
{

/* eğer java daki gibi bütün bir class ı değil sadece bir değişkeni static
yapmak istersek değişkeni companion object {} kod bloğu içerisine yazmamız gerekli.
 */

  companion object
  {
      var top2=0
  }


    fun arttir() : String
    {
        return "${top2++}"
    }
    
}