package br.com.ivanfsilva.learn.entities.pk;

import br.com.ivanfsilva.learn.entities.Offer;
import br.com.ivanfsilva.learn.entities.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class EnrollmentPK implements Serializable {
    private static final long SerialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public EnrollmentPK() {}

    public EnrollmentPK(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrollmentPK that = (EnrollmentPK) o;

        if (!user.equals(that.user)) return false;
        return offer.equals(that.offer);
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + offer.hashCode();
        return result;
    }
}
