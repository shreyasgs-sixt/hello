package Command;

public class RemoteApplication {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        remote.setCommand(new LightOnCommand(light));
        remote.pressed();
        remote.setCommand(new LightOffCommand(light));
        remote.pressed();
    }
}
