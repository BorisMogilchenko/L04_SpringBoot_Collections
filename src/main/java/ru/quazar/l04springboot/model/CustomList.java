package ru.quazar.l04springboot.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Make generic class CustomList with parameter T. This parameter extends from class Number.
 * This class CustomList must have field ArrayList<T>.
 * This class CustomList must have method "add" taking parameter type T.
 *
 * @version $Id: CustomList.java,v 1.0 2021-02-15 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@Data
@Entity
public class CustomList<T extends Number> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany(targetEntity=CustomList.class)
//    @Size(min=1, message="You must choose at least 1 ingredient")

    private List<T> list = new ArrayList<>();

    public CustomList() {
    }

    public CustomList(List< T > list) {
        this.list = list;
    }

    public void addList(T t) {
        list.add(t);
    }

    @Override
    public String toString( ) {
        return "CustomList{" +
                "id=" + id +
                ", list=" + list +
                '}';
    }
}
