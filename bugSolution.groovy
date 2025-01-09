def myMethod() {
    def list = [1, 2, 3]
    boolean shouldStop = false
    list.each { it ->
        if (it == 2) {
            shouldStop = true
            return // Returning from the closure
        }
        println it
    }

    if(shouldStop) {
        println "Stopped iteration"
    }
}

myMethod() 