package com.example;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

class CanaryPropertyTest {
    @Property
    boolean additionIsCommutative(@ForAll int left, @ForAll int right) {
        CanaryService service = new CanaryService();
        return service.add(left, right) == service.add(right, left);
    }
}
