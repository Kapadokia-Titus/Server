package kapadokia.nyandoro.server.controller;

import kapadokia.nyandoro.server.model.Idea;
import kapadokia.nyandoro.server.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdeaController {

     @Autowired
     IdeaService ideaService;

    String message = "Thanks for visiting the app!  Our next hackathon is scheduled for the end of Q3.  We hope to see you there, be sure to add your ideas to the app!";
    @GetMapping("messages")
    public String getMessage(){
        return message;
    }

    @GetMapping("/ideas")
    public List<Idea> getIdeas(){
        return ideaService.getAllIdeas();
    }

    @GetMapping("/ideas/{id}")
    public Idea getIdeaById(@PathVariable long id){
        return ideaService.getAllIdeasById(id);
    }

    @PostMapping("/ideas")
    public Idea insertIdeas(@RequestBody Idea idea){
        return  ideaService.insertIdeas(idea);
    }
    @PutMapping("/ideas/{id}")
    public Idea updateIdea(@PathVariable long id, @RequestBody Idea idea){
        return  ideaService.updateIdea(idea,id);
    }
    @DeleteMapping("/ideas/{id}")
    public void deleteIdea(@PathVariable long id){
         ideaService.deleteIdea(id);
    }
}
