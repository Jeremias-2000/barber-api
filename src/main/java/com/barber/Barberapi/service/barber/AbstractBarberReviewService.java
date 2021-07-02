package com.barber.Barberapi.service.barber;

import java.util.List;

public interface AbstractBarberReviewService<BR> {

    List<BR> findReviews();
    BR createReview(BR review);
}
