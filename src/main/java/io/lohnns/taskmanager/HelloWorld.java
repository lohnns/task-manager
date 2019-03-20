package io.lohnns.taskmanager;

import io.lohnns.taskmanager.model.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@RestController
public class HelloWorld {

    @Autowired
    EntityManager entityManager;

    @GetMapping("hello")
    public List<Task> hello() {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Task> q = cb.createQuery(Task.class);
        Root<Task> tasks = q.from(Task.class);

        entityManager.createQuery(q);

        return entityManager.createQuery(q).getResultList();
    }

}
