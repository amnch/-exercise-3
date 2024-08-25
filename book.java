package ir.freeland.springboot;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/basic")
public class book {
	
	// public book() {
	//        super();
	    //}
//
	 @RequestMapping(value = "/book")
	    @ResponseBody
	    public String getFoosBySimplePath() {
	        return "Simple Get some book";
	    }
	 @RequestMapping(value = "/book/{id}")
	    @ResponseBody
	    public String getFoosBySimplePathWithPathVariable(@PathVariable final long id) {
	        return "Get a specific book with id=" + id;
	    }
	 @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE )
	    @ResponseBody
	    public String deletebookBySimplePathWithPathVariables(@PathVariable final long id) {
	        return "THE BOOK with  deleted";
	    }
	 @RequestMapping(value = "/foos/{id}", method =  RequestMethod.PUT)
	    @ResponseBody
	    public String putbooksBySimplePathWithPathVariables(@PathVariable final long id) {
	        return " the book put";
	    }
	 
	 @RequestMapping(value = "/book/create", method =  RequestMethod.POST)
	    @ResponseBody
	    public String postbooks() {
	        return " the book posted";
	    }
	 
	 @RequestMapping(value = "/book/{title}", method =  RequestMethod.GET)
	    @ResponseBody
	    public String getbooksBySimplePathWithPathVariables(@PathVariable final long title) {
	        return " the book get";
	    }
	 @RequestMapping(value = "/book", headers = { "name=val1", "publish=val2" })
	    @ResponseBody
	    public String getbookWithHeaders() {
	        return "Get some book with Header name and publish";
	    }

}