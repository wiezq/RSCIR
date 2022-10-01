package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommandValidator {
    private static final Set<String> COMMANDS = new HashSet<>(List.of(
            "whoami",
            "id",
            "ps",
            "ls"));

    public static boolean validate(String command)
    {
        return COMMANDS.contains(command);
    }
}
