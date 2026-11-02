package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;
import su.happ.proxyutility.dto.AdditionalInfoCode;
import su.happ.proxyutility.dto.AdditionalInfoCodeKt;
import su.happ.proxyutility.dto.TestPingViaProxyData;
import su.happ.proxyutility.dto.TestPingViaProxyResultData;
import su.happ.proxyutility.service.XRayTestService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ ii(j2 j2Var, String str, String str2, gn2 gn2Var) {
        this.X = (byte) 7;
        this.Z = j2Var;
        this.f0 = str;
        this.g0 = str2;
        this.Y = gn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) throws RemoteException {
        byte b = this.X;
        char c = 1;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.g0;
        Object obj3 = this.Y;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        switch (b) {
            case 0:
                oi oiVar = (oi) obj5;
                qk qkVar = (qk) obj4;
                gn2 gn2Var = (gn2) obj3;
                aa6 aa6Var = (aa6) obj2;
                ok okVar = (ok) obj;
                ry7.j(okVar, oiVar.c);
                rh5 rh5Var = okVar.e;
                Object objB = oiVar.b(rh5Var.getValue());
                if (!dh3.f(objB, rh5Var.getValue())) {
                    oiVar.c.Y.setValue(objB);
                    qkVar.Y.setValue(objB);
                    if (gn2Var != null) {
                        gn2Var.B(oiVar);
                    }
                    okVar.a();
                    aa6Var.X = true;
                } else if (gn2Var != null) {
                    gn2Var.B(oiVar);
                }
                return dn8Var;
            case 1:
                b83 b83Var = (b83) obj5;
                gn2 gn2Var2 = (gn2) obj3;
                kx4 kx4Var = (kx4) obj4;
                kx4 kx4Var2 = (kx4) obj2;
                y64 y64Var = (y64) obj;
                y64Var.getClass();
                int i = 0;
                for (Object obj6 : b83Var) {
                    int i2 = i + 1;
                    if (i < 0) {
                        i21.X();
                        throw null;
                    }
                    ir2 ir2Var = (ir2) obj6;
                    y64.a(y64Var, ir2Var.a, new zy0(-288290795, true, new p90(ir2Var, gn2Var2, kx4Var, c == true ? 1 : 0)));
                    if (i != ((z0) b83Var).a() - 1) {
                        y64.a(y64Var, "Divider" + ir2Var.a, new zy0(210028186, true, new hr2(kx4Var2, (byte) 0)));
                    }
                    i = i2;
                }
                return dn8Var;
            case 2:
                nc3 nc3Var = (nc3) obj4;
                ba6 ba6Var = (ba6) obj3;
                b71 b71Var = (b71) obj2;
                long jLongValue = ((Long) obj).longValue();
                lh7 lh7Var = (lh7) ((y05) obj5).getValue();
                long jLongValue2 = lh7Var != null ? ((Number) lh7Var.getValue()).longValue() : jLongValue;
                long j = nc3Var.c;
                c15 c15Var = nc3Var.a;
                if (j == Long.MIN_VALUE || ba6Var.X != ry7.h(b71Var.getCoroutineContext())) {
                    nc3Var.c = jLongValue;
                    Object[] objArr = c15Var.X;
                    int i3 = c15Var.Z;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((lc3) objArr[i4]).h0 = true;
                    }
                    ba6Var.X = ry7.h(b71Var.getCoroutineContext());
                }
                float f = ba6Var.X;
                if (f == 0.0f) {
                    Object[] objArr2 = c15Var.X;
                    int i5 = c15Var.Z;
                    for (int i6 = 0; i6 < i5; i6++) {
                        lc3 lc3Var = (lc3) objArr2[i6];
                        lc3Var.Z.setValue(lc3Var.f0.c);
                        lc3Var.h0 = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - nc3Var.c) / f);
                    Object[] objArr3 = c15Var.X;
                    int i7 = c15Var.Z;
                    boolean z = true;
                    for (int i8 = 0; i8 < i7; i8++) {
                        lc3 lc3Var2 = (lc3) objArr3[i8];
                        boolean zE = lc3Var2.g0;
                        if (!zE) {
                            lc3Var2.j0.b.setValue(Boolean.FALSE);
                            if (lc3Var2.h0) {
                                lc3Var2.h0 = false;
                                lc3Var2.i0 = j2;
                            }
                            long j3 = j2 - lc3Var2.i0;
                            lc3Var2.Z.setValue(lc3Var2.f0.f(j3));
                            zE = lc3Var2.f0.e(j3);
                            lc3Var2.g0 = zE;
                        }
                        if (!zE) {
                            z = false;
                        }
                    }
                    nc3Var.d.setValue(Boolean.valueOf(!z));
                }
                return dn8Var;
            case 3:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " API source: " + wv0.A0(((Request) obj5).url().pathSegments()) + " Response code: " + ((Response) obj4).code() + " Info Code: " + AdditionalInfoCodeKt.a(((AdditionalInfoCode) obj3).getValue(), (String) obj2));
                return dn8Var;
            case 4:
                p64 p64Var = (p64) obj5;
                p64Var.c = new sa2((f64) obj4, (vp7) obj3, (ws5) obj2);
                return new jd(p64Var, (byte) 7);
            case 5:
                ba6 ba6Var2 = (ba6) obj5;
                uy4 uy4Var = (uy4) obj4;
                ry6 ry6Var = (ry6) obj3;
                vf vfVar = (vf) obj2;
                ok okVar2 = (ok) obj;
                float fFloatValue = ((Number) okVar2.e.getValue()).floatValue() - ba6Var2.X;
                if (w79.G(fFloatValue)) {
                    if (((Boolean) vfVar.B(Float.valueOf(ba6Var2.X))).booleanValue()) {
                        okVar2.a();
                    }
                } else if (w79.G(fFloatValue - uy4Var.c(ry6Var, fFloatValue))) {
                    ba6Var2.X += fFloatValue;
                    if (((Boolean) vfVar.B(Float.valueOf(ba6Var2.X))).booleanValue()) {
                        okVar2.a();
                    }
                } else {
                    okVar2.a();
                }
                return dn8Var;
            case 6:
                final q51 q51Var = (q51) obj;
                q51Var.getClass();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: cd6
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        q51Var.f(new rj6(new RuntimeException("Binder died")));
                    }
                };
                ((ea6) obj5).X = deathRecipient;
                ((IBinder) obj4).linkToDeath(deathRecipient, 0);
                ((bd6) obj3).K((IInterface) obj2, new ed6(q51Var));
                return dn8Var;
            case 7:
                j2 j2Var = (j2) obj5;
                String str = (String) obj4;
                String str2 = (String) obj2;
                gn2 gn2Var3 = (gn2) obj3;
                y64 y64Var2 = (y64) obj;
                y64Var2.getClass();
                FillElement fillElement = b.a;
                ListIterator listIterator = j2Var.listIterator(0);
                int i9 = 0;
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        i21.X();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) next;
                    tn6 tn6Var = (tn6) entry.getKey();
                    b83 b83Var2 = (b83) entry.getValue();
                    y64.a(y64Var2, tn6Var.a, new zy0(253466970, true, new o90((Object) tn6Var, (Object) fillElement, (byte) 13)));
                    Iterator it = b83Var2.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            i21.X();
                            throw null;
                        }
                        vo6 vo6Var = (vo6) next2;
                        String str3 = vo6Var.c;
                        FillElement fillElement2 = fillElement;
                        df4 df4Var = new df4(vo6Var, str, tn6Var, str2, gn2Var3, fillElement2);
                        j2 j2Var2 = j2Var;
                        Iterator it2 = it;
                        dn8 dn8Var2 = dn8Var;
                        y64.a(y64Var2, str3, new zy0(288913903, true, df4Var));
                        if (i11 != ((z0) b83Var2).size() - 1) {
                            y64.a(y64Var2, oi0.l("Divider", vo6Var.c), new zy0(-1787124342, true, new hr2(fillElement2, (byte) 3)));
                        }
                        j2Var = j2Var2;
                        it = it2;
                        fillElement = fillElement2;
                        dn8Var = dn8Var2;
                        i11 = i12;
                    }
                    j2 j2Var3 = j2Var;
                    dn8 dn8Var3 = dn8Var;
                    FillElement fillElement3 = fillElement;
                    if (i9 != j2Var3.a() - 1) {
                        y64.a(y64Var2, oi0.l("Divider", tn6Var.a), vr3.h);
                    }
                    j2Var = j2Var3;
                    fillElement = fillElement3;
                    dn8Var = dn8Var3;
                    i9 = i10;
                }
                return dn8Var;
            case 8:
                dn2 dn2Var = (dn2) obj4;
                r68 r68Var = (r68) obj3;
                s88 s88Var = (s88) obj2;
                t38 t38Var = (t38) obj;
                ((dn2) obj5).invoke();
                if (dn2Var != null ? ((Boolean) dn2Var.invoke()).booleanValue() : true) {
                    t38Var.close();
                }
                r68Var.y(s88Var);
                return dn8Var;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                TestPingViaProxyData testPingViaProxyData = (TestPingViaProxyData) obj3;
                XRayTestService xRayTestService = (XRayTestService) obj2;
                Long l = (Long) obj;
                l.getClass();
                arrayList.add(l);
                if (arrayList.size() >= ((List) obj4).size()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : arrayList) {
                        if (((Number) obj7).longValue() > 0) {
                            arrayList2.add(obj7);
                        }
                    }
                    Long l2 = (Long) wv0.C0(arrayList2);
                    qe4.L0(xRayTestService, "su.happ.proxyutility.action.activity", 71, yw2.b.h(new TestPingViaProxyResultData(l2 != null ? l2.longValue() : -1L, testPingViaProxyData.getGuid())));
                }
                return dn8Var;
        }
    }

    public /* synthetic */ ii(b83 b83Var, gn2 gn2Var, kx4 kx4Var, kx4 kx4Var2) {
        this.X = (byte) 1;
        this.Z = b83Var;
        this.Y = gn2Var;
        this.f0 = kx4Var;
        this.g0 = kx4Var2;
    }

    public /* synthetic */ ii(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = obj3;
        this.g0 = obj4;
    }
}
