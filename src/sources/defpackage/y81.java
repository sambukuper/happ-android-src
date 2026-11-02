package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y81 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 2;
    public boolean h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(q51 q51Var, gn2 gn2Var, ql6 ql6Var, boolean z, boolean z2) {
        super(2, q51Var);
        this.k0 = ql6Var;
        this.i0 = z;
        this.j0 = z2;
        this.l0 = gn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((y81) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        switch (b) {
            case 0:
                return new y81(q51Var, (gn2) obj2, (ql6) obj3, this.i0, this.j0);
            case 1:
                return new y81(this.i0, this.j0, (q80) obj3, (y05) obj2, q51Var);
            default:
                return new y81(q51Var, (dj4) obj3, (ux0) obj2, this.i0, this.j0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:73:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean zBooleanValue;
        boolean z;
        ux0 ux0Var;
        kh7 kh7Var;
        Integer num;
        switch (this.g0) {
            case 0:
                c71 c71Var = c71.X;
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ql6 ql6Var = (ql6) this.k0;
                boolean z3 = this.i0;
                x81 x81Var = new x81(null, (gn2) this.l0, ql6Var, this.j0, z3);
                this.h0 = true;
                Object objQ = ql6Var.q(z3, x81Var, this);
                return objQ == c71Var ? c71Var : objQ;
            case 1:
                c71 c71Var2 = c71.X;
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    if (this.i0 && ((Boolean) ((y05) this.l0).getValue()).booleanValue() && this.j0) {
                        q80 q80Var = (q80) this.k0;
                        this.h0 = true;
                        if (q80Var.a(null, this) == c71Var2) {
                            return c71Var2;
                        }
                    }
                } else {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                boolean z5 = this.i0;
                ux0 ux0Var2 = (ux0) this.l0;
                dj4 dj4Var = (dj4) this.k0;
                c71 c71Var3 = c71.X;
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    xg1 xg1Var = dj4Var.i;
                    if (xg1Var != null) {
                        this.h0 = true;
                        obj = xg1Var.J0(this);
                        if (obj == c71Var3) {
                            return c71Var3;
                        }
                    } else {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        dj4Var.c(dj4Var.f, -1);
                        ux0Var2.l0(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                    } else {
                        dj4Var.e = z5;
                        if (!z5) {
                            dj4Var.c(dj4Var.f, -1);
                        }
                        if (dj4Var.c != null) {
                            if (z5) {
                                dj4Var.c(dj4Var.f, 0);
                            }
                            z = this.j0;
                            ux0Var = dj4Var.h;
                            if (z) {
                                if (ux0Var != null) {
                                    p61.y("There is a new enableLowLightBoost being set", ux0Var);
                                }
                                dj4Var.h = null;
                            } else if (ux0Var != null) {
                                zc1.f0(ux0Var2, ux0Var);
                            }
                            dj4Var.h = ux0Var2;
                            kh7Var = dj4Var.a;
                            num = z5 ? new Integer(6) : null;
                            synchronized (kh7Var.d) {
                                kh7Var.k = num;
                            }
                            zc1.f0(kh7Var.f(), ux0Var2);
                            ux0Var2.D(new d3(ux0Var2, dj4Var, (byte) 13));
                        } else {
                            p61.y("Camera is not active.", ux0Var2);
                        }
                    }
                    return dn8.a;
                }
                if (!z6) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    dj4Var.c(dj4Var.f, -1);
                    ux0Var2.l0(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                } else {
                    dj4Var.e = z5;
                    if (!z5) {
                        dj4Var.c(dj4Var.f, -1);
                    }
                    if (dj4Var.c != null) {
                        if (z5) {
                            dj4Var.c(dj4Var.f, 0);
                        }
                        z = this.j0;
                        ux0Var = dj4Var.h;
                        if (z) {
                            if (ux0Var != null) {
                                p61.y("There is a new enableLowLightBoost being set", ux0Var);
                            }
                            dj4Var.h = null;
                        } else if (ux0Var != null) {
                            zc1.f0(ux0Var2, ux0Var);
                        }
                        dj4Var.h = ux0Var2;
                        kh7Var = dj4Var.a;
                        if (z5) {
                        }
                        synchronized (kh7Var.d) {
                            kh7Var.k = num;
                            zc1.f0(kh7Var.f(), ux0Var2);
                            ux0Var2.D(new d3(ux0Var2, dj4Var, (byte) 13));
                        }
                    } else {
                        p61.y("Camera is not active.", ux0Var2);
                    }
                }
                return dn8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(q51 q51Var, dj4 dj4Var, ux0 ux0Var, boolean z, boolean z2) {
        super(2, q51Var);
        this.k0 = dj4Var;
        this.l0 = ux0Var;
        this.i0 = z;
        this.j0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(boolean z, boolean z2, q80 q80Var, y05 y05Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = z;
        this.j0 = z2;
        this.k0 = q80Var;
        this.l0 = y05Var;
    }
}
