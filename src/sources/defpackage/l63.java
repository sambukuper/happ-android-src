package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l63 extends yj2 {
    public final m63[] f0;
    public final int g0;
    public final int h0;

    public l63(n63 n63Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(n63Var);
        this.f0 = new m63[]{new k63(i, byteBuffer), new k63(byteBuffer2, i), new k63(byteBuffer3, i)};
        this.g0 = i;
        this.h0 = i2;
    }

    @Override // defpackage.yj2, defpackage.n63
    public final int a() {
        return this.h0;
    }

    @Override // defpackage.yj2, defpackage.n63
    public final int b() {
        return this.g0;
    }

    @Override // defpackage.yj2, defpackage.n63
    public final m63[] n() {
        return this.f0;
    }
}
