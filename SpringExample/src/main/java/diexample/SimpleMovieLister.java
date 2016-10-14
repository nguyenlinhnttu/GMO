package diexample;

public class SimpleMovieLister {
    private MovieFinder movieFinder;
    
    /*Using DI Contructor (Update Beans)
     * 
//    public SimpleMovieLister(MovieFinder movieFinder) {
//        this.movieFinder = movieFinder;
//    }
    */
    public void getMovie() {
        movieFinder.checkMovie();
    }
    
    //DI SetterBased 
    public MovieFinder getMovieFinder() {
        System.out.println("Inside set MovieFinder");
        return movieFinder;
    }
    
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}
