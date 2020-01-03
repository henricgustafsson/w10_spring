package se.lexicon.henric.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
public class ScannerInputService implements UserInputService{


    private Scanner scanner;


    public ScannerInputService() {

    }

    /**
     * method for printing a string
     * @return String
     * */
    @Override
    public String getString() {
        return null;
    }

    /**
     * method for printing an int
     * @return Int
     * */
    @Override
    public int getInt() {
        return 0;
    }

    @Autowired
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
