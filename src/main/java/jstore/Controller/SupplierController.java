package jstore.Controller;
import java.util.*;

import jstore.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SupplierController {

    /*@RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }*/

    @RequestMapping(value = "/supplierlist", method= RequestMethod.GET)
    public ArrayList<Supplier> supplierList()
                            //(@RequestParam(value="name") String name,
                            //@RequestParam(value="email") String email,
                           // @RequestParam(value="username") String username,
                            //@RequestParam(value="password") String password
 //   )
    {
         ArrayList<Supplier> tempDatabaseSupplier = DatabaseSupplier.getSupplierDatabase();
         return tempDatabaseSupplier;
    }

    @RequestMapping(value = "/getsupplier/{id_supplier}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id) {
        Supplier supplier = DatabaseSupplier.getSupplier(id);
        return supplier;
    }

}