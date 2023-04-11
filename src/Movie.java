public class Movie {
    String name;
    int launchYear;
    String runTimeInMinutes;
    public Movie(String name){
        this.name = name;
    }

    public Movie(MovieFromAPI movie){
        this.name = movie.title();
        this.launchYear = Integer.parseInt(movie.year());
        this.runTimeInMinutes = movie.runtime();
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public String getRunTimeInMinutes() {
        return runTimeInMinutes;
    }

    public void setRunTimeInMinutes(String runTimeInMinutes) {
        this.runTimeInMinutes = runTimeInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " +
                "Name = " + name +  "\n" +
                "Launch Year = " + launchYear + "\n" +
                "Run time = " + runTimeInMinutes;
    }
}
