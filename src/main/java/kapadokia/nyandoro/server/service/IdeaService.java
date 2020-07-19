package kapadokia.nyandoro.server.service;


import kapadokia.nyandoro.server.model.Idea;
import kapadokia.nyandoro.server.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdeaService {

    @Autowired
    private IdeaRepository repository;

    public List<Idea> getAllIdeas() {
        List<Idea> packages = new ArrayList<>();
        repository.findAll().forEach(packages::add);

        return packages;
    }

    public Idea getAllIdeasById(long id) {
        return repository.findById(id).get();
    }

    public Idea insertIdeas(Idea idea) {
        return repository.save(idea);
    }

    public Idea updateIdea(Idea idea, long id) {
        return repository.save(idea);
    }

    public void deleteIdea(long id) {
        repository.deleteById(id);
    }
}
