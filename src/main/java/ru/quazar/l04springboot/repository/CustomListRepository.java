package ru.quazar.l04springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.quazar.l04springboot.model.CustomList;

/**
 * Interface for making repository of CustomList with parameter T. This parameter extends from class Number.
 *
 * @version $Id: CustomListRepository.java,v 1.0 2021-02-15 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@Repository
public interface CustomListRepository extends JpaRepository<CustomList<Integer>, Long> {
}
