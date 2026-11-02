package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 extends uy7 implements rn2 {
    public dd8 g0;
    public byte h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ boolean k0;
    public final /* synthetic */ ql6 l0;
    public final /* synthetic */ gn2 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(q51 q51Var, gn2 gn2Var, ql6 ql6Var, boolean z, boolean z2) {
        super(2, q51Var);
        this.j0 = z;
        this.k0 = z2;
        this.l0 = ql6Var;
        this.m0 = gn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((x81) n((q51) obj2, (ed8) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        x81 x81Var = new x81(q51Var, this.m0, this.l0, this.j0, this.k0);
        x81Var.i0 = obj;
        return x81Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT, PHI: r0 r12
  0x009d: PHI (r0v11 ed8) = (r0v8 ed8), (r0v16 ed8) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[RETURN] */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        dd8 dd8Var;
        ed8 ed8Var;
        dd8 dd8Var2;
        ed8 ed8Var2;
        ed8 ed8Var3;
        Object objC;
        Object obj2;
        byte b = this.h0;
        gn2 gn2Var = this.m0;
        ql6 ql6Var = this.l0;
        boolean z = this.k0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            ed8 ed8Var4 = (ed8) this.i0;
            if (!this.j0) {
                ed8Var4.getClass();
                return gn2Var.B(((o66) ed8Var4).b());
            }
            dd8Var = z ? dd8.X : dd8.Y;
            if (z) {
                dd8 dd8Var3 = dd8Var;
                ed8Var = ed8Var4;
                dd8Var2 = dd8Var3;
                w81 w81Var = new w81((q51) null, gn2Var, (byte) 0);
                this.i0 = ed8Var;
                this.g0 = null;
                this.h0 = (byte) 3;
                obj = ed8Var.a(dd8Var2, w81Var, this);
                if (obj != c71Var) {
                    if (z) {
                        return obj;
                    }
                    this.i0 = obj;
                    this.h0 = (byte) 4;
                    objC = ed8Var.c(this);
                    if (objC != c71Var) {
                        Object obj3 = obj;
                        obj = objC;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            fi3 fi3VarF = ql6Var.f();
                            fi3VarF.b.c(fi3VarF.e, fi3VarF.f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.i0 = ed8Var4;
                this.g0 = dd8Var;
                this.h0 = (byte) 1;
                Object objC2 = ed8Var4.c(this);
                if (objC2 != c71Var) {
                    ed8Var2 = ed8Var4;
                    obj = objC2;
                }
            }
            return c71Var;
        }
        if (b == 1) {
            dd8Var = this.g0;
            ed8Var2 = (ed8) this.i0;
            w39.n0(obj);
        } else {
            if (b == 2) {
                dd8Var = this.g0;
                ed8Var3 = (ed8) this.i0;
                w39.n0(obj);
                dd8Var2 = dd8Var;
                ed8Var = ed8Var3;
                w81 w81Var2 = new w81((q51) null, gn2Var, (byte) 0);
                this.i0 = ed8Var;
                this.g0 = null;
                this.h0 = (byte) 3;
                obj = ed8Var.a(dd8Var2, w81Var2, this);
                if (obj != c71Var) {
                    if (z) {
                        return obj;
                    }
                    this.i0 = obj;
                    this.h0 = (byte) 4;
                    objC = ed8Var.c(this);
                    if (objC != c71Var) {
                        Object obj4 = obj;
                        obj = objC;
                        obj2 = obj4;
                    }
                }
                return c71Var;
            }
            if (b == 3) {
                ed8Var = (ed8) this.i0;
                w39.n0(obj);
                if (z) {
                    return obj;
                }
                this.i0 = obj;
                this.h0 = (byte) 4;
                objC = ed8Var.c(this);
                if (objC != c71Var) {
                    Object obj5 = obj;
                    obj = objC;
                    obj2 = obj5;
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
            fi3 fi3VarF2 = ql6Var.f();
            fi3VarF2.b.c(fi3VarF2.e, fi3VarF2.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            dd8Var2 = dd8Var;
            ed8Var = ed8Var2;
            w81 w81Var3 = new w81((q51) null, gn2Var, (byte) 0);
            this.i0 = ed8Var;
            this.g0 = null;
            this.h0 = (byte) 3;
            obj = ed8Var.a(dd8Var2, w81Var3, this);
            if (obj != c71Var) {
                if (z) {
                    return obj;
                }
                this.i0 = obj;
                this.h0 = (byte) 4;
                objC = ed8Var.c(this);
                if (objC != c71Var) {
                    Object obj6 = obj;
                    obj = objC;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        fi3 fi3VarF3 = ql6Var.f();
                        fi3VarF3.b.c(fi3VarF3.e, fi3VarF3.f);
                    }
                    return obj2;
                }
            }
        } else {
            fi3 fi3VarF4 = ql6Var.f();
            this.i0 = ed8Var2;
            this.g0 = dd8Var;
            this.h0 = (byte) 2;
            if (fi3VarF4.a(this) != c71Var) {
                ed8Var3 = ed8Var2;
                dd8Var2 = dd8Var;
                ed8Var = ed8Var3;
                w81 w81Var4 = new w81((q51) null, gn2Var, (byte) 0);
                this.i0 = ed8Var;
                this.g0 = null;
                this.h0 = (byte) 3;
                obj = ed8Var.a(dd8Var2, w81Var4, this);
                if (obj != c71Var) {
                    if (z) {
                        return obj;
                    }
                    this.i0 = obj;
                    this.h0 = (byte) 4;
                    objC = ed8Var.c(this);
                    if (objC != c71Var) {
                        Object obj7 = obj;
                        obj = objC;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            fi3 fi3VarF5 = ql6Var.f();
                            fi3VarF5.b.c(fi3VarF5.e, fi3VarF5.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return c71Var;
    }
}
