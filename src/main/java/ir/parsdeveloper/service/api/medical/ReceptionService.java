package ir.parsdeveloper.service.api.medical;

import ir.parsdeveloper.commons.exception.ServiceException;
import ir.parsdeveloper.model.entity.core.Patient;
import ir.parsdeveloper.model.entity.core.Person;
import ir.parsdeveloper.model.entity.core.User;

/**
 * Created by bahram on 5/18/16.
 */
public interface ReceptionService {
    Patient addPatient(Patient person, User currentUser) throws ServiceException;
}
