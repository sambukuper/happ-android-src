package io.sentry.cache.tape;

import defpackage.bt;
import defpackage.u52;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator {
    public int X = 0;
    public long Y;
    public int Z;
    public final /* synthetic */ j f0;

    public i(j jVar) {
        this.f0 = jVar;
        this.Y = jVar.g0.a;
        this.Z = jVar.j0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j jVar = this.f0;
        if (jVar.m0) {
            bt.i("closed");
            return false;
        }
        if (jVar.j0 == this.Z) {
            return this.X != jVar.f0;
        }
        bt.c();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = j.n0;
        j jVar = this.f0;
        if (jVar.m0) {
            bt.i("closed");
            return null;
        }
        if (jVar.j0 != this.Z) {
            bt.c();
            return null;
        }
        int i = jVar.f0;
        if (i == 0) {
            bt.n();
            return null;
        }
        if (this.X >= i) {
            bt.n();
            return null;
        }
        try {
            h hVarU = jVar.U(this.Y);
            int i2 = hVarU.b;
            long j = hVarU.a;
            byte[] bArr2 = new byte[i2];
            long j2 = j + 4;
            long jH0 = jVar.H0(j2);
            this.Y = jH0;
            if (!jVar.B0(jH0, bArr2, i2)) {
                this.X = jVar.f0;
                return bArr;
            }
            this.Y = jVar.H0(j2 + ((long) i2));
            this.X++;
            return bArr2;
        } catch (IOException e) {
            throw e;
        } catch (OutOfMemoryError unused) {
            jVar.u0();
            this.X = jVar.f0;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        j jVar = this.f0;
        if (jVar.j0 != this.Z) {
            bt.c();
            return;
        }
        if (jVar.f0 == 0) {
            bt.n();
        } else {
            if (this.X != 1) {
                u52.k("Removal is only permitted from the head.");
                return;
            }
            jVar.c0(1);
            this.Z = jVar.j0;
            this.X--;
        }
    }
}
