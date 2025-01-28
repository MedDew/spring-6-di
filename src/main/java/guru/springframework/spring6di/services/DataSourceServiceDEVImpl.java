package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DataSourceServiceDEVImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "DEV ===> SQL DATA SOURCE";
    }
}
