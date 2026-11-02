package io.sentry.transport;

import io.sentry.n0;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements io.sentry.cache.d {
    public static final i X = new i();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.d
    public final boolean m(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        return false;
    }

    @Override // io.sentry.cache.d
    public final void J(io.sentry.internal.debugmeta.c cVar) {
    }
}
