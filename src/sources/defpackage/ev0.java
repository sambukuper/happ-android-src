package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ev0 implements Iterable {
    public final int[] X = new int[128];
    public final char[] Y;
    public final pu Z;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final int j0;
    public final /* synthetic */ byte k0;

    public ev0(char[] cArr, pu puVar, int i, int i2, int i3, byte b) {
        this.k0 = b;
        this.Y = cArr;
        this.Z = puVar;
        this.f0 = puVar.u();
        this.g0 = i;
        this.h0 = i2;
        this.i0 = i3;
        for (int i4 = 0; i4 < 128; i4++) {
            this.X[i4] = puVar.v(i4);
        }
        int i5 = this.f0;
        this.j0 = puVar.v(i3 >= i5 ? i5 - 2 : i3);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bv0(this);
    }
}
