package de.unibayreuth.se.teaching.list.data.persistence;

import de.unibayreuth.se.teaching.list.data.pattern.Observer;
import de.unibayreuth.se.teaching.list.data.pattern.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListClearedObserver implements Observer {

    private static final Logger logger = LoggerFactory.getLogger(DoublyLinkedListComponent.class);
    @Override
    public void update(Subject subject) {
        logger.info("List cleared!");
    }
}
