package net.cho.api.designPatterns;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class CommandTest {

    class Aircon{
        void turnOn(){
            System.out.println("에어콘 켜기");
        }
        void turnOff(){
            System.out.println("에어콘 끄기");
        }void increaseTemp(){
            System.out.println("온도 올리기");
        }void decreaseTemp(){
            System.out.println("온도 내리기");
        }

    }
    interface Command{void execute();}
    class AirconRemoteControl{
        Command command;
        void setCommand(Command command){this.command = command;}
        void buttonPressed(){ command.execute();}
    }
    @Test
    @DisplayName("Command 테스트")
    void main(){
        Aircon aircon = new Aircon();
        AirconRemoteControl Control = new AirconRemoteControl();
        Control.setCommand(()->aircon.turnOn());
        Control.buttonPressed(); // subscribe의 원리를 설명
        //실행하는 것은 command.execute() 이부분에 있고 이는 consumer()이라고 보면 된다.

    }

}
