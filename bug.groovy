def myMethod() {
    def list = [1, 2, 3]
    list.each { it ->
        if (it == 2) {
            return // Incorrect return statement
        }
        println it
    }
}

myMethod()