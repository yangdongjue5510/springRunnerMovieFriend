package moviebuddy.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JaxbMovieReaderTest {

    @Test
    void NotEmpty_LoadedMovies(){
        JaxbMovieReader jaxbMovieReader = new JaxbMovieReader();
        List<Movie> movies = jaxbMovieReader.loadMovies();

        Assertions.assertEquals(1375, movies.size());
    }
}
