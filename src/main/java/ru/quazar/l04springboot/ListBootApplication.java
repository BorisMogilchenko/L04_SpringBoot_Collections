package ru.quazar.l04springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Make generic class with parameter T. source file by path, find substring "Hello, guys!".
 * Write to the file "homework_02_output.txt" twenty symbols behind and
 * twenty symbols after finding substring.
 *
 * @version $Id: ListBootApplication.java,v 1.0 2019-08-15 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "")
//@EnableTransactionManagement
//@EntityScan(basePackages="")
public class ListBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ListBootApplication.class, args);
    }
}
