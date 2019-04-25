package jstore.Controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ItemController {

      /*@RequestMapping("/")
      public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
         return "Hello " + name;
    }*/

    @RequestMapping(value = "/itemlist", method= RequestMethod.GET)
    public ArrayList<Item> itemsList()/*(@RequestParam(value="name") String name,
                         @RequestParam(value="email") String email,
                         //@RequestParam(value="username") String username,
                         @RequestParam(value="password") String password
    )*/
    {
        ArrayList<Item> tempDatabaseItem = DatabaseItem.getItemDatabase();
        return tempDatabaseItem;
    }

    @RequestMapping(value = "/getitem/{id_item}", method = RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id) {
        Item item = DatabaseItem.getItemFromID(id);
        return item;
    }
}