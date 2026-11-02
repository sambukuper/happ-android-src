package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub extends no2 implements dn2 {
    public final /* synthetic */ byte X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.X = b;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0331  */
    /* JADX WARN: Code duplicated, block: B:268:0x065f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:273:0x067e  */
    /* JADX WARN: Code duplicated, block: B:407:0x08ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x08bc A[LOOP:20: B:397:0x0884->B:408:0x08bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:437:0x0928 A[PHI: r7
  0x0928: PHI (r7v12 int) = (r7v11 int), (r7v14 int), (r7v14 int) binds: [B:423:0x08ff, B:428:0x0909, B:430:0x090f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:604:0x0987 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [t05] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v69, types: [d02] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t05] */
    @Override // defpackage.dn2
    public final Object invoke() throws Exception {
        ContentCaptureSession contentCaptureSessionP;
        t6 t6Var;
        boolean zIsAssignableFrom;
        Class cls;
        Object next;
        Object next2;
        boolean z;
        Class cls2;
        ?? arrayList;
        Class cls3;
        Object value;
        xm4 xm4Var;
        Object value2;
        xm4 xm4Var2;
        Object value3;
        xm4 xm4Var3;
        int i;
        int i2;
        Type typeV;
        byte b = this.X;
        byte b2 = 2;
        q51 q51Var = null;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                View view = (View) this.receiver;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    b4.s(view);
                }
                if (i3 < 29 || (contentCaptureSessionP = wa.p(view)) == null) {
                    return null;
                }
                return new h41(contentCaptureSessionP, view);
            case 1:
                return ((h38) this.receiver).S();
            case 2:
                ExcludedRoutesActivity excludedRoutesActivity = (ExcludedRoutesActivity) this.receiver;
                int i4 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity.getClass();
                pu.Q(excludedRoutesActivity, y46.toast_success);
                return dn8Var;
            case 3:
                ExcludedRoutesActivity excludedRoutesActivity2 = (ExcludedRoutesActivity) this.receiver;
                int i5 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity2.C();
                return dn8Var;
            case 4:
                ExcludedRoutesActivity excludedRoutesActivity3 = (ExcludedRoutesActivity) this.receiver;
                int i6 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity3.C();
                return dn8Var;
            case 5:
                ExcludedRoutesActivity excludedRoutesActivity4 = (ExcludedRoutesActivity) this.receiver;
                int i7 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity4.getClass();
                pu.Q(excludedRoutesActivity4, y46.toast_success);
                return dn8Var;
            case 6:
                ExcludedRoutesActivity excludedRoutesActivity5 = (ExcludedRoutesActivity) this.receiver;
                int i8 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity5.C();
                return dn8Var;
            case 7:
                ExcludedRoutesActivity excludedRoutesActivity6 = (ExcludedRoutesActivity) this.receiver;
                int i9 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity6.getClass();
                pu.Q(excludedRoutesActivity6, y46.toast_success);
                return dn8Var;
            case 8:
                ExcludedRoutesActivity excludedRoutesActivity7 = (ExcludedRoutesActivity) this.receiver;
                int i10 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity7.C();
                return dn8Var;
            case 9:
                ExcludedRoutesActivity excludedRoutesActivity8 = (ExcludedRoutesActivity) this.receiver;
                int i11 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity8.getClass();
                pu.Q(excludedRoutesActivity8, y46.toast_success);
                return dn8Var;
            case 10:
                ExcludedRoutesActivity excludedRoutesActivity9 = (ExcludedRoutesActivity) this.receiver;
                int i12 = ExcludedRoutesActivity.U0;
                excludedRoutesActivity9.C();
                return dn8Var;
            case 11:
                bh2 bh2Var = (bh2) this.receiver;
                ?? r1 = bh2Var.c;
                ?? r2 = bh2Var.d;
                gh2 gh2Var = bh2Var.a;
                ai2 ai2VarF = gh2Var.f();
                yh2 yh2Var = yh2.Z;
                long j = -9187201950435737472L;
                if (ai2VarF == null) {
                    Object[] objArr = r2.b;
                    long[] jArr = r2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j2 = jArr[i13];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length)) >>> 31);
                                long j3 = j2;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if ((j3 & 255) < 128) {
                                        ((vg2) objArr[(i13 << 3) + i15]).H(yh2Var);
                                    }
                                    j3 >>= 8;
                                }
                                if (i14 == 8) {
                                    if (i13 != length) {
                                        i13++;
                                    }
                                }
                            } else if (i13 != length) {
                                i13++;
                            }
                        }
                    }
                } else if (ai2VarF.p0) {
                    if (r1.c(ai2VarF)) {
                        ai2VarF.e1();
                    }
                    yh2 yh2VarD1 = ai2VarF.d1();
                    if (!ai2VarF.X.p0) {
                        wc3.b("visitAncestors called on an unattached node");
                    }
                    jx4 jx4Var = ai2VarF.X;
                    LayoutNode layoutNodeZ = yn0.Z(ai2VarF);
                    jx4 jx4Var2 = jx4Var;
                    int i16 = 0;
                    while (layoutNodeZ != null) {
                        if ((((jx4) layoutNodeZ.H0.i0).f0 & 5120) != 0) {
                            while (jx4Var2 != null) {
                                int i17 = jx4Var2.Z;
                                if ((i17 & 5120) != 0) {
                                    if ((i17 & 1024) != 0) {
                                        i16++;
                                    }
                                    if ((jx4Var2 instanceof vg2) && r2.c(jx4Var2)) {
                                        if (i16 <= 1) {
                                            ((vg2) jx4Var2).H(yh2VarD1);
                                        } else {
                                            ((vg2) jx4Var2).H(yh2.Y);
                                        }
                                        r2.l(jx4Var2);
                                    }
                                }
                                jx4Var2 = jx4Var2.g0;
                            }
                        }
                        layoutNodeZ = layoutNodeZ.w();
                        jx4Var2 = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
                    }
                    Object[] objArr2 = r2.b;
                    long[] jArr2 = r2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j4 = jArr2[i18];
                            long j5 = j;
                            if ((((~j4) << 7) & j4 & j5) != j5) {
                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                long j6 = j4;
                                for (int i20 = 0; i20 < i19; i20++) {
                                    if ((j6 & 255) < 128) {
                                        ((vg2) objArr2[(i18 << 3) + i20]).H(yh2Var);
                                    }
                                    j6 >>= 8;
                                }
                                if (i19 == 8) {
                                }
                            }
                            if (i18 != length2) {
                                i18++;
                                j = j5;
                            }
                        }
                    }
                }
                if (gh2Var.f() == null || gh2Var.c.d1() == yh2Var) {
                    gh2Var.c();
                }
                r1.b();
                r2.b();
                bh2Var.e = false;
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Boolean.valueOf(ai2.h1(((ci2) this.receiver).x0));
            case 13:
                ((ow2) this.receiver).a();
                return dn8Var;
            case 14:
                y68 y68Var = (y68) this.receiver;
                rh5 rh5Var = y68Var.c;
                rh5 rh5Var2 = y68Var.c;
                dd7 dd7VarD = yn0.D();
                gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
                dd7 dd7VarP = yn0.P(dd7VarD);
                try {
                    boolean zBooleanValue = ((Boolean) rh5Var.getValue()).booleanValue();
                    yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                    if (zBooleanValue) {
                        zc3.c("TextFieldState does not support concurrent or nested editing.");
                    }
                    rh5Var.setValue(Boolean.TRUE);
                    g48 g48Var = new g48(y68Var.c(), null, null, null, 14);
                    try {
                        g48Var.c(0, g48Var.Z.length(), _UrlKt.FRAGMENT_ENCODE_SET);
                        mn7.f(g48Var);
                        y68Var.a(g48Var);
                        rh5Var2.setValue(Boolean.FALSE);
                        return dn8Var;
                    } finally {
                        rh5Var2.setValue(Boolean.FALSE);
                        y68Var.f(false);
                    }
                } catch (Throwable th) {
                    yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                    throw th;
                }
            case 15:
                Method method = (Method) this.receiver;
                method.getClass();
                if (Modifier.isStatic(method.getModifiers())) {
                    zIsAssignableFrom = false;
                } else {
                    v15 v15VarE = v15.e(method.getName());
                    int length3 = method.getParameterTypes().length;
                    boolean zIsVarArgs = method.isVarArgs();
                    if (v15VarE.equals(id5.i)) {
                        if (length3 >= 1) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (v15VarE.equals(id5.j)) {
                        if (length3 < 2 || zIsVarArgs) {
                            zIsAssignableFrom = false;
                        } else {
                            zIsAssignableFrom = true;
                        }
                    } else if (v15VarE.equals(id5.a)) {
                        if (!zIsVarArgs && length3 == 2) {
                            Class<?> cls4 = method.getParameterTypes()[1];
                            cls4.getClass();
                            if (cls4.isAssignableFrom(nw3.class)) {
                                zIsAssignableFrom = true;
                            }
                        }
                        zIsAssignableFrom = false;
                    } else if (v15VarE.equals(id5.b)) {
                        if (!zIsVarArgs && length3 == 3) {
                            Class<?> cls5 = method.getParameterTypes()[1];
                            cls5.getClass();
                            if (cls5.isAssignableFrom(nw3.class)) {
                                zIsAssignableFrom = true;
                            }
                        }
                        zIsAssignableFrom = false;
                    } else if (v15VarE.equals(id5.c)) {
                        if (!zIsVarArgs && length3 == 2) {
                            Class<?> cls6 = method.getParameterTypes()[1];
                            cls6.getClass();
                            if (cls6.isAssignableFrom(nw3.class)) {
                                zIsAssignableFrom = true;
                            }
                        }
                        zIsAssignableFrom = false;
                    } else if (v15VarE.equals(id5.g)) {
                        zIsAssignableFrom = true;
                    } else {
                        boolean zEquals = v15VarE.equals(id5.f);
                        Class cls7 = Boolean.TYPE;
                        if (zEquals) {
                            if (length3 == 1 && !zIsVarArgs && dh3.f(method.getReturnType(), cls7)) {
                                zIsAssignableFrom = true;
                            } else {
                                zIsAssignableFrom = false;
                            }
                        } else if (v15VarE.equals(id5.h)) {
                            if (length3 == 0) {
                                zIsAssignableFrom = true;
                            } else {
                                zIsAssignableFrom = false;
                            }
                        } else if (v15VarE.equals(id5.k)) {
                            if (length3 == 0) {
                                zIsAssignableFrom = true;
                            } else {
                                zIsAssignableFrom = false;
                            }
                        } else if (v15VarE.equals(id5.l)) {
                            if (length3 == 0 && dh3.f(method.getReturnType(), cls7)) {
                                zIsAssignableFrom = true;
                            } else {
                                zIsAssignableFrom = false;
                            }
                        } else if (v15VarE.equals(id5.d)) {
                            if (length3 == 1 && dh3.f(method.getParameterTypes()[0], Object.class)) {
                                zIsAssignableFrom = true;
                            } else {
                                zIsAssignableFrom = false;
                            }
                        } else if (v15VarE.equals(id5.e)) {
                            if (dh3.f(method.getReturnType(), Integer.TYPE) && length3 == 1 && !zIsVarArgs) {
                                zIsAssignableFrom = true;
                            } else {
                                zIsAssignableFrom = false;
                            }
                        } else if (id5.y.contains(v15VarE)) {
                            if (length3 != 1 || zIsVarArgs) {
                                zIsAssignableFrom = false;
                            } else {
                                zIsAssignableFrom = true;
                            }
                        } else if (id5.x.contains(v15VarE)) {
                            if (length3 == 0) {
                                zIsAssignableFrom = true;
                            } else {
                                zIsAssignableFrom = false;
                            }
                        } else if (v15VarE.equals(id5.n) || v15VarE.equals(id5.o)) {
                            zIsAssignableFrom = method.getDeclaringClass().isAssignableFrom(method.getReturnType());
                        } else {
                            if (!id5.z.contains(v15VarE)) {
                                String strB = v15VarE.b();
                                if (strB != null) {
                                    zIsAssignableFrom = id5.m.d(strB);
                                }
                            } else if (dh3.f(method.getReturnType(), Void.TYPE) && length3 == 1 && !zIsVarArgs) {
                                zIsAssignableFrom = true;
                            }
                            zIsAssignableFrom = false;
                        }
                    }
                }
                return Boolean.valueOf(zIsAssignableFrom);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ev3 ev3Var = (ev3) this.receiver;
                ev3Var.getClass();
                g44 g44Var = ev3Var.Z;
                if (!q08.b || q08.a || ev3Var.k0()) {
                    gb4 gb4VarR = i21.r();
                    gb4VarR.addAll(((cv3) g44Var.getValue()).a());
                    et4 et4VarK = ev3Var.h0().X().K();
                    ss4 ss4Var = ss4.Y;
                    gb4VarR.addAll(gv3.x(ev3Var, et4VarK, ss4Var));
                    et4 et4VarO0 = ev3Var.h0().o0();
                    et4VarO0.getClass();
                    gb4VarR.addAll(gv3.x(ev3Var, et4VarO0, ss4Var));
                    return i21.j(gb4VarR);
                }
                tb6 tb6Var = ((cv3) g44Var.getValue()).p;
                nw3 nw3Var = cv3.r[12];
                Object objInvoke = tb6Var.invoke();
                objInvoke.getClass();
                Map map = (Map) objInvoke;
                Class clsM = zc1.M(ev3Var);
                tx0 tx0Var = y72.a;
                boolean z2 = clsM.getAnnotation(Metadata.class) != null;
                int size = map.size();
                HashMap map2 = new HashMap(size >= 3 ? (size / 3) + size + 1 : 3);
                for (Map.Entry entry : map.entrySet()) {
                    kb6 kb6Var = (kb6) entry.getValue();
                    if (!z2 || !y72.f(kb6Var) || !((lb6) kb6Var).X.c()) {
                        if (!kb6Var.R() || dh3.f(y72.d(kb6Var).t().getPackage(), zc1.M(ev3Var).getPackage())) {
                            map2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                Collection collectionValues = map2.values();
                collectionValues.getClass();
                Collection collectionA = ((cv3) g44Var.getValue()).a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionA) {
                    if (y72.e(ev3Var, (kb6) obj)) {
                        arrayList2.add(obj);
                    }
                }
                return wv0.H0(collectionValues, arrayList2);
            case 17:
                ev3 ev3Var2 = (ev3) this.receiver;
                ev3Var2.getClass();
                Class cls8 = ev3Var2.Y;
                gb4 gb4VarR2 = i21.r();
                boolean z3 = q08.a;
                ss4 ss4Var2 = ss4.X;
                if (z3 || ev3Var2.k0() || ev3Var2.i0() != null) {
                    gb4VarR2.addAll(gv3.x(ev3Var2, ev3Var2.h0().X().K(), ss4Var2));
                    et4 et4VarO1 = ev3Var2.h0().o0();
                    et4VarO1.getClass();
                    gb4VarR2.addAll(gv3.x(ev3Var2, et4VarO1, ss4Var2));
                } else {
                    for (Object obj2 : gv3.w(ev3Var2)) {
                        vk3 vk3Var = (vk3) obj2;
                        vk3Var.getClass();
                        List listF = z91.F(v15.e(vk3Var.getName()));
                        if (listF.isEmpty()) {
                            cls = cls8;
                            gb4VarR2.add(obj2);
                        } else {
                            Iterator it = listF.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String strB2 = ((v15) it.next()).b();
                                    strB2.getClass();
                                    List listC = ev3Var2.c();
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it2 = listC.iterator();
                                    while (it2.hasNext()) {
                                        lv3 lv3VarM = ((pw3) it2.next()).M();
                                        zu3 zu3Var = lv3VarM instanceof zu3 ? (zu3) lv3VarM : null;
                                        if (zu3Var != null) {
                                            Collection collectionP = zu3Var.P();
                                            ArrayList arrayList4 = new ArrayList();
                                            for (Object obj3 : collectionP) {
                                                xu3 xu3Var = (xu3) obj3;
                                                if ((xu3Var instanceof lw3) && (xu3Var instanceof pb6)) {
                                                    kb6 kb6Var2 = (kb6) xu3Var;
                                                    if (y72.f(kb6Var2)) {
                                                        cls3 = cls8;
                                                    } else {
                                                        List listL = kb6Var2.l();
                                                        if (listL == null || !listL.isEmpty()) {
                                                            Iterator it3 = listL.iterator();
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    cls3 = cls8;
                                                                    if (((ob6) it3.next()).x() != fw3.Z) {
                                                                        cls8 = cls3;
                                                                    }
                                                                } else {
                                                                    cls3 = cls8;
                                                                    arrayList4.add(obj3);
                                                                }
                                                            }
                                                        } else {
                                                            cls3 = cls8;
                                                            arrayList4.add(obj3);
                                                        }
                                                    }
                                                } else {
                                                    cls3 = cls8;
                                                }
                                                cls8 = cls3;
                                            }
                                            cls2 = cls8;
                                            arrayList = new ArrayList();
                                            for (Object obj4 : arrayList4) {
                                                if (dh3.f(((lw3) obj4).getName(), strB2)) {
                                                    arrayList.add(obj4);
                                                }
                                            }
                                        } else {
                                            cls2 = cls8;
                                            arrayList = 0;
                                        }
                                        if (arrayList == 0) {
                                            arrayList = d02.X;
                                        }
                                        bw0.d0(arrayList3, arrayList);
                                        cls8 = cls2;
                                    }
                                    cls = cls8;
                                    if (!arrayList3.isEmpty()) {
                                        Iterator it4 = arrayList3.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                lw3 lw3Var = (lw3) it4.next();
                                                d3 d3Var = new d3(vk3Var, ev3Var2, (byte) 8);
                                                if (!(lw3Var instanceof cl3)) {
                                                    Iterator it5 = ((Iterable) d3Var.B(js3.a(lw3Var.getName()))).iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next = it5.next();
                                                            nb6 nb6Var = (nb6) next;
                                                            if (!nr4.C(nb6Var).isEmpty() || !z68.p0(nb6Var.j(), lw3Var.j())) {
                                                            }
                                                        } else {
                                                            next = null;
                                                        }
                                                    }
                                                    nb6 nb6Var2 = (nb6) next;
                                                    Iterator it6 = ((Iterable) d3Var.B(js3.b(lw3Var.getName()))).iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next2 = it6.next();
                                                            nb6 nb6Var3 = (nb6) next2;
                                                            ArrayList arrayListC = nr4.C(nb6Var3);
                                                            if (arrayListC.size() != 1 || !dh3.f(nb6Var3.j(), rg7.e) || !wl7.l(((ob6) wv0.O0(arrayListC)).B(), lw3Var.j())) {
                                                            }
                                                        } else {
                                                            next2 = null;
                                                        }
                                                    }
                                                    nb6 nb6Var4 = (nb6) next2;
                                                    if (nb6Var2 != null && (!((z = lw3Var instanceof zv3)) || (nb6Var4 != null && nb6Var4.m() == nb6Var2.m()))) {
                                                        if (!z) {
                                                            String name = vk3Var.getName();
                                                            fk2 fk2Var = js3.a;
                                                            if (!mm7.Z(name, false, "set")) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    cls8 = cls;
                                } else {
                                    cls = cls8;
                                    gb4VarR2.add(obj2);
                                }
                            }
                        }
                        cls8 = cls;
                    }
                    Class cls9 = cls8;
                    for (Object obj5 : gv3.x(ev3Var2, ev3Var2.h0().X().K(), ss4Var2)) {
                        if (((ej1) obj5) instanceof nw3) {
                            gb4VarR2.add(obj5);
                        }
                    }
                    Method[] declaredMethods = cls9.getDeclaredMethods();
                    declaredMethods.getClass();
                    for (Method method2 : declaredMethods) {
                        if (Modifier.isStatic(method2.getModifiers()) && !method2.isSynthetic()) {
                            gb4VarR2.add(new vk3(ev3Var2, method2, nd0.NO_RECEIVER, yu3.k));
                        }
                    }
                    Field[] declaredFields = cls9.getDeclaredFields();
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        if (!field.isEnumConstant() && Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                            if (Modifier.isFinal(field.getModifiers())) {
                                gb4VarR2.add(new cl3(ev3Var2, field, nd0.NO_RECEIVER, yu3.k));
                            } else {
                                gb4VarR2.add(new sk3(ev3Var2, field, nd0.NO_RECEIVER, yu3.k));
                            }
                        }
                    }
                    if (cls9.isEnum()) {
                        gb4VarR2.add(new jk3(ev3Var2));
                    }
                }
                return i21.j(gb4VarR2);
            case 18:
                ((ow2) this.receiver).a();
                return dn8Var;
            case 19:
                ((MainViewModel) this.receiver).v();
                return dn8Var;
            case 20:
                MainViewModel mainViewModel = (MainViewModel) this.receiver;
                mainViewModel.getClass();
                jm4.Q(zw8.a(mainViewModel), null, new xn4(mainViewModel, q51Var, b2), 3);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                oh7 oh7Var = ((MainViewModel) this.receiver).w;
                do {
                    value = oh7Var.getValue();
                    xm4Var = (xm4) value;
                    xm4Var.getClass();
                } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, false, false, null, 57343)));
                return dn8Var;
            case 22:
                oh7 oh7Var2 = ((MainViewModel) this.receiver).w;
                do {
                    value2 = oh7Var2.getValue();
                    xm4Var2 = (xm4) value2;
                    xm4Var2.getClass();
                } while (!oh7Var2.k(value2, xm4.a(xm4Var2, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, false, false, null, 49151)));
                return dn8Var;
            case 23:
                oh7 oh7Var3 = ((MainViewModel) this.receiver).w;
                do {
                    value3 = oh7Var3.getValue();
                    xm4Var3 = (xm4) value3;
                    xm4Var3.getClass();
                } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, false, false, rm4.a, 32767)));
                return dn8Var;
            case 24:
                ((wu2) this.receiver).getClass();
                return new GuId(rl8.a());
            case 25:
                ((cn7) this.receiver).getClass();
                return new SubId(rl8.a());
            case 26:
                lb6 lb6Var = (lb6) this.receiver;
                lb6Var.getClass();
                List<ob6> listG = lb6Var.g();
                if (mb6.L(lb6Var)) {
                    Member memberB = lb6Var.r().b();
                    Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
                    if (constructor == null || !zc1.U(constructor)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                int size2 = (lb6Var.h() ? 1 : 0) + listG.size() + i;
                if (listG.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (ob6 ob6Var : listG) {
                        if (ob6Var.x() == fw3.f0 || ob6Var.x() == fw3.Y) {
                            i2++;
                            if (i2 < 0) {
                                i21.W();
                                throw null;
                            }
                        }
                    }
                }
                int i21 = ((i2 + i) + 31) / 32;
                Object[] objArr3 = new Object[size2 + i21 + 1];
                for (ob6 ob6Var2 : listG) {
                    if (ob6Var2.F() && !ms8.i(ob6Var2.B())) {
                        int iV = ob6Var2.v();
                        pw3 pw3VarB = ob6Var2.B();
                        pw3VarB.getClass();
                        if (pw3VarB instanceof u1) {
                            tb6 tb6Var2 = ((u1) pw3VarB).X;
                            typeV = tb6Var2 != null ? (Type) tb6Var2.invoke() : null;
                            if (typeV == null) {
                                typeV = vj8.v(pw3VarB, false);
                            }
                        } else {
                            typeV = vj8.v(pw3VarB, false);
                        }
                        objArr3[iV] = ms8.f(typeV);
                    } else if (ob6Var2.G()) {
                        int iV2 = ob6Var2.v();
                        Class clsM2 = zc1.M(ci8.v(ob6Var2.B()));
                        if (!clsM2.isArray()) {
                            throw new p14("Cannot instantiate the default empty array of type " + clsM2.getSimpleName() + ", because it is not an array type");
                        }
                        Object objNewInstance = Array.newInstance(clsM2.getComponentType(), 0);
                        objNewInstance.getClass();
                        objArr3[iV2] = objNewInstance;
                    } else {
                        continue;
                    }
                }
                for (int i22 = 0; i22 < i21; i22++) {
                    objArr3[size2 + i22] = 0;
                }
                return objArr3;
            case 27:
                ql6 ql6Var = (ql6) this.receiver;
                m51 m51Var = ql6Var.a;
                if (m51Var == null) {
                    dh3.T("coroutineScope");
                    throw null;
                }
                gv3.i(m51Var, null);
                ql6Var.f();
                by0 by0Var = ql6Var.d;
                if (by0Var != null) {
                    ((t11) by0Var.f).close();
                    return dn8Var;
                }
                dh3.T("connectionManager");
                throw null;
            default:
                ((ow2) this.receiver).a();
                return dn8Var;
        }
    }
}
