package com.barber.Barberapi.service.barber.impl;

import com.barber.Barberapi.document.barber.BarberReview;

import com.barber.Barberapi.repository.barber.BarberReviewRepository;
import com.barber.Barberapi.service.barber.AbstractBarberReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberReviewService implements AbstractBarberReviewService<BarberReview> {

    @Autowired
    private BarberReviewRepository barberReviewRepository;


    @Override
    public List<BarberReview> findReviews() {
        return barberReviewRepository.findAll();
    }

    @Override
    public BarberReview createReview(BarberReview review) {
        return barberReviewRepository.save(review);
    }
}
