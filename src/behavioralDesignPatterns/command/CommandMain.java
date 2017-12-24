package behavioralDesignPatterns.command;

import behavioralDesignPatterns.command.impl.Light.Light;
import behavioralDesignPatterns.command.impl.Light.LightOffCommand;
import behavioralDesignPatterns.command.impl.Light.LightOnCommand;
import behavioralDesignPatterns.command.impl.ceilingFan.CeilingFan;
import behavioralDesignPatterns.command.impl.ceilingFan.CeilingFanHighCommand;
import behavioralDesignPatterns.command.impl.ceilingFan.CeilingFanMediumCommand;
import behavioralDesignPatterns.command.impl.ceilingFan.CeilingFanOffCommand;
import behavioralDesignPatterns.command.impl.ceilingFan.CeilingFanOnCommand;
import behavioralDesignPatterns.command.impl.garage.GarageDoor;
import behavioralDesignPatterns.command.impl.garage.GarageDoorCloseCommand;
import behavioralDesignPatterns.command.impl.garage.GarageDoorOpenCommand;
import behavioralDesignPatterns.command.impl.stereo.Stereo;
import behavioralDesignPatterns.command.impl.stereo.StereoOffCommand;
import behavioralDesignPatterns.command.impl.stereo.StereoOnWithCDCommand;

/**
 * CommandMain.
 * Date: 07/24/2017
 *
 * @author Mikalai Bezmen
 */
public class CommandMain {

    public static void main(String[] args) {
        // CASE 1
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room light");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(4, garageDoorOpenCommand, garageDoorCloseCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        // CASE 2
        RemoteControl remoteControlWithUndo = new RemoteControl();
        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControlWithUndo.undoButtonWasPushed();

        // CASE 3
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);

        remoteControlWithUndo.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(2);
        remoteControlWithUndo.undoButtonWasPushed();

    }
}
