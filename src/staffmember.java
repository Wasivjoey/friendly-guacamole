public class staffmember {

        private String fisrstName;
        private String LastName;
        private String deptNumber;
        private double Hoursworked; 
        
        public staffmember(String fisrstName, String lastName, String deptNumber, double hoursworked) {
			this.fisrstName = fisrstName;
			LastName = lastName;
			this.deptNumber = deptNumber;
			Hoursworked = hoursworked;
        }
		public String getFisrstName() {
			return fisrstName;
		}
		public void setFisrstName(String fisrstName) {
			this.fisrstName = fisrstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getDeptNumber() {
			return deptNumber;
		}
		public void setDeptNumber(String deptNumber) {
			this.deptNumber = deptNumber;
		}
		public double getHoursworked() {
			return Hoursworked;
		}
		public void setHoursworked(double hoursworked) {
			Hoursworked = hoursworked;
		}
		
		
		@Override
		public String toString() {
			return "staffmember [Hoursworked=" + Hoursworked + ", LastName=" + LastName + ", deptNumber=" + deptNumber
					+ ", fisrstName=" + fisrstName + "]";
		}
        
        
        
        }

