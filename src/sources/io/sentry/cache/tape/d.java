package io.sentry.cache.tape;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {
    public final i X;
    public final /* synthetic */ e Y;

    public d(e eVar, i iVar) {
        this.Y = eVar;
        this.X = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.Y.Z.d((byte[]) this.X.next());
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        this.X.remove();
    }
}
