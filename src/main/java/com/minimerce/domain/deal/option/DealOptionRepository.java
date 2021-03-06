package com.minimerce.domain.deal.option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gemini on 23/03/2017.
 */
@Repository
public interface DealOptionRepository extends JpaRepository<DealOption, Long> {
    DealOption findByClientIdAndId(Long clientId, Long id);
}
