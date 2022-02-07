object Main extends App {
        val range1 = 1 to 10
        println(s"① 1 to 10 →\n\t $range1")
        
        val range2 = 1 until 10
        println(s"② 1 until 10 →\n\t $range2")
        
        val range3 = 1 until 10 by 3
        println(s"③ 1 until 10 by 3 →\n\t $range3")
        
        println(s"④ range1.toList →\n\t ${range1.toList}")
        
        val moreThan4 = range1.filter(_ > 4)  
        println(s"⑤ range1.filter(_ > 4) →\n\t $moreThan4")
        
        val doubleIt = range1.map(e => e*2)  
        println(s"⑥ range1.map(_ * 2) →\n\t $doubleIt")
}