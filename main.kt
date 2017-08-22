import java.io.*
import java.util.*

/////////////////////////////////////////////////////////////
//  `                    Rules Input                     ////
/////////////////////////////////////////////////////////////
//input =   size                                           // <=asal tidak bertemu spasi maka bisa di input dan tidak pakai huruf
//          array[0] array[1].... array[size]              // <=asal tidak bertemu spasi maka bisa di input dan tidak pakai huruf
/////////////////////////////////////////////////////////////


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)       //input seperti java (karna biasanya pakai java)
    val size = sc.nextInt()             //besar Arraynya
    val array = IntArray(size)          //array yang belum di sorting
    for (i in 0..size-1) {
        array[i] = sc.nextInt()         //input array
    }
                                        //using bubble sort (reason : butuh cepat dalam coding, agar dapat seat)
    for(i in 0..size-2)
    {
        for(x in 0..size-i-2)
        {
            if(array[x]>array[x+1])
            {
                val temp = array[x]     //temp untuk sementara biar nilainya gak langsung ke copy / ketimpa
                array[x] = array[x+1]
                array[x+1] = temp
            }
        }
    }
    for(i in 0..size-1)
        println(array[i])
}