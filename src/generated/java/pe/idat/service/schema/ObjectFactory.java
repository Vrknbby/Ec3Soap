
package pe.idat.service.schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.idat.service.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.idat.service.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieRequest }
     * 
     */
    public GetMovieRequest createGetMovieRequest() {
        return new GetMovieRequest();
    }

    /**
     * Create an instance of {@link GetMovieResponse }
     * 
     */
    public GetMovieResponse createGetMovieResponse() {
        return new GetMovieResponse();
    }

    /**
     * Create an instance of {@link AddMovieRequest }
     * 
     */
    public AddMovieRequest createAddMovieRequest() {
        return new AddMovieRequest();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link UpdateMovieRequest }
     * 
     */
    public UpdateMovieRequest createUpdateMovieRequest() {
        return new UpdateMovieRequest();
    }

    /**
     * Create an instance of {@link UpdateMovieResponse }
     * 
     */
    public UpdateMovieResponse createUpdateMovieResponse() {
        return new UpdateMovieResponse();
    }

    /**
     * Create an instance of {@link DeleteMovieRequest }
     * 
     */
    public DeleteMovieRequest createDeleteMovieRequest() {
        return new DeleteMovieRequest();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

}
