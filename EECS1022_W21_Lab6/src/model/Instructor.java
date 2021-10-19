package model;



	public class Instructor {

	private String name;
    private int ext;
    private String email;
   
   public Instructor(String firstname, int phone, String contact) {
	   
	   	name = firstname;
	   	ext = phone;
	   	email = contact;
   	}

   public String getName() {
	   	return name;
   		}

   	public int getPhoneExtension() {
	
	return ext;
   			}

     public String getEmail() {
	
		return email;
 		}

	public String getInformation() {
		String information = "Instructor "+ name +" has campus phone extension "+ext+" and contact email "+email;
  		return information;
			}


	public void setName(String firstname) {
	  	this.name = firstname;
  			}

  		public void setPhoneExtension(int phone) {
  		this.ext = phone;
  }

		public void setEmail(String contact) {
		this.email = contact;
      }
}
