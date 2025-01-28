package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class DataSourceServiceUATImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "UAT ===> SQL DATA SOURCE";
    }
}
