package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final DataSourceService dataSourceService;

    public FauxController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String showSQLDataSource(){
        return dataSourceService.getDataSource();
    }
}
