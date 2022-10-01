package org.example;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Service
public class LinuxConsoleService {


    public  String getCommandResult(String command) throws IOException {
        //Validation
        if(!CommandValidator.validate(command)) return "Not allowed command, try another";
        //Executing
        Process process = Runtime.getRuntime().exec(command);
        //Reading from inputStream
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        //Parse to string
        return reader.lines().collect(Collectors.joining(" "));
    }


}
