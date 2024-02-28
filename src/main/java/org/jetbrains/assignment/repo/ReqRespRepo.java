package org.jetbrains.assignment.repo;

import org.jetbrains.assignment.models.ReqResp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReqRespRepo extends JpaRepository<ReqResp, Long> {
}
