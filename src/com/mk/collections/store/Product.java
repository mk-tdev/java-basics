package com.mk.collections.store;

public record Product(
        String sku,
        String name,
        String mfgr,
        Category category
) {
}
