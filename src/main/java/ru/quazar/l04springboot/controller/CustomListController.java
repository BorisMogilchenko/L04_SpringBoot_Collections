package ru.quazar.l04springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.quazar.l04springboot.model.CustomList;
import ru.quazar.l04springboot.repository.CustomListRepository;
import ru.quazar.l04springboot.service.CustomListService;
import ru.quazar.l04springboot.service.MaximumClassService;
import ru.quazar.l04springboot.service.MinimumClassService;

import java.util.Arrays;
import java.util.List;

/**
 * Make generic class with parameter T. source file by path, find substring "Hello, guys!".
 * Write to the file "homework_02_output.txt" twenty symbols behind and
 * twenty symbols after finding substring.
 *
 * @version $Id: CustomListController.java,v 1.0 2021-02-15 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@RestController
public class CustomListController {

/*    @Autowired
    private CustomListService customListService;
    private CheckArgsService checkArgsService;
    private MaximumClassService maximumClassService;
    private MinimumClassService minimumClassService;
*/

/*    @RequestMapping(value="/data", method = RequestMethod.GET)
    public @ResponseBody
    item getitem(@RequestParam("itemid") Optional<Integer> itemid) {
        if( itemid.isPresent()){
            item i = itemDao.findOne(itemid.get());
            return i;
        } else ....
    }*/

    @Autowired
    private CustomListRepository repository;

    @GetMapping("/list")
        String getList() {
//        CustomList< Integer > minElement = CustomListService.getList(repository.count()).get(0);
         List< CustomList<Integer> > requestElement = CustomListService.getList(repository.count());

        MinimumClassService< Integer > minClass = new MinimumClassService<>();
        MaximumClassService< Integer > maxClass = new MaximumClassService<>();

        List< Integer > listResponse = Arrays.asList((int) minClass.minElement((CustomList<Integer>) requestElement), (int) maxClass.maxElement((CustomList< Integer >) requestElement));
//        CustomListService.saveList(listResponse);

        return String.format("listResponse[minElement], listResponse[maxElement]",
                listResponse.get(0), listResponse.get(1));
    }

/*
    @PostMapping("/list")
    List<Integer> createList(@RequestBody CustomList<Integer> list) {
        return CustomListService.saveList(list);
    }
*/

    @PutMapping("list/{id}")
    CustomList<Integer> updateList(@RequestBody CustomList<Integer> list, @PathVariable Long id) {
        return (CustomList<Integer>) CustomListService.updateList(id, list);
    }

    @GetMapping("/list/{id}")
    CustomList<Integer> getList(@PathVariable Integer id) {
        return (CustomList< Integer >) CustomListService.getList(id);
    }

    @DeleteMapping("/list")
    void deleteAllLists() {
        CustomListService.deleteAllLists();
    }

    @DeleteMapping("/list/{id}")
    void deleteList(@PathVariable Long id) {
        CustomListService.deleteList(id);
    }
}
