package pmb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.TrainingCourse;
import dao.TrainingCourseDAO;

@ViewScoped
@ManagedBean (name = "mbTrainingCourse")
public class MBTrainingCourse {
			
		private List<TrainingCourse> trainingCourseTable;
		private TrainingCourseDAO trainingCourseDAO;
		private TrainingCourse selectedTrainingCourse;
		private List<Integer> trTable;

		@PostConstruct
		public void init() {
			trainingCourseDAO = new TrainingCourseDAO();
			setTrTable(trainingCourseDAO.selectById());
			setTrainingCourseTable(trainingCourseDAO.selectAll());
			selectedTrainingCourse = new TrainingCourse ();
		}
		
		public String updateTrainingCourse ( ) {
			trainingCourseDAO.update(selectedTrainingCourse);
			setTrainingCourseTable(trainingCourseDAO.selectAll());
			return null;
		}
		
		public String removeTrainingCourse ( ) {
			trainingCourseDAO.delete(selectedTrainingCourse.getCourseId());
			setTrainingCourseTable(trainingCourseDAO.selectAll());
			return null;
		}

		public List<TrainingCourse> getTrainingCourseTable() {
			return trainingCourseTable;
		}

		public void setTrainingCourseTable(List<TrainingCourse> trainingCourseTable) {
			this.trainingCourseTable = trainingCourseTable;
		}

		public TrainingCourse getSelectedTrainingCourse() {
			return selectedTrainingCourse;
		}

		public void setSelectedTrainingCourse(TrainingCourse selectedTrainingCourse) {
			this.selectedTrainingCourse = selectedTrainingCourse;
		}

		public List<Integer> getTrTable() {
			return trTable;
		}

		public void setTrTable(List<Integer> trTable) {
			this.trTable = trTable;
		}


		
}
