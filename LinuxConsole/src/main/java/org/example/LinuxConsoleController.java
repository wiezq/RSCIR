package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class LinuxConsoleController {
    private LinuxConsoleService LinuxConsoleServic;

    @Autowired
    public LinuxConsoleController(LinuxConsoleService linuxConsoleService) {
        LinuxConsoleServic = linuxConsoleService;
    }


    @GetMapping("/{command}")
    public String getCommandResult(@PathVariable String command) throws IOException {
        return LinuxConsoleServic.getCommandResult(command);
    }
}
