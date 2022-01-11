package tr.com.kafein._02_lambda;

public class LambdaTest05 {

    String firstname;

    public static void main(String[] args) {
        LambdaTest05 lambda = new LambdaTest05();

        String name = "Edi";
        //name = "compileError";
        LambdaMessage lambdaLocalVariableMessage = (String str) ->
                System.out.println(name + " " + str);

        lambdaLocalVariableMessage.printMessage("Büdü");

        lambda.firstname = "John";
        lambda.firstname = "Alice";
        lambda.firstname="Foo";

        LambdaMessage lambdaObjectVariableMessage = (String str) ->
                System.out.println(lambda.firstname + " " + str);

        lambdaObjectVariableMessage.printMessage("Büdü");
    }
}

@FunctionalInterface
interface LambdaMessage{
    void printMessage(String message);
}
