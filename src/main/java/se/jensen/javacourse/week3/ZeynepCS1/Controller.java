package se.jensen.javacourse.week3.ZeynepCS1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    private authorclass[] author1 = new authorclass[]{ new authorclass(38, "zeynep", "can sakci")
};

    @GetMapping("/author")
    public authorclass[] getAuthor1() {
        return author1;
    }


}
