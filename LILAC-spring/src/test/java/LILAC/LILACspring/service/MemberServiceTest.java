package LILAC.LILACspring.service;

import LILAC.LILACspring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void join() {
        // given
        Member member = new Member();
        member.setName("hello");
        // when

        // then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}