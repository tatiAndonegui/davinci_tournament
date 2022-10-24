import java.util.Date;

class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;

    Match(){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
    }

    Match(String location, Date date, Team localTeam, Team visitantTeam){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
        this.setDate(date);
        this.setLocation(location);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }
    public String generateMarker(){
       // return this.getLocalGoalCounter() + "-" + this.getVisitantGoalCounter();
        return String.format(" %s (%d) -(%d)  %s ",
                this.getLocalTeam().getName(),
                this.getLocalGoalCounter(),
                this.getVisitantGoalCounter(),
                this.getVisitantTeam().getName()
        );
    }

    public void setLocation(String location){
        this.location = location;
        return;
    }
    public String getLocation(){
        return this.location;
    }

    public void setDate(Date date){
        this.date = date;
        return;
    }
    public Date getdate(){
        return this.date;
    }
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
    }
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
    }
    public Team getLocalTeam(){
        return this.localTeam;
    }
    public void incrementLocalCounter(){
        this.localGoalCounter++;
    }


    public int getLocalGoalCounter() {
        return localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }

    public int getVisitantGoalCounter() {
        return visitantGoalCounter;
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }

    public Team getVisitantTeam() {
        return visitantTeam;
    }
}

