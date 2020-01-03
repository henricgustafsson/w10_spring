package se.lexicon.henric.Spring.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
public class ScannerInputService implements UserInputService{


    Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
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
}
