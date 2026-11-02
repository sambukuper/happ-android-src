package defpackage;

import android.content.Intent;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase;
import com.google.gson.a;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ProfileRoutingSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;
import su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask;
import su.happ.proxyutility.ui.ScScannerActivity;
import su.happ.proxyutility.ui.ScannerActivity;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.widget.QROverlayView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t16 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ t16(mn6 mn6Var, ProfileRoutingSettings profileRoutingSettings) {
        this.X = (byte) 7;
        this.Y = profileRoutingSettings;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        sl6 sl6Var;
        String str;
        byte b = this.X;
        boolean z = false;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                ((kt) ((fu6) obj2).i0).addLast(obj);
                return dn8.a;
            case 1:
                ((r01) obj2).y(obj);
                return dn8.a;
            case 2:
                p86 p86Var = (p86) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (p86Var.c) {
                    try {
                        bm3 bm3Var = p86Var.d;
                        if (bm3Var != null) {
                            oh7 oh7Var = p86Var.u;
                            m86 m86Var = m86.Y;
                            oh7Var.getClass();
                            oh7Var.n(null, m86Var);
                            bm3Var.m(cancellationException);
                            p86Var.r = null;
                            bm3Var.D(new zw2(p86Var, th, (byte) 25));
                        } else {
                            p86Var.e = cancellationException;
                            oh7 oh7Var2 = p86Var.u;
                            m86 m86Var2 = m86.X;
                            oh7Var2.getClass();
                            oh7Var2.n(null, m86Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return dn8.a;
            case 3:
                sm2 sm2Var = (sm2) obj;
                sm2Var.getClass();
                ((by0) obj2).g = sm2Var;
                return dn8.a;
            case 4:
                xr6 xr6Var = (xr6) obj;
                xr6Var.getClass();
                ((t16) obj2).B(new t50(xr6Var));
                return dn8.a;
            case 5:
                sl6 sl6Var2 = (sl6) obj2;
                xr6 xr6Var2 = (xr6) obj;
                xr6Var2.getClass();
                int i = sl6Var2.i0;
                if (1 <= i) {
                    int i2 = 1;
                    while (true) {
                        int i3 = sl6Var2.h0[i2];
                        if (i3 == 1) {
                            xr6Var2.l(i2);
                        } else if (i3 == 2) {
                            xr6Var2.i(i2, sl6Var2.Y[i2]);
                        } else if (i3 == 3) {
                            xr6Var2.h(i2, sl6Var2.Z[i2]);
                        } else if (i3 == 4) {
                            String str2 = sl6Var2.f0[i2];
                            if (str2 == null) {
                                bt.q("Required value was null.");
                                return null;
                            }
                            xr6Var2.T(i2, str2);
                        } else if (i3 == 5) {
                            byte[] bArr = sl6Var2.g0[i2];
                            if (bArr == null) {
                                bt.q("Required value was null.");
                                return null;
                            }
                            xr6Var2.j(i2, bArr);
                        }
                        if (i2 != i) {
                            i2++;
                        }
                    }
                }
                return dn8.a;
            case 6:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj2;
                ((RouteSettingsCache) obj).getClass();
                return routeSettingsCache;
            case 7:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                routeSettingsCache2.getClass();
                return RouteSettingsCache.a(routeSettingsCache2, null, mn6.w(routeSettingsCache2.getRouteSettings(), (ProfileRoutingSettings) obj2), null, null, false, 29);
            case 8:
                kv6 kv6Var = ((jv6) obj2).Z;
                return Boolean.valueOf(kv6Var != null ? kv6Var.c(obj) : true);
            case 9:
                ScScannerActivity scScannerActivity = (ScScannerActivity) obj2;
                int i4 = ScScannerActivity.R0;
                if (((Boolean) obj).booleanValue()) {
                    scScannerActivity.Q0.h0(new Intent(scScannerActivity, (Class<?>) ScannerActivity.class));
                } else {
                    String string = scScannerActivity.getString(y46.toast_permission_denied, scScannerActivity.getString(y46.permission_camera));
                    string.getClass();
                    x79.i(scScannerActivity, string);
                }
                return dn8.a;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i5 = ScannerActivity.T0;
                ((p84) obj2).Z.X.Z.f(zBooleanValue);
                return dn8.a;
            case 11:
                Integer num = (Integer) obj;
                lr lrVar = ((ScannerActivity) obj2).Q0;
                if (lrVar == null) {
                    dh3.T("binding");
                    throw null;
                }
                QROverlayView qROverlayView = (QROverlayView) lrVar.Z;
                if (num != null && num.intValue() == 1) {
                    z = true;
                }
                qROverlayView.setTorchState(z);
                return dn8.a;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ay6 ay6Var = (ay6) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                oh5 oh5Var = ay6Var.X;
                float fL = oh5Var.l() + fFloatValue + ay6Var.i0;
                float fM = x97.m(fL, 0.0f, ay6Var.h0.l());
                z = fL == fM;
                float fL2 = fM - oh5Var.l();
                int iRound = Math.round(fL2);
                oh5Var.m(oh5Var.l() + iRound);
                ay6Var.i0 = fL2 - iRound;
                if (!z) {
                    fFloatValue = fL2;
                }
                return Float.valueOf(fFloatValue);
            case 13:
                sy6 sy6Var = (sy6) obj2;
                return new z85(sy6Var.d(sy6Var.k, ((z85) obj).a, sy6Var.j));
            case 14:
                hq5 hq5Var = (hq5) obj;
                long j = hq5Var.c;
                ((h68) obj2).getClass();
                hq5Var.a();
                return dn8.a;
            case 15:
                d17.d((f17) obj, ((kl6) obj2).a);
                return dn8.a;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ((List) obj).add((Float) ((v64) obj2).invoke());
                return true;
            case 17:
                ServerActivity serverActivity = (ServerActivity) obj2;
                int iIntValue = ((Integer) obj).intValue();
                ConstraintLayout constraintLayout = serverActivity.a2;
                if (iIntValue == 0) {
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    HappSettingsDivider happSettingsDivider = serverActivity.d2;
                    if (happSettingsDivider != null) {
                        happSettingsDivider.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout2 = serverActivity.e2;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(8);
                    }
                    HappSettingsDivider happSettingsDivider2 = serverActivity.h2;
                    if (happSettingsDivider2 != null) {
                        happSettingsDivider2.setVisibility(8);
                    }
                } else {
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    HappSettingsDivider happSettingsDivider3 = serverActivity.d2;
                    if (happSettingsDivider3 != null) {
                        happSettingsDivider3.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout3 = serverActivity.e2;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setVisibility(0);
                    }
                    HappSettingsDivider happSettingsDivider4 = serverActivity.h2;
                    if (happSettingsDivider4 != null) {
                        happSettingsDivider4.setVisibility(0);
                    }
                }
                return dn8.a;
            case 18:
                u67 u67Var = (u67) obj2;
                pk6 pk6Var = (pk6) obj;
                pk6Var.j(pk6Var.v0.getDensity() * u67Var.X);
                pk6Var.k(u67Var.Y);
                pk6Var.d(u67Var.Z);
                pk6Var.c(u67Var.f0);
                pk6Var.l(u67Var.g0);
                return dn8.a;
            case 19:
                r97 r97Var = (r97) obj2;
                pk6 pk6Var2 = (pk6) obj;
                pk6Var2.g(r97Var.q0);
                pk6Var2.h(r97Var.r0);
                pk6Var2.b(r97Var.s0);
                pk6Var2.n(r97Var.t0);
                pk6Var2.o(r97Var.u0);
                pk6Var2.j(r97Var.v0);
                float f = r97Var.w0;
                if (pk6Var2.l0 != f) {
                    pk6Var2.X |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    pk6Var2.l0 = f;
                }
                float f2 = r97Var.x0;
                if (pk6Var2.m0 != f2) {
                    pk6Var2.X |= 512;
                    pk6Var2.m0 = f2;
                }
                float f3 = r97Var.y0;
                if (pk6Var2.n0 != f3) {
                    pk6Var2.X |= 1024;
                    pk6Var2.n0 = f3;
                }
                float f4 = r97Var.z0;
                if (pk6Var2.o0 != f4) {
                    pk6Var2.X |= 2048;
                    pk6Var2.o0 = f4;
                }
                pk6Var2.m(r97Var.A0);
                pk6Var2.k(r97Var.B0);
                pk6Var2.d(r97Var.C0);
                o60 o60Var = r97Var.D0;
                if (!dh3.f(pk6Var2.x0, o60Var)) {
                    pk6Var2.X |= 131072;
                    pk6Var2.x0 = o60Var;
                }
                pk6Var2.c(r97Var.E0);
                pk6Var2.l(r97Var.F0);
                int i6 = r97Var.G0;
                if (pk6Var2.s0 != i6) {
                    pk6Var2.X |= 32768;
                    pk6Var2.s0 = i6;
                }
                int i7 = r97Var.H0;
                if (pk6Var2.z0 != i7) {
                    pk6Var2.X |= 524288;
                    pk6Var2.z0 = i7;
                }
                g60 g60Var = r97Var.I0;
                if (!dh3.f(pk6Var2.y0, g60Var)) {
                    pk6Var2.X |= 262144;
                    pk6Var2.y0 = g60Var;
                }
                pk6Var2.f(r97Var.J0);
                return dn8.a;
            case 20:
                na7 na7Var = (na7) obj2;
                n17 n17Var = na7Var.j0;
                n17Var.getClass();
                if (!dh3.f(na7Var.j0, n17Var)) {
                    wr5.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                t05 t05Var = na7Var.i0;
                Object obj3 = na7Var.g0;
                if (t05Var != null) {
                    if (obj3 != null) {
                        wr5.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    t05Var.a(obj);
                } else if (obj3 == null) {
                    na7Var.g0 = obj;
                } else {
                    t05 t05Var2 = vw6.a;
                    t05 t05Var3 = new t05();
                    t05Var3.a(obj3);
                    t05Var3.a(obj);
                    na7Var.i0 = t05Var3;
                    na7Var.g0 = null;
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                xd7 xd7Var = (xd7) obj2;
                synchronized (xd7Var.g) {
                    wd7 wd7Var = xd7Var.i;
                    wd7Var.getClass();
                    Object obj4 = wd7Var.b;
                    obj4.getClass();
                    int i8 = wd7Var.d;
                    f05 f05Var = wd7Var.c;
                    if (f05Var == null) {
                        f05Var = new f05();
                        wd7Var.c = f05Var;
                        wd7Var.f.l(obj4, f05Var);
                    }
                    wd7Var.b(obj, i8, obj4, f05Var);
                }
                return dn8.a;
            case 22:
                yr6 yr6Var = (yr6) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                em7 em7Var = l49.z;
                t66 t66VarT = workDatabase.t();
                String str3 = " AND";
                ArrayList arrayList = (ArrayList) yr6Var.Z;
                ArrayList arrayList2 = (ArrayList) yr6Var.f0;
                ArrayList arrayList3 = (ArrayList) yr6Var.Y;
                ArrayList arrayList4 = new ArrayList();
                StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
                String str4 = " WHERE";
                ArrayList arrayList5 = (ArrayList) yr6Var.g0;
                if (!arrayList5.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList(xv0.Z(arrayList5, 10));
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(Integer.valueOf(a28.u((u39) it.next())));
                    }
                    sb.append(" WHERE state IN (");
                    wl7.n(arrayList6.size(), sb);
                    sb.append(")");
                    arrayList4.addAll(arrayList6);
                    str4 = " AND";
                }
                if (!arrayList3.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList(xv0.Z(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(((UUID) it2.next()).toString());
                    }
                    sb.append(str4.concat(" id IN ("));
                    wl7.n(arrayList3.size(), sb);
                    sb.append(")");
                    arrayList4.addAll(arrayList7);
                    str4 = " AND";
                }
                if (arrayList2.isEmpty()) {
                    str3 = str4;
                } else {
                    sb.append(str4.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
                    wl7.n(arrayList2.size(), sb);
                    sb.append("))");
                    arrayList4.addAll(arrayList2);
                }
                if (!arrayList.isEmpty()) {
                    sb.append(str3.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
                    wl7.n(arrayList.size(), sb);
                    sb.append("))");
                    arrayList4.addAll(arrayList);
                }
                sb.append(";");
                String string2 = sb.toString();
                Object[] array = arrayList4.toArray(new Object[0]);
                t66VarT.getClass();
                TreeMap treeMap = sl6.j0;
                int length = array != null ? array.length : 0;
                TreeMap treeMap2 = sl6.j0;
                synchronized (treeMap2) {
                    Map.Entry entryCeilingEntry = treeMap2.ceilingEntry(Integer.valueOf(length));
                    if (entryCeilingEntry != null) {
                        treeMap2.remove(entryCeilingEntry.getKey());
                        sl6Var = (sl6) entryCeilingEntry.getValue();
                        sl6Var.getClass();
                        sl6Var.X = string2;
                        sl6Var.i0 = length;
                    } else {
                        sl6Var = new sl6(length);
                        sl6Var.X = string2;
                        sl6Var.i0 = length;
                    }
                }
                ci8.j(new ym2(sl6Var, (byte) 1), array);
                String str5 = sl6Var.X;
                if (str5 != null) {
                    str = str5;
                } else {
                    bt.i("Required value was null.");
                    str = null;
                }
                t16 t16Var = new t16((Object) sl6Var, (byte) 5);
                y45 y45Var = new y45();
                y45Var.X = new t16((Object) t16Var, (byte) 4);
                Object objApply = em7Var.apply((List) u15.G(t66VarT.a, true, false, new sn((Object) str, (Object) y45Var, (Object) t66VarT, (byte) 20)));
                objApply.getClass();
                return (List) objApply;
            case 23:
                qs7 qs7Var = (qs7) obj;
                qs7Var.getClass();
                return qs7.a(qs7Var, null, false, false, fs7.a(qs7Var.d, false, (SubscriptionAutoConnectType) obj2, 1), false, false, null, 0, null, null, 1015);
            case 24:
                qs7 qs7Var2 = (qs7) obj;
                qs7Var2.getClass();
                return qs7.a(qs7Var2, null, false, false, null, false, false, null, 0, null, (SubscriptionSortType) obj2, 511);
            case 25:
                String str6 = (String) obj;
                str6.getClass();
                ((gn2) ((pv3) obj2)).B(new lo7(str6));
                return dn8.a;
            case 26:
                ((Boolean) obj).getClass();
                ((AppCompatImageButton) obj2).setEnabled(true);
                return dn8.a;
            case 27:
                String str7 = (String) obj;
                String string3 = ((zt7) obj2).b.getString(str7, null);
                if (string3 == null) {
                    return null;
                }
                cn7 cn7Var = SubId.Companion;
                str7.getClass();
                cn7Var.getClass();
                if (str7.equals(SubId.SERVER_LIST_NAME)) {
                    str7 = SubId.EMPTY;
                }
                return new qg5(new SubId(str7), string3);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                a aVar = wu7.y1;
                ((u95) obj).getClass();
                ((wu7) obj2).R(false, false);
                return dn8.a;
            default:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " SubscriptionUpdater done: " + ((SubscriptionUpdater$UpdateTask) obj2).b.b.a("subIdData"));
                return dn8.a;
        }
    }

    public /* synthetic */ t16(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
