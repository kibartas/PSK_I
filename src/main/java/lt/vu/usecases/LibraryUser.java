package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.User;
import lt.vu.persistence.UsersDAO;
import lt.vu.utils.ErrorComponent;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

@Model
public class LibraryUser implements Serializable {

    @Inject
    private UsersDAO usersDAO;

    @Getter
    @Setter
    private User userToUpdate;

    @Inject
    private ErrorComponent errorComponent;

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer userId = Integer.parseInt(requestParameters.get("userId"));
        this.userToUpdate = usersDAO.findOne(userId);
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void updateUserName() {
        usersDAO.update(userToUpdate);
        try {
            Thread.sleep(5000);
            usersDAO.flush();
            errorComponent.setShowErrorMessage(false);
        } catch (OptimisticLockException e) {
            errorComponent.setShowErrorMessage(true);
        } catch (Exception e) {}
    }
}
