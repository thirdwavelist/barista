package com.thirdwavelist.barista.resolver;

import com.thirdwavelist.barista.model.Cafe;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class CafeResolver implements GraphQLResolver<Cafe> {

    public String displayName(final Cafe cafe) {
        return String.format("%1$s (%2$s)", cafe.getName(), cafe.getLocation().getCity());
    }
}