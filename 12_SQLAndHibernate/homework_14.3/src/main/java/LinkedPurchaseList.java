import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "LinkedPurchaseList")
public class LinkedPurchaseList {

    @EmbeddedId
    Id id;

    @EmbeddedId
    private LinkedPurchaseKey linkedPurchaseKey;

    @Column(name = "subscription_date")
    private Date subscriptionDate;

    @Column(name = "price")
    private Integer price;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "course_name")
    private String courseName;

    public LinkedPurchaseList() {
    }

    public Id getId () {
        return id;
    }

     public void setId (Id id) {
        this.id = id;
    }

    public LinkedPurchaseKey getLinkedPurchaseKey() {
        return linkedPurchaseKey;
    }

    public void setLinkedPurchaseKey(LinkedPurchaseKey linkedPurchaseKey) {
        this.linkedPurchaseKey = linkedPurchaseKey;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

        @Embeddable
        private static class Id implements Serializable {

            @Column(name = "student_name")
            private String studentName;

            @Column(name = "course_name")
            private String courseName;

            public String getStudentName() {
                return studentName;
            }

            public void setStudentName(String studentName) {
                this.studentName = studentName;
            }

            public String getCourseName() {
                return courseName;
            }

            public void setCourseName(String courseName) {
                this.courseName = courseName;
            }

            public Id() {
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                Id id = (Id) o;
                return Objects.equals(studentName, id.studentName) &&
                        Objects.equals(courseName, id.courseName);
            }

            @Override
            public int hashCode() {
                return Objects.hash(studentName, courseName);
        }
    }
}
