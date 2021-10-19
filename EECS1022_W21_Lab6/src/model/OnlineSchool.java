package model;

public class OnlineSchool {
			
		
	    private int list;
	    private int regcount;
	    private Participant[] participSize;

	    
	   public OnlineSchool( ) {
	    	
	    	
	       this.list = 0;
	       this.regcount = 0;
	       this.participSize = new Participant[0];
   
    }
    public Participant[] getParticipants(String number1) {
        int a = 0;
        
      Participant[] participant;
      Participant[] report = new Participant[0];
        
        
      for(int i=0; i< this.participSize.length;i++) {
        for (int n=0; n < this.participSize[i].getRegistrations().length; n++) {
        	
        if(this.participSize[i].getRegistrations()[n].getTitle() == number1) {
            
        	a += 1;
        	participant = report; 
                    
                  report = new Participant[a];
                 for(int x=0; x<participant.length; x++) {
              	report[x] = participant[x];
                      }
             report[a-1] = this.participSize[i];
               break;

                }
            }
        }
        return report;
    }
    public void addParticipant(Participant number2) {
    	
        this.regcount += 1;
        Participant[] list = this.participSize;

        if(this.regcount <=100) {
            this.participSize = new Participant[this.regcount];
        }
        
        for(int i=0; i<list.length; i++) {
            this.participSize[i] = list[i];
            }
        
        if(this.regcount <= 100) {
        	
            this.participSize[this.list] = number2;
            this.list+=1;
        }

    }

}