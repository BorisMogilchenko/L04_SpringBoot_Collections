package ru.quazar.l04springboot.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import ru.quazar.l04springboot.model.CustomList;

import java.util.Collections;

/**
 * param myList Collection ArrayList
 *
 * return Collections.max Maximum value of element collection/
 *
 * @version $Id: MaximumClassService.java,v 1.0 2021-02-15 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@NoArgsConstructor
@Service
/**
 * Find element with maximum value
 *
 * @param myList Collection of integer elements
 * @return Element with maximum value
 */
public class MaximumClassService<T extends Comparable<T>> {

//    @Autowired
    public Integer maxElement(CustomList<Integer> myList) {
        return (Integer) Collections.max(myList.getList());
    }
}
