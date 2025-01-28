package guru.springframework.spring6di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class DataSourceServiceQAImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "QA ===> SQL DATA SOURCE";
    }
}
