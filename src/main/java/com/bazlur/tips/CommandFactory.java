package com.bazlur.tips;

import java.util.HashMap;

/**
 * @author Bazlur Rahman Rokon
 * @since 11/29/15.
 */
public class CommandFactory {
    private HashMap<String, Command> commands;

    public CommandFactory() {
        commands = new HashMap<>();
    }

    public void addCommand(String name, Command command) {
        commands.put(name, command);
    }

    public void executeCommand(String name) {
        if (this.commands.containsKey(name)) {
            this.commands.get(name).apply();
        }
    }

    public void listCommands() {
        System.out.println("Commands enabled :");
        this.commands.keySet().stream().forEach(System.out::println);
    }

    /* Factory pattern */
    public static CommandFactory init() {
        CommandFactory cf = new CommandFactory();
        // commands are added here using lambda. It also possible to dynamically add commands without editing code.
        cf.addCommand("Light on", () -> System.out.println("Light turned on"));
        cf.addCommand("Light off", () -> System.out.println("Light turned off"));

        return cf;
    }

    public static void main(String[] args) {
        CommandFactory commandFactory = CommandFactory.init();
        commandFactory.executeCommand("Light on");
        commandFactory.listCommands();
    }

}
