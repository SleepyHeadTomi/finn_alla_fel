package systementor.cidemo1;

public class PingPong {

    private int pingCounter = 0;
    public String ping(String input){
        if(input.equals("ping")){
            pingCounter += 1;
            return "pong";
        }
        else{
            return "You didn't say ping!";
        }
    }

    public int getPingCounter(){
        if (pingCounter > 0){
            return pingCounter;
        }
        else{
            return -1;
        }
    }
}
