package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hy6 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 1;
    public boolean h0;
    public final /* synthetic */ long i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy6(ip5 ip5Var, CharSequence charSequence, long j, r68 r68Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = ip5Var;
        this.k0 = charSequence;
        this.i0 = j;
        this.l0 = r68Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((hy6) n((q51) obj2, (ry6) obj)).q(dn8Var);
            case 1:
                return ((hy6) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((hy6) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        switch (b) {
            case 0:
                hy6 hy6Var = new hy6((sy6) obj3, this.i0, (ba6) obj2, q51Var);
                hy6Var.j0 = obj;
                return hy6Var;
            case 1:
                return new hy6((ip5) this.j0, (CharSequence) obj3, this.i0, (r68) obj2, q51Var);
            default:
                return new hy6((String) this.j0, (jh4) obj3, (byte[]) obj2, this.i0, q51Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object objW;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        long j = this.i0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                sy6 sy6Var = (sy6) obj3;
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ry6 ry6Var = (ry6) this.j0;
                float fH = sy6Var.h(j);
                fh fhVar = new fh(obj2, (Object) sy6Var, (Object) ry6Var, (byte) 18);
                this.h0 = true;
                return ry7.a(0.0f, fH, 0.0f, wl7.V(0.0f, 0.0f, null, 7), fhVar, this) == c71Var ? c71Var : dn8Var;
            case 1:
                CharSequence charSequence = (CharSequence) obj3;
                kd8 kd8Var = ((r68) obj2).a;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    ip5 ip5Var = (ip5) this.j0;
                    this.h0 = true;
                    op5 op5Var = (op5) ip5Var;
                    op5Var.getClass();
                    if (charSequence.length() == 0) {
                        objW = null;
                    } else {
                        long j2 = this.i0;
                        if (f88.b(j2)) {
                            objW = null;
                        } else {
                            objW = w51.W(op5Var.a, new mp5(op5Var, new np5(j2, null, op5Var, charSequence), null), this);
                        }
                    }
                    if (objW == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objW = obj;
                    charSequence = charSequence;
                }
                f88 f88Var = (f88) objW;
                if (f88Var == null) {
                    return dn8Var;
                }
                long j3 = f88Var.a;
                if (!dh3.f(kd8Var.d().Z, charSequence) || !f88.a(kd8Var.d().f0, j) || f88.a(j3, kd8Var.d().f0)) {
                    return dn8Var;
                }
                kd8Var.j(j3);
                return dn8Var;
            default:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                nf1 nf1Var = tp1.a;
                ye1 ye1Var = ye1.Z;
                kl8 kl8Var = new kl8((String) this.j0, (jh4) obj3, (byte[]) obj2, this.i0, null);
                this.h0 = true;
                Object objW2 = w51.W(ye1Var, kl8Var, this);
                return objW2 == c71Var ? c71Var : objW2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy6(sy6 sy6Var, long j, ba6 ba6Var, q51 q51Var) {
        super(2, q51Var);
        this.k0 = sy6Var;
        this.i0 = j;
        this.l0 = ba6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy6(String str, jh4 jh4Var, byte[] bArr, long j, q51 q51Var) {
        super(2, q51Var);
        this.j0 = str;
        this.k0 = jh4Var;
        this.l0 = bArr;
        this.i0 = j;
    }
}
