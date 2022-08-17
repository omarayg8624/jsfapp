package pmb;

import javax.faces.bean.ManagedBean;

import bean.TrainingCourse;
import dao.TrainingCourseDAO;
import util.Massages;

@ManagedBean (name = "mbAddTrainingCourse")
public class MBAddTrainingCourse {
	
	private TrainingCourse trainingCourse;

	public String save() {
		TrainingCourseDAO trainingCourseDAO = new TrainingCourseDAO();
		int row = trainingCourseDAO.insert(trainingCourse);
		if (row > 0) {
			Massages.addMessageByKey("INFO", "", "msg_tsave");
		} else {
			Massages.addMessageByKey("INFO", "", "msg_ntsave");
		}		trainingCourse = new TrainingCourse();
		return null;
	}

	public TrainingCourse getTrainingCourse() {

		if (trainingCourse == null) {
			trainingCourse = new TrainingCourse();
		}

		return trainingCourse;
	}

	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}


}
