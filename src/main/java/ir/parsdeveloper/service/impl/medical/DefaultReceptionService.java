package ir.parsdeveloper.service.impl.medical;

import ir.parsdeveloper.commons.exception.ServiceException;
import ir.parsdeveloper.commons.utils.CommonUtils;
import ir.parsdeveloper.model.entity.core.Patient;
import ir.parsdeveloper.model.entity.core.Person;
import ir.parsdeveloper.model.entity.core.User;
import ir.parsdeveloper.service.api.medical.ReceptionService;
import ir.parsdeveloper.service.impl.business.core.DefaultBasicService;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by bahram on 5/18/16.
 */
@Service
public class DefaultReceptionService extends DefaultPersonService<Patient> implements ReceptionService {


    @Override
    @Transactional(rollbackFor = Throwable.class, timeout = -1)
    public Patient addPatient(Patient patient, User currentUser) throws ServiceException {
        Person person = patient.getPerson();

             person = addPerson(person, currentUser);

        patient.setPerson(person);
        patient = saveEntity(patient, currentUser);
        return patient;

    }


}
