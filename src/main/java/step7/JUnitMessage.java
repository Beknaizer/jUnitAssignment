package step7;

public class JUnitMessage {

    private String message;

    public JUnitMessage(String message) {
        this.message = message;
    }

    public void printMessage(){

        System.out.println(message);
        int divide=1/0;

//        return message;
    }

    public String printHiMessage(){

        message="Hi!"+ message;

        System.out.println(message);

        return message;
    }

}

