public class HockeyTeam
{
    private String city;
    private Integer year;
    private String name;
    private Integer cupsWon;
 
    public HockeyTeam(String city, Integer year, Integer cupsWon){
        this.city = city;
        this.year = year;
        this.cupsWon = cupsWon;
    }
 
    public void setCity(String newCity){
 
        city = newCity;
 
    }
 
    public void setTeam(String newName)
    {
        name = newName;
    }
 
    public void setYearJoined(Integer newYear)
    {
        year = newYear;
    }
 
    public void setYearJoined(String newYear)
    {
        Integer unboxYear = 0;
        unboxYear.getInteger(newYear);
    }
 
    public void setCupsWon(Integer cups){
        cupsWon = cups;
    }
 
    public String getCity()
    {
        return city;
    }
 
    public String getTeam()
    {
        return name;
    }
 
    public Integer getYearJoined()
    {
        return year;
    }
 
    public Integer getCupsWon(){
 
        return cupsWon;
 
    }
 
    public Integer getAgeOfTeamYears()
    {
        Integer ageOfTeamYears = 2012 - year;
        return ageOfTeamYears;
    }
 
    public String getCityAndTeam()
    {
        String cityAndTeam = "The " + city + " " + name;
        return cityAndTeam;
    }
 
}