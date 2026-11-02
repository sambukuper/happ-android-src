package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 {
    public final /* synthetic */ o15 a;
    public final /* synthetic */ aa6 b;
    public final /* synthetic */ ea6 c;
    public final /* synthetic */ ib1 d;

    public ra1(o15 o15Var, aa6 aa6Var, ea6 ea6Var, ib1 ib1Var) {
        this.a = o15Var;
        this.b = aa6Var;
        this.c = ea6Var;
        this.d = ib1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ia1 ia1Var, s51 s51Var) throws Throwable {
        qa1 qa1Var;
        o15 o15Var;
        aa6 aa6Var;
        ea6 ea6Var;
        ib1 ib1Var;
        rn2 rn2Var;
        o15 o15Var2;
        o15 o15Var3;
        ea6 ea6Var2;
        Object obj;
        if (s51Var instanceof qa1) {
            qa1Var = (qa1) s51Var;
            int i = qa1Var.m0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa1Var.m0 = i - Integer.MIN_VALUE;
            } else {
                qa1Var = new qa1(this, s51Var);
            }
        } else {
            qa1Var = new qa1(this, s51Var);
        }
        Object obj2 = qa1Var.k0;
        int i2 = qa1Var.m0;
        c71 c71Var = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(obj2);
                qa1Var.f0 = ia1Var;
                o15Var = this.a;
                qa1Var.g0 = o15Var;
                aa6Var = this.b;
                qa1Var.h0 = aa6Var;
                ea6Var = this.c;
                qa1Var.i0 = ea6Var;
                ib1Var = this.d;
                qa1Var.j0 = ib1Var;
                qa1Var.m0 = 1;
                if (o15Var.g(qa1Var) != c71Var) {
                }
                rn2Var = ia1Var;
                return c71Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = qa1Var.h0;
                    ea6Var2 = (ea6) qa1Var.g0;
                    o15Var2 = (o15) qa1Var.f0;
                    try {
                        w39.n0(obj2);
                        ea6Var2.X = obj;
                        Object obj3 = ea6Var2.X;
                        o15Var2.m(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        o15Var2.m(null);
                        throw th;
                    }
                }
                ib1Var = (ib1) qa1Var.h0;
                ea6Var2 = (ea6) qa1Var.g0;
                o15Var3 = (o15) qa1Var.f0;
                try {
                    w39.n0(obj2);
                    if (!dh3.f(obj2, ea6Var2.X)) {
                        qa1Var.f0 = o15Var3;
                        qa1Var.g0 = ea6Var2;
                        qa1Var.h0 = obj2;
                        qa1Var.m0 = 3;
                        if (ib1Var.h(obj2, false, qa1Var) != c71Var) {
                            obj = obj2;
                            o15Var2 = o15Var3;
                            ea6Var2.X = obj;
                        }
                        rn2Var = ia1Var;
                        return c71Var;
                    }
                    o15Var2 = o15Var3;
                    Object obj4 = ea6Var2.X;
                    o15Var2.m(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    o15Var2 = o15Var3;
                    o15Var2.m(null);
                    throw th;
                }
            }
            ib1Var = qa1Var.j0;
            ea6 ea6Var3 = qa1Var.i0;
            aa6Var = (aa6) qa1Var.h0;
            o15 o15Var4 = (o15) qa1Var.g0;
            rn2 rn2Var2 = (rn2) qa1Var.f0;
            w39.n0(obj2);
            ea6Var = ea6Var3;
            rn2Var = rn2Var2;
            o15Var = o15Var4;
            rn2Var = ia1Var;
            if (aa6Var.X) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = ea6Var.X;
            qa1Var.f0 = o15Var;
            qa1Var.g0 = ea6Var;
            qa1Var.h0 = ib1Var;
            qa1Var.i0 = null;
            qa1Var.j0 = null;
            qa1Var.m0 = 2;
            Object objK = rn2Var.K(obj5, qa1Var);
            if (objK != c71Var) {
                o15Var3 = o15Var;
                obj2 = objK;
                ea6Var2 = ea6Var;
                if (!dh3.f(obj2, ea6Var2.X)) {
                    qa1Var.f0 = o15Var3;
                    qa1Var.g0 = ea6Var2;
                    qa1Var.h0 = obj2;
                    qa1Var.m0 = 3;
                    if (ib1Var.h(obj2, false, qa1Var) != c71Var) {
                        obj = obj2;
                        o15Var2 = o15Var3;
                        ea6Var2.X = obj;
                    }
                } else {
                    o15Var2 = o15Var3;
                }
                Object obj6 = ea6Var2.X;
                o15Var2.m(null);
                return obj6;
            }
            rn2Var = ia1Var;
            return c71Var;
        } catch (Throwable th3) {
            th = th3;
            o15Var2 = o15Var;
            o15Var2.m(null);
            throw th;
        }
    }
}
