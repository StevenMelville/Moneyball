public class Player {
    private String name;
    private String team;
    private double age;
    private double height;
    private double weight;
    private String college;
    private String country;
    private double draftYear;
    private double draftRound;
    private double draftNumber;
    private double gamesPlayed;
    private double averagePoints;
    private double averageRebounds;
    private double averageAssists;
    private double netRating;
    private double offensiveReboundPercentage;
    private double defensiveReboundPercentage;
    private double teamPlayUsagePercentage;
    private double shootingEfficiencyPercentage;
    private double assistPercent;
    private String nbaSeason;

    public Player(
             String name,
             String team,
             double age,
             double height,
             double weight,
             String college,
             String country,
             double draftYear,
             double draftRound,
             double draftNumber,
             double gamesPlayed,
             double averagePoints,
             double averageRebounds,
             double averageAssists,
             double netRating,
             double offensiveReboundPercentage,
             double defensiveReboundPercentage,
             double teamPlayUsagePercentage,
             double shootingEfficiencyPercentage,
             double assistPercent,
             String nbaSeason
    ){
         this.name = name;
         this.team = team;
         this.age = age;
         this.height = height;
         this.weight = weight;
         this.college = college;
         this.country = country;
         this.draftYear = draftYear;
         this.draftRound = draftRound;
         this.draftNumber = draftNumber;
         this.gamesPlayed = gamesPlayed;
         this.averagePoints = averagePoints;
         this.averageRebounds = averageRebounds;
         this.averageAssists = averageAssists;
         this.netRating = averageAssists;
         this.offensiveReboundPercentage = offensiveReboundPercentage;
         this.defensiveReboundPercentage = defensiveReboundPercentage;
         this.teamPlayUsagePercentage = teamPlayUsagePercentage;
         this.shootingEfficiencyPercentage = shootingEfficiencyPercentage;
         this.assistPercent = assistPercent;
         this.nbaSeason = nbaSeason;
    }

    public void print(){
        System.out.println(
                 name + ", " +
                 team + ", " +
                 age + ", " +
                 height + ", " +
                 weight + ", " +
                 college + ", " +
                 country + ", " +
                 draftYear + ", " +
                 draftRound + ", " +
                 draftNumber + ", " +
                 gamesPlayed + ", " +
                 averagePoints + ", " +
                 averageRebounds + ", " +
                 averageAssists + ", " +
                 netRating + ", " +
                 offensiveReboundPercentage + ", " +
                 defensiveReboundPercentage + ", " +
                 teamPlayUsagePercentage + ", " +
                 shootingEfficiencyPercentage + ", " +
                 assistPercent + ", " +
                 nbaSeason
        );
    }

    public double getDraftNumber() {
        return draftNumber;
    }

    public double getWeight() {
        return weight;
    }

    public double getAssistPercent() {
        return assistPercent;
    }

    public double getAverageAssists() {
        return averageAssists;
    }

    public double getAveragePoints() {
        return averagePoints;
    }

    public double getAverageRebounds() {
        return averageRebounds;
    }

    public double getDefensiveReboundPercentage() {
        return defensiveReboundPercentage;
    }

    public double getHeight() {
        return height;
    }

    public double getNetRating() {
        return netRating;
    }

    public double getOffensiveReboundPercentage() {
        return offensiveReboundPercentage;
    }

    public double getShootingEfficiencyPercentage() {
        return shootingEfficiencyPercentage;
    }

    public double getTeamPlayUsagePercentage() {
        return teamPlayUsagePercentage;
    }

    public double getAge() {
        return age;
    }

    public double getDraftRound() {
        return draftRound;
    }

    public double getDraftYear() {
        return draftYear;
    }

    public double getGamesPlayed() {
        return gamesPlayed;
    }

    public String getCollege() {
        return college;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getNbaSeason() {
        return nbaSeason;
    }

    public String getTeam() {
        return team;
    }


}
