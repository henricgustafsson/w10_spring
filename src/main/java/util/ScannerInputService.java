package util;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {
    Scanner Scanner;


    //TODO: P2-
    public String getString() {
        return "Return";
    }

    public int getInt() {
        return 0;
    }
}
