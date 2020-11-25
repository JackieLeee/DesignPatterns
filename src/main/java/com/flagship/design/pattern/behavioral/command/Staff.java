package com.flagship.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:08
 * @Description
 */
public class Staff {
    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
