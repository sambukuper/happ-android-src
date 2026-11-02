package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fc8 implements i04, ov8 {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;
    public Object i0;
    public Object j0;

    /* JADX WARN: Multi-variable type inference failed */
    public fc8(jl1 jl1Var, fc8 fc8Var, List list, String str, String str2) {
        Map linkedHashMap;
        this.X = (byte) 4;
        list.getClass();
        this.Y = jl1Var;
        this.Z = fc8Var;
        this.f0 = str;
        this.g0 = str2;
        ve4 ve4Var = ((hl1) jl1Var.X).a;
        int i = 0;
        this.h0 = ve4Var.c(new oh8(this, 0 == true ? 1 : 0));
        this.i0 = ve4Var.c(new oh8(this, (byte) 1));
        if (list.isEmpty()) {
            linkedHashMap = e02.X;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sz5 sz5Var = (sz5) it.next();
                linkedHashMap.put(Integer.valueOf(sz5Var.f0), new lm1((jl1) this.Y, sz5Var, i));
                i++;
            }
        }
        this.j0 = linkedHashMap;
    }

    public static aa7 a(aa7 aa7Var, t14 t14Var) {
        zz3 zz3VarE = y08.e(aa7Var);
        sm annotations = aa7Var.getAnnotations();
        t14 t14VarA = w79.A(aa7Var);
        List listW = w79.w(aa7Var);
        List listP0 = wv0.p0(1, w79.C(aa7Var));
        ArrayList arrayList = new ArrayList(xv0.Z(listP0, 10));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(((ni8) it.next()).b());
        }
        return w79.p(zz3VarE, annotations, t14VarA, listW, arrayList, t14Var, true).r0(aa7Var.o0());
    }

    public static final ArrayList f(nz5 nz5Var, fc8 fc8Var) {
        List list = nz5Var.f0;
        list.getClass();
        nz5 nz5VarR = vr3.R(nz5Var, (ux4) ((jl1) fc8Var.Y).f0);
        Iterable iterableF = nz5VarR != null ? f(nz5VarR, fc8Var) : null;
        if (iterableF == null) {
            iterableF = d02.X;
        }
        return wv0.H0(list, iterableF);
    }

    public static ch8 h(List list, sm smVar) {
        ch8 ch8VarK;
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qg1) it.next()).getClass();
            if (smVar.isEmpty()) {
                ch8.Y.getClass();
                ch8VarK = ch8.Z;
            } else {
                xd6 xd6Var = ch8.Y;
                List listK = i21.K(new wm(smVar));
                xd6Var.getClass();
                ch8VarK = xd6.k(listK);
            }
            arrayList.add(ch8VarK);
        }
        ArrayList arrayListA0 = xv0.a0(arrayList);
        ch8.Y.getClass();
        return xd6.k(arrayListA0);
    }

    public static final sx4 j(fc8 fc8Var, nz5 nz5Var, int i) {
        jl1 jl1Var = (jl1) fc8Var.Y;
        qs0 qs0VarL = u70.L((w15) jl1Var.Y, i);
        md8 md8VarL0 = w27.l0(w27.i0(nz5Var, new oh8(fc8Var, (byte) 2)), ve7.Z);
        ArrayList arrayList = new ArrayList();
        Iterator it = md8VarL0.iterator();
        while (true) {
            ld8 ld8Var = (ld8) it;
            if (!ld8Var.hasNext()) {
                break;
            }
            arrayList.add(ld8Var.next());
        }
        int iE0 = w27.e0(w27.i0(qs0VarL, ph8.X));
        while (arrayList.size() < iE0) {
            arrayList.add(0);
        }
        return ((hl1) jl1Var.X).l.E(qs0VarL, arrayList);
    }

    public List b() {
        return wv0.Y0(((Map) this.j0).values());
    }

    @Override // defpackage.i04
    public void c() {
        fu6 fu6Var = (fu6) this.f0;
        qs0 qs0Var = (qs0) this.h0;
        HashMap map = (HashMap) this.Z;
        boolean zY = false;
        if (qs0Var.equals(gf7.b)) {
            Object obj = map.get(v15.e("value"));
            kv3 kv3Var = obj instanceof kv3 ? (kv3) obj : null;
            if (kv3Var != null) {
                Object obj2 = kv3Var.a;
                iv3 iv3Var = obj2 instanceof iv3 ? (iv3) obj2 : null;
                if (iv3Var != null) {
                    zY = fu6Var.Y(iv3Var.a.a);
                }
            }
        }
        if (zY || fu6Var.Y(qs0Var)) {
            return;
        }
        ((List) this.i0).add(new hm(((sx4) this.g0).X(), map, (ke7) this.j0));
    }

    public hi8 d(int i) {
        hi8 hi8Var = (hi8) ((Map) this.j0).get(Integer.valueOf(i));
        if (hi8Var != null) {
            return hi8Var;
        }
        fc8 fc8Var = (fc8) this.Z;
        if (fc8Var != null) {
            return fc8Var.d(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:120:0x0300  */
    /* JADX WARN: Code duplicated, block: B:125:0x0319  */
    /* JADX WARN: Code duplicated, block: B:132:0x0336  */
    /* JADX WARN: Code duplicated, block: B:133:0x033b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0348  */
    /* JADX WARN: Code duplicated, block: B:143:0x036e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0371  */
    /* JADX WARN: Code duplicated, block: B:146:0x0375  */
    /* JADX WARN: Code duplicated, block: B:147:0x037a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0384  */
    /* JADX WARN: Code duplicated, block: B:151:0x0389  */
    /* JADX WARN: Code duplicated, block: B:153:0x038f  */
    /* JADX WARN: Code duplicated, block: B:154:0x039b  */
    /* JADX WARN: Code duplicated, block: B:155:0x039d  */
    /* JADX WARN: Code duplicated, block: B:157:0x03af  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:170:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:172:0x03e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0122  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0169  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171  */
    /* JADX WARN: Code duplicated, block: B:53:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0196  */
    /* JADX WARN: Code duplicated, block: B:57:0x019d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ed  */
    public aa7 e(nz5 nz5Var, boolean z) {
        lh8 lh8VarD;
        ot0 ot0VarJ;
        Object next;
        byte b;
        ch8 ch8VarH;
        ArrayList arrayList;
        int i;
        List listY0;
        boolean zBooleanValue;
        boolean z2;
        aa7 aa7VarN;
        hh1 hh1VarJ;
        int size;
        aa7 aa7VarN2;
        ot0 ot0VarX;
        so2 so2VarX;
        ni8 ni8Var;
        t14 t14VarB;
        ot0 ot0VarX2;
        fk2 fk2VarG;
        t14 t14VarB2;
        jd0 jd0Var;
        fk2 fk2VarC;
        int size2;
        int i2;
        nz5 nz5VarA;
        int i3;
        lz5 lz5Var;
        hi8 hi8Var;
        kz5 kz5Var;
        int iOrdinal;
        rt8 rt8Var;
        int i4;
        nz5 nz5VarA2;
        bh8 wg7Var;
        bh8 wg7Var2;
        jl1 jl1Var = (jl1) this.Y;
        ux4 ux4Var = (ux4) jl1Var.f0;
        ed1 ed1Var = (ed1) jl1Var.Z;
        hl1 hl1Var = (hl1) jl1Var.X;
        nz5Var.getClass();
        if (nz5Var.p()) {
            if (u70.L((w15) jl1Var.Y, nz5Var.k0).c) {
                ((hl1) jl1Var.X).g.getClass();
            }
        } else if ((nz5Var.Z & 128) == 128) {
            if (u70.L((w15) jl1Var.Y, nz5Var.n0).c) {
                ((hl1) jl1Var.X).g.getClass();
            }
        }
        if (!nz5Var.p()) {
            int i5 = nz5Var.Z;
            if ((i5 & 32) == 32) {
                ot0VarJ = d(nz5Var.l0);
                if (ot0VarJ == null) {
                    u32 u32Var = u32.a;
                    lh8VarD = u32.d(s32.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(nz5Var.l0), (String) this.g0);
                }
            } else if ((i5 & 64) == 64) {
                String string = ((w15) jl1Var.Y).getString(nz5Var.m0);
                Iterator it = b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!dh3.f(((hi8) next).getName().b(), string));
                hi8 hi8Var2 = (hi8) next;
                if (hi8Var2 == null) {
                    u32 u32Var2 = u32.a;
                    lh8VarD = u32.d(s32.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, ed1Var.toString());
                } else {
                    ot0VarJ = hi8Var2;
                }
            } else if ((i5 & 128) == 128) {
                ot0VarJ = (ot0) ((vt1) this.i0).B(Integer.valueOf(nz5Var.n0));
                if (ot0VarJ == null) {
                    ot0VarJ = j(this, nz5Var, nz5Var.n0);
                }
            } else {
                u32 u32Var3 = u32.a;
                lh8VarD = u32.d(s32.UNKNOWN_TYPE, new String[0]);
            }
            b = 1;
            if (u32.f(lh8VarD.x())) {
                u32 u32Var4 = u32.a;
                return u32.e(s32.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, d02.X, lh8VarD, (String[]) Arrays.copyOf(new String[]{lh8VarD.toString()}, 1));
            }
            ll1 ll1Var = new ll1(hl1Var.a, new xg8(this, nz5Var, b));
            ch8VarH = h(hl1Var.r, ll1Var);
            ArrayList arrayListF = f(nz5Var, this);
            arrayList = new ArrayList(xv0.Z(arrayListF, 10));
            i = 0;
            for (Object obj : arrayListF) {
                i3 = i + 1;
                if (i >= 0) {
                    i21.X();
                    throw null;
                }
                lz5Var = (lz5) obj;
                List listG = lh8VarD.g();
                listG.getClass();
                hi8Var = (hi8) wv0.u0(i, listG);
                kz5Var = lz5Var.Z;
                if (kz5Var == kz5.STAR) {
                    kz5Var.getClass();
                    iOrdinal = kz5Var.ordinal();
                    if (iOrdinal != 0) {
                        rt8Var = rt8.IN_VARIANCE;
                    } else if (iOrdinal != b) {
                        rt8Var = rt8.OUT_VARIANCE;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                b61.c();
                                return null;
                            }
                            u52.j(kz5Var, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        rt8Var = rt8.INVARIANT;
                    }
                    i4 = lz5Var.Y;
                    if ((i4 & 2) == 2) {
                        nz5VarA2 = lz5Var.f0;
                    } else if ((i4 & 4) == 4) {
                        nz5VarA2 = ux4Var.a(lz5Var.g0);
                    } else {
                        nz5VarA2 = null;
                    }
                    if (nz5VarA2 == null) {
                        wg7Var2 = new wg7(u32.c(s32.NO_RECORDED_TYPE, lz5Var.toString()));
                    } else {
                        wg7Var = new wg7(i(nz5VarA2), rt8Var);
                        wg7Var2 = wg7Var;
                    }
                } else if (hi8Var == null) {
                    wg7Var2 = new vg7(hl1Var.b.f());
                } else {
                    wg7Var = new wg7(hi8Var);
                    wg7Var2 = wg7Var;
                }
                arrayList.add(wg7Var2);
                i = i3;
                b = 1;
            }
            Object obj2 = null;
            listY0 = wv0.Y0(arrayList);
            ot0 ot0VarX3 = lh8VarD.x();
            if (z || !(ot0VarX3 instanceof km1)) {
                zBooleanValue = md2.a.e(nz5Var.s0).booleanValue();
                z2 = nz5Var.g0;
                if (zBooleanValue) {
                    size = lh8VarD.g().size() - listY0.size();
                    if (size == 0) {
                        aa7VarN2 = dh3.N(ch8VarH, lh8VarD, listY0, z2);
                        ot0VarX = aa7VarN2.n0().x();
                        if (ot0VarX == null && (ot0VarX instanceof sx4) && zz3.K(ot0VarX)) {
                            int i6 = el1.a;
                            gk2 gk2VarF = bl1.f(ot0VarX);
                            gk2VarF.getClass();
                            so2VarX = w79.x(gk2VarF);
                        } else {
                            so2VarX = null;
                        }
                        if (dh3.f(so2VarX, oo2.d) || (ni8Var = (ni8) wv0.B0(w79.C(aa7VarN2))) == null || (t14VarB = ni8Var.b()) == null) {
                            aa7VarN2 = null;
                        } else {
                            ot0VarX2 = t14VarB.n0().x();
                            if (ot0VarX2 != null) {
                                fk2VarG = el1.g(ot0VarX2);
                            } else {
                                fk2VarG = null;
                            }
                            if (t14VarB.l0().size() == 1 && (dh3.f(fk2VarG, ug7.g) || dh3.f(fk2VarG, qh8.a))) {
                                t14VarB2 = ((ni8) wv0.O0(t14VarB.l0())).b();
                                t14VarB2.getClass();
                                if (ed1Var instanceof jd0) {
                                    jd0Var = (jd0) ed1Var;
                                } else {
                                    jd0Var = null;
                                }
                                if (jd0Var != null) {
                                    fk2VarC = el1.c(jd0Var);
                                } else {
                                    fk2VarC = null;
                                }
                                if (dh3.f(fk2VarC, sy7.a)) {
                                    aa7VarN2 = a(aa7VarN2, t14VarB2);
                                } else {
                                    aa7VarN2 = a(aa7VarN2, t14VarB2);
                                }
                            }
                        }
                    } else if (size != 1 && (size2 = listY0.size() - 1) >= 0) {
                        lh8 lh8VarL = lh8VarD.f().w(size2).l();
                        lh8VarL.getClass();
                        aa7VarN2 = dh3.N(ch8VarH, lh8VarL, listY0, z2);
                    } else {
                        aa7VarN2 = null;
                    }
                    if (aa7VarN2 == null) {
                        u32 u32Var5 = u32.a;
                        aa7VarN = u32.e(s32.INCONSISTENT_SUSPEND_FUNCTION, listY0, lh8VarD, new String[0]);
                    } else {
                        aa7VarN = aa7VarN2;
                    }
                } else {
                    aa7VarN = dh3.N(ch8VarH, lh8VarD, listY0, z2);
                    if (md2.b.e(nz5Var.s0).booleanValue()) {
                        hh1VarJ = ra.j(aa7VarN, true);
                        if (hh1VarJ == null) {
                            kp5.s(aa7VarN, "null DefinitelyNotNullType for '");
                            return null;
                        }
                        aa7VarN = hh1VarJ;
                    }
                }
            } else {
                km1 km1Var = (km1) ot0VarX3;
                f08 f08Var = new f08((byte) 6);
                List listG2 = km1Var.l0.g();
                ArrayList arrayList2 = new ArrayList(xv0.Z(listG2, 10));
                Iterator it2 = listG2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((hi8) it2.next()).a());
                }
                yr6 yr6Var = new yr6(obj2, km1Var, listY0, zp4.P(wv0.e1(arrayList2, listY0)), (byte) 8);
                ch8.Y.getClass();
                ch8 ch8Var = ch8.Z;
                ch8Var.getClass();
                aa7 aa7VarE = f08Var.e(yr6Var, ch8Var, false, 0, true);
                List list = hl1Var.r;
                ArrayList arrayListF0 = wv0.F0(ll1Var, aa7VarE.getAnnotations());
                aa7VarN = aa7VarE.r0(cj8.e(aa7VarE) || nz5Var.g0).t0(h(list, arrayListF0.isEmpty() ? oy1.f0 : new vm(arrayListF0, (byte) 0)));
            }
            i2 = nz5Var.Z;
            if ((i2 & 1024) == 1024) {
                nz5VarA = nz5Var.q0;
            } else if ((i2 & 2048) == 2048) {
                nz5VarA = ux4Var.a(nz5Var.r0);
            } else {
                nz5VarA = null;
            }
            if (nz5VarA != null) {
                return jm4.d0(aa7VarN, e(nz5VarA, false));
            }
            return aa7VarN;
        }
        ot0VarJ = (ot0) ((vt1) this.h0).B(Integer.valueOf(nz5Var.k0));
        if (ot0VarJ == null) {
            ot0VarJ = j(this, nz5Var, nz5Var.k0);
        }
        lh8VarD = ot0VarJ.l();
        lh8VarD.getClass();
        b = 1;
        if (u32.f(lh8VarD.x())) {
            u32 u32Var6 = u32.a;
            return u32.e(s32.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, d02.X, lh8VarD, (String[]) Arrays.copyOf(new String[]{lh8VarD.toString()}, 1));
        }
        ll1 ll1Var2 = new ll1(hl1Var.a, new xg8(this, nz5Var, b));
        ch8VarH = h(hl1Var.r, ll1Var2);
        ArrayList arrayListF2 = f(nz5Var, this);
        arrayList = new ArrayList(xv0.Z(arrayListF2, 10));
        i = 0;
        while (r10.hasNext()) {
            i3 = i + 1;
            if (i >= 0) {
                i21.X();
                throw null;
            }
            lz5Var = (lz5) obj;
            List listG3 = lh8VarD.g();
            listG3.getClass();
            hi8Var = (hi8) wv0.u0(i, listG3);
            kz5Var = lz5Var.Z;
            if (kz5Var == kz5.STAR) {
                kz5Var.getClass();
                iOrdinal = kz5Var.ordinal();
                if (iOrdinal != 0) {
                    rt8Var = rt8.IN_VARIANCE;
                } else if (iOrdinal != b) {
                    rt8Var = rt8.OUT_VARIANCE;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            b61.c();
                            return null;
                        }
                        u52.j(kz5Var, "Only IN, OUT and INV are supported. Actual argument: ");
                        return null;
                    }
                    rt8Var = rt8.INVARIANT;
                }
                i4 = lz5Var.Y;
                if ((i4 & 2) == 2) {
                    nz5VarA2 = lz5Var.f0;
                } else if ((i4 & 4) == 4) {
                    nz5VarA2 = ux4Var.a(lz5Var.g0);
                } else {
                    nz5VarA2 = null;
                }
                if (nz5VarA2 == null) {
                    wg7Var2 = new wg7(u32.c(s32.NO_RECORDED_TYPE, lz5Var.toString()));
                } else {
                    wg7Var = new wg7(i(nz5VarA2), rt8Var);
                    wg7Var2 = wg7Var;
                }
            } else if (hi8Var == null) {
                wg7Var2 = new vg7(hl1Var.b.f());
            } else {
                wg7Var = new wg7(hi8Var);
                wg7Var2 = wg7Var;
            }
            arrayList.add(wg7Var2);
            i = i3;
            b = 1;
        }
        Object obj3 = null;
        listY0 = wv0.Y0(arrayList);
        ot0 ot0VarX4 = lh8VarD.x();
        if (z) {
            zBooleanValue = md2.a.e(nz5Var.s0).booleanValue();
            z2 = nz5Var.g0;
            if (zBooleanValue) {
                size = lh8VarD.g().size() - listY0.size();
                if (size == 0) {
                    aa7VarN2 = dh3.N(ch8VarH, lh8VarD, listY0, z2);
                    ot0VarX = aa7VarN2.n0().x();
                    if (ot0VarX == null) {
                        so2VarX = null;
                    } else {
                        so2VarX = null;
                    }
                    if (dh3.f(so2VarX, oo2.d)) {
                        aa7VarN2 = null;
                    } else {
                        ot0VarX2 = t14VarB.n0().x();
                        if (ot0VarX2 != null) {
                            fk2VarG = el1.g(ot0VarX2);
                        } else {
                            fk2VarG = null;
                        }
                        if (t14VarB.l0().size() == 1) {
                            t14VarB2 = ((ni8) wv0.O0(t14VarB.l0())).b();
                            t14VarB2.getClass();
                            if (ed1Var instanceof jd0) {
                                jd0Var = (jd0) ed1Var;
                            } else {
                                jd0Var = null;
                            }
                            if (jd0Var != null) {
                                fk2VarC = el1.c(jd0Var);
                            } else {
                                fk2VarC = null;
                            }
                            if (dh3.f(fk2VarC, sy7.a)) {
                                aa7VarN2 = a(aa7VarN2, t14VarB2);
                            } else {
                                aa7VarN2 = a(aa7VarN2, t14VarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    aa7VarN2 = null;
                } else {
                    lh8 lh8VarL2 = lh8VarD.f().w(size2).l();
                    lh8VarL2.getClass();
                    aa7VarN2 = dh3.N(ch8VarH, lh8VarL2, listY0, z2);
                }
                if (aa7VarN2 == null) {
                    u32 u32Var7 = u32.a;
                    aa7VarN = u32.e(s32.INCONSISTENT_SUSPEND_FUNCTION, listY0, lh8VarD, new String[0]);
                } else {
                    aa7VarN = aa7VarN2;
                }
            } else {
                aa7VarN = dh3.N(ch8VarH, lh8VarD, listY0, z2);
                if (md2.b.e(nz5Var.s0).booleanValue()) {
                    hh1VarJ = ra.j(aa7VarN, true);
                    if (hh1VarJ == null) {
                        kp5.s(aa7VarN, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    aa7VarN = hh1VarJ;
                }
            }
        } else {
            zBooleanValue = md2.a.e(nz5Var.s0).booleanValue();
            z2 = nz5Var.g0;
            if (zBooleanValue) {
                size = lh8VarD.g().size() - listY0.size();
                if (size == 0) {
                    aa7VarN2 = dh3.N(ch8VarH, lh8VarD, listY0, z2);
                    ot0VarX = aa7VarN2.n0().x();
                    if (ot0VarX == null) {
                        so2VarX = null;
                    } else {
                        so2VarX = null;
                    }
                    if (dh3.f(so2VarX, oo2.d)) {
                        aa7VarN2 = null;
                    } else {
                        ot0VarX2 = t14VarB.n0().x();
                        if (ot0VarX2 != null) {
                            fk2VarG = el1.g(ot0VarX2);
                        } else {
                            fk2VarG = null;
                        }
                        if (t14VarB.l0().size() == 1) {
                            t14VarB2 = ((ni8) wv0.O0(t14VarB.l0())).b();
                            t14VarB2.getClass();
                            if (ed1Var instanceof jd0) {
                                jd0Var = (jd0) ed1Var;
                            } else {
                                jd0Var = null;
                            }
                            if (jd0Var != null) {
                                fk2VarC = el1.c(jd0Var);
                            } else {
                                fk2VarC = null;
                            }
                            if (dh3.f(fk2VarC, sy7.a)) {
                                aa7VarN2 = a(aa7VarN2, t14VarB2);
                            } else {
                                aa7VarN2 = a(aa7VarN2, t14VarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    aa7VarN2 = null;
                } else {
                    lh8 lh8VarL3 = lh8VarD.f().w(size2).l();
                    lh8VarL3.getClass();
                    aa7VarN2 = dh3.N(ch8VarH, lh8VarL3, listY0, z2);
                }
                if (aa7VarN2 == null) {
                    u32 u32Var8 = u32.a;
                    aa7VarN = u32.e(s32.INCONSISTENT_SUSPEND_FUNCTION, listY0, lh8VarD, new String[0]);
                } else {
                    aa7VarN = aa7VarN2;
                }
            } else {
                aa7VarN = dh3.N(ch8VarH, lh8VarD, listY0, z2);
                if (md2.b.e(nz5Var.s0).booleanValue()) {
                    hh1VarJ = ra.j(aa7VarN, true);
                    if (hh1VarJ == null) {
                        kp5.s(aa7VarN, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    aa7VarN = hh1VarJ;
                }
            }
        }
        i2 = nz5Var.Z;
        if ((i2 & 1024) == 1024) {
            nz5VarA = nz5Var.q0;
        } else if ((i2 & 2048) == 2048) {
            nz5VarA = ux4Var.a(nz5Var.r0);
        } else {
            nz5VarA = null;
        }
        if (nz5VarA != null) {
            return jm4.d0(aa7VarN, e(nz5VarA, false));
        }
        return aa7VarN;
    }

    @Override // defpackage.i04
    public void g(v15 v15Var, Object obj) {
        s21 s21VarJ = pz2.j((wx4) ((fu6) this.Y).f0, obj);
        if (s21VarJ == null) {
            s21VarJ = new v32("Unsupported annotation argument: " + v15Var);
        }
        ((HashMap) this.Z).put(v15Var, s21VarJ);
    }

    @Override // defpackage.ov8
    public View getRoot() {
        return (CardView) this.Y;
    }

    public t14 i(nz5 nz5Var) {
        nz5 nz5VarA;
        jl1 jl1Var = (jl1) this.Y;
        nz5Var.getClass();
        if ((nz5Var.Z & 2) != 2) {
            return e(nz5Var, true);
        }
        String string = ((w15) jl1Var.Y).getString(nz5Var.h0);
        aa7 aa7VarE = e(nz5Var, true);
        ux4 ux4Var = (ux4) jl1Var.f0;
        int i = nz5Var.Z;
        if ((i & 4) == 4) {
            nz5VarA = nz5Var.i0;
        } else {
            nz5VarA = (i & 8) == 8 ? ux4Var.a(nz5Var.j0) : null;
        }
        nz5VarA.getClass();
        return ((hl1) jl1Var.X).j.b(nz5Var, string, aa7VarE, e(nz5VarA, true));
    }

    @Override // defpackage.i04
    public void n(v15 v15Var, vs0 vs0Var) {
        ((HashMap) this.Z).put(v15Var, new kv3(new iv3(vs0Var)));
    }

    @Override // defpackage.i04
    public j04 r(v15 v15Var) {
        return new z47((fu6) this.Y, v15Var, this);
    }

    @Override // defpackage.i04
    public void t(v15 v15Var, qs0 qs0Var, v15 v15Var2) {
        ((HashMap) this.Z).put(v15Var, new x22(qs0Var, v15Var2));
    }

    public String toString() {
        switch (this.X) {
            case 4:
                String str = (String) this.f0;
                fc8 fc8Var = (fc8) this.Z;
                return str.concat(fc8Var == null ? _UrlKt.FRAGMENT_ENCODE_SET : ". Child of ".concat((String) fc8Var.f0));
            default:
                return super.toString();
        }
    }

    @Override // defpackage.i04
    public i04 w(qs0 qs0Var, v15 v15Var) {
        ArrayList arrayList = new ArrayList();
        return new y5(((fu6) this.Y).a0(qs0Var, ke7.G, arrayList), this, v15Var, arrayList);
    }

    public /* synthetic */ fc8() {
        this.X = (byte) 1;
    }

    public fc8(CardView cardView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, HappTextView happTextView) {
        this.X = (byte) 3;
        this.Y = cardView;
        this.Z = appCompatImageView;
        this.f0 = constraintLayout;
        this.g0 = constraintLayout2;
        this.h0 = appCompatImageView2;
        this.i0 = appCompatImageView3;
        this.j0 = happTextView;
    }

    public fc8(Context context) {
        this.X = (byte) 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.g0 = layoutParams;
        this.h0 = new Rect();
        this.i0 = new int[2];
        this.j0 = new int[2];
        this.Y = context;
        View viewInflate = LayoutInflater.from(context).inflate(u46.abc_tooltip, (ViewGroup) null);
        this.Z = viewInflate;
        this.f0 = (TextView) viewInflate.findViewById(d46.message);
        layoutParams.setTitle(fc8.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = q56.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public fc8(fu6 fu6Var, sx4 sx4Var, qs0 qs0Var, List list, ke7 ke7Var) {
        this.X = (byte) 2;
        this.f0 = fu6Var;
        this.g0 = sx4Var;
        this.h0 = qs0Var;
        this.i0 = list;
        this.j0 = ke7Var;
        this.Y = fu6Var;
        this.Z = new HashMap();
    }
}
