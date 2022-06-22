package impl;

import core.ICommand;
import models.Author;
import services.AuthorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HiberCommand extends Command implements ICommand {

    final static String NAME = "hb";
    final static String KEYS = "crud";

    @Override
    public String getName() {
        return NAME;

    }

    @Override
    String getLegalKeys() {
        return KEYS;
    }

    @Override
    void execute(Map<String, ArrayList<String>> parameterMap) {

        AuthorService authorService = new AuthorService();
        List<Author> authors = authorService.findAllAuthors();
        System.out.println(authors);



    }

}