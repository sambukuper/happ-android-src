package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mi4 implements Iterator, qv3 {
    public final long X;
    public final long Y;
    public boolean Z;
    public long f0;

    public mi4(long j, long j2, long j3) {
        this.X = j3;
        this.Y = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.Z = z;
        this.f0 = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f0;
        if (j != this.Y) {
            this.f0 = this.X + j;
        } else {
            if (!this.Z) {
                bt.n();
                return null;
            }
            this.Z = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
