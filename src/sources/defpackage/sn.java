package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.AppCompatImageButton;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.SubscriptionRestrictedStatus;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ sn(sz2 sz2Var, String str, String str2, js5 js5Var) {
        this.X = (byte) 10;
        this.Y = str;
        this.Z = str2;
        this.f0 = js5Var;
    }

    private final Object c(Object obj) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        String str = (String) this.Y;
        y45 y45Var = (y45) this.Z;
        t66 t66Var = (t66) this.f0;
        qr6 qr6Var = (qr6) obj;
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0(str);
        try {
            ((t16) y45Var.X).B(xr6VarX0);
            xr6VarX0.getClass();
            int iU = w45.u(xr6VarX0, "id");
            int iU2 = w45.u(xr6VarX0, "state");
            int iU3 = w45.u(xr6VarX0, "output");
            int iU4 = w45.u(xr6VarX0, "initial_delay");
            int iU5 = w45.u(xr6VarX0, "interval_duration");
            int iU6 = w45.u(xr6VarX0, "flex_duration");
            int iU7 = w45.u(xr6VarX0, "run_attempt_count");
            int iU8 = w45.u(xr6VarX0, "backoff_policy");
            int iU9 = w45.u(xr6VarX0, "backoff_delay_duration");
            int iU10 = w45.u(xr6VarX0, "last_enqueue_time");
            int iU11 = w45.u(xr6VarX0, "period_count");
            int iU12 = w45.u(xr6VarX0, "generation");
            int iU13 = w45.u(xr6VarX0, "next_schedule_time_override");
            int iU14 = w45.u(xr6VarX0, "stop_reason");
            int iU15 = w45.u(xr6VarX0, "worker_class_name");
            int iU16 = w45.u(xr6VarX0, "required_network_type");
            int iU17 = w45.u(xr6VarX0, "required_network_request");
            int iU18 = w45.u(xr6VarX0, "requires_charging");
            int iU19 = w45.u(xr6VarX0, "requires_device_idle");
            int iU20 = w45.u(xr6VarX0, "requires_battery_not_low");
            int iU21 = w45.u(xr6VarX0, "requires_storage_not_low");
            int iU22 = w45.u(xr6VarX0, "trigger_content_update_delay");
            int iU23 = w45.u(xr6VarX0, "trigger_max_content_delay");
            int iU24 = w45.u(xr6VarX0, "content_uri_triggers");
            int i9 = iU12;
            vt vtVar = new vt(0);
            int i10 = iU11;
            vt vtVar2 = new vt(0);
            while (xr6VarX0.S0()) {
                String strP0 = xr6VarX0.p0(iU);
                if (!vtVar.containsKey(strP0)) {
                    vtVar.put(strP0, new ArrayList());
                }
                String strP1 = xr6VarX0.p0(iU);
                if (!vtVar2.containsKey(strP1)) {
                    vtVar2.put(strP1, new ArrayList());
                }
                iU10 = iU10;
            }
            int i11 = iU10;
            xr6VarX0.reset();
            t66Var.b(qr6Var, vtVar);
            t66Var.a(qr6Var, vtVar2);
            ArrayList arrayList = new ArrayList();
            while (xr6VarX0.S0()) {
                if (iU == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
                String strP2 = xr6VarX0.p0(iU);
                if (iU2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                }
                vt vtVar3 = vtVar2;
                u39 u39VarM = a28.m((int) xr6VarX0.getLong(iU2));
                if (iU3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                }
                byte[] blob = xr6VarX0.getBlob(iU3);
                u91 u91Var = u91.b;
                u91 u91VarA = wl7.A(blob);
                long j = iU4 == -1 ? 0L : xr6VarX0.getLong(iU4);
                long j2 = iU5 == -1 ? 0L : xr6VarX0.getLong(iU5);
                long j3 = iU6 == -1 ? 0L : xr6VarX0.getLong(iU6);
                int i12 = iU7 == -1 ? 0 : (int) xr6VarX0.getLong(iU7);
                if (iU8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                }
                int i13 = iU2;
                z00 z00VarJ = a28.j((int) xr6VarX0.getLong(iU8));
                long j4 = iU9 == -1 ? 0L : xr6VarX0.getLong(iU9);
                int i14 = i11;
                long j5 = i14 == -1 ? 0L : xr6VarX0.getLong(i14);
                i11 = i14;
                int i15 = i10;
                int i16 = i15 == -1 ? 0 : (int) xr6VarX0.getLong(i15);
                i9 = i9;
                if (i9 == -1) {
                    i = 0;
                    i2 = -1;
                } else {
                    i = (int) xr6VarX0.getLong(i9);
                    i2 = -1;
                }
                int i17 = iU13;
                long j6 = i17 == i2 ? 0L : xr6VarX0.getLong(i17);
                iU13 = i17;
                int i18 = iU14;
                if (i18 == i2) {
                    i3 = 0;
                    i4 = i2;
                } else {
                    i3 = (int) xr6VarX0.getLong(i18);
                    i4 = -1;
                }
                int i19 = iU15;
                if (i19 == i4) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                }
                String strP3 = xr6VarX0.p0(i19);
                iU14 = i18;
                int i20 = iU16;
                if (i20 == i4) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                }
                b45 b45VarK = a28.k((int) xr6VarX0.getLong(i20));
                int i21 = iU17;
                if (i21 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                }
                u35 u35VarW = a28.w(xr6VarX0.getBlob(i21));
                boolean z5 = true;
                int i22 = iU18;
                if (i22 == -1) {
                    z = false;
                    i5 = -1;
                } else {
                    z = ((int) xr6VarX0.getLong(i22)) != 0;
                    i5 = -1;
                }
                int i23 = iU19;
                if (i23 == i5) {
                    z2 = false;
                    i6 = i5;
                } else {
                    z2 = ((int) xr6VarX0.getLong(i23)) != 0;
                    i6 = -1;
                }
                int i24 = iU20;
                if (i24 == i6) {
                    z3 = false;
                    i7 = i6;
                } else {
                    z3 = ((int) xr6VarX0.getLong(i24)) != 0;
                    i7 = -1;
                }
                int i25 = iU21;
                if (i25 == i7) {
                    z4 = false;
                    i8 = i7;
                } else {
                    if (((int) xr6VarX0.getLong(i25)) == 0) {
                        z5 = false;
                    }
                    z4 = z5;
                    i8 = -1;
                }
                int i26 = iU22;
                long j7 = i26 == i8 ? 0L : xr6VarX0.getLong(i26);
                int i27 = iU23;
                long j8 = i27 == i8 ? 0L : xr6VarX0.getLong(i27);
                iU23 = i27;
                int i28 = iU24;
                if (i28 == i8) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                }
                p31 p31Var = new p31(u35VarW, b45VarK, z, z2, z3, z4, j7, j8, a28.b(xr6VarX0.getBlob(i28)));
                Object objH = zp4.H(vtVar, xr6VarX0.p0(iU));
                objH.getClass();
                List list = (List) objH;
                Object objH2 = zp4.H(vtVar3, xr6VarX0.p0(iU));
                objH2.getClass();
                arrayList.add(new k49(strP2, u39VarM, u91VarA, j, j2, j3, p31Var, i12, z00VarJ, j4, j5, i16, i, j6, i3, list, strP3, (List) objH2));
                iU24 = i28;
                iU22 = i26;
                iU7 = iU7;
                iU8 = iU8;
                iU20 = i24;
                iU21 = i25;
                iU5 = iU5;
                iU6 = iU6;
                iU19 = i23;
                iU18 = i22;
                iU16 = i20;
                iU4 = iU4;
                iU17 = i21;
                iU3 = iU3;
                i10 = i15;
                iU15 = i19;
                iU2 = i13;
                vtVar2 = vtVar3;
            }
            xr6VarX0.close();
            return arrayList;
        } catch (Throwable th) {
            xr6VarX0.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0425 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0427 A[LOOP:3: B:147:0x03e3->B:160:0x0427, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:355:0x043c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        SubscriptionRestrictedStatus subscriptionRestrictedStatus;
        long j;
        rv1 rv1Var;
        Object objG;
        Object obj2;
        Object obj3;
        byte b = this.X;
        sd5 sd5Var = sd5.X;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        byte b2 = 3;
        int i = 0;
        z = false;
        z = false;
        boolean z = false;
        int i2 = 0;
        boolean zBooleanValue = false;
        byte b3 = 1;
        Object objValueOf = 0;
        objValueOf = 0;
        dn8 dn8Var = dn8.a;
        Object obj4 = this.Z;
        Object obj5 = this.f0;
        Object obj6 = this.Y;
        switch (b) {
            case 0:
                qg5 qg5Var = (qg5) obj5;
                PrintWriter printWriter = (PrintWriter) obj;
                Object objQ = p61.q(printWriter);
                String remarks = ((SubscriptionItem) obj6).getRemarks();
                int iOrdinal = ((tn) obj4).ordinal();
                Object obj7 = qg5Var != null ? (Integer) qg5Var.X : null;
                if (qg5Var != null && (subscriptionRestrictedStatus = (SubscriptionRestrictedStatus) qg5Var.Y) != null) {
                    objValueOf = Boolean.valueOf(subscriptionRestrictedStatus.getImport());
                }
                printWriter.println(objQ + " subscription " + remarks + " check install server " + iOrdinal + " response code: " + obj7 + " total " + objValueOf);
                return dn8Var;
            case 1:
                k40 k40Var = new k40((b71) obj4, (jc8) obj5, false ? (byte) 1 : (byte) 0);
                nw3[] nw3VarArr = d17.a;
                ((f17) obj).a(s07.c, new q3((String) obj6, k40Var));
                return dn8Var;
            case 2:
                o41 o41Var = (o41) obj6;
                bm3 bm3Var = (bm3) obj4;
                ry6 ry6Var = (ry6) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                float f = o41Var.s0 ? 1.0f : -1.0f;
                sy6 sy6Var = o41Var.r0;
                long jF = sy6Var.f(sy6Var.i(f * fFloatValue));
                sy6 sy6Var2 = ry6Var.a;
                float fH = sy6Var.h(sy6Var.f(sy6Var2.d(sy6Var2.k, jF, 1))) * f;
                if (Math.abs(fH) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fH + " < " + fFloatValue + ")");
                    cancellationException.initCause(null);
                    bm3Var.m(cancellationException);
                }
                return dn8Var;
            case 3:
                xg1 xg1Var = (xg1) obj6;
                ux0 ux0Var = (ux0) obj4;
                b58 b58Var = (b58) obj5;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    b58Var.B(xg1Var.p());
                    ux0Var.V(dn8Var);
                    return dn8Var;
                }
                if (th instanceof CancellationException) {
                    ux0Var.l((CancellationException) th);
                } else {
                    ux0Var.l0(th);
                }
                return dn8Var;
            case 4:
                ba6 ba6Var = (ba6) obj6;
                ok okVar = (ok) obj;
                float fFloatValue2 = ((Number) okVar.e.getValue()).floatValue() - ba6Var.X;
                float fA = ((xx6) obj4).a(fFloatValue2);
                ba6Var.X = ((Number) okVar.e.getValue()).floatValue();
                ((ba6) obj5).X = ((Number) okVar.a.b.B(okVar.f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    okVar.a();
                }
                return dn8Var;
            case 5:
                Context context = (Context) obj4;
                h30 h30Var = (h30) obj5;
                i51 i51Var = (i51) obj;
                List list = ((g38) obj6).a;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f38 f38Var = (f38) list.get(i3);
                    if (f38Var instanceof n38) {
                        n38 n38Var = (n38) f38Var;
                        i51.b(i51Var, new b1(n38Var, (byte) 6), n38Var.c == 0 ? null : new zy0(-1930700965, true, new mg1(n38Var, false ? (byte) 1 : (byte) 0)), new p5(n38Var, h30Var, (byte) 20), 6);
                    } else if (f38Var instanceof u38) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            ts2.e(i51Var, context, (u38) f38Var);
                        }
                    } else if (f38Var instanceof s38) {
                        i51Var.a.add(vj8.Y);
                    }
                }
                return dn8Var;
            case 6:
                pt1 pt1Var = (pt1) obj6;
                wt1 wt1Var = (wt1) obj4;
                aa6 aa6Var = (aa6) obj5;
                wt1 wt1Var2 = (wt1) obj;
                if (!wt1Var2.p0) {
                    return xe8.Y;
                }
                if (wt1Var2.s0 != null) {
                    wc3.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gn2 gn2Var = wt1Var2.q0;
                xt1 xt1Var = gn2Var != null ? (xt1) gn2Var.B(pt1Var) : null;
                wt1Var2.s0 = xt1Var;
                boolean z2 = xt1Var != null;
                if (z2) {
                    ((pd) yn0.a0(wt1Var).getDragAndDropManager()).b.add(wt1Var2);
                }
                aa6Var.X = aa6Var.X || z2;
                return xe8.X;
            case 7:
                fv1 fv1Var = (fv1) obj4;
                eo5 eo5Var = (eo5) obj5;
                do5 do5Var = (do5) obj;
                boolean zC0 = ((zr4) obj6).c0();
                t5 t5Var = fv1Var.q0;
                float fD = zC0 ? t5Var.d().d(((zi1) fv1Var.q0.j0).getValue()) : t5Var.f();
                sd5 sd5Var2 = fv1Var.s0;
                float f2 = sd5Var2 == sd5.Y ? fD : 0.0f;
                if (sd5Var2 != sd5Var) {
                    fD = 0.0f;
                }
                do5Var.X = true;
                do5.f(do5Var, eo5Var, nr4.O(f2), nr4.O(fD));
                do5Var.X = false;
                return dn8Var;
            case 8:
                ka kaVar = (ka) obj6;
                sd5 sd5Var3 = (sd5) obj5;
                long j2 = ((fu1) obj).a;
                long jG = ((kv1) obj4).P0 ? z85.g(-1.0f, j2) : z85.g(1.0f, j2);
                iv1 iv1Var = jv1.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sd5Var3 == sd5Var ? jG & 4294967295L : jG >> 32));
                switch (kaVar.a) {
                    case 0:
                        t5 t5Var2 = (t5) kaVar.b;
                        ha haVar = (ha) t5Var2.o0;
                        float fE = t5Var2.e(fIntBitsToFloat);
                        t5 t5Var3 = haVar.a;
                        ((nh5) t5Var3.k0).m(fE);
                        ((nh5) t5Var3.l0).m(0.0f);
                        return dn8Var;
                    default:
                        ((wb7) kaVar.b).a(fIntBitsToFloat);
                        return dn8Var;
                }
            case 9:
                gh2 gh2Var = (gh2) obj4;
                gn2 gn2Var2 = (gn2) obj5;
                ai2 ai2Var = (ai2) obj;
                if (!dh3.f(ai2Var, (ai2) obj6)) {
                    if (dh3.f(ai2Var, gh2Var.c)) {
                        bt.i("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) gn2Var2.B(ai2Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 10:
                String str2 = (String) obj6;
                String str3 = (String) obj4;
                js5 js5Var = (js5) obj5;
                o05 o05Var = (o05) obj;
                js5 js5Var2 = sz2.c;
                js5 js5Var3 = sz2.d;
                if (((String) ci8.x(o05Var, js5Var3, _UrlKt.FRAGMENT_ENCODE_SET)).equals(str2)) {
                    js5 js5VarC = sz2.c(o05Var, str2);
                    if (js5VarC != null && !js5VarC.a.equals(str3)) {
                        sz2.d(o05Var, str2);
                        HashSet hashSet = new HashSet((Collection) ci8.x(o05Var, js5Var, new HashSet()));
                        hashSet.add(str2);
                        o05Var.f(js5Var, hashSet);
                    }
                } else {
                    long jLongValue = ((Long) ci8.x(o05Var, js5Var2, 0L)).longValue();
                    long j3 = 1;
                    if (jLongValue + 1 == 30) {
                        long jLongValue2 = ((Long) ci8.x(o05Var, js5Var2, 0L)).longValue();
                        Set hashSet2 = new HashSet();
                        String str4 = null;
                        for (Map.Entry entry : o05Var.a().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                Set<String> set = (Set) entry.getValue();
                                for (String str5 : set) {
                                    long j4 = j3;
                                    if (str4 == null || str4.compareTo(str5) > 0) {
                                        str = ((js5) entry.getKey()).a;
                                        str4 = str5;
                                        hashSet2 = set;
                                    }
                                    j3 = j4;
                                }
                            }
                            j3 = j3;
                        }
                        j = j3;
                        HashSet hashSet3 = new HashSet(hashSet2);
                        hashSet3.remove(str4);
                        str.getClass();
                        o05Var.f(new js5(str), hashSet3);
                        jLongValue = jLongValue2 - j;
                        o05Var.f(js5Var2, Long.valueOf(jLongValue));
                    } else {
                        j = 1;
                    }
                    HashSet hashSet4 = new HashSet((Collection) ci8.x(o05Var, js5Var, new HashSet()));
                    hashSet4.add(str2);
                    o05Var.f(js5Var, hashSet4);
                    o05Var.f(js5Var2, Long.valueOf(jLongValue + j));
                    o05Var.f(js5Var3, str2);
                }
                return null;
            case 11:
                p34 p34Var = (p34) obj6;
                um0 um0Var = p34Var.X;
                vj2 vj2Var = (vj2) obj5;
                sv1 sv1Var = (sv1) obj;
                rv1 rv1Var2 = p34Var.Y;
                p34Var.Y = (rv1) obj4;
                try {
                    fi1 fi1VarM = sv1Var.n0().m();
                    z24 z24VarO = sv1Var.n0().o();
                    sm0 sm0VarK = sv1Var.n0().k();
                    long jP = sv1Var.n0().p();
                    xt2 xt2Var = (xt2) sv1Var.n0().Z;
                    fi1 fi1VarM2 = um0Var.Y.m();
                    z24 z24VarO2 = um0Var.Y.o();
                    sm0 sm0VarK2 = um0Var.Y.k();
                    long jP2 = um0Var.Y.p();
                    lr lrVar = um0Var.Y;
                    try {
                        xt2 xt2Var2 = (xt2) lrVar.Z;
                        lrVar.B(fi1VarM);
                        lrVar.C(z24VarO);
                        lrVar.A(sm0VarK);
                        lrVar.D(jP);
                        lrVar.Z = xt2Var;
                        sm0VarK.g();
                        try {
                            vj2Var.B(p34Var);
                            sm0VarK.p();
                            lr lrVar2 = um0Var.Y;
                            lrVar2.B(fi1VarM2);
                            lrVar2.C(z24VarO2);
                            lrVar2.A(sm0VarK2);
                            lrVar2.D(jP2);
                            lrVar2.Z = xt2Var2;
                            p34Var.Y = rv1Var2;
                            return dn8Var;
                        } catch (Throwable th2) {
                            rv1Var = rv1Var2;
                            try {
                                sm0VarK.p();
                                lr lrVar3 = um0Var.Y;
                                lrVar3.B(fi1VarM2);
                                lrVar3.C(z24VarO2);
                                lrVar3.A(sm0VarK2);
                                lrVar3.D(jP2);
                                lrVar3.Z = xt2Var2;
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                p34Var.Y = rv1Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        rv1Var = rv1Var2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    rv1Var = rv1Var2;
                }
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                Void r0 = (Void) obj;
                ((d6) obj6).d((zl0) obj4, o51.a((ScannerActivity) obj5));
                return r0;
            case 13:
                d94 d94Var = (d94) obj6;
                fy0 fy0Var = new fy0((n84) obj4, (y05) obj5, b3);
                d94Var.getH0().a(fy0Var);
                return new p00(d94Var, fy0Var, b2);
            case 14:
                d94 d94Var2 = (d94) obj6;
                final l94 l94Var = (l94) obj4;
                final gn2 gn2Var3 = (gn2) obj5;
                final ea6 ea6Var = new ea6();
                a94 a94Var = new a94() { // from class: y84
                    @Override // defpackage.a94
                    public final void k(d94 d94Var3, n84 n84Var) {
                        int i4 = z84.a[n84Var.ordinal()];
                        ea6 ea6Var2 = ea6Var;
                        if (i4 == 1) {
                            ea6Var2.X = gn2Var3.B(l94Var);
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            o00 o00Var = (o00) ea6Var2.X;
                            if (o00Var != null) {
                                o00Var.a();
                            }
                            ea6Var2.X = null;
                        }
                    }
                };
                d94Var2.getH0().a(a94Var);
                return new yi(d94Var2, a94Var, ea6Var, b3);
            case 15:
                long jLongValue3 = ((Long) obj).longValue();
                nf1 nf1Var = tp1.a;
                jm4.Q((b71) obj6, dm4.a, new xb2((nm4) obj4, (String) obj5, jLongValue3, (q51) null), 2);
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                o87 o87Var = (o87) obj4;
                w51.G((b71) obj6, null, null, new oz0(o87Var, ((Float) obj).floatValue(), objValueOf, (byte) 2), 3).D(new tw4(o87Var, (dn2) obj5, (byte) 1));
                return dn8Var;
            case 17:
                jz4 jz4Var = (jz4) obj4;
                ea6 ea6Var2 = (ea6) obj5;
                if (((Set) obj6).contains(obj) && (objG = jz4Var.f0.g(obj)) != null) {
                    if (objG instanceof t05) {
                        t05 t05Var = (t05) objG;
                        Object[] objArr = t05Var.b;
                        long[] jArr = t05Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j5 = jArr[i4];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j5) < 128) {
                                            n17 n17Var = (n17) objArr[(i4 << 3) + i6];
                                            Object obj8 = ea6Var2.X;
                                            if (obj8 == null) {
                                                obj3 = obj8;
                                                ArrayList arrayList = new ArrayList();
                                                ea6Var2.X = arrayList;
                                                obj3 = arrayList;
                                            }
                                            obj3 = obj8;
                                            ((List) obj3).add(n17Var);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i5 == 8) {
                                        if (i4 != length) {
                                            i4++;
                                        }
                                    }
                                } else if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        n17 n17Var2 = (n17) objG;
                        Object obj9 = ea6Var2.X;
                        if (obj9 == null) {
                            obj2 = obj9;
                            ArrayList arrayList2 = new ArrayList();
                            ea6Var2.X = arrayList2;
                            obj2 = arrayList2;
                        }
                        obj2 = obj9;
                        ((List) obj2).add(n17Var2);
                    }
                }
                return dn8Var;
            case 18:
                gg5 gg5Var = (gg5) obj4;
                p8 p8Var = (p8) obj5;
                p34 p34Var2 = (p34) obj;
                long j6 = ((ua7) ((i58) obj6).get()).a;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
                if (fIntBitsToFloat2 > 0.0f) {
                    float fH0 = p34Var2.h0(4.0f);
                    um0 um0Var2 = p34Var2.X;
                    float fH1 = p34Var2.h0(gg5Var.b(p34Var2.getLayoutDirection()));
                    float fA2 = p8Var.a(nr4.O(fIntBitsToFloat2), nr4.O((Float.intBitsToFloat((int) (um0Var2.e() >> 32)) - fH1) - p34Var2.h0(gg5Var.c(p34Var2.getLayoutDirection()))), p34Var2.getLayoutDirection()) + fH1;
                    float f3 = fIntBitsToFloat2 / 2.0f;
                    float f4 = fA2 + f3;
                    float f5 = (f4 - f3) - fH0;
                    float f6 = f5 < 0.0f ? 0.0f : f5;
                    float f7 = f4 + f3 + fH0;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (um0Var2.e() >> 32));
                    float f8 = f7 > fIntBitsToFloat3 ? fIntBitsToFloat3 : f7;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    float f9 = (-fIntBitsToFloat4) / 2.0f;
                    float f10 = fIntBitsToFloat4 / 2.0f;
                    lr lrVar4 = um0Var2.Y;
                    long jP3 = lrVar4.p();
                    lrVar4.k().g();
                    try {
                        ((lr) ((wl6) lrVar4.Y).Y).k().m(f6, f9, f8, f10, 0);
                        p34Var2.a();
                    } finally {
                        p61.w(lrVar4, jP3);
                    }
                } else {
                    p34Var2.a();
                }
                return dn8Var;
            case 19:
                j2 j2Var = (j2) obj6;
                gn2 gn2Var4 = (gn2) obj4;
                kx4 kx4Var = (kx4) obj5;
                y64 y64Var = (y64) obj;
                y64Var.getClass();
                ListIterator listIterator = j2Var.listIterator(0);
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    int i7 = i2 + 1;
                    if (i2 < 0) {
                        i21.X();
                        throw null;
                    }
                    om6 om6Var = (om6) next;
                    y64.a(y64Var, om6Var.a.getId(), new zy0(901795757, true, new p90(om6Var, gn2Var4, kx4Var, (byte) 6)));
                    if (i2 != j2Var.a() - 1) {
                        y64.a(y64Var, oi0.l("Divider", om6Var.a.getId()), new zy0(1523609288, true, new hr2(kx4Var, b3)));
                    }
                    i2 = i7;
                }
                return dn8Var;
            case 20:
                return c(obj);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj6;
                RoutingRulesActivity routingRulesActivity = (RoutingRulesActivity) obj4;
                String str6 = (String) obj5;
                String str7 = (String) obj;
                int i8 = RoutingRulesActivity.X0;
                str7.getClass();
                if (str7.length() > 0) {
                    if (dh3.f(routeSettingsCache.getRouteSettings().getDomesticDnsDomain(), str7)) {
                        x79.h(routingRulesActivity, y46.routing_settings_toast_different_name_domain);
                        s6 s6Var = routingRulesActivity.Q0;
                        if (s6Var == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        String text = s6Var.m0.getText();
                        s6 s6Var2 = routingRulesActivity.Q0;
                        if (s6Var2 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        s6Var2.m0.setText(fm7.Q0(text.length() - 1, text));
                    } else {
                        routingRulesActivity.I(str6, new m40(str7, (byte) 24));
                        qe4.L0(routingRulesActivity, "su.happ.proxyutility.action.service", 5, _UrlKt.FRAGMENT_ENCODE_SET);
                    }
                }
                return dn8Var;
            case 22:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj6;
                RoutingRulesActivity routingRulesActivity2 = (RoutingRulesActivity) obj4;
                RouteProfile routeProfile = (RouteProfile) obj5;
                String str8 = (String) obj;
                int i9 = RoutingRulesActivity.X0;
                str8.getClass();
                if (str8.length() > 0) {
                    if (dh3.f(routeSettingsCache2.getRouteSettings().getRemoteDnsDomain(), str8)) {
                        x79.h(routingRulesActivity2, y46.routing_settings_toast_different_name_domain);
                        s6 s6Var3 = routingRulesActivity2.Q0;
                        if (s6Var3 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        String text2 = s6Var3.m0.getText();
                        s6 s6Var4 = routingRulesActivity2.Q0;
                        if (s6Var4 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        s6Var4.m0.setText(fm7.Q0(text2.length() - 1, text2));
                    } else {
                        routingRulesActivity2.I(routeProfile.getSubId(), new m40(str8, (byte) 22));
                        qe4.L0(routingRulesActivity2, "su.happ.proxyutility.action.service", 5, _UrlKt.FRAGMENT_ENCODE_SET);
                    }
                }
                return dn8Var;
            case 23:
                mr2 mr2Var = (mr2) obj4;
                String str9 = (String) obj5;
                RouteSettingsCache routeSettingsCache3 = (RouteSettingsCache) obj;
                routeSettingsCache3.getClass();
                int i10 = cq6.a[((eq6) obj6).d.ordinal()];
                if (i10 == 1) {
                    int iOrdinal2 = mr2Var.ordinal();
                    if (iOrdinal2 == 0) {
                        routeSettingsCache3.getRouteSettings().getProxySites().add(str9);
                    } else {
                        if (iOrdinal2 != 1) {
                            b61.c();
                            return null;
                        }
                        routeSettingsCache3.getRouteSettings().getProxyIp().add(str9);
                    }
                } else if (i10 == 2) {
                    int iOrdinal3 = mr2Var.ordinal();
                    if (iOrdinal3 == 0) {
                        routeSettingsCache3.getRouteSettings().getDirectSites().add(str9);
                    } else {
                        if (iOrdinal3 != 1) {
                            b61.c();
                            return null;
                        }
                        routeSettingsCache3.getRouteSettings().getDirectIp().add(str9);
                    }
                } else {
                    if (i10 != 3) {
                        b61.c();
                        return null;
                    }
                    int iOrdinal4 = mr2Var.ordinal();
                    if (iOrdinal4 == 0) {
                        routeSettingsCache3.getRouteSettings().getBlockSites().add(str9);
                    } else {
                        if (iOrdinal4 != 1) {
                            b61.c();
                            return null;
                        }
                        routeSettingsCache3.getRouteSettings().getBlockIp().add(str9);
                    }
                }
                return routeSettingsCache3;
            case 24:
                jv6 jv6Var = (jv6) obj6;
                nv6 nv6Var = (nv6) obj5;
                s05 s05Var = jv6Var.Y;
                if (s05Var.b(obj4)) {
                    em7.h("Key ", obj4, " was used multiple times ");
                    return null;
                }
                jv6Var.X.remove(obj4);
                s05Var.l(obj4, nv6Var);
                return new yi(jv6Var, obj4, nv6Var, (byte) 2);
            case 25:
                h68 h68Var = (h68) obj6;
                kp5 kp5Var = (kp5) obj4;
                aa6 aa6Var2 = (aa6) obj5;
                hq5 hq5Var = (hq5) obj;
                long j7 = hq5Var.c;
                r68 r68Var = h68Var.e;
                y78 y78Var = r68Var.b;
                kd8 kd8Var = r68Var.a;
                x78 x78VarC = y78Var.c();
                if (r68Var.i && x78VarC != null && kd8Var.d().Z.length() != 0) {
                    if (!f88.a(kd8Var.d().f0, h68Var.b(j7, kp5Var, x78VarC, false))) {
                        h68Var.d = false;
                    }
                    z = true;
                }
                if (z) {
                    hq5Var.a();
                    aa6Var2.X = true;
                }
                return dn8Var;
            case 26:
                dx0 dx0Var = (dx0) obj5;
                Throwable th6 = (Throwable) obj;
                ((y0) obj6).B(th6);
                x90 x90Var = (x90) ((yr6) obj4).f0;
                x90Var.e(th6, false);
                while (true) {
                    Object objA = up0.a(x90Var.q());
                    if (objA == null) {
                        return dn8Var;
                    }
                    dx0Var.K(objA, th6);
                }
                break;
            case 27:
                tj7 tj7Var = (tj7) obj6;
                qq8 qq8Var = (qq8) obj5;
                Throwable th7 = (Throwable) obj;
                if (!(th7 instanceof z53) || ((z53) th7).X != 3) {
                    throw null;
                }
                w51.G(tj7Var.b.f, null, null, new ia1(tj7Var, qq8Var, (rj7) null, (q51) null), 3);
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                x73 x73Var = (x73) obj6;
                gn2 gn2Var5 = (gn2) obj4;
                kx4 kx4Var2 = (kx4) obj5;
                y64 y64Var2 = (y64) obj;
                y64Var2.getClass();
                for (Object obj10 : x73Var) {
                    int i11 = i + 1;
                    if (i < 0) {
                        i21.X();
                        throw null;
                    }
                    yr7 yr7Var = (yr7) obj10;
                    y64.a(y64Var2, yr7Var.a, new zy0(1767246685, true, new p90(yr7Var, gn2Var5, kx4Var2, (byte) 10)));
                    if (i != x73Var.size() - 1) {
                        y64.a(y64Var2, oi0.l("Divider", yr7Var.a), new zy0(-1757907592, true, new hr2(kx4Var2, (byte) 4)));
                    }
                    i = i11;
                }
                return dn8Var;
            default:
                rv7 rv7Var = (rv7) obj5;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((AppCompatImageButton) obj6).setEnabled(true);
                rn2 rn2Var = ((kq7) obj4).i;
                if (rn2Var != null) {
                    rn2Var.K(new SubId(rv7Var.b.getSubId()), bool);
                }
                return dn8Var;
        }
    }

    public /* synthetic */ sn(o41 o41Var, qo8 qo8Var, bm3 bm3Var, ry6 ry6Var) {
        this.X = (byte) 2;
        this.Y = o41Var;
        this.Z = bm3Var;
        this.f0 = ry6Var;
    }

    public /* synthetic */ sn(ba6 ba6Var, xx6 xx6Var, ba6 ba6Var2, pe1 pe1Var) {
        this.X = (byte) 4;
        this.Y = ba6Var;
        this.Z = xx6Var;
        this.f0 = ba6Var2;
    }

    public /* synthetic */ sn(tj7 tj7Var, xg1 xg1Var, rj7 rj7Var, qq8 qq8Var) {
        this.X = (byte) 27;
        this.Y = tj7Var;
        this.Z = xg1Var;
        this.f0 = qq8Var;
    }

    public /* synthetic */ sn(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }
}
