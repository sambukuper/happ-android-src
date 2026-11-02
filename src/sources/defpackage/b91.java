package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b91 extends uy7 implements rn2 {
    public dd8 g0;
    public byte h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ ql6 k0;
    public final /* synthetic */ gn2 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b91(q51 q51Var, gn2 gn2Var, ql6 ql6Var, boolean z) {
        super(2, q51Var);
        this.j0 = z;
        this.k0 = ql6Var;
        this.l0 = gn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((b91) n((q51) obj2, (ed8) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        b91 b91Var = new b91(q51Var, this.l0, this.k0, this.j0);
        b91Var.i0 = obj;
        return b91Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[PHI: r0 r12
  0x0070: PHI (r0v6 ed8) = (r0v3 ed8), (r0v10 ed8) binds: [B:23:0x006d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r12v9 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:23:0x006d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[RETURN] */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        dd8 dd8Var;
        dd8 dd8Var2;
        ed8 ed8Var;
        ed8 ed8Var2;
        Object objC;
        Object obj2;
        byte b = this.h0;
        gn2 gn2Var = this.l0;
        if (b == 0) {
            w39.n0(obj);
            ed8 ed8Var3 = (ed8) this.i0;
            ed8Var3.getClass();
            return gn2Var.B(((o66) ed8Var3).b());
        }
        q51 q51Var = null;
        ql6 ql6Var = this.k0;
        byte b2 = 1;
        c71 c71Var = c71.X;
        if (b != 1) {
            if (b == 2) {
                dd8Var = this.g0;
                ed8Var2 = (ed8) this.i0;
                w39.n0(obj);
            } else {
                if (b == 3) {
                    ed8Var = (ed8) this.i0;
                    w39.n0(obj);
                    if (this.j0) {
                        return obj;
                    }
                    this.i0 = obj;
                    this.h0 = (byte) 4;
                    objC = ed8Var.c(this);
                    if (objC != c71Var) {
                        Object obj3 = obj;
                        obj = objC;
                        obj2 = obj3;
                    }
                    return c71Var;
                }
                if (b != 4) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.i0;
                w39.n0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                fi3 fi3VarF = ql6Var.f();
                fi3VarF.b.c(fi3VarF.e, fi3VarF.f);
            }
            return obj2;
        }
        dd8Var = this.g0;
        ed8 ed8Var4 = (ed8) this.i0;
        w39.n0(obj);
        if (((Boolean) obj).booleanValue()) {
            dd8Var2 = dd8Var;
            ed8Var = ed8Var4;
            w81 w81Var = new w81(q51Var, gn2Var, b2);
            this.i0 = ed8Var;
            this.g0 = null;
            this.h0 = (byte) 3;
            obj = ed8Var.a(dd8Var2, w81Var, this);
            if (obj != c71Var) {
                if (this.j0) {
                    return obj;
                }
                this.i0 = obj;
                this.h0 = (byte) 4;
                objC = ed8Var.c(this);
                if (objC != c71Var) {
                    Object obj4 = obj;
                    obj = objC;
                    obj2 = obj4;
                    if (!((Boolean) obj).booleanValue()) {
                        fi3 fi3VarF2 = ql6Var.f();
                        fi3VarF2.b.c(fi3VarF2.e, fi3VarF2.f);
                    }
                    return obj2;
                }
            }
        } else {
            fi3 fi3VarF3 = ql6Var.f();
            this.i0 = ed8Var4;
            this.g0 = dd8Var;
            this.h0 = (byte) 2;
            if (fi3VarF3.a(this) != c71Var) {
                ed8Var2 = ed8Var4;
            }
        }
        return c71Var;
        dd8Var2 = dd8Var;
        ed8Var = ed8Var2;
        w81 w81Var2 = new w81(q51Var, gn2Var, b2);
        this.i0 = ed8Var;
        this.g0 = null;
        this.h0 = (byte) 3;
        obj = ed8Var.a(dd8Var2, w81Var2, this);
        if (obj != c71Var) {
            if (this.j0) {
                return obj;
            }
            this.i0 = obj;
            this.h0 = (byte) 4;
            objC = ed8Var.c(this);
            if (objC != c71Var) {
                Object obj5 = obj;
                obj = objC;
                obj2 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                    fi3 fi3VarF4 = ql6Var.f();
                    fi3VarF4.b.c(fi3VarF4.e, fi3VarF4.f);
                }
                return obj2;
            }
        }
        return c71Var;
    }
}
