package ru.quazar.l04springboot.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.quazar.l04springboot.model.CustomList;

import java.util.Collections;

/**
 * param myList Collection ArrayList
 *
 * return Collections.min Minimum value of element collection/
 *
 * @version $Id: MinimumClassService.java,v 1.0 2021-02-15 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@NoArgsConstructor
@Service
public class MinimumClassService<T extends Comparable<T>> {
    /**
     * Find element with minimum value
     *
     * @param myList Collection of integer elements
     * @return Element with minimum value
     */

//    @Autowired
    public Integer minElement(CustomList<Integer> myList) {
        return (Integer) Collections.min(myList.getList());
    }
}
