package LILAC.LILACspring.repository;

import LILAC.LILACspring.domain.Member;

import java.util.*;

// 구현체
public class MemoryMemberRepository implements MemberRepository {

    // 저장되는 곳
    // 동시성 문제 때문에 HashMap보다 ConcurrentHashMap을 사용하는 것이 좋다.
    private static Map<Long, Member> store = new HashMap<>();

    // 동시성 문제 때문에 long보다 AtomicLong을 사용하는 것이 좋다.
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }


    public void clearStore(){
        store.clear();
    }
}
