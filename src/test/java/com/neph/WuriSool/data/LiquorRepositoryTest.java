package com.neph.WuriSool.data;

import com.neph.WuriSool.domain.Liquor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LiquorRepositoryTest {

    @Autowired
    LiquorRepository liquorRepository;

    @Test
    void save() {
        // given
        Liquor liquor = new Liquor();

        // when
        Long liquorId = liquorRepository.save(liquor);
        Liquor findLiquor = liquorRepository.find(liquorId);

        //then
        Assertions.assertThat(findLiquor.getId())
                .isEqualTo(liquor.getId());
    }

    @Test
    void find() {
    }
}