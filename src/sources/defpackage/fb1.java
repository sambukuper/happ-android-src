package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fb1 extends uy7 implements gn2 {
    public final /* synthetic */ byte g0 = 0;
    public byte h0;
    public final /* synthetic */ ib1 i0;
    public Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(ea6 ea6Var, ib1 ib1Var, ca6 ca6Var, q51 q51Var) {
        super(1, q51Var);
        this.k0 = ea6Var;
        this.i0 = ib1Var;
        this.l0 = ca6Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                break;
        }
        return ((fb1) m(q51Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        Object obj = this.l0;
        Object obj2 = this.k0;
        ib1 ib1Var = this.i0;
        switch (b) {
            case 0:
                return new fb1((ea6) obj2, ib1Var, (ca6) obj, q51Var);
            default:
                return new fb1(ib1Var, (s61) obj2, (rn2) obj, q51Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        ea6 ea6Var;
        ca6 ca6Var;
        v91 v91Var;
        Object obj2;
        int iHashCode;
        byte b = this.g0;
        Object obj3 = this.l0;
        Object obj4 = this.k0;
        c71 c71Var = c71.X;
        ib1 ib1Var = this.i0;
        q51 q51Var = null;
        switch (b) {
            case 0:
                ca6 ca6Var2 = (ca6) obj3;
                ea6 ea6Var2 = (ea6) obj4;
                byte b2 = this.h0;
                try {
                    if (b2 != 0) {
                        if (b2 == 1) {
                            ea6Var = (ea6) ((Serializable) this.j0);
                            w39.n0(obj);
                        } else {
                            if (b2 != 2) {
                                if (b2 != 3) {
                                    bt.i("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ca6Var2 = (ca6) ((Serializable) this.j0);
                                w39.n0(obj);
                                ca6Var2.X = ((Number) obj).intValue();
                                return dn8.a;
                            }
                            ca6Var = (ca6) ((Serializable) this.j0);
                            w39.n0(obj);
                        }
                        ca6Var.X = ((Number) obj).intValue();
                        return dn8.a;
                    }
                    w39.n0(obj);
                    this.j0 = ea6Var2;
                    this.h0 = (byte) 1;
                    obj = ((p92) ib1Var.l0.getValue()).a(new ta1(3, (q51) null), this);
                    if (obj == c71Var) {
                        return c71Var;
                    }
                    ea6Var = ea6Var2;
                    ea6Var.X = obj;
                    ja7 ja7VarB = ib1Var.b();
                    this.j0 = ca6Var2;
                    this.h0 = (byte) 2;
                    obj = ja7VarB.a();
                    if (obj == c71Var) {
                        return c71Var;
                    }
                    ca6Var = ca6Var2;
                    ca6Var.X = ((Number) obj).intValue();
                    return dn8.a;
                } catch (j71 unused) {
                    Object obj5 = ea6Var2.X;
                    this.j0 = ca6Var2;
                    this.h0 = (byte) 3;
                    obj = ib1Var.h(obj5, true, this);
                    if (obj == c71Var) {
                        return c71Var;
                    }
                }
            default:
                byte b3 = this.h0;
                if (b3 != 0) {
                    if (b3 == 1) {
                        w39.n0(obj);
                    } else if (b3 == 2) {
                        v91Var = (v91) this.j0;
                        w39.n0(obj);
                        obj2 = v91Var.b;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        if (iHashCode != v91Var.c) {
                            if (!dh3.f(v91Var.b, obj)) {
                                this.j0 = obj;
                                this.h0 = (byte) 3;
                                if (ib1Var.h(obj, true, this) == c71Var) {
                                    return c71Var;
                                }
                            }
                            return obj;
                        }
                        bt.i("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    } else {
                        if (b3 == 3) {
                            Object obj6 = this.j0;
                            w39.n0(obj);
                            return obj6;
                        }
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                w39.n0(obj);
                this.h0 = (byte) 1;
                obj = ib1Var.g(true, this);
                if (obj == c71Var) {
                    return c71Var;
                }
                v91Var = (v91) obj;
                q0 q0Var = new q0((rn2) obj3, v91Var, q51Var, (byte) 18);
                this.j0 = v91Var;
                this.h0 = (byte) 2;
                obj = w51.W((s61) obj4, q0Var, this);
                if (obj == c71Var) {
                    return c71Var;
                }
                obj2 = v91Var.b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode != v91Var.c) {
                    bt.i("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (!dh3.f(v91Var.b, obj)) {
                    this.j0 = obj;
                    this.h0 = (byte) 3;
                    if (ib1Var.h(obj, true, this) == c71Var) {
                        return c71Var;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(ib1 ib1Var, s61 s61Var, rn2 rn2Var, q51 q51Var) {
        super(1, q51Var);
        this.i0 = ib1Var;
        this.k0 = s61Var;
        this.l0 = rn2Var;
    }
}
