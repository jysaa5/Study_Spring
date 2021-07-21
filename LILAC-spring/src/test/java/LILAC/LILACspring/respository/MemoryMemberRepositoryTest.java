package LILAC.LILACspring.respository;

import LILAC.LILACspring.domain.Member;
import LILAC.LILACspring.repository.MemberRepository;
import LILAC.LILACspring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        // System.out.println("result = " + (result == member));
        // Assertions.assertEquals(result, member);
        Assertions.assertThat(result).isEqualTo(member);
    }


    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("s1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("s2");
        repository.save(member2);

        Member result1 = repository.findByName("s2").get();

        //Assertions.assertThat(result1).isEqualTo(member1);
        Assertions.assertThat(result1).isEqualTo(member2);

    }

    @Test
    public void findAll(){
        Member member3 = new Member();
        member3.setName("spring1");
        repository.save(member3);


        Member member4 = new Member();
        member4.setName("spring2");
        repository.save(member4);

        List<Member> result2 = repository.findAll();

        Assertions.assertThat(result2.size()).isEqualTo(2);
    }
}
