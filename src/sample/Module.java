package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Module {
    public Module createFile(String nameFile, String pathFile, String rash, String sureName, String name, String patronymic) throws IOException {
        File newFile = new File(pathFile + nameFile + rash);
        FileWriter fw = new FileWriter(newFile);
        return null;
    }
}
