package com.thirdwavelist.barista.service;

import com.thirdwavelist.barista.model.Cafe;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CafeService {
    private final Collection<Cafe> cafe = new ConcurrentLinkedQueue<>();

    public CafeService() {
    }

    public Collection<Cafe> getCafe() {
        return Collections.unmodifiableCollection(cafe);
    }

    public Collection<Cafe> getCafe(UUID guid) {
        return Collections.unmodifiableCollection(cafe).stream().filter(new Predicate<Cafe>() {
            @Override
            public boolean test(Cafe cafe) {
                return cafe.getGuid().equals(guid);
            }
        }).collect(Collectors.toUnmodifiableList());
    }
}