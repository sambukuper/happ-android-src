package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qj5 implements je7 {
    public final ba0 X;
    public final i90 Y;
    public mz6 Z;
    public int f0;
    public boolean g0;
    public long h0;

    public qj5(ba0 ba0Var) {
        this.X = ba0Var;
        i90 i90VarC = ba0Var.c();
        this.Y = i90VarC;
        mz6 mz6Var = i90VarC.X;
        this.Z = mz6Var;
        this.f0 = mz6Var != null ? mz6Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.je7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(defpackage.i90 r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.g0
            if (r3 != 0) goto L5f
            mz6 r3 = r8.Z
            i90 r4 = r8.Y
            if (r3 == 0) goto L27
            mz6 r5 = r4.X
            if (r3 != r5) goto L21
            int r3 = r8.f0
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.bt.i(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.h0
            r2 = 1
            long r0 = r0 + r2
            ba0 r2 = r8.X
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            mz6 r0 = r8.Z
            if (r0 != 0) goto L48
            mz6 r0 = r4.X
            if (r0 == 0) goto L48
            r8.Z = r0
            int r0 = r0.b
            r8.f0 = r0
        L48:
            long r0 = r4.Y
            long r2 = r8.h0
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            i90 r2 = r8.Y
            long r4 = r8.h0
            r3 = r9
            r2.p(r3, r4, r6)
            long r9 = r8.h0
            long r9 = r9 + r6
            r8.h0 = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.bt.i(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.ie2.f(r10, r8)
            defpackage.em7.c(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj5.read(i90, long):long");
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.X.timeout();
    }
}
