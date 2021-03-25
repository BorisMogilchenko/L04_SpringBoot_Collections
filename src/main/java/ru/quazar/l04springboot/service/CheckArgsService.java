package ru.quazar.l04springboot.service;

/**
 * Check of values incoming arguments
 *
 * return values incoming arguments
 *
 * @version $Id: MaximumClassService.java,v 1.0 2021-01-15 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

public class CheckArgsService {
    /**
     * Check count cycle iteration
     *
     * @param args Array of incoming arguments
     * @return Integer type of count cycle iteration
     * @throws NumberFormatException
     */
    public static int checkIteration(String[] args) throws NumberFormatException {
        if (args.length == 1) {
            return Integer.parseInt(args[0]);
        } else {
            throw new NumberFormatException("Incorrect argument!!!");
        }
    }
}
