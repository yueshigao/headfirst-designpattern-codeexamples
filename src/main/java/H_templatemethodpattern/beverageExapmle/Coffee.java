package H_templatemethodpattern.beverageExapmle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Coffee extends Beverage {

    private final Logger logger = LogManager.getLogger(Coffee.class);

    @Override
    protected void brew() {
        System.out.println("Dripping water through filter");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding sugar and milk!");
    }

    @Override
    boolean clientWantToAddCondiment() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) return true;
        return false;
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like to add a condiment? (y/n)");

        /**Syntax like:
         * new BufferedReader(new FileReader(filePath))**/
        InputStream in = System.in;
        BufferedReader inReader = new BufferedReader(new InputStreamReader(in));

        /**try with resource: for the file need to be closed - auto closable
         * not need here**/
        try {
            answer = inReader.readLine();
        } catch (IOException e) {
            logger.error("IO error while trying to read your answer" + e);
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
