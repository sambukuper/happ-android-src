package io.sentry.cache.tape;

import defpackage.b61;
import defpackage.bt;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    public final j X;
    public final c Y = new c();
    public final f Z;

    public e(j jVar, f fVar) {
        this.X = jVar;
        this.Z = fVar;
    }

    @Override // io.sentry.cache.tape.g
    public final void R(Comparable comparable) throws IOException {
        long j;
        long j2;
        long j3;
        long jH0;
        long j4;
        long j5;
        c cVar = this.Y;
        cVar.reset();
        this.Z.e(comparable, cVar);
        j jVar = this.X;
        byte[] bArr = jVar.i0;
        byte[] bArrG = cVar.g();
        int size = cVar.size();
        if (bArrG == null) {
            b61.i("data == null");
            return;
        }
        if (size < 0 || size > bArrG.length) {
            throw new IndexOutOfBoundsException();
        }
        if (jVar.m0) {
            bt.i("closed");
            return;
        }
        int i = jVar.k0;
        if (i != -1 && jVar.f0 == i) {
            jVar.c0(1);
        }
        long j6 = ((long) size) + 4;
        long j7 = jVar.Z;
        if (jVar.f0 == 0) {
            j = 4;
            j3 = 32;
            j2 = 32;
        } else {
            h hVar = jVar.h0;
            long j8 = hVar.a;
            j = 4;
            long j9 = jVar.g0.a;
            int i2 = hVar.b;
            if (j8 >= j9) {
                j3 = (j8 - j9) + 4 + ((long) i2) + 32;
                j2 = 32;
            } else {
                j2 = 32;
                j3 = (((j8 + 4) + ((long) i2)) + j7) - j9;
            }
        }
        long j10 = j7 - j3;
        if (j10 < j6) {
            do {
                j10 += j7;
                j7 <<= 1;
            } while (j10 < j6);
            jVar.X.setLength(j7);
            jVar.X.getChannel().force(true);
            h hVar2 = jVar.h0;
            long jH1 = jVar.H0(hVar2.a + j + ((long) hVar2.b));
            if (jH1 <= jVar.g0.a) {
                FileChannel channel = jVar.X.getChannel();
                channel.position(jVar.Z);
                j4 = jH1 - j2;
                if (channel.transferTo(32L, j4, channel) != j4) {
                    bt.g("Copied insufficient number of bytes!");
                    return;
                }
            } else {
                j4 = 0;
            }
            long j11 = jVar.h0.a;
            long j12 = jVar.g0.a;
            if (j11 < j12) {
                long j13 = (jVar.Z + j11) - j2;
                j5 = j7;
                jVar.J0(j5, jVar.f0, j12, j13);
                jVar.h0 = new h(j13, jVar.h0.b);
            } else {
                j5 = j7;
                jVar.J0(j5, jVar.f0, j12, j11);
            }
            jVar.Z = j5;
            long j14 = j2;
            long j15 = j4;
            while (j15 > 0) {
                int iMin = (int) Math.min(j15, 4096L);
                jVar.C0(j14, j.n0, iMin);
                long j16 = iMin;
                j15 -= j16;
                j14 += j16;
            }
        }
        boolean z = jVar.f0 == 0;
        if (z) {
            jH0 = j2;
        } else {
            h hVar3 = jVar.h0;
            jH0 = jVar.H0(hVar3.a + j + ((long) hVar3.b));
        }
        h hVar4 = new h(jH0, size);
        j.V0(0, size, bArr);
        jVar.C0(jH0, bArr, 4);
        jVar.C0(jH0 + j, bArrG, size);
        jVar.J0(jVar.Z, jVar.f0 + 1, z ? jH0 : jVar.g0.a, jH0);
        jVar.h0 = hVar4;
        jVar.f0++;
        jVar.j0++;
        if (z) {
            jVar.g0 = hVar4;
        }
    }

    @Override // io.sentry.cache.tape.g
    public final void X(int i) throws IOException {
        this.X.c0(i);
    }

    @Override // io.sentry.cache.tape.g
    public final void Y() throws IOException {
        j jVar = this.X;
        if (jVar.l0) {
            return;
        }
        jVar.X.getChannel().force(false);
    }

    @Override // io.sentry.cache.tape.g
    public final void clear() throws IOException {
        this.X.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this, new i(this.X));
    }

    @Override // io.sentry.cache.tape.g
    public final int size() {
        return this.X.f0;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.X + '}';
    }
}
