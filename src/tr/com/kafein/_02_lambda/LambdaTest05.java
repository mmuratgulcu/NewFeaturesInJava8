package tr.com.kafein._02_lambda;

public class LambdaTest05 {
    String firstname;
    public static void main(String[] args) {

        localeVariable();
        instanceVariable();
    }

    public static void localeVariable(){
        String name = "Edi";
        //name = "compileError";
        LambdaMessage lambdaLocalVariableMessage = (String str) -> System.out.println(name + " " + str);
        lambdaLocalVariableMessage.printMessage("Büdü");
    }

    public static void instanceVariable(){
        LambdaTest05 lambda = new LambdaTest05();
        lambda.firstname = "John";
        lambda.firstname = "Alice";
        lambda.firstname="Murat";

        LambdaMessage lambdaObjectVariableMessage = (String str) ->
                System.out.println(lambda.firstname + " " + str);

        lambdaObjectVariableMessage.printMessage("Büdü");
    }
}

@FunctionalInterface
interface LambdaMessage{
    void printMessage(String message);
}
