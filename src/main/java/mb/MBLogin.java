package mb;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import bean.User_TBL;
import dao.User_TBLDAO;

@ManagedBean (name = "Login")
public class MBLogin {

	private User_TBL user = new User_TBL();
	private User_TBLDAO userDAO = null;
	 
	@PostConstruct
	public void init () {
		setUserDAO(new User_TBLDAO());
		userDAO = new User_TBLDAO ();
	}

	public String signIn() {
		
		user = userDAO.selectByEmail(user.getEmailAddress(), user.getPassword());
		System.out.println(user);
		
		if (user != null) {
			
			return ("/secured/welcome.xhtml");
			
		} else {
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Invalid Login",
					"Username or Password not Correct"));
			return null;

		}
	}
	
	public User_TBL getUser() {
		return user;
	}

	public void setUser(User_TBL user) {
		this.user = user;
	}

	public User_TBLDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(User_TBLDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
