package com.financialorgratingsystem;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.financialorgratingsystem.entity.Feedback;
import com.financialorgratingsystem.exception.NotFoundException;
import com.financialorgratingsystem.repository.FeedbackRepo;
import com.financialorgratingsystem.service.FeedbackService;

@SpringBootTest
public class FeedbackServiceTest {

	@Autowired
	FeedbackService feedbackservice;

	@MockBean
	FeedbackRepo feedbackRepo;

	Feedback f1;

	@BeforeEach
	public void setUp() throws Exception {
		f1 = getFeedback();

	}

	private Feedback getFeedback() {
		Feedback f = new Feedback();
		f.setFeedbackId(1);
		f.setMessage("Good");
		f.setUserId(2);
		f.setOrganizationId(4);
		return f;
	}

	@Test
	void testAddFeedback() {

		Mockito.when(feedbackRepo.save(f1)).thenReturn(f1);
		assertThat(feedbackservice.addFeedback(f1)).isEqualTo(f1);

	}

	@Test
	void testFeedbackByFId() throws NotFoundException {
	Optional<Feedback> f2 = Optional.of(f1);
	Mockito.when(feedbackRepo.findById(1)).thenReturn(f2);
	Mockito.when(feedbackRepo.existsById(f1.getFeedbackId())).thenReturn(true);
	assertThat(feedbackservice.getFeedbackByFId(f1.getFeedbackId())).isEqualTo(f1);
	}

	@Test
	void testdeleteFeedbackByFId() throws NotFoundException {
	Mockito.when(feedbackRepo.existsById(2)).thenReturn(true);
	assertThat(feedbackservice.deleteFeedbackByFId(2)).isEqualTo(true);
	}

}
