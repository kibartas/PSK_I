package lt.vu.utils;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class ErrorComponent implements Serializable {
    @Getter @Setter
    private boolean showErrorMessage = false;

    public String showError() {
        if (showErrorMessage)  return "The information has recently changed. Please try again.";
        return "";
    }
}
