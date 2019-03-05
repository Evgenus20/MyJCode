public class InitialisationBlocksExamples {
    String exampleString;
    int exampleInt;

    //The first example of initialisation block
    {
        System.out.println("It is an out of initialisation block");
    }

    //The second example of initialisation block
    static{
        System.out.println("It is an out of static initialisation block");
    }

    //The third example of initialisation block
    {
        exampleInt = 1;
        exampleString = "exampleString";
    }

    //Constructor
    InitialisationBlocksExamples(String exampleString, int exampleInt){
        this.exampleString = exampleString;
        this.exampleInt = exampleInt;
        System.out.println(this.exampleString + " " + this.exampleInt);
    }


}
