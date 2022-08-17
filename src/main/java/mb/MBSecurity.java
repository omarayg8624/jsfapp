package mb;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import util.Massages;

@ManagedBean(name = "mbSec")
@SessionScoped
public class MBSecurity {

	private String userName;
	private String passWord;
	private boolean logon;

	private String lang = "en";
	private String dir = "ltr";
	private Locale locale = Locale.ENGLISH;
	private static Map<String, Object> countries;

	static {
		countries = new LinkedHashMap<String, Object>();
		countries.put("English", Locale.ENGLISH);
		countries.put("ÚÑÈí", new Locale("ar"));
	}

	public void localeChanged(ValueChangeEvent e) {
		lang = e.getNewValue().toString();

		for (Map.Entry<String, Object> entry : countries.entrySet()) {
			if (entry.getValue().toString().equals(lang)) {
				locale = lang.equals("en") ? Locale.ENGLISH : new Locale(lang);
				FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale) entry.getValue());
				dir = lang.equals("ar") ? "rtl" : "ltr";
			}
		}
	}

	public String checkUser() {
		if (userName.equalsIgnoreCase("java") && passWord.equals("java@2022")) {
			logon = true;
			return "/home.xhtml";

		} else {
			logon = false;
			Massages.addMessage("Error", " ", "Please Check Username or Password");
			return null;
		}
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/home.xhtml?faces-redirect=true";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public boolean isLogon() {
		return logon;
	}

	public void setLogon(boolean logon) {
		this.logon = logon;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Map<String, Object> getCountries() {
		return countries;
	}

	

}
