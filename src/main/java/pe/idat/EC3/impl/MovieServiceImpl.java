package pe.idat.EC3.impl;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.EC3.model.Movie;
import pe.idat.EC3.repository.MovieRepository;
import pe.idat.service.schema.*;
import pe.idat.service.wsdl.SoapServicePort;

import java.util.Optional;

@Service
@SchemaValidation(type = SchemaValidationType.REQUEST)
public class MovieServiceImpl implements SoapServicePort {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public DeleteMovieResponse deleteMovie(DeleteMovieRequest request) {
        DeleteMovieResponse response = new DeleteMovieResponse();
        Long id = (long)request.getId();
        Optional<Movie> movieOpt = movieRepository.findById(id);

        if (movieOpt.isPresent()) {
            movieRepository.deleteById(id);
            response.setStatus("Película eliminada");
        } else {
            response.setStatus("No se encontró película con id " + id);
        }

        return response;
    }

    @Override
    public GetMovieResponse getMovie(GetMovieRequest request) {
        GetMovieResponse response = new GetMovieResponse();
        Long id = (long) request.getId();
        System.out.println("ID solicitado: " + id);
        Optional<Movie> movieOpt = movieRepository.findById(id);

        if (movieOpt.isPresent()) {
            Movie movie = movieOpt.get();
            System.out.println("Película encontrada: " + movie);
            response.setId(movie.getId().intValue());
            response.setName(movie.getName());
            response.setCategory(movie.getCategory());
            response.setYear(movie.getYear());
            response.setOriginCountry(movie.getOriginCountry());
        } else {
            System.out.println("No se encontró película con ID: " + id);
            response.setName("No existe película con id " + id);
        }

        return response;
    }

    @Override
    public AddMovieResponse addMovie(AddMovieRequest request) {
        AddMovieResponse response = new AddMovieResponse();
        Movie movie = new Movie();
        movie.setName(request.getName());
        movie.setCategory(request.getCategory());
        movie.setYear(request.getYear());
        movie.setOriginCountry(request.getOriginCountry());
        movieRepository.save(movie);
        response.setStatus("Película guardada");
        return response;
    }

    @Override
    public UpdateMovieResponse updateMovie(UpdateMovieRequest request) {
        UpdateMovieResponse response = new UpdateMovieResponse();
        Long id = (long)request.getId();
        Optional<Movie> movieOpt = movieRepository.findById(id);

        if (movieOpt.isPresent()) {
            Movie movie = movieOpt.get();
            movie.setOriginCountry(String.valueOf(request.getOriginCountry()));
            movieRepository.save(movie);
            response.setStatus("País de origen actualizado");
        } else {
            response.setStatus("No se encontró película con id " + id);
        }

        return response;

        }
}
