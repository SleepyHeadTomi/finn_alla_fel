package systementor.cidemo1;

public class PingPong {

    private int pingCounter = 0;
    public String ping(String input){
        if(input.equals("ping")){
            pingCounter += 5;
            return "pong";
        }
        else{
            return "pong";
        }
    }

    public int getPingCounter(){
        if (pingCounter < 0){
            return pingCounter;
        }
        else{
            return 100;
        }
    }
}
