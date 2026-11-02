package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.CancellationSignal;
import androidx.compose.ui.platform.AndroidComposeView;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubInfoColor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ y0(ib2 ib2Var, hd6 hd6Var) {
        this.X = (byte) 28;
        this.Y = hd6Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x041f  */
    /* JADX WARN: Code duplicated, block: B:136:0x045a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        int i;
        g60 g60Var;
        s53 s53Var;
        s53 s53Var2;
        je jeVarD;
        byte b = this.X;
        byte b2 = 5;
        z = false;
        boolean z = false;
        c = 0;
        char c = 0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                return obj == ((z0) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                b2 b2Var = (b2) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == b2Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != b2Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                g7 g7Var = (g7) obj2;
                g7Var.s0.K((e38) obj, hi5.W(g7Var, pc.b));
                return dn8Var;
            case 3:
                o34 o34Var = (o34) obj2;
                v8 v8Var = (v8) obj;
                if (v8Var.l() != Integer.MAX_VALUE) {
                    if (v8Var.c().b) {
                        v8Var.B();
                    }
                    for (Map.Entry entry2 : v8Var.c().i.entrySet()) {
                        o34Var.a((r8) entry2.getKey(), ((Number) entry2.getValue()).intValue(), v8Var.d());
                    }
                    i55 i55Var = v8Var.d().y0;
                    i55Var.getClass();
                    while (!i55Var.equals(o34Var.a.d())) {
                        for (r8 r8Var : o34Var.b(i55Var).keySet()) {
                            o34Var.a(r8Var, o34Var.c(i55Var, r8Var), i55Var);
                        }
                        i55Var = i55Var.y0;
                        i55Var.getClass();
                    }
                }
                return dn8Var;
            case 4:
                return Boolean.valueOf(((ai2) obj).g1(((ug2) obj2).a));
            case 5:
                ti4 ti4Var = (ti4) obj;
                AndroidComposeView androidComposeView = ((tb) obj2).r0;
                if (androidComposeView.getInsetsListener().i0.l() > 0) {
                    vz4 vz4Var = g29.a;
                    ti4Var.X = true;
                    vi4 vi4Var = ti4Var.f0;
                    y24 y24VarM0 = vi4Var.m0();
                    if (hf3.a(ti4Var.Y, 9223372034707292159L)) {
                        ti4Var.Y = nr4.M(y24VarM0.n(0L));
                        ti4Var.Z = y24VarM0.j();
                    }
                    vi4Var.r0().I0.b();
                    long j = y24VarM0.j();
                    s05 s05Var = androidComposeView.getInsetsListener().h0;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    e29[] e29VarArr = g29.b;
                    int length = e29VarArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        e29 e29Var = e29VarArr[i4];
                        Object objG = s05Var.g(e29Var);
                        objG.getClass();
                        r29 r29Var = (r29) objG;
                        ti4 ti4Var2 = ti4Var;
                        int i5 = i3;
                        int i6 = i2;
                        g29.a(ti4Var2, ((f29) e29Var).c, r29Var.h, i6, i5);
                        if (((Boolean) r29Var.b.getValue()).booleanValue()) {
                            g29.a(ti4Var2, r29Var.f, r29Var.j, i6, i5);
                            g29.a(ti4Var2, r29Var.g, r29Var.k, i6, i5);
                        }
                        g29.a(ti4Var2, ((f29) e29Var).d, r29Var.i, i6, i5);
                        ti4Var = ti4Var2;
                        i4++;
                        i2 = i6;
                        i3 = i5;
                    }
                    j05 j05Var = androidComposeView.getInsetsListener().j0;
                    if (j05Var.j()) {
                        vd7 vd7Var = androidComposeView.getInsetsListener().k0;
                        Object[] objArr = j05Var.a;
                        int i7 = j05Var.b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            y05 y05Var = (y05) objArr[i8];
                            gd3 gd3Var = (gd3) vd7Var.get(i8);
                            Rect rect = (Rect) y05Var.getValue();
                            ti4Var.a(gd3Var.b(), rect.left);
                            ti4Var.a(gd3Var.d(), rect.top);
                            ti4Var.a(gd3Var.c(), rect.right);
                            ti4Var.a(gd3Var.a(), rect.bottom);
                        }
                    }
                }
                return dn8Var;
            case 6:
                return Boolean.valueOf(((ff3) obj2).a(((y07) obj).f));
            case 7:
                return Boolean.valueOf(vr3.L((y07) obj, (Resources) obj2));
            case 8:
                ((f17) obj).a(n07.a, new m07(ev2.X, ((v30) obj2).a(), l07.Y, true));
                return dn8Var;
            case 9:
                fz0 fz0Var = (fz0) obj2;
                fz0Var.a.f(true);
                fz0Var.b.f(true);
                return new o00((l94) obj, fz0Var);
            case 10:
                ((u95) obj).getClass();
                ((s10) obj2).R(false, false);
                return dn8Var;
            case 11:
                return new jd((i30) obj2, (byte) 3);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new jd((jc8) obj2, b2);
            case 13:
                b70 b70Var = (b70) obj2;
                jc0 jc0Var = (jc0) obj;
                if (jc0Var.getDensity() * b70Var.t0 < 0.0f || ua7.c(jc0Var.X.e()) <= 0.0f) {
                    return jc0Var.a(new y2((byte) 28));
                }
                final float fMin = Math.min(kt1.b(b70Var.t0, 0.0f) ? 1.0f : (float) Math.ceil(jc0Var.getDensity() * b70Var.t0), (float) Math.ceil(ua7.c(jc0Var.X.e()) / 2.0f));
                final float f = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jc0Var.X.e() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jc0Var.X.e() & 4294967295L)) - fMin)) & 4294967295L);
                float f2 = fMin * 2.0f;
                boolean z2 = f2 > ua7.c(jc0Var.X.e());
                mb6 mb6VarA = b70Var.v0.a(jc0Var.X.e(), jc0Var.X.getLayoutDirection(), jc0Var);
                if (!(mb6VarA instanceof zd5)) {
                    if (!(mb6VarA instanceof be5)) {
                        boolean z3 = z2;
                        if (!(mb6VarA instanceof ae5)) {
                            b61.c();
                            return null;
                        }
                        fe7 fe7Var = b70Var.u0;
                        long j2 = z3 ? 0L : jFloatToRawIntBits;
                        if (z3) {
                            jFloatToRawIntBits2 = jc0Var.X.e();
                        }
                        return jc0Var.a(new y60(fe7Var, j2, jFloatToRawIntBits2, z3 ? ea2.a : new om7(fMin, 0.0f, 0, 0, 30)));
                    }
                    final fe7 fe7Var2 = b70Var.u0;
                    em6 em6Var = ((be5) mb6VarA).j0;
                    if (pu.z(em6Var)) {
                        final long j3 = em6Var.e;
                        final om7 om7Var = new om7(fMin, 0.0f, 0, 0, 30);
                        final boolean z4 = z2;
                        return jc0Var.a(new gn2() { // from class: z60
                            @Override // defpackage.gn2
                            public final Object B(Object obj3) throws Throwable {
                                long j4;
                                p34 p34Var = (p34) obj3;
                                p34Var.a();
                                um0 um0Var = p34Var.X;
                                boolean z5 = z4;
                                d90 d90Var = fe7Var2;
                                long j5 = j3;
                                if (z5) {
                                    sv1.p0(p34Var, d90Var, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f3 = f;
                                    if (fIntBitsToFloat < f3) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (um0Var.e() >> 32));
                                        float f4 = fMin;
                                        float f5 = fIntBitsToFloat2 - f4;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (um0Var.e() & 4294967295L)) - f4;
                                        lr lrVar = um0Var.Y;
                                        long jP = lrVar.p();
                                        lrVar.k().g();
                                        try {
                                            ((lr) ((wl6) lrVar.Y).Y).k().m(f4, f4, f5, fIntBitsToFloat3, 0);
                                            j4 = jP;
                                            try {
                                                sv1.p0(p34Var, d90Var, 0L, 0L, j5, null, 246);
                                                p61.w(lrVar, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                p61.w(lrVar, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jP;
                                        }
                                    } else {
                                        sv1.p0(p34Var, d90Var, jFloatToRawIntBits, jFloatToRawIntBits2, u70.o0(f3, j5), om7Var, 208);
                                    }
                                }
                                return dn8.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    x60 x60Var = b70Var.s0;
                    if (x60Var == null) {
                        x60Var = new x60();
                        b70Var.s0 = x60Var;
                    }
                    lf lfVarA = x60Var.d;
                    if (lfVarA == null) {
                        lfVarA = nf.a();
                        x60Var.d = lfVarA;
                    }
                    lfVarA.g();
                    lf.c(lfVarA, em6Var);
                    if (!z5) {
                        lf lfVarA2 = nf.a();
                        lf.c(lfVarA2, new em6(fMin, fMin, (em6Var.c - em6Var.a) - fMin, (em6Var.d - em6Var.b) - fMin, u70.o0(fMin, em6Var.e), u70.o0(fMin, em6Var.f), u70.o0(fMin, em6Var.g), u70.o0(fMin, em6Var.h)));
                        lfVarA.f(lfVarA, lfVarA2, 0);
                    }
                    return jc0Var.a(new p0(lfVarA, fe7Var2, (byte) 9));
                }
                fe7 fe7Var3 = b70Var.u0;
                zd5 zd5Var = (zd5) mb6VarA;
                lf lfVar = zd5Var.j0;
                if (z2) {
                    return jc0Var.a(new p0(zd5Var, fe7Var3, (byte) 10));
                }
                if (fe7Var3 != null) {
                    g60Var = new g60(dw0.b(1.0f, fe7Var3.a), 5);
                    i = 1;
                } else {
                    i = 0;
                    g60Var = null;
                }
                s86 s86VarD = lfVar.d();
                float f3 = s86VarD.b;
                float f4 = s86VarD.a;
                x60 x60Var2 = b70Var.s0;
                if (x60Var2 == null) {
                    x60Var2 = new x60();
                    b70Var.s0 = x60Var2;
                }
                lf lfVarA3 = x60Var2.d;
                if (lfVarA3 == null) {
                    lfVarA3 = nf.a();
                    x60Var2.d = lfVarA3;
                }
                lfVarA3.g();
                lf.b(lfVarA3, s86VarD);
                lfVarA3.f(lfVarA3, lfVar, 0);
                ea6 ea6Var = new ea6();
                long jCeil = (((long) ((int) Math.ceil(s86VarD.c - f4))) << 32) | (((long) ((int) Math.ceil(s86VarD.d - f3))) & 4294967295L);
                x60 x60Var3 = b70Var.s0;
                x60Var3.getClass();
                je jeVar = x60Var3.a;
                eb ebVarA = x60Var3.b;
                if (jeVar != null) {
                    Bitmap.Config config = jeVar.a.getConfig();
                    config.getClass();
                    s53Var = new s53(ue3.k0(config));
                } else {
                    s53Var = null;
                }
                if (s53Var != null && s53Var.a == 0) {
                    c = 1;
                } else {
                    if (jeVar != null) {
                        Bitmap.Config config2 = jeVar.a.getConfig();
                        config2.getClass();
                        s53Var2 = new s53(ue3.k0(config2));
                    } else {
                        s53Var2 = null;
                    }
                    if (s53Var2 != null && i == s53Var2.a) {
                        c = 1;
                    }
                }
                if (jeVar == null || ebVarA == null) {
                    jeVarD = mb6.d((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    x60Var3.a = jeVarD;
                    ebVarA = fb.a(jeVarD);
                    x60Var3.b = ebVarA;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jc0Var.X.e() >> 32));
                    Bitmap bitmap = jeVar.a;
                    if (fIntBitsToFloat <= bitmap.getWidth()) {
                        char c2 = c;
                        if (Float.intBitsToFloat((int) (jc0Var.X.e() & 4294967295L)) > bitmap.getHeight() || c2 == 0) {
                            jeVarD = mb6.d((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                            x60Var3.a = jeVarD;
                            ebVarA = fb.a(jeVarD);
                            x60Var3.b = ebVarA;
                        } else {
                            jeVarD = jeVar;
                        }
                    } else {
                        jeVarD = mb6.d((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                        x60Var3.a = jeVarD;
                        ebVarA = fb.a(jeVarD);
                        x60Var3.b = ebVarA;
                    }
                }
                um0 um0Var = x60Var3.c;
                if (um0Var == null) {
                    um0Var = new um0();
                    x60Var3.c = um0Var;
                }
                lr lrVar = um0Var.Y;
                tm0 tm0Var = um0Var.X;
                long jR = u15.R(jCeil);
                z24 layoutDirection = jc0Var.X.getLayoutDirection();
                fi1 fi1Var = tm0Var.a;
                um0 um0Var2 = um0Var;
                z24 z24Var = tm0Var.b;
                sm0 sm0Var = tm0Var.c;
                long j4 = tm0Var.d;
                tm0Var.a = jc0Var;
                tm0Var.b = layoutDirection;
                tm0Var.c = ebVarA;
                tm0Var.d = jR;
                ebVarA.g();
                sv1.k0(um0Var2, dw0.b, 0L, jR, 0.0f, 58);
                float f5 = -f4;
                float f6 = -f3;
                ((wl6) lrVar.Y).V(f5, f6);
                try {
                    sv1.d0(um0Var2, zd5Var.j0, fe7Var3, 0.0f, new om7(f2, 0.0f, 0, 0, 30), 52);
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (um0Var2.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (um0Var2.e() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (um0Var2.e() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (um0Var2.e() & 4294967295L));
                    long jA0 = um0Var2.A0();
                    je jeVar2 = jeVarD;
                    eb ebVar = ebVarA;
                    long jP = lrVar.p();
                    lrVar.k().g();
                    lf lfVar2 = lfVarA3;
                    try {
                        ((wl6) lrVar.Y).U(fIntBitsToFloat2, fIntBitsToFloat3, jA0);
                        sv1.d0(um0Var2, lfVar2, fe7Var3, 0.0f, null, 28);
                        lrVar.k().p();
                        lrVar.D(jP);
                        ((wl6) lrVar.Y).V(-f5, -f6);
                        ebVar.p();
                        tm0Var.a = fi1Var;
                        tm0Var.b = z24Var;
                        tm0Var.c = sm0Var;
                        tm0Var.d = j4;
                        jeVar2.a.prepareToDraw();
                        ea6Var.X = jeVar2;
                        return jc0Var.a(new a70(s86VarD, ea6Var, jCeil, g60Var));
                    } catch (Throwable th) {
                        lrVar.k().p();
                        lrVar.D(jP);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((wl6) lrVar.Y).V(-f5, -f6);
                    throw th2;
                }
            case 14:
                p34 p34Var = (p34) obj;
                ((gq6) obj2).B(p34Var);
                p34Var.a();
                return dn8Var;
            case 15:
                return Boolean.valueOf(((ck0) obj).a == ((d6) obj2));
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                String value2 = ((SubId) qg5Var.X).getValue();
                value2.getClass();
                qs7 qs7VarA = ((zt7) ((pv0) obj2).a.getValue()).a(value2);
                if (qs7VarA != null && !qs7VarA.e) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 17:
                CancellationSignal cancellationSignal = (CancellationSignal) obj2;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return dn8Var;
            case 18:
                xz0 xz0Var = (xz0) obj2;
                ug ugVar = xz0Var.x;
                if (ugVar != null) {
                    return ugVar;
                }
                ug ugVar2 = new ug(xz0Var.a);
                xz0Var.x = ugVar2;
                return ugVar2;
            case 19:
                qd0 qd0Var = (qd0) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 == null) {
                    qd0Var.b(null);
                } else if (th3 instanceof CancellationException) {
                    qd0Var.c();
                } else {
                    qd0Var.d(th3);
                }
                return dn8Var;
            case 20:
                ib1 ib1Var = (ib1) obj2;
                vz7 vz7Var = ib1Var.l0;
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    ib1Var.j0.c(new ma2(th4));
                }
                if (vz7Var.d()) {
                    ((p92) vz7Var.getValue()).close();
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((u95) obj).getClass();
                ((in1) obj2).Y();
                return dn8Var;
            case 22:
                return DiskLruCache.newJournalWriter$lambda$0((DiskLruCache) obj2, (IOException) obj);
            case 23:
                ((lp1) obj2).n0 = true;
                return dn8Var;
            case 24:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                routeSettingsCache.getClass();
                String localPathGeo = routeSettingsCache.getRouteSettings().getLocalPathGeo();
                ((ht1) obj2).getClass();
                mr2 mr2Var = mr2.GEOIP;
                File file = new File(ht1.c(mr2Var, localPathGeo).concat(".temp"));
                File file2 = new File(ht1.c(mr2Var, localPathGeo));
                mr2 mr2Var2 = mr2.GEOSITE;
                File file3 = new File(ht1.c(mr2Var2, localPathGeo).concat(".temp"));
                File file4 = new File(ht1.c(mr2Var2, localPathGeo));
                if (file.exists()) {
                    file2.delete();
                    file.renameTo(file2);
                }
                if (file3.exists()) {
                    file4.delete();
                    file3.renameTo(file4);
                }
                RouteSettings updateValue = routeSettingsCache.getUpdateValue();
                if (updateValue == null) {
                    return routeSettingsCache;
                }
                return RouteSettingsCache.a(routeSettingsCache, null, updateValue, RouteSettings.e(updateValue, false, null, null, null, null, null, null, null, null, null, wv0.Z0(updateValue.getProxySites()), wv0.Z0(updateValue.getProxyIp()), wv0.Z0(updateValue.getDirectSites()), wv0.Z0(updateValue.getDirectIp()), wv0.Z0(updateValue.getBlockSites()), wv0.Z0(updateValue.getBlockIp()), false, null, null, null, null, 8259583), null, false, 17);
            case 25:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                int iOrdinal = ((mr2) obj2).ordinal();
                if (iOrdinal == 0) {
                    return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettingsCache2.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 7864319), null, null, false, 29);
                }
                if (iOrdinal == 1) {
                    return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettingsCache2.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 7340031), null, null, false, 29);
                }
                b61.c();
                return null;
            case 26:
                pt1 pt1Var = (pt1) obj2;
                wt1 wt1Var = (wt1) obj;
                if (!wt1Var.X.p0) {
                    return xe8.Y;
                }
                xt1 xt1Var = wt1Var.s0;
                if (xt1Var != null) {
                    xt1Var.C(pt1Var);
                }
                wt1Var.s0 = null;
                wt1Var.r0 = null;
                return xe8.X;
            case 27:
                nr2 nr2Var = (nr2) obj;
                return Boolean.valueOf(nr2Var instanceof hv1 ? ((Boolean) ((ru1) obj2).B(nr2Var)).booleanValue() : true);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                hd6 hd6Var = (hd6) obj2;
                PrintWriter printWriter = (PrintWriter) obj;
                Date dateQ = p61.q(printWriter);
                Boolean boolJ = ib2.j(hd6Var);
                String strC = ib2.c(hd6Var);
                String strG = ib2.g(hd6Var);
                SubInfoColor subInfoColorF = ib2.f(hd6Var);
                String strE = ib2.e(hd6Var);
                String strD = ib2.d(hd6Var);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dateQ);
                sb2.append(" control type:sub-info params[SubExpire:");
                sb2.append(boolJ);
                sb2.append(", SubExpireButtonLink:");
                sb2.append(strC);
                sb2.append("SubInfoText:");
                sb2.append(strG);
                sb2.append("SubInfoColor:");
                sb2.append(subInfoColorF);
                oi0.y(sb2, "SubInfoButtonText:", strE, "SubInfoButtonLink:", strD);
                sb2.append("]");
                printWriter.println(sb2.toString());
                return dn8Var;
            default:
                qj8 qj8Var = (qj8) obj;
                return ((hi2) obj2).a(new qj8(null, qj8Var.b, qj8Var.c, qj8Var.d, qj8Var.e)).X;
        }
    }

    public /* synthetic */ y0(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
