package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.domain.routing.entity.SubRoutingState;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class hp7 extends uy7 implements rn2 {
    public yg1 g0;
    public xg1 h0;
    public xg1 i0;
    public xg1 j0;
    public xg1 k0;
    public String l0;
    public SubRoutingState m0;
    public j2 n0;
    public String o0;
    public boolean p0;
    public byte q0;
    public /* synthetic */ Object r0;
    public final /* synthetic */ np7 s0;
    public final /* synthetic */ String t0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp7(np7 np7Var, String str, q51 q51Var) {
        super(2, q51Var);
        this.s0 = np7Var;
        this.t0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        hp7 hp7Var = new hp7(this.s0, this.t0, q51Var);
        hp7Var.r0 = obj;
        return hp7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:20:0x0102  */
    /* JADX WARN: Code duplicated, block: B:24:0x0124  */
    /* JADX WARN: Code duplicated, block: B:28:0x014c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0172  */
    /* JADX WARN: Code duplicated, block: B:35:0x017c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0181  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a2  */
    public final Object q(Object obj) {
        yg1 yg1VarJ;
        xg1 xg1VarJ;
        xg1 xg1VarJ2;
        xg1 xg1VarJ3;
        Object objH;
        xg1 xg1Var;
        String str;
        Object objJ0;
        xg1 xg1Var2;
        String str2;
        xg1 xg1Var3;
        SubRoutingState subRoutingState;
        Object objJ1;
        String str3;
        xg1 xg1Var4;
        SubRoutingState subRoutingState2;
        xg1 xg1Var5;
        xg1 xg1Var6;
        boolean zBooleanValue;
        Object objJ2;
        xg1 xg1Var7;
        boolean z;
        String str4;
        j2 j2Var;
        Object objJ3;
        SubRoutingState subRoutingState3;
        j2 j2Var2;
        xg1 xg1Var8;
        RouteProfileId routeProfileId;
        String strC;
        Object objJ4;
        final j2 j2Var3;
        final String str5;
        final String str6;
        b71 b71Var = (b71) this.r0;
        byte b = this.q0;
        byte b2 = 3;
        byte b3 = 2;
        np7 np7Var = this.s0;
        final String str7 = this.t0;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                w39.n0(obj);
                nf1 nf1Var = tp1.a;
                ye1 ye1Var = ye1.Z;
                byte b4 = 1;
                yg1 yg1VarJ2 = w51.j(b71Var, ye1Var, new gp7(str7, q51Var, b4), 2);
                yg1VarJ = w51.j(b71Var, ye1Var, new fp7(np7Var, str7, q51Var, b3), 2);
                nf1 nf1Var2 = tp1.a;
                byte b5 = 0;
                xg1 xg1VarJ4 = w51.j(b71Var, nf1Var2, new gp7(str7, q51Var, b5), 2);
                xg1VarJ = w51.j(b71Var, ye1Var, new fp7(np7Var, str7, q51Var, b4), 2);
                xg1VarJ2 = w51.j(b71Var, ye1Var, new fp7(np7Var, str7, q51Var, b2), 2);
                xg1VarJ3 = w51.j(b71Var, nf1Var2, new fp7(np7Var, str7, q51Var, b5), 2);
                this.r0 = null;
                this.g0 = yg1VarJ;
                this.h0 = xg1VarJ4;
                this.i0 = xg1VarJ;
                this.j0 = xg1VarJ2;
                this.k0 = xg1VarJ3;
                this.q0 = (byte) 1;
                objH = yg1VarJ2.h(this);
                if (objH != c71Var) {
                    xg1Var = xg1VarJ4;
                    str = (String) objH;
                    this.r0 = null;
                    this.g0 = null;
                    this.h0 = xg1Var;
                    this.i0 = xg1VarJ;
                    this.j0 = xg1VarJ2;
                    this.k0 = xg1VarJ3;
                    this.l0 = str;
                    this.q0 = (byte) 2;
                    objJ0 = yg1VarJ.J0(this);
                    if (objJ0 != c71Var) {
                        xg1 xg1Var9 = xg1VarJ2;
                        xg1Var2 = xg1VarJ3;
                        str2 = str;
                        xg1Var3 = xg1Var9;
                        subRoutingState = (SubRoutingState) objJ0;
                        this.r0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.i0 = xg1VarJ;
                        this.j0 = xg1Var3;
                        this.k0 = xg1Var2;
                        this.l0 = str2;
                        this.m0 = subRoutingState;
                        this.q0 = (byte) 3;
                        objJ1 = xg1Var.J0(this);
                        if (objJ1 != c71Var) {
                            str3 = str2;
                            xg1Var4 = xg1Var2;
                            subRoutingState2 = subRoutingState;
                            xg1Var5 = xg1Var3;
                            xg1Var6 = xg1VarJ;
                            zBooleanValue = ((Boolean) objJ1).booleanValue();
                            this.r0 = null;
                            this.g0 = null;
                            this.h0 = null;
                            this.i0 = null;
                            this.j0 = xg1Var5;
                            this.k0 = xg1Var4;
                            this.l0 = str3;
                            this.m0 = subRoutingState2;
                            this.p0 = zBooleanValue;
                            this.q0 = (byte) 4;
                            objJ2 = xg1Var6.J0(this);
                            if (objJ2 != c71Var) {
                                String str8 = str3;
                                xg1Var7 = xg1Var4;
                                z = zBooleanValue;
                                str4 = str8;
                                j2Var = (j2) objJ2;
                                this.r0 = null;
                                this.g0 = null;
                                this.h0 = null;
                                this.i0 = null;
                                this.j0 = null;
                                this.k0 = xg1Var7;
                                this.l0 = str4;
                                this.m0 = subRoutingState2;
                                this.n0 = j2Var;
                                this.p0 = z;
                                this.q0 = (byte) 5;
                                objJ3 = xg1Var5.J0(this);
                                if (objJ3 != c71Var) {
                                    xg1 xg1Var10 = xg1Var7;
                                    subRoutingState3 = subRoutingState2;
                                    j2Var2 = j2Var;
                                    xg1Var8 = xg1Var10;
                                    routeProfileId = (RouteProfileId) objJ3;
                                    if (routeProfileId != null) {
                                        strC = routeProfileId.c();
                                    } else {
                                        strC = null;
                                    }
                                    this.r0 = null;
                                    this.g0 = null;
                                    this.h0 = null;
                                    this.i0 = null;
                                    this.j0 = null;
                                    this.k0 = null;
                                    this.l0 = str4;
                                    this.m0 = subRoutingState3;
                                    this.n0 = j2Var2;
                                    this.o0 = strC;
                                    this.p0 = z;
                                    this.q0 = (byte) 6;
                                    objJ4 = xg1Var8.J0(this);
                                    if (objJ4 != c71Var) {
                                        j2Var3 = j2Var2;
                                        str5 = str4;
                                        str6 = strC;
                                        final boolean z2 = z;
                                        final SubRoutingState subRoutingState4 = subRoutingState3;
                                        final boolean zBooleanValue2 = ((Boolean) objJ4).booleanValue();
                                        u15.S(np7Var.e, new gn2() { // from class: ep7
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            public final Object B(Object obj2) {
                                                qn7 qn7Var = (qn7) obj2;
                                                SubRoutingState subRoutingState5 = subRoutingState4;
                                                return qn7.a(qn7Var, str7, str5, z2, subRoutingState5 != null && subRoutingState5.d(), subRoutingState5 != null && subRoutingState5.e(), j2Var3, str6, zBooleanValue2, null, null, false, false, false, null, 32256);
                                            }
                                        });
                                        return dn8.a;
                                    }
                                }
                            }
                        }
                    }
                }
                return c71Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                xg1VarJ3 = this.k0;
                xg1VarJ2 = this.j0;
                xg1 xg1Var11 = this.i0;
                xg1Var = this.h0;
                yg1VarJ = this.g0;
                w39.n0(obj);
                xg1VarJ = xg1Var11;
                objH = obj;
                str = (String) objH;
                this.r0 = null;
                this.g0 = null;
                this.h0 = xg1Var;
                this.i0 = xg1VarJ;
                this.j0 = xg1VarJ2;
                this.k0 = xg1VarJ3;
                this.l0 = str;
                this.q0 = (byte) 2;
                objJ0 = yg1VarJ.J0(this);
                if (objJ0 != c71Var) {
                    xg1 xg1Var12 = xg1VarJ2;
                    xg1Var2 = xg1VarJ3;
                    str2 = str;
                    xg1Var3 = xg1Var12;
                    subRoutingState = (SubRoutingState) objJ0;
                    this.r0 = null;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = xg1VarJ;
                    this.j0 = xg1Var3;
                    this.k0 = xg1Var2;
                    this.l0 = str2;
                    this.m0 = subRoutingState;
                    this.q0 = (byte) 3;
                    objJ1 = xg1Var.J0(this);
                    if (objJ1 != c71Var) {
                        str3 = str2;
                        xg1Var4 = xg1Var2;
                        subRoutingState2 = subRoutingState;
                        xg1Var5 = xg1Var3;
                        xg1Var6 = xg1VarJ;
                        zBooleanValue = ((Boolean) objJ1).booleanValue();
                        this.r0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.i0 = null;
                        this.j0 = xg1Var5;
                        this.k0 = xg1Var4;
                        this.l0 = str3;
                        this.m0 = subRoutingState2;
                        this.p0 = zBooleanValue;
                        this.q0 = (byte) 4;
                        objJ2 = xg1Var6.J0(this);
                        if (objJ2 != c71Var) {
                            String str9 = str3;
                            xg1Var7 = xg1Var4;
                            z = zBooleanValue;
                            str4 = str9;
                            j2Var = (j2) objJ2;
                            this.r0 = null;
                            this.g0 = null;
                            this.h0 = null;
                            this.i0 = null;
                            this.j0 = null;
                            this.k0 = xg1Var7;
                            this.l0 = str4;
                            this.m0 = subRoutingState2;
                            this.n0 = j2Var;
                            this.p0 = z;
                            this.q0 = (byte) 5;
                            objJ3 = xg1Var5.J0(this);
                            if (objJ3 != c71Var) {
                                xg1 xg1Var13 = xg1Var7;
                                subRoutingState3 = subRoutingState2;
                                j2Var2 = j2Var;
                                xg1Var8 = xg1Var13;
                                routeProfileId = (RouteProfileId) objJ3;
                                if (routeProfileId != null) {
                                    strC = routeProfileId.c();
                                } else {
                                    strC = null;
                                }
                                this.r0 = null;
                                this.g0 = null;
                                this.h0 = null;
                                this.i0 = null;
                                this.j0 = null;
                                this.k0 = null;
                                this.l0 = str4;
                                this.m0 = subRoutingState3;
                                this.n0 = j2Var2;
                                this.o0 = strC;
                                this.p0 = z;
                                this.q0 = (byte) 6;
                                objJ4 = xg1Var8.J0(this);
                                if (objJ4 != c71Var) {
                                    j2Var3 = j2Var2;
                                    str5 = str4;
                                    str6 = strC;
                                    final boolean z3 = z;
                                    final SubRoutingState subRoutingState5 = subRoutingState3;
                                    final boolean zBooleanValue3 = ((Boolean) objJ4).booleanValue();
                                    u15.S(np7Var.e, new gn2() { // from class: ep7
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        public final Object B(Object obj2) {
                                            qn7 qn7Var = (qn7) obj2;
                                            SubRoutingState subRoutingState6 = subRoutingState5;
                                            return qn7.a(qn7Var, str7, str5, z3, subRoutingState6 != null && subRoutingState6.d(), subRoutingState6 != null && subRoutingState6.e(), j2Var3, str6, zBooleanValue3, null, null, false, false, false, null, 32256);
                                        }
                                    });
                                    return dn8.a;
                                }
                            }
                        }
                    }
                }
                return c71Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                str2 = this.l0;
                xg1Var2 = this.k0;
                xg1 xg1Var14 = this.j0;
                xg1 xg1Var15 = this.i0;
                xg1Var = this.h0;
                w39.n0(obj);
                xg1VarJ = xg1Var15;
                xg1Var3 = xg1Var14;
                objJ0 = obj;
                subRoutingState = (SubRoutingState) objJ0;
                this.r0 = null;
                this.g0 = null;
                this.h0 = null;
                this.i0 = xg1VarJ;
                this.j0 = xg1Var3;
                this.k0 = xg1Var2;
                this.l0 = str2;
                this.m0 = subRoutingState;
                this.q0 = (byte) 3;
                objJ1 = xg1Var.J0(this);
                if (objJ1 != c71Var) {
                    str3 = str2;
                    xg1Var4 = xg1Var2;
                    subRoutingState2 = subRoutingState;
                    xg1Var5 = xg1Var3;
                    xg1Var6 = xg1VarJ;
                    zBooleanValue = ((Boolean) objJ1).booleanValue();
                    this.r0 = null;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = null;
                    this.j0 = xg1Var5;
                    this.k0 = xg1Var4;
                    this.l0 = str3;
                    this.m0 = subRoutingState2;
                    this.p0 = zBooleanValue;
                    this.q0 = (byte) 4;
                    objJ2 = xg1Var6.J0(this);
                    if (objJ2 != c71Var) {
                        String str10 = str3;
                        xg1Var7 = xg1Var4;
                        z = zBooleanValue;
                        str4 = str10;
                        j2Var = (j2) objJ2;
                        this.r0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.i0 = null;
                        this.j0 = null;
                        this.k0 = xg1Var7;
                        this.l0 = str4;
                        this.m0 = subRoutingState2;
                        this.n0 = j2Var;
                        this.p0 = z;
                        this.q0 = (byte) 5;
                        objJ3 = xg1Var5.J0(this);
                        if (objJ3 != c71Var) {
                            xg1 xg1Var16 = xg1Var7;
                            subRoutingState3 = subRoutingState2;
                            j2Var2 = j2Var;
                            xg1Var8 = xg1Var16;
                            routeProfileId = (RouteProfileId) objJ3;
                            if (routeProfileId != null) {
                                strC = routeProfileId.c();
                            } else {
                                strC = null;
                            }
                            this.r0 = null;
                            this.g0 = null;
                            this.h0 = null;
                            this.i0 = null;
                            this.j0 = null;
                            this.k0 = null;
                            this.l0 = str4;
                            this.m0 = subRoutingState3;
                            this.n0 = j2Var2;
                            this.o0 = strC;
                            this.p0 = z;
                            this.q0 = (byte) 6;
                            objJ4 = xg1Var8.J0(this);
                            if (objJ4 != c71Var) {
                                j2Var3 = j2Var2;
                                str5 = str4;
                                str6 = strC;
                                final boolean z4 = z;
                                final SubRoutingState subRoutingState6 = subRoutingState3;
                                final boolean zBooleanValue4 = ((Boolean) objJ4).booleanValue();
                                u15.S(np7Var.e, new gn2() { // from class: ep7
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public final Object B(Object obj2) {
                                        qn7 qn7Var = (qn7) obj2;
                                        SubRoutingState subRoutingState7 = subRoutingState6;
                                        return qn7.a(qn7Var, str7, str5, z4, subRoutingState7 != null && subRoutingState7.d(), subRoutingState7 != null && subRoutingState7.e(), j2Var3, str6, zBooleanValue4, null, null, false, false, false, null, 32256);
                                    }
                                });
                                return dn8.a;
                            }
                        }
                    }
                }
                return c71Var;
            case 3:
                SubRoutingState subRoutingState7 = this.m0;
                String str11 = this.l0;
                xg1 xg1Var17 = this.k0;
                xg1 xg1Var18 = this.j0;
                xg1Var6 = this.i0;
                w39.n0(obj);
                xg1Var5 = xg1Var18;
                str3 = str11;
                subRoutingState2 = subRoutingState7;
                xg1Var4 = xg1Var17;
                objJ1 = obj;
                zBooleanValue = ((Boolean) objJ1).booleanValue();
                this.r0 = null;
                this.g0 = null;
                this.h0 = null;
                this.i0 = null;
                this.j0 = xg1Var5;
                this.k0 = xg1Var4;
                this.l0 = str3;
                this.m0 = subRoutingState2;
                this.p0 = zBooleanValue;
                this.q0 = (byte) 4;
                objJ2 = xg1Var6.J0(this);
                if (objJ2 != c71Var) {
                    String str12 = str3;
                    xg1Var7 = xg1Var4;
                    z = zBooleanValue;
                    str4 = str12;
                    j2Var = (j2) objJ2;
                    this.r0 = null;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = null;
                    this.j0 = null;
                    this.k0 = xg1Var7;
                    this.l0 = str4;
                    this.m0 = subRoutingState2;
                    this.n0 = j2Var;
                    this.p0 = z;
                    this.q0 = (byte) 5;
                    objJ3 = xg1Var5.J0(this);
                    if (objJ3 != c71Var) {
                        xg1 xg1Var19 = xg1Var7;
                        subRoutingState3 = subRoutingState2;
                        j2Var2 = j2Var;
                        xg1Var8 = xg1Var19;
                        routeProfileId = (RouteProfileId) objJ3;
                        if (routeProfileId != null) {
                            strC = routeProfileId.c();
                        } else {
                            strC = null;
                        }
                        this.r0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.i0 = null;
                        this.j0 = null;
                        this.k0 = null;
                        this.l0 = str4;
                        this.m0 = subRoutingState3;
                        this.n0 = j2Var2;
                        this.o0 = strC;
                        this.p0 = z;
                        this.q0 = (byte) 6;
                        objJ4 = xg1Var8.J0(this);
                        if (objJ4 != c71Var) {
                            j2Var3 = j2Var2;
                            str5 = str4;
                            str6 = strC;
                            final boolean z5 = z;
                            final SubRoutingState subRoutingState8 = subRoutingState3;
                            final boolean zBooleanValue5 = ((Boolean) objJ4).booleanValue();
                            u15.S(np7Var.e, new gn2() { // from class: ep7
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                public final Object B(Object obj2) {
                                    qn7 qn7Var = (qn7) obj2;
                                    SubRoutingState subRoutingState9 = subRoutingState8;
                                    return qn7.a(qn7Var, str7, str5, z5, subRoutingState9 != null && subRoutingState9.d(), subRoutingState9 != null && subRoutingState9.e(), j2Var3, str6, zBooleanValue5, null, null, false, false, false, null, 32256);
                                }
                            });
                            return dn8.a;
                        }
                    }
                }
                return c71Var;
            case 4:
                z = this.p0;
                subRoutingState2 = this.m0;
                str4 = this.l0;
                xg1Var7 = this.k0;
                xg1 xg1Var20 = this.j0;
                w39.n0(obj);
                xg1Var5 = xg1Var20;
                objJ2 = obj;
                j2Var = (j2) objJ2;
                this.r0 = null;
                this.g0 = null;
                this.h0 = null;
                this.i0 = null;
                this.j0 = null;
                this.k0 = xg1Var7;
                this.l0 = str4;
                this.m0 = subRoutingState2;
                this.n0 = j2Var;
                this.p0 = z;
                this.q0 = (byte) 5;
                objJ3 = xg1Var5.J0(this);
                if (objJ3 != c71Var) {
                    xg1 xg1Var110 = xg1Var7;
                    subRoutingState3 = subRoutingState2;
                    j2Var2 = j2Var;
                    xg1Var8 = xg1Var110;
                    routeProfileId = (RouteProfileId) objJ3;
                    if (routeProfileId != null) {
                        strC = routeProfileId.c();
                    } else {
                        strC = null;
                    }
                    this.r0 = null;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = null;
                    this.j0 = null;
                    this.k0 = null;
                    this.l0 = str4;
                    this.m0 = subRoutingState3;
                    this.n0 = j2Var2;
                    this.o0 = strC;
                    this.p0 = z;
                    this.q0 = (byte) 6;
                    objJ4 = xg1Var8.J0(this);
                    if (objJ4 != c71Var) {
                        j2Var3 = j2Var2;
                        str5 = str4;
                        str6 = strC;
                        final boolean z6 = z;
                        final SubRoutingState subRoutingState9 = subRoutingState3;
                        final boolean zBooleanValue6 = ((Boolean) objJ4).booleanValue();
                        u15.S(np7Var.e, new gn2() { // from class: ep7
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object B(Object obj2) {
                                qn7 qn7Var = (qn7) obj2;
                                SubRoutingState subRoutingState10 = subRoutingState9;
                                return qn7.a(qn7Var, str7, str5, z6, subRoutingState10 != null && subRoutingState10.d(), subRoutingState10 != null && subRoutingState10.e(), j2Var3, str6, zBooleanValue6, null, null, false, false, false, null, 32256);
                            }
                        });
                        return dn8.a;
                    }
                }
                return c71Var;
            case 5:
                z = this.p0;
                j2Var2 = this.n0;
                SubRoutingState subRoutingState10 = this.m0;
                String str13 = this.l0;
                xg1Var8 = this.k0;
                w39.n0(obj);
                subRoutingState3 = subRoutingState10;
                str4 = str13;
                objJ3 = obj;
                routeProfileId = (RouteProfileId) objJ3;
                if (routeProfileId != null) {
                    strC = routeProfileId.c();
                } else {
                    strC = null;
                }
                this.r0 = null;
                this.g0 = null;
                this.h0 = null;
                this.i0 = null;
                this.j0 = null;
                this.k0 = null;
                this.l0 = str4;
                this.m0 = subRoutingState3;
                this.n0 = j2Var2;
                this.o0 = strC;
                this.p0 = z;
                this.q0 = (byte) 6;
                objJ4 = xg1Var8.J0(this);
                if (objJ4 != c71Var) {
                    j2Var3 = j2Var2;
                    str5 = str4;
                    str6 = strC;
                    final boolean z7 = z;
                    final SubRoutingState subRoutingState11 = subRoutingState3;
                    final boolean zBooleanValue7 = ((Boolean) objJ4).booleanValue();
                    u15.S(np7Var.e, new gn2() { // from class: ep7
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final Object B(Object obj2) {
                            qn7 qn7Var = (qn7) obj2;
                            SubRoutingState subRoutingState12 = subRoutingState11;
                            return qn7.a(qn7Var, str7, str5, z7, subRoutingState12 != null && subRoutingState12.d(), subRoutingState12 != null && subRoutingState12.e(), j2Var3, str6, zBooleanValue7, null, null, false, false, false, null, 32256);
                        }
                    });
                    return dn8.a;
                }
                return c71Var;
            case 6:
                z = this.p0;
                String str14 = this.o0;
                j2 j2Var4 = this.n0;
                subRoutingState3 = this.m0;
                String str15 = this.l0;
                w39.n0(obj);
                str5 = str15;
                str6 = str14;
                j2Var3 = j2Var4;
                objJ4 = obj;
                final boolean z8 = z;
                final SubRoutingState subRoutingState12 = subRoutingState3;
                final boolean zBooleanValue8 = ((Boolean) objJ4).booleanValue();
                u15.S(np7Var.e, new gn2() { // from class: ep7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object B(Object obj2) {
                        qn7 qn7Var = (qn7) obj2;
                        SubRoutingState subRoutingState13 = subRoutingState12;
                        return qn7.a(qn7Var, str7, str5, z8, subRoutingState13 != null && subRoutingState13.d(), subRoutingState13 != null && subRoutingState13.e(), j2Var3, str6, zBooleanValue8, null, null, false, false, false, null, 32256);
                    }
                });
                return dn8.a;
            default:
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
