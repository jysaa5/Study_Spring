package LILAC.LILACspring.respository;

import LILAC.LILACspring.domain.Member;
import LILAC.LILACspring.repository.MemberRepository;
import LILAC.LILACspring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        System.out.println("result = " + (result == member));
    }
}
