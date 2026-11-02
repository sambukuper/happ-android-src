package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class we5 implements hp5, iv5, hw5, lj2, cn2, az6, i87 {
    public static we5 Y;
    public final /* synthetic */ byte X;

    public /* synthetic */ we5(byte b) {
        this.X = b;
    }

    public static ze7 d(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? ze7.g0 : l(view.getVisibility());
    }

    public static ni8 e(hi8 hi8Var, nl3 nl3Var, xd6 xd6Var, t14 t14Var) {
        nl3Var.getClass();
        if (!nl3Var.c) {
            nl3Var = nl3.a(nl3Var, ol3.X, false, null, null, 61);
        }
        int iOrdinal = nl3Var.b.ordinal();
        rt8 rt8Var = rt8.INVARIANT;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new wg7(t14Var, rt8Var);
            }
            b61.c();
            return null;
        }
        if (!hi8Var.D().Y) {
            return new wg7(el1.e(hi8Var).o(), rt8Var);
        }
        List listG = t14Var.n0().g();
        listG.getClass();
        return !listG.isEmpty() ? new wg7(t14Var, rt8.OUT_VARIANCE) : cj8.k(hi8Var, nl3Var);
    }

    public static rx7 f(qx7 qx7Var, ox7 ox7Var, jl7 jl7Var) {
        ox7Var.getClass();
        jl7Var.getClass();
        return new rx7(qx7Var, ox7Var, jl7Var);
    }

    public static ze5 h(int i, int i2, lh4 lh4Var, af5 af5Var, bf5 bf5Var, cf5 cf5Var, df5 df5Var, Size size, String str) {
        lh4 lh4Var2 = lh4.n0;
        lh4 lh4Var3 = (i2 & 8) != 0 ? lh4Var2 : lh4Var;
        af5 af5Var2 = (i2 & 64) != 0 ? null : af5Var;
        cf5 cf5Var2 = (i2 & 128) != 0 ? null : cf5Var;
        df5 df5Var2 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : df5Var;
        size.getClass();
        lh4 lh4Var4 = lh4.p0;
        d02 d02Var = d02.X;
        if (lh4Var3 == lh4Var4 || lh4Var3 == lh4.o0 || ((lh4Var3 == lh4.r0 || lh4Var3 == lh4.s0) && Build.VERSION.SDK_INT >= 35)) {
            return new xe5(size, i, str, lh4Var3, bf5Var, af5Var2, cf5Var2, df5Var2, d02Var);
        }
        if (lh4Var3 == lh4Var2) {
            return new ye5(size, i, str, bf5Var, af5Var2, cf5Var2, df5Var2, d02Var);
        }
        bt.i("Check failed.");
        return null;
    }

    public static ze7 l(int i) {
        if (i == 0) {
            return ze7.Z;
        }
        if (i == 4) {
            return ze7.g0;
        }
        if (i == 8) {
            return ze7.f0;
        }
        bt.q(pc6.j(i, "Unknown visibility "));
        return null;
    }

    public static jk5 m(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == -1374130968) {
            if (lowerCase.equals("bypass")) {
                return jk5.f0;
            }
            return null;
        }
        if (iHashCode == 3551) {
            if (lowerCase.equals("on")) {
                return jk5.Z;
            }
            return null;
        }
        if (iHashCode == 109935 && lowerCase.equals("off")) {
            return jk5.Y;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    public static rx7 p(int i, Size size, nz nzVar, int i2, px7 px7Var, jl7 jl7Var) {
        LinkedHashMap linkedHashMap = nzVar.f;
        size.getClass();
        px7Var.getClass();
        jl7Var.getClass();
        qx7 qx7Var = (qx7) rx7.h.get(Integer.valueOf(i));
        if (qx7Var == null) {
            qx7Var = qx7.X;
        }
        ox7 ox7Var = ox7.NOT_SUPPORT;
        Size size2 = cb7.a;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= cb7.a((Size) nzVar.b.get(Integer.valueOf(i)))) {
                ox7Var = ox7.S720P_16_9;
            } else if (height <= cb7.a((Size) nzVar.d.get(Integer.valueOf(i)))) {
                ox7Var = ox7.S1440P_4_3;
            }
        } else if (px7Var == px7.X) {
            Size size3 = (Size) linkedHashMap.get(Integer.valueOf(i));
            for (ox7 ox7Var2 : rx7.f) {
                if (size.equals(ox7Var2.Y)) {
                    ox7Var = ox7Var2;
                    break;
                }
            }
            if (ox7Var == ox7.NOT_SUPPORT && size.equals(size3)) {
                ox7Var = ox7.MAXIMUM;
            }
        } else {
            Size size4 = nzVar.a;
            if (height <= size4.getHeight() * size4.getWidth()) {
                ox7Var = ox7.VGA;
            } else {
                Size size5 = nzVar.c;
                if (height <= size5.getHeight() * size5.getWidth()) {
                    ox7Var = ox7.PREVIEW;
                } else {
                    Size size6 = nzVar.e;
                    if (height <= size6.getHeight() * size6.getWidth()) {
                        ox7Var = ox7.RECORD;
                    } else {
                        Size size7 = (Size) linkedHashMap.get(Integer.valueOf(i));
                        Size size8 = (Size) nzVar.i.get(Integer.valueOf(i));
                        if (size7 != null) {
                            if (height <= size7.getHeight() * size7.getWidth()) {
                                if (i2 != 2) {
                                    ox7Var = ox7.MAXIMUM;
                                } else if (size8 != null) {
                                    if (height <= size8.getHeight() * size8.getWidth()) {
                                        ox7Var = ox7.ULTRA_MAXIMUM;
                                    }
                                }
                            } else if (size8 != null) {
                                if (height <= size8.getHeight() * size8.getWidth()) {
                                    ox7Var = ox7.ULTRA_MAXIMUM;
                                }
                            }
                        } else if (i2 != 2) {
                            ox7Var = ox7.MAXIMUM;
                        } else if (size8 != null) {
                            if (height <= size8.getHeight() * size8.getWidth()) {
                                ox7Var = ox7.ULTRA_MAXIMUM;
                            }
                        }
                    }
                }
            }
        }
        return f(qx7Var, ox7Var, jl7Var);
    }

    @Override // defpackage.cn2
    public Object a(Object obj) {
        ow6 ow6Var;
        switch (this.X) {
            case 14:
                o85 o85Var = (o85) obj;
                mr6.c.b().getClass();
                return o85Var;
            case 15:
            default:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return g02.X;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((gl5) it.next()).b) {
                        ow6Var = new ow6(Boolean.FALSE);
                        return ow6Var;
                    }
                }
                ow6Var = new ow6(Boolean.TRUE);
                return ow6Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                Throwable th = (Throwable) obj;
                mr6.c.b().getClass();
                return th;
        }
    }

    @Override // defpackage.i87
    public xe2 b(lq7 lq7Var) {
        return new j31(lq7Var, (byte) 8);
    }

    @Override // defpackage.lj2
    public xb4 c(Context context, UUID uuid, kj2 kj2Var) {
        RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) pd6.c(context);
        return km4.d0(remoteWorkManagerClient.e(new zz2(uuid.toString(), kj2Var, (byte) 29)), RemoteWorkManagerClient.j, remoteWorkManagerClient.d);
    }

    @Override // defpackage.hw5
    public void i(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    public t14 j(xj3 xj3Var, jd0 jd0Var, boolean z, z47 z47Var, km kmVar, rh8 rh8Var, boolean z2, gn2 gn2Var) {
        g97 g97Var = new g97(jd0Var, z, z47Var, kmVar, false);
        t14 t14Var = (t14) gn2Var.B(xj3Var);
        Collection collectionQ = xj3Var.q();
        collectionQ.getClass();
        Collection<ld0> collection = collectionQ;
        ArrayList arrayList = new ArrayList(xv0.Z(collection, 10));
        for (ld0 ld0Var : collection) {
            ld0Var.getClass();
            arrayList.add((t14) gn2Var.B(ld0Var));
        }
        return (t14) k32.e(t14Var.q0(), g97Var.m(t14Var, arrayList, rh8Var, z2), 0, g97Var.m0).c;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x028f  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [jd0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r24v0, types: [we5] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ed1, jd0, ld0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [xj3] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38 */
    public ArrayList k(z47 z47Var, Collection collection) {
        sm annotations;
        t14 t14VarC;
        cs5 cs5Var;
        qg5 qg5Var;
        int i;
        List list;
        hx5 hx5Var;
        cd5 cd5Var = cd5.E0;
        z47Var.getClass();
        Collection<??> collection2 = collection;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(xv0.Z(collection2, 10));
        for (?? D0 : collection2) {
            if (D0 instanceof xj3) {
                byte b = 1;
                if (D0.r() == 2 && D0.a().q().size() == 1) {
                    i = 10;
                } else {
                    ot0 ot0VarD = vr3.D(D0);
                    byte b2 = 0;
                    if (ot0VarD == null) {
                        annotations = ((cw0) D0).getAnnotations();
                    } else {
                        p44 p44Var = ot0VarD instanceof p44 ? (p44) ot0VarD : null;
                        List list2 = p44Var != null ? (List) p44Var.m0.getValue() : null;
                        if (list2 == null || list2.isEmpty()) {
                            annotations = ((cw0) D0).getAnnotations();
                        } else {
                            ArrayList arrayList2 = new ArrayList(xv0.Z(list2, i2));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new m44((ja6) it.next(), z47Var, true));
                            }
                            ArrayList arrayListF0 = wv0.F0(((cw0) D0).getAnnotations(), arrayList2);
                            annotations = arrayListF0.isEmpty() ? oy1.f0 : new vm(arrayListF0, b2);
                        }
                    }
                    z47 z47VarQ = pu.q(z47Var, annotations);
                    ?? r12 = (!(D0 instanceof gl3) || (hx5Var = ((gx5) D0).A0) == null || hx5Var.i0) ? D0 : hx5Var;
                    i44 i44VarS = D0.S();
                    km kmVar = km.VALUE_PARAMETER;
                    if (i44VarS != null) {
                        ho2 ho2Var = r12 instanceof ho2 ? (ho2) r12 : null;
                        ot8 ot8Var = ho2Var != null ? (ot8) ho2Var.v(dl3.J0) : null;
                        t14VarC = j((xj3) D0, ot8Var, false, ot8Var != null ? pu.q(z47VarQ, ot8Var.getAnnotations()) : z47VarQ, kmVar, null, false, cd5.B0);
                    } else {
                        t14VarC = null;
                    }
                    dl3 dl3Var = D0 instanceof dl3 ? (dl3) D0 : null;
                    if (dl3Var != null) {
                        ed1 ed1VarP = dl3Var.p();
                        ed1VarP.getClass();
                        sx4 sx4Var = (sx4) ed1VarP;
                        String strY = w45.y(dl3Var, 3);
                        String str = ll3.a;
                        qs0 qs0VarH = ll3.h(el1.g(sx4Var).a);
                        cs5Var = (cs5) bs5.d.get((qs0VarH != null ? zs3.b(qs0VarH) : z51.t(sx4Var, qe4.A0)) + '.' + strY);
                        if (cs5Var != null) {
                            String str2 = cs5Var.c;
                            if (str2 != null && !mm7.Z(str2, false, "2.")) {
                                bt.i("Check failed.");
                                return null;
                            }
                            if (str2 != null) {
                                cs5Var = cs5Var.d;
                            }
                        } else {
                            cs5Var = null;
                        }
                    } else {
                        cs5Var = null;
                    }
                    if (cs5Var != null) {
                        cs5Var.b.size();
                        ((dl3) D0).L().size();
                    }
                    boolean z = ((f0) ((o8) ((c6) z47Var.Y).g0).f0).B(el3.a) == je6.STRICT && (D0 instanceof ho2) && dh3.f(D0.v(dl3.K0), Boolean.TRUE);
                    List<ot8> listL = r12.L();
                    listL.getClass();
                    ArrayList arrayList3 = new ArrayList(xv0.Z(listL, i2));
                    for (ot8 ot8Var2 : listL) {
                        arrayList3.add(j((xj3) D0, ot8Var2, false, ot8Var2 != null ? pu.q(z47VarQ, ot8Var2.getAnnotations()) : z47VarQ, kmVar, (cs5Var == null || (list = cs5Var.b) == null) ? null : (rh8) wv0.u0(ot8Var2.j0, list), z, new zo6(ot8Var2, b)));
                    }
                    fx5 fx5Var = D0 instanceof fx5 ? (fx5) D0 : null;
                    xj3 xj3Var = (xj3) D0;
                    t14 t14VarJ = j(xj3Var, r12, true, z47VarQ, (fx5Var == null || !vj8.V(fx5Var)) ? km.METHOD_RETURN_TYPE : km.FIELD, cs5Var != null ? cs5Var.a : null, false, cd5.C0);
                    t14 t14VarJ2 = D0.j();
                    t14VarJ2.getClass();
                    if (cj8.c(t14VarJ2, cd5Var, null)) {
                        qg5Var = new qg5(wl7.b, new ui1());
                    } else {
                        i44 i44VarS2 = D0.S();
                        if (i44VarS2 != null ? cj8.c(i44VarS2.c(), cd5Var, null) : false) {
                            qg5Var = new qg5(wl7.b, new ui1());
                        } else {
                            List listL2 = D0.L();
                            listL2.getClass();
                            if (!listL2.isEmpty()) {
                                Iterator it2 = listL2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        t14 t14VarC2 = ((ot8) it2.next()).c();
                                        t14VarC2.getClass();
                                        if (cj8.c(t14VarC2, cd5Var, null)) {
                                            qg5Var = new qg5(wl7.b, new ui1());
                                        }
                                    }
                                }
                            }
                            qg5Var = null;
                        }
                    }
                    if (t14VarC == null && t14VarJ == null) {
                        if (!arrayList3.isEmpty()) {
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((t14) it3.next()) != null) {
                                    }
                                } else if (qg5Var != null) {
                                    i = 10;
                                }
                            }
                        } else if (qg5Var != null) {
                            i = 10;
                        }
                    }
                    if (t14VarC == null) {
                        i44 i44VarS3 = D0.S();
                        t14VarC = i44VarS3 != null ? i44VarS3.c() : null;
                    }
                    i = 10;
                    ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
                    int i3 = 0;
                    for (Object obj : arrayList3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            i21.X();
                            throw null;
                        }
                        t14 t14VarC3 = (t14) obj;
                        if (t14VarC3 == null) {
                            t14VarC3 = ((ot8) D0.L().get(i3)).c();
                            t14VarC3.getClass();
                        }
                        arrayList4.add(t14VarC3);
                        i3 = i4;
                    }
                    if (t14VarJ == null) {
                        t14VarJ = D0.j();
                        t14VarJ.getClass();
                    }
                    D0 = xj3Var.d0(t14VarC, arrayList4, t14VarJ, qg5Var);
                }
            } else {
                i = i2;
            }
            arrayList.add(D0);
            i2 = i;
        }
        return arrayList;
    }

    public void n(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public String toString() {
        switch (this.X) {
            case 18:
                int iHashCode = hashCode();
                km4.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return pc6.q("CreationExtras.Key@", string, "<", yb6.a.b(yv6.class).E(), ">");
            case 19:
                int iHashCode2 = hashCode();
                km4.q(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return pc6.q("CreationExtras.Key@", string2, "<", yb6.a.b(Bundle.class).E(), ">");
            case 25:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ we5(Object obj, byte b) {
        this.X = b;
    }

    @Override // defpackage.iv5
    public void request(long j) {
    }

    public void o(ir5 ir5Var, int i, int i2) {
    }
}
