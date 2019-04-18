package kg.itacademy.service;

import kg.itacademy.dao.LessonDao;
import kg.itacademy.model.Lesson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/lesson")
public class LessonService {

    @GET
    @Path("/{CalcMap}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Lesson getLesson(@PathParam("lessonId") Integer lessonId) {

        return LessonDao.getLesson(lessonId);
    }
}
