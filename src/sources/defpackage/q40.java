package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 extends qj6 implements rn2 {
    public oh7 Z;
    public bq5 f0;
    public long g0;
    public byte h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ b71 j0;
    public final /* synthetic */ jc8 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(b71 b71Var, jc8 jc8Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = b71Var;
        this.k0 = jc8Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((q40) n((q51) obj2, (bz7) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        q40 q40Var = new q40(this.j0, this.k0, q51Var);
        q40Var.i0 = obj;
        return q40Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c0, B:43:0x00c4), top: B:52:0x0014 }] */
    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        oh7 oh7VarA;
        bq5 bq5Var;
        long j;
        bz7 bz7Var;
        oh7 oh7Var;
        oh7 oh7Var2;
        hq5 hq5Var;
        byte b = this.h0;
        byte b2 = 1;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            bz7 bz7Var2 = (bz7) this.i0;
            oh7VarA = ph7.a(Boolean.FALSE);
            long jB = bz7Var2.c().b();
            this.i0 = bz7Var2;
            this.Z = oh7VarA;
            bq5Var = bq5.X;
            this.f0 = bq5Var;
            this.g0 = jB;
            this.h0 = (byte) 1;
            Object objB = q18.b(bz7Var2, this, 1);
            if (objB != c71Var) {
                j = jB;
                bz7Var = bz7Var2;
                obj = objB;
            }
            return c71Var;
        }
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oh7Var2 = (oh7) this.i0;
                try {
                    w39.n0(obj);
                    hq5Var = (hq5) obj;
                    if (hq5Var != null) {
                        hq5Var.a();
                    }
                    Boolean bool = Boolean.FALSE;
                    oh7Var2.getClass();
                    oh7Var2.n(null, bool);
                    return dn8.a;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    oh7Var2.getClass();
                    oh7Var2.n(null, bool2);
                    throw th;
                }
            }
            bq5 bq5Var2 = this.f0;
            oh7Var = this.Z;
            bz7Var = (bz7) this.i0;
            try {
                w39.n0(obj);
                Boolean bool3 = Boolean.FALSE;
                oh7Var.getClass();
                oh7Var.n(null, bool3);
            } catch (cq5 unused) {
                bq5Var = bq5Var2;
                oh7VarA = oh7Var;
                w51.G(this.j0, null, e71.f0, new bv(oh7VarA, this.k0, q51Var, b2), 1);
                this.i0 = oh7VarA;
                this.Z = null;
                this.f0 = null;
                this.h0 = (byte) 3;
                obj = q18.i(bz7Var, bq5Var, this);
                if (obj != c71Var) {
                    oh7Var2 = oh7VarA;
                    hq5Var = (hq5) obj;
                    if (hq5Var != null) {
                        hq5Var.a();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    oh7Var2.getClass();
                    oh7Var2.n(null, bool4);
                }
                return c71Var;
            } catch (Throwable th2) {
                th = th2;
                oh7Var2 = oh7Var;
                Boolean bool5 = Boolean.FALSE;
                oh7Var2.getClass();
                oh7Var2.n(null, bool5);
                throw th;
            }
            return dn8.a;
        }
        long j2 = this.g0;
        bq5 bq5Var3 = this.f0;
        oh7 oh7Var3 = this.Z;
        bz7 bz7Var3 = (bz7) this.i0;
        w39.n0(obj);
        bq5Var = bq5Var3;
        oh7VarA = oh7Var3;
        j = j2;
        bz7Var = bz7Var3;
        long j3 = j;
        int i = ((hq5) obj).i;
        if (i == 1 || i == 3) {
            try {
                try {
                    p40 p40Var = new p40(bq5Var, q51Var, (byte) 0);
                    this.i0 = bz7Var;
                    this.Z = oh7VarA;
                    this.f0 = bq5Var;
                    this.h0 = (byte) 2;
                    if (bz7Var.d(j3, p40Var, this) != c71Var) {
                        oh7Var = oh7VarA;
                        Boolean bool6 = Boolean.FALSE;
                        oh7Var.getClass();
                        oh7Var.n(null, bool6);
                    }
                } catch (cq5 unused2) {
                    w51.G(this.j0, null, e71.f0, new bv(oh7VarA, this.k0, q51Var, b2), 1);
                    this.i0 = oh7VarA;
                    this.Z = null;
                    this.f0 = null;
                    this.h0 = (byte) 3;
                    obj = q18.i(bz7Var, bq5Var, this);
                    if (obj != c71Var) {
                        oh7Var2 = oh7VarA;
                        hq5Var = (hq5) obj;
                        if (hq5Var != null) {
                            hq5Var.a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        oh7Var2.getClass();
                        oh7Var2.n(null, bool7);
                        return dn8.a;
                    }
                }
                return c71Var;
            } catch (Throwable th3) {
                th = th3;
                oh7Var2 = oh7VarA;
                Boolean bool8 = Boolean.FALSE;
                oh7Var2.getClass();
                oh7Var2.n(null, bool8);
                throw th;
            }
        }
        return dn8.a;
    }
}
