fun main(){
    print("If Statements \n")
    print("____________If else___________ \n")
    
    val number = 8
    if(number >= 10){
        print("You Pass")
    }
    else{
        print("You Fail \n\n")
    }
    print("____________if else if_____________ \n\n")
    val marks = 75
    //check marks between 0 and 100 using logical AND (&&) operator
    if(marks <= 100 && marks >= 0){
        //now check marks
        //if marks greater than or equal 75, print A
        if(marks >= 75){
            print("A \n\n")
        //if marks greater than or equal 65, print B
        }else if(marks >= 65){
            print("B \n\n")
        //if marks greater than or equal 50, print C
        }else if(marks >= 50){
            print("C \n\n")
        //if marks less than 50, print Fail
        }else if(marks < 50){
            print("Fail \n\n")
        }

    //if marks not between 0 and 100,
    //it means marks greater then 100 (101,102,103...) or less than 0 (-1,-2,-3......)
    }else{
        print("Invail Marks \n\n")
    }

    print("____________nested if_____________ \n\n")

    val number2 = 10
    if(number2 <= 10){
        if(number2 >= 5){
            print("Between 5 and 10")
        }else{
            print("less than 5")
        }
    }else{
        print("Invaled")
    }

}