package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bg {
    public static final ox1 a = new ox1(new x((byte) 16), (byte) 0);
    public static final ox1 b = new ox1(new j72((byte) 10), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:105:0x024a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0254  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x0199  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r26v0, types: [lp2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void a(nr5 nr5Var, dn2 dn2Var, final or5 or5Var, zy0 zy0Var, lp2 lp2Var, int i, int i2) {
        int i3;
        dn2 dn2Var2;
        or5 or5Var2;
        int i4;
        boolean z;
        dn2 dn2Var3;
        j86 j86VarR;
        final dn2 dn2Var4;
        View view;
        fi1 fi1Var;
        String str;
        final z24 z24Var;
        jp2 jp2VarJ0;
        y05 y05VarP;
        Object objK;
        be beVar;
        Object obj;
        UUID uuid;
        boolean zBooleanValue;
        Object objK2;
        String str2;
        ?? r13;
        ir5 ir5Var;
        int i5;
        ?? r4;
        int i6;
        ?? r5;
        boolean z2;
        Object objK3;
        final ir5 ir5Var2;
        ?? r6;
        ?? r7;
        boolean z3;
        Object objK4;
        ?? r8;
        int i7;
        byte b2;
        Object obj2;
        boolean zH;
        Object obj3;
        boolean zH2;
        Object obj4;
        boolean zH3;
        Object obj5;
        int i8;
        int i9;
        nr5 nr5Var2 = nr5Var;
        lp2Var.X(-1772091631);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(nr5Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                dn2Var2 = dn2Var;
                i3 |= lp2Var.h(dn2Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                or5Var2 = or5Var;
                if (lp2Var.f(or5Var2)) {
                    i9 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            } else {
                or5Var2 = or5Var;
            }
            if ((i & 3072) == 0) {
                if (lp2Var.h(zy0Var)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (lp2Var.N(i4 & 1, z)) {
                if (i10 != 0) {
                    dn2Var4 = null;
                } else {
                    dn2Var4 = dn2Var2;
                }
                view = (View) lp2Var.j(pc.f);
                fi1Var = (fi1) lp2Var.j(y01.h);
                str = (String) lp2Var.j(a);
                z24Var = (z24) lp2Var.j(y01.n);
                jp2VarJ0 = km4.j0(lp2Var);
                y05VarP = z51.P(zy0Var, lp2Var);
                Object[] objArr = new Object[0];
                objK = lp2Var.K();
                beVar = zz0.a;
                obj = objK;
                if (objK == beVar) {
                    x xVar = new x((byte) 17);
                    lp2Var.g0(xVar);
                    obj = xVar;
                }
                uuid = (UUID) jm4.W(objArr, (dn2) obj, lp2Var);
                zBooleanValue = ((Boolean) lp2Var.j(b)).booleanValue();
                objK2 = lp2Var.K();
                if (objK2 == beVar) {
                    str2 = str;
                    r13 = 1;
                    ir5 ir5Var3 = new ir5(dn2Var4, or5Var2, str2, view, fi1Var, nr5Var2, uuid, zBooleanValue);
                    nr5Var2 = nr5Var2;
                    ir5Var3.m(jp2VarJ0, new zy0(-297523940, true, new tf(ir5Var3, y05VarP, true ? 1 : 0)));
                    lp2Var.g0(ir5Var3);
                    objK2 = ir5Var3;
                } else {
                    str2 = str;
                    r13 = 1;
                }
                ir5Var = (ir5) objK2;
                boolean zH4 = lp2Var.h(ir5Var);
                i5 = i4 & 112;
                if (i5 == 32) {
                    r4 = r13;
                } else {
                    r4 = 0;
                }
                int i11 = (zH4 ? 1 : 0) | r4;
                i6 = i4 & 896;
                if (i6 == 256) {
                    r5 = r13;
                } else {
                    r5 = 0;
                }
                z2 = ((((i11 == true ? 1 : 0) | r5) == true ? 1 : 0) | (lp2Var.f(str2) ? 1 : 0) ? 1 : 0) | (lp2Var.d(z24Var.ordinal()) ? 1 : 0);
                objK3 = lp2Var.K();
                if (!z2 || objK3 == beVar) {
                    ir5Var2 = ir5Var;
                    vf vfVar = new vf(ir5Var2, dn2Var4, or5Var, str2, z24Var, (byte) 0);
                    lp2Var.g0(vfVar);
                    objK3 = vfVar;
                } else {
                    ir5Var2 = ir5Var;
                }
                u70.a(ir5Var2, (gn2) objK3, lp2Var);
                boolean zH5 = lp2Var.h(ir5Var2);
                if (i5 == 32) {
                    r6 = r13;
                } else {
                    r6 = 0;
                }
                int i12 = (zH5 ? 1 : 0) | r6;
                if (i6 == 256) {
                    r7 = r13;
                } else {
                    r7 = 0;
                }
                z3 = ((((i12 == true ? 1 : 0) | r7) == true ? 1 : 0) | (lp2Var.f(str2) ? 1 : 0) ? 1 : 0) | (lp2Var.d(z24Var.ordinal()) ? 1 : 0);
                objK4 = lp2Var.K();
                if (z3 || objK4 == beVar) {
                    final String str3 = str2;
                    dn2 dn2Var5 = new dn2() { // from class: wf
                        @Override // defpackage.dn2
                        public final Object invoke() {
                            ir5Var2.n(dn2Var4, or5Var, str3, z24Var);
                            return dn8.a;
                        }
                    };
                    lp2Var.g0(dn2Var5);
                    objK4 = dn2Var5;
                }
                u70.q((dn2) objK4, lp2Var);
                boolean zH6 = lp2Var.h(ir5Var2);
                if ((i4 & 14) == 4) {
                    r8 = r13;
                } else {
                    r8 = 0;
                }
                i7 = (zH6 ? 1 : 0) | r8;
                Object objK5 = lp2Var.K();
                b2 = 3;
                obj2 = objK5;
                if (i7 == 0 || objK5 == beVar) {
                    p0 p0Var = new p0(ir5Var2, nr5Var2, b2);
                    lp2Var.g0(p0Var);
                    obj2 = p0Var;
                }
                u70.a(nr5Var2, (gn2) obj2, lp2Var);
                zH = lp2Var.h(ir5Var2);
                Object objK6 = lp2Var.K();
                obj3 = objK6;
                if (zH || objK6 == beVar) {
                    q0 q0Var = new q0(ir5Var2, (q51) null, b2);
                    lp2Var.g0(q0Var);
                    obj3 = q0Var;
                }
                u70.h((rn2) obj3, lp2Var, ir5Var2);
                zH2 = lp2Var.h(ir5Var2);
                Object objK7 = lp2Var.K();
                obj4 = objK7;
                if (zH2 || objK7 == beVar) {
                    uf ufVar = new uf(ir5Var2, r13);
                    lp2Var.g0(ufVar);
                    obj4 = ufVar;
                }
                kx4 kx4VarQ = vr3.Q(hx4.X, (gn2) obj4);
                zH3 = lp2Var.h(ir5Var2) | lp2Var.d(z24Var.ordinal());
                Object objK8 = lp2Var.K();
                obj5 = objK8;
                if (zH3 || objK8 == beVar) {
                    yf yfVar = new yf(ir5Var2, z24Var, (byte) 0);
                    lp2Var.g0(yfVar);
                    obj5 = yfVar;
                }
                xr4 xr4Var = (xr4) obj5;
                int iHashCode = Long.hashCode(lp2Var.T);
                kl5 kl5VarL = lp2Var.l();
                kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarQ);
                uz0.j.getClass();
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(pz2.B0, lp2Var, xr4Var);
                pn7.m(pz2.A0, lp2Var, kl5VarL);
                pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                pn7.l(lp2Var);
                pn7.m(pz2.z0, lp2Var, kx4VarQ2);
                lp2Var.p(r13);
                dn2Var3 = dn2Var4;
            } else {
                lp2Var.Q();
                dn2Var3 = dn2Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new xf(nr5Var2, dn2Var3, or5Var, zy0Var, i, i2, (byte) 0);
            }
        }
        i3 |= 48;
        dn2Var2 = dn2Var;
        if ((i & 384) == 0) {
            or5Var2 = or5Var;
            if (lp2Var.f(or5Var2)) {
                i9 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            or5Var2 = or5Var;
        }
        if ((i & 3072) == 0) {
            if (lp2Var.h(zy0Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (lp2Var.N(i4 & 1, z)) {
            if (i10 != 0) {
                dn2Var4 = null;
            } else {
                dn2Var4 = dn2Var2;
            }
            view = (View) lp2Var.j(pc.f);
            fi1Var = (fi1) lp2Var.j(y01.h);
            str = (String) lp2Var.j(a);
            z24Var = (z24) lp2Var.j(y01.n);
            jp2VarJ0 = km4.j0(lp2Var);
            y05VarP = z51.P(zy0Var, lp2Var);
            Object[] objArr2 = new Object[0];
            objK = lp2Var.K();
            beVar = zz0.a;
            obj = objK;
            if (objK == beVar) {
                x xVar2 = new x((byte) 17);
                lp2Var.g0(xVar2);
                obj = xVar2;
            }
            uuid = (UUID) jm4.W(objArr2, (dn2) obj, lp2Var);
            zBooleanValue = ((Boolean) lp2Var.j(b)).booleanValue();
            objK2 = lp2Var.K();
            if (objK2 == beVar) {
                str2 = str;
                r13 = 1;
                ir5 ir5Var4 = new ir5(dn2Var4, or5Var2, str2, view, fi1Var, nr5Var2, uuid, zBooleanValue);
                nr5Var2 = nr5Var2;
                ir5Var4.m(jp2VarJ0, new zy0(-297523940, true, new tf(ir5Var4, y05VarP, true ? 1 : 0)));
                lp2Var.g0(ir5Var4);
                objK2 = ir5Var4;
            } else {
                str2 = str;
                r13 = 1;
            }
            ir5Var = (ir5) objK2;
            boolean zH7 = lp2Var.h(ir5Var);
            i5 = i4 & 112;
            if (i5 == 32) {
                r4 = r13;
            } else {
                r4 = 0;
            }
            int i13 = (zH7 ? 1 : 0) | r4;
            i6 = i4 & 896;
            if (i6 == 256) {
                r5 = r13;
            } else {
                r5 = 0;
            }
            z2 = ((((i13 == true ? 1 : 0) | r5) == true ? 1 : 0) | (lp2Var.f(str2) ? 1 : 0) ? 1 : 0) | (lp2Var.d(z24Var.ordinal()) ? 1 : 0);
            objK3 = lp2Var.K();
            if (z2) {
                ir5Var2 = ir5Var;
                vf vfVar2 = new vf(ir5Var2, dn2Var4, or5Var, str2, z24Var, (byte) 0);
                lp2Var.g0(vfVar2);
                objK3 = vfVar2;
            } else {
                ir5Var2 = ir5Var;
                vf vfVar3 = new vf(ir5Var2, dn2Var4, or5Var, str2, z24Var, (byte) 0);
                lp2Var.g0(vfVar3);
                objK3 = vfVar3;
            }
            u70.a(ir5Var2, (gn2) objK3, lp2Var);
            boolean zH8 = lp2Var.h(ir5Var2);
            if (i5 == 32) {
                r6 = r13;
            } else {
                r6 = 0;
            }
            int i14 = (zH8 ? 1 : 0) | r6;
            if (i6 == 256) {
                r7 = r13;
            } else {
                r7 = 0;
            }
            z3 = ((((i14 == true ? 1 : 0) | r7) == true ? 1 : 0) | (lp2Var.f(str2) ? 1 : 0) ? 1 : 0) | (lp2Var.d(z24Var.ordinal()) ? 1 : 0);
            objK4 = lp2Var.K();
            if (z3) {
                final String str4 = str2;
                dn2 dn2Var6 = new dn2() { // from class: wf
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        ir5Var2.n(dn2Var4, or5Var, str4, z24Var);
                        return dn8.a;
                    }
                };
                lp2Var.g0(dn2Var6);
                objK4 = dn2Var6;
            } else {
                final String str5 = str2;
                dn2 dn2Var7 = new dn2() { // from class: wf
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        ir5Var2.n(dn2Var4, or5Var, str5, z24Var);
                        return dn8.a;
                    }
                };
                lp2Var.g0(dn2Var7);
                objK4 = dn2Var7;
            }
            u70.q((dn2) objK4, lp2Var);
            boolean zH9 = lp2Var.h(ir5Var2);
            if ((i4 & 14) == 4) {
                r8 = r13;
            } else {
                r8 = 0;
            }
            i7 = (zH9 ? 1 : 0) | r8;
            Object objK9 = lp2Var.K();
            b2 = 3;
            obj2 = objK9;
            if (i7 == 0) {
                p0 p0Var2 = new p0(ir5Var2, nr5Var2, b2);
                lp2Var.g0(p0Var2);
                obj2 = p0Var2;
            } else {
                p0 p0Var3 = new p0(ir5Var2, nr5Var2, b2);
                lp2Var.g0(p0Var3);
                obj2 = p0Var3;
            }
            u70.a(nr5Var2, (gn2) obj2, lp2Var);
            zH = lp2Var.h(ir5Var2);
            Object objK10 = lp2Var.K();
            obj3 = objK10;
            if (zH) {
                q0 q0Var2 = new q0(ir5Var2, (q51) null, b2);
                lp2Var.g0(q0Var2);
                obj3 = q0Var2;
            } else {
                q0 q0Var3 = new q0(ir5Var2, (q51) null, b2);
                lp2Var.g0(q0Var3);
                obj3 = q0Var3;
            }
            u70.h((rn2) obj3, lp2Var, ir5Var2);
            zH2 = lp2Var.h(ir5Var2);
            Object objK11 = lp2Var.K();
            obj4 = objK11;
            if (zH2) {
                uf ufVar2 = new uf(ir5Var2, r13);
                lp2Var.g0(ufVar2);
                obj4 = ufVar2;
            } else {
                uf ufVar3 = new uf(ir5Var2, r13);
                lp2Var.g0(ufVar3);
                obj4 = ufVar3;
            }
            kx4 kx4VarQ3 = vr3.Q(hx4.X, (gn2) obj4);
            zH3 = lp2Var.h(ir5Var2) | lp2Var.d(z24Var.ordinal());
            Object objK12 = lp2Var.K();
            obj5 = objK12;
            if (zH3) {
                yf yfVar2 = new yf(ir5Var2, z24Var, (byte) 0);
                lp2Var.g0(yfVar2);
                obj5 = yfVar2;
            } else {
                yf yfVar3 = new yf(ir5Var2, z24Var, (byte) 0);
                lp2Var.g0(yfVar3);
                obj5 = yfVar3;
            }
            xr4 xr4Var2 = (xr4) obj5;
            int iHashCode2 = Long.hashCode(lp2Var.T);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ4 = w45.Q(lp2Var, kx4VarQ3);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4Var2);
            pn7.m(pz2.A0, lp2Var, kl5VarL2);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode2));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ4);
            lp2Var.p(r13);
            dn2Var3 = dn2Var4;
        } else {
            lp2Var.Q();
            dn2Var3 = dn2Var2;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new xf(nr5Var2, dn2Var3, or5Var, zy0Var, i, i2, (byte) 0);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
