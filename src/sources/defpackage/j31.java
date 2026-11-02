package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j31 implements xe2 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ j31(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x0222  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x014d  */
    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) {
        dc2 dc2Var;
        df2 df2Var;
        int i;
        Iterator it;
        int i2;
        vf2 vf2Var;
        Object obj;
        h e;
        ql4 ql4Var;
        bo4 bo4Var;
        j1 j1Var;
        qu6 qu6Var;
        Throwable th;
        ch7 ch7Var;
        byte b = this.X;
        byte b2 = 1;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        q51 q51Var2 = null;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                Object objA = ((sf2) obj2).a(new n(ze2Var, b2), q51Var);
                return objA == c71Var ? objA : dn8Var;
            case 1:
                if (q51Var instanceof dc2) {
                    dc2Var = (dc2) q51Var;
                    int i3 = dc2Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dc2Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        dc2Var = new dc2(this, q51Var);
                    }
                } else {
                    dc2Var = new dc2(this, q51Var);
                }
                Object obj3 = dc2Var.f0;
                int i4 = dc2Var.g0;
                if (i4 == 0) {
                    w39.n0(obj3);
                    n nVar = new n(ze2Var, (byte) 6);
                    dc2Var.g0 = 1;
                    return ((cc2) obj2).a(nVar, dc2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i4 == 1) {
                    w39.n0(obj3);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                r0 r0Var = new r0((if2) obj2, ze2Var, q51Var2, (byte) 21);
                af2 af2Var = new af2(q51Var, q51Var.w());
                Object objD = z38.d(af2Var, true, af2Var, r0Var);
                return objD == c71Var ? objD : dn8Var;
            case 3:
                if (q51Var instanceof df2) {
                    df2Var = (df2) q51Var;
                    int i5 = df2Var.g0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        df2Var.g0 = i5 - Integer.MIN_VALUE;
                    } else {
                        df2Var = new df2(this, q51Var);
                    }
                } else {
                    df2Var = new df2(this, q51Var);
                }
                Object obj4 = df2Var.f0;
                int i6 = df2Var.g0;
                if (i6 == 0) {
                    w39.n0(obj4);
                    i = 0;
                    it = ((kf3) obj2).iterator();
                    i2 = 0;
                } else {
                    if (i6 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = df2Var.l0;
                    int i8 = df2Var.k0;
                    it = df2Var.j0;
                    ze2 ze2Var2 = df2Var.i0;
                    w39.n0(obj4);
                    i2 = i8;
                    i = i7;
                    ze2Var = ze2Var2;
                }
                while (it.hasNext()) {
                    Integer num = new Integer(((Number) it.next()).intValue());
                    df2Var.i0 = ze2Var;
                    df2Var.j0 = it;
                    df2Var.k0 = i2;
                    df2Var.l0 = i;
                    df2Var.g0 = 1;
                    if (ze2Var.l(num, df2Var) == c71Var) {
                        return c71Var;
                    }
                }
                return dn8Var;
            case 4:
                if (q51Var instanceof vf2) {
                    vf2Var = (vf2) q51Var;
                    int i9 = vf2Var.g0;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vf2Var.g0 = i9 - Integer.MIN_VALUE;
                    } else {
                        vf2Var = new vf2(this, q51Var);
                    }
                } else {
                    vf2Var = new vf2(this, q51Var);
                }
                Object obj5 = vf2Var.f0;
                int i10 = vf2Var.g0;
                if (i10 == 0) {
                    w39.n0(obj5);
                    Object obj6 = new Object();
                    try {
                        zj zjVar = new zj(new ca6(), ze2Var, obj6, (byte) 4);
                        vf2Var.i0 = obj6;
                        vf2Var.g0 = 1;
                        return ((o) obj2).a(zjVar, vf2Var) == c71Var ? c71Var : dn8Var;
                    } catch (h e2) {
                        obj = obj6;
                        e = e2;
                    }
                } else {
                    if (i10 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = vf2Var.i0;
                    try {
                        w39.n0(obj5);
                        return dn8Var;
                    } catch (h e3) {
                        e = e3;
                    }
                }
                if (e.X == obj) {
                    return dn8Var;
                }
                throw e;
            case 5:
                if (q51Var instanceof ql4) {
                    ql4Var = (ql4) q51Var;
                    int i11 = ql4Var.g0;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ql4Var.g0 = i11 - Integer.MIN_VALUE;
                    } else {
                        ql4Var = new ql4(this, q51Var);
                    }
                } else {
                    ql4Var = new ql4(this, q51Var);
                }
                Object obj7 = ql4Var.f0;
                int i12 = ql4Var.g0;
                if (i12 == 0) {
                    w39.n0(obj7);
                    n nVar2 = new n(ze2Var, (byte) 16);
                    ql4Var.g0 = 1;
                    return ((o) obj2).a(nVar2, ql4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i12 == 1) {
                    w39.n0(obj7);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (q51Var instanceof bo4) {
                    bo4Var = (bo4) q51Var;
                    int i13 = bo4Var.g0;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bo4Var.g0 = i13 - Integer.MIN_VALUE;
                    } else {
                        bo4Var = new bo4(this, q51Var);
                    }
                } else {
                    bo4Var = new bo4(this, q51Var);
                }
                Object obj8 = bo4Var.f0;
                int i14 = bo4Var.g0;
                if (i14 == 0) {
                    w39.n0(obj8);
                    n nVar3 = new n(ze2Var, (byte) 19);
                    bo4Var.g0 = 1;
                    return ((o) obj2).a(nVar3, bo4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i14 == 1) {
                    w39.n0(obj8);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (q51Var instanceof j1) {
                    j1Var = (j1) q51Var;
                    int i15 = j1Var.i0;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        j1Var.i0 = i15 - Integer.MIN_VALUE;
                    } else {
                        j1Var = new j1(this, q51Var);
                    }
                } else {
                    j1Var = new j1(this, q51Var);
                }
                Object obj9 = j1Var.g0;
                int i16 = j1Var.i0;
                if (i16 != 0) {
                    if (i16 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qu6Var = j1Var.f0;
                    try {
                        w39.n0(obj9);
                        qu6Var.r();
                        return dn8Var;
                    } catch (Throwable th2) {
                        th = th2;
                        qu6Var.r();
                        throw th;
                    }
                }
                w39.n0(obj9);
                s61 s61Var = j1Var.Y;
                s61Var.getClass();
                qu6 qu6Var2 = new qu6(ze2Var, s61Var);
                try {
                    j1Var.f0 = qu6Var2;
                    j1Var.i0 = 1;
                    Object objK = ((rn2) obj2).K(qu6Var2, j1Var);
                    if (objK != c71Var) {
                        objK = dn8Var;
                    }
                    if (objK == c71Var) {
                        return c71Var;
                    }
                    qu6Var = qu6Var2;
                    qu6Var.r();
                    return dn8Var;
                } catch (Throwable th3) {
                    qu6Var = qu6Var2;
                    th = th3;
                    qu6Var.r();
                    throw th;
                }
            case 8:
                if (q51Var instanceof ch7) {
                    ch7Var = (ch7) q51Var;
                    int i17 = ch7Var.g0;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ch7Var.g0 = i17 - Integer.MIN_VALUE;
                    } else {
                        ch7Var = new ch7(this, q51Var);
                    }
                } else {
                    ch7Var = new ch7(this, q51Var);
                }
                Object obj10 = ch7Var.f0;
                int i18 = ch7Var.g0;
                if (i18 != 0) {
                    if (i18 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj10);
                        b61.n();
                    }
                    return null;
                }
                w39.n0(obj10);
                te0 te0Var = new te0(new aa6(), ze2Var, (byte) 13);
                ch7Var.g0 = 1;
                ((lq7) obj2).a(te0Var, ch7Var);
                return c71Var;
            default:
                xe2[] xe2VarArr = (xe2[]) obj2;
                Object objK2 = g33.k(q51Var, ze2Var, new zk3(xe2VarArr, (byte) 28), new ja(3, q51Var2), xe2VarArr);
                return objK2 == c71Var ? objK2 : dn8Var;
        }
    }
}
