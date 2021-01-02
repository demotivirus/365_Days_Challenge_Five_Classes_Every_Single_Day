package com.demotivirus.Day_012_S2.main;

import com.demotivirus.Day_011.main.Instructor;
import com.demotivirus.Day_011.main.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetail {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Instructor deletingInstructor = new Instructor("Delete", "Delete", "delete@gmail.com");
        InstructorDetail deleteDetail = new InstructorDetail("delete", "delete");
        deletingInstructor.setInstructorDetail(deleteDetail);


        session.beginTransaction();
        session.save(deletingInstructor);
        session.getTransaction().commit();
        System.err.println("SAVE INSTRUCTOR: " + deletingInstructor);

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//            InstructorDetail instructorDetail =
//                    (InstructorDetail) session.createQuery(
//                            "FROM InstructorDetail " +
//                                    "WHERE hobby='delete'")
//                            .uniqueResult();
//            System.err.println("DELETING THE INSTRUCTOR: " + instructorDetail.getInstructor());
            session.createQuery("DELETE FROM Instructor WHERE first_name='Delete'").executeUpdate();
            session.createQuery("DELETE FROM InstructorDetail WHERE hobby='delete'").executeUpdate();
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
