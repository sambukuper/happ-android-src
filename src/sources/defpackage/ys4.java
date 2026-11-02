package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ys4 {
    public final jl1 a;
    public final dq b;

    public ys4(jl1 jl1Var) {
        this.a = jl1Var;
        hl1 hl1Var = (hl1) jl1Var.X;
        this.b = new dq(hl1Var.b, hl1Var.l);
    }

    public final wb4 a(ed1 ed1Var) {
        if (ed1Var instanceof tf5) {
            fk2 fk2Var = ((uf5) ((tf5) ed1Var)).i0;
            jl1 jl1Var = this.a;
            return new d06(fk2Var, (w15) jl1Var.Y, (ux4) jl1Var.f0, (xl1) jl1Var.i0);
        }
        if (ed1Var instanceof vl1) {
            return ((vl1) ed1Var).w0;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, d2 d2Var, int i) {
        ys4 ys4Var = this;
        jl1 jl1Var = ys4Var.a;
        ed1 ed1Var = (ed1) jl1Var.Z;
        ed1Var.getClass();
        jd0 jd0Var = (jd0) ed1Var;
        ed1 ed1VarP = jd0Var.p();
        ed1VarP.getClass();
        wb4 wb4VarA = ys4Var.a(ed1VarP);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i21.X();
                throw null;
            }
            nz5 nz5Var = (nz5) obj;
            vz5 vz5Var = (vz5) wv0.u0(i2, list2);
            i44 i44VarR = z91.r(jd0Var, ((fc8) jl1Var.j0).i(nz5Var), null, (wb4VarA == null || !md2.c.e((vz5Var == null || (vz5Var.Z & 1) != 1) ? 0 : vz5Var.f0).booleanValue()) ? oy1.f0 : new u55(((hl1) jl1Var.X).a, new xs4(ys4Var, wb4VarA, d2Var, i, i2, vz5Var, (byte) 1)), i2);
            if (i44VarR != null) {
                arrayList.add(i44VarR);
            }
            ys4Var = this;
            i2 = i3;
        }
        return arrayList;
    }

    public final sm c(d2 d2Var, int i, int i2) {
        return !md2.c.e(i).booleanValue() ? oy1.f0 : new u55(((hl1) this.a.X).a, new vs4((byte) 0, i2, this, d2Var));
    }

    public final sm d(cz5 cz5Var, boolean z) {
        return !md2.c.e(cz5Var.f0).booleanValue() ? oy1.f0 : new u55(((hl1) this.a.X).a, new ws4(this, z, cz5Var));
    }

    public final nl1 e(iy5 iy5Var, boolean z) {
        fl1 fl1Var;
        jl1 jl1Var = this.a;
        ed1 ed1Var = (ed1) jl1Var.Z;
        ed1Var.getClass();
        sx4 sx4Var = (sx4) ed1Var;
        nl1 nl1Var = new nl1(sx4Var, null, c(iy5Var, iy5Var.f0, 1), z, 1, iy5Var, (w15) jl1Var.Y, (ux4) jl1Var.f0, (dv8) jl1Var.g0, (xl1) jl1Var.i0, null);
        ys4 ys4Var = (ys4) jl1Var.a(nl1Var, d02.X, (w15) jl1Var.Y, (ux4) jl1Var.f0, (dv8) jl1Var.g0, (s50) jl1Var.h0).k0;
        List list = iy5Var.g0;
        list.getClass();
        List listH = ys4Var.h(list, iy5Var, 1);
        b06 b06Var = (b06) md2.d.e(iy5Var.f0);
        switch (b06Var == null ? -1 : i06.b[b06Var.ordinal()]) {
            case 1:
                fl1Var = gl1.d;
                fl1Var.getClass();
                break;
            case 2:
                fl1Var = gl1.a;
                fl1Var.getClass();
                break;
            case 3:
                fl1Var = gl1.b;
                fl1Var.getClass();
                break;
            case 4:
                fl1Var = gl1.c;
                fl1Var.getClass();
                break;
            case 5:
                fl1Var = gl1.e;
                fl1Var.getClass();
                break;
            case 6:
                fl1Var = gl1.f;
                fl1Var.getClass();
                break;
            default:
                fl1Var = gl1.a;
                fl1Var.getClass();
                break;
        }
        nl1Var.U0(listH, fl1Var);
        nl1Var.P0(sx4Var.X());
        nl1Var.v0 = sx4Var.C();
        nl1Var.z0 = !md2.o.e(iy5Var.f0).booleanValue();
        return nl1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    public final jm1 f(vy5 vy5Var) {
        int i;
        i44 i44VarX;
        t14 t14VarI;
        jl1 jl1Var = this.a;
        w15 w15Var = (w15) jl1Var.Y;
        ux4 ux4Var = (ux4) jl1Var.f0;
        byte b = 1;
        if ((vy5Var.Z & 1) == 1) {
            i = vy5Var.f0;
        } else {
            int i2 = vy5Var.g0;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        sm smVarC = c(vy5Var, i3, 1);
        int i4 = vy5Var.Z;
        sm ll1Var = ((i4 & 32) == 32 || (i4 & 64) == 64) ? new ll1(((hl1) jl1Var.X).a, new vs4(b, b, this, vy5Var)) : oy1.f0;
        jm1 jm1Var = new jm1((ed1) jl1Var.Z, null, smVarC, u70.S(w15Var, vy5Var.h0), dh3.C((wy5) md2.q.e(i3)), vy5Var, (w15) jl1Var.Y, ux4Var, el1.g((ed1) jl1Var.Z).a(u70.S(w15Var, vy5Var.h0)).equals(sy7.a) ? dv8.b : (dv8) jl1Var.g0, (xl1) jl1Var.i0, null);
        List list = vy5Var.k0;
        list.getClass();
        jl1 jl1VarA = jl1Var.a(jm1Var, list, (w15) jl1Var.Y, (ux4) jl1Var.f0, (dv8) jl1Var.g0, (s50) jl1Var.h0);
        ys4 ys4Var = (ys4) jl1VarA.k0;
        fc8 fc8Var = (fc8) jl1VarA.j0;
        nz5 nz5VarU = vr3.U(vy5Var, ux4Var);
        if (nz5VarU == null) {
            i44VarX = null;
        } else {
            if (md2.A.e(i3).booleanValue()) {
                nz5VarU = null;
            }
            if (nz5VarU == null || (t14VarI = fc8Var.i(nz5VarU)) == null) {
                i44VarX = null;
            } else {
                i44VarX = z91.x(jm1Var, t14VarI, ll1Var);
            }
        }
        ed1 ed1Var = (ed1) jl1Var.Z;
        sx4 sx4Var = ed1Var instanceof sx4 ? (sx4) ed1Var : null;
        i44 i44VarP0 = sx4Var != null ? sx4Var.p0() : null;
        i44 i44Var = (i44VarP0 == null || md2.A.e(i3).booleanValue()) ? null : i44VarP0;
        List listQ = vr3.q(vy5Var, ux4Var);
        List list2 = vy5Var.q0;
        list2.getClass();
        ArrayList arrayListB = ys4Var.b(listQ, list2, vy5Var, 1);
        List listB = fc8Var.b();
        List list3 = vy5Var.r0;
        list3.getClass();
        jm1Var.U0(i44VarX, i44Var, arrayListB, listB, ys4Var.h(list3, vy5Var, 1), fc8Var.i(vr3.X(vy5Var, ux4Var)), lh4.R0((xy5) md2.e.e(i3)), dh3.q((b06) md2.d.e(i3)), e02.X);
        jm1Var.q0 = md2.r.e(i3).booleanValue();
        jm1Var.r0 = md2.s.e(i3).booleanValue();
        jm1Var.s0 = md2.v.e(i3).booleanValue();
        jm1Var.t0 = md2.t.e(i3).booleanValue();
        jm1Var.u0 = md2.u.e(i3).booleanValue();
        jm1Var.y0 = md2.w.e(i3).booleanValue();
        jm1Var.v0 = md2.x.e(i3).booleanValue();
        jm1Var.z0 = !md2.y.e(i3).booleanValue();
        ((hl1) jl1Var.X).m.getClass();
        return jm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0154  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [sx4] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [ys4] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public final im1 g(cz5 cz5Var, boolean z) {
        int i;
        sm smVarC;
        byte b;
        ?? r14;
        sm ll1Var;
        i44 i44VarX;
        im1 im1Var;
        hx5 hx5VarS;
        se4 se4Var;
        tx5 tx5VarT;
        boolean z2;
        ?? r0;
        Object objG0;
        sx4 sx4Var;
        t14 t14VarI;
        rm rmVar = oy1.f0;
        jl1 jl1Var = this.a;
        w15 w15Var = (w15) jl1Var.Y;
        ux4 ux4Var = (ux4) jl1Var.f0;
        if ((cz5Var.Z & 1) == 1) {
            i = cz5Var.f0;
        } else {
            int i2 = cz5Var.g0;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        if (z) {
            List<cy5> list = cz5Var.w0;
            list.getClass();
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            for (cy5 cy5Var : list) {
                cy5Var.getClass();
                arrayList.add(this.b.m(cy5Var, w15Var));
            }
            smVarC = arrayList.isEmpty() ? rmVar : new vm(arrayList, (byte) 0);
        } else {
            smVarC = null;
        }
        ed1 ed1Var = (ed1) jl1Var.Z;
        if (smVarC == null) {
            smVarC = c(cz5Var, i, 2);
        }
        kd2 kd2Var = md2.e;
        fx4 fx4VarR0 = lh4.R0((xy5) kd2Var.e(i));
        kd2 kd2Var2 = md2.d;
        int i3 = i;
        im1 im1Var2 = new im1(ed1Var, null, smVarC, fx4VarR0, dh3.q((b06) kd2Var2.e(i)), md2.B.e(i).booleanValue(), u70.S(w15Var, cz5Var.h0), dh3.C((wy5) md2.q.e(i)), md2.F.e(i).booleanValue(), md2.E.e(i).booleanValue(), md2.H.e(i).booleanValue(), md2.I.e(i).booleanValue(), md2.J.e(i).booleanValue(), cz5Var, (w15) jl1Var.Y, ux4Var, (dv8) jl1Var.g0, (xl1) jl1Var.i0);
        List list2 = cz5Var.k0;
        list2.getClass();
        jl1 jl1VarA = jl1Var.a(im1Var2, list2, (w15) jl1Var.Y, (ux4) jl1Var.f0, (dv8) jl1Var.g0, (s50) jl1Var.h0);
        fc8 fc8Var = (fc8) jl1VarA.j0;
        boolean zBooleanValue = md2.C.e(i3).booleanValue();
        int i4 = 3;
        if (zBooleanValue) {
            int i5 = cz5Var.Z;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                b = 1;
                ys4 ys4Var = this;
                ll1Var = new ll1(((hl1) jl1Var.X).a, new vs4(b, i4, ys4Var, cz5Var));
                r14 = ys4Var;
            } else {
                b = 1;
                r14 = this;
                ll1Var = rmVar;
            }
        } else {
            b = 1;
            r14 = this;
            ll1Var = rmVar;
        }
        t14 t14VarI2 = fc8Var.i(vr3.Y(cz5Var, ux4Var));
        List listB = fc8Var.b();
        ed1 ed1Var2 = (ed1) jl1Var.Z;
        sx4 sx4Var2 = ed1Var2 instanceof sx4 ? (sx4) ed1Var2 : null;
        i44 i44VarP0 = sx4Var2 != null ? sx4Var2.p0() : null;
        i44 i44Var = (i44VarP0 == null || md2.L.e(i3).booleanValue()) ? null : i44VarP0;
        nz5 nz5VarV = vr3.V(cz5Var, ux4Var);
        if (nz5VarV == null) {
            i44VarX = null;
        } else {
            if (md2.L.e(i3).booleanValue()) {
                nz5VarV = null;
            }
            if (nz5VarV == null || (t14VarI = fc8Var.i(nz5VarV)) == null) {
                i44VarX = null;
            } else {
                i44VarX = z91.x(im1Var2, t14VarI, ll1Var);
            }
        }
        ys4 ys4Var2 = (ys4) jl1VarA.k0;
        List listR = vr3.r(cz5Var, ux4Var);
        List list3 = cz5Var.q0;
        list3.getClass();
        ?? r1 = b;
        im1Var2.O0(t14VarI2, listB, i44Var, i44VarX, ys4Var2.b(listR, list3, cz5Var, 3));
        int iB = md2.b(md2.c.e(i3).booleanValue(), (b06) kd2Var2.e(i3), (xy5) kd2Var.e(i3));
        g55 g55Var = ke7.G;
        if (zBooleanValue) {
            int i6 = (cz5Var.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? cz5Var.s0 : iB;
            boolean zBooleanValue2 = md2.P.e(i6).booleanValue();
            boolean zBooleanValue3 = md2.Q.e(i6).booleanValue();
            boolean zBooleanValue4 = md2.R.e(i6).booleanValue();
            sm smVarC2 = r14.c(cz5Var, i6, 3);
            if (zBooleanValue2) {
                hx5 hx5Var = new hx5(im1Var2, smVarC2, lh4.R0((xy5) kd2Var.e(i6)), dh3.q((b06) kd2Var2.e(i6)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, im1Var2.r(), null, g55Var);
                im1Var = im1Var2;
                hx5VarS = hx5Var;
            } else {
                im1Var = im1Var2;
                hx5VarS = z91.s(im1Var, smVarC2);
            }
            hx5VarS.J0(im1Var.j());
        } else {
            im1Var = im1Var2;
            hx5VarS = null;
        }
        if (md2.D.e(i3).booleanValue()) {
            if ((cz5Var.Z & 512) == 512) {
                iB = cz5Var.t0;
            }
            boolean zBooleanValue5 = md2.P.e(iB).booleanValue();
            boolean zBooleanValue6 = md2.Q.e(iB).booleanValue();
            boolean zBooleanValue7 = md2.R.e(iB).booleanValue();
            sm smVarC3 = r14.c(cz5Var, iB, 4);
            if (zBooleanValue5) {
                tx5VarT = new tx5(im1Var, smVarC3, lh4.R0((xy5) kd2Var.e(iB)), dh3.q((b06) kd2Var2.e(iB)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, im1Var.r(), null, g55Var);
                ot8 ot8Var = (ot8) wv0.O0(((ys4) jl1VarA.a(tx5VarT, d02.X, (w15) jl1VarA.Y, (ux4) jl1VarA.f0, (dv8) jl1VarA.g0, (s50) jl1VarA.h0).k0).h(i21.K(cz5Var.r0), cz5Var, 4));
                if (ot8Var == null) {
                    tx5.B(6);
                    throw null;
                }
                tx5VarT.q0 = ot8Var;
                se4Var = null;
            } else {
                se4Var = null;
                tx5VarT = z91.t(im1Var, smVarC3);
            }
        } else {
            se4Var = null;
            tx5VarT = null;
        }
        if (md2.G.e(i3).booleanValue()) {
            z2 = false;
            im1Var.M0(se4Var, new us4(r14, cz5Var, im1Var, false ? 1 : 0));
        } else {
            z2 = false;
        }
        ed1 ed1Var3 = (ed1) jl1Var.Z;
        if (ed1Var3 instanceof sx4) {
            sx4Var = (sx4) ed1Var3;
        } else {
            r0 = se4Var;
        }
        if (r0 != 0) {
            r0 = sx4Var;
            objG0 = r0.g0();
        } else {
            r0 = sx4Var;
            objG0 = se4Var;
        }
        if (objG0 == us0.g0) {
            im1Var.M0(se4Var, new us4(r14, cz5Var, im1Var, r1 == true ? (byte) 1 : (byte) 0));
        }
        im1Var.L0(hx5VarS, tx5VarT, new y82(r14.d(cz5Var, z2)), new y82(r14.d(cz5Var, r1)));
        return im1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [t14] */
    /* JADX WARN: Type inference failed for: r21v2 */
    public final List h(List list, d2 d2Var, int i) {
        int i2;
        nz5 nz5Var;
        sm u55Var;
        ys4 ys4Var = this;
        jl1 jl1Var = ys4Var.a;
        ux4 ux4Var = (ux4) jl1Var.f0;
        fc8 fc8Var = (fc8) jl1Var.j0;
        ed1 ed1Var = (ed1) jl1Var.Z;
        ed1Var.getClass();
        jd0 jd0Var = (jd0) ed1Var;
        ed1 ed1VarP = jd0Var.p();
        ed1VarP.getClass();
        wb4 wb4VarA = ys4Var.a(ed1VarP);
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i21.X();
                throw null;
            }
            vz5 vz5Var = (vz5) obj;
            int i5 = (vz5Var.Z & 1) == 1 ? vz5Var.f0 : 0;
            if (wb4VarA == null || !md2.c.e(i5).booleanValue()) {
                i2 = i3;
                nz5Var = null;
                u55Var = oy1.f0;
            } else {
                i2 = i3;
                nz5Var = null;
                u55Var = new u55(((hl1) jl1Var.X).a, new xs4(ys4Var, wb4VarA, d2Var, i, i2, vz5Var, (byte) 0));
            }
            v15 v15VarS = u70.S((w15) jl1Var.Y, vz5Var.g0);
            t14 t14VarI = fc8Var.i(vr3.h0(vz5Var, ux4Var));
            boolean zBooleanValue = md2.M.e(i5).booleanValue();
            boolean zBooleanValue2 = md2.N.e(i5).booleanValue();
            boolean zBooleanValue3 = md2.O.e(i5).booleanValue();
            int i6 = vz5Var.Z;
            nz5 nz5VarA = (i6 & 16) == 16 ? vz5Var.j0 : (i6 & 32) == 32 ? ux4Var.a(vz5Var.k0) : nz5Var;
            ?? I = nz5VarA != null ? fc8Var.i(nz5VarA) : nz5Var;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ot8(jd0Var, null, i2, u55Var, v15VarS, t14VarI, zBooleanValue, zBooleanValue2, zBooleanValue3, I, ke7.G));
            arrayList = arrayList2;
            i3 = i4;
            ys4Var = this;
        }
        return wv0.Y0(arrayList);
    }
}
