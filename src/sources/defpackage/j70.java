package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j70 implements u4, u06 {
    public final byte X;
    public final Object Y;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j70(int i, Object obj) {
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.u4
    public boolean f(View view) {
        ((BottomSheetBehavior) this.Y).N(this.X);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v06
    public Object get() {
        Map map;
        String string;
        r91 r91Var = (r91) this.Y;
        Object[] objArr = 0;
        gf0 gf0Var = null;
        byte b = this.X;
        switch (b) {
            case 0:
                return new wj0((bm3) r91Var.d.get());
            case 1:
                return u70.g();
            case 2:
                return new zh0((og0) r91Var.w.get());
            case 3:
                nj0 nj0Var = (nj0) r91Var.a.Y;
                j70 j70Var = r91Var.v;
                Context contextA = r91Var.a();
                s98 s98Var = (s98) r91Var.f.get();
                wj0 wj0Var = (wj0) r91Var.e.get();
                j70Var.getClass();
                s98Var.getClass();
                wj0Var.getClass();
                Map map2 = (Map) nj0Var.d.Y;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    mg0 mg0Var = (mg0) j70Var.get();
                    Trace.endSection();
                    String str = "CXCP-Camera2";
                    if (map2.containsKey(new ng0(str))) {
                        om0.l("CameraBackendConfig#cameraBackends should not contain a backend with ", ng0.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.");
                        return null;
                    }
                    ng0 ng0Var = new ng0(str);
                    xj0 xj0Var = new xj0(mg0Var);
                    if (map2.isEmpty()) {
                        Map mapSingletonMap = Collections.singletonMap(ng0Var, xj0Var);
                        mapSingletonMap.getClass();
                        map = mapSingletonMap;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(ng0Var, xj0Var);
                        map = linkedHashMap;
                    }
                    if (map.containsKey(new ng0(str))) {
                        return new og0("CXCP-Camera2", map, contextA, s98Var, wj0Var);
                    }
                    StringBuilder sb = new StringBuilder("Failed to find ");
                    sb.append((Object) ng0.a("CXCP-Camera2"));
                    bt.l(sb, " in the list of available CameraPipe backends! Available values are ", map.keySet());
                    return null;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                return new re0((s98) r91Var.f.get(), (zf0) r91Var.k.get(), (hg0) r91Var.n.get(), (s16) r91Var.u.get(), new yr2((Object) r91Var, (byte) 19), r91Var.a());
            case 5:
                b8 b8Var = r91Var.b;
                wj0 wj0Var2 = (wj0) r91Var.e.get();
                bm3 bm3Var = (bm3) r91Var.d.get();
                wj0Var2.getClass();
                bm3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ThreadFactory threadFactory = uh.b;
                int i = -1;
                ScheduledExecutorService scheduledExecutorServiceA = uh.a(new sh(i, uh.b(threadFactory, "CXCP-IO-")), 8);
                arrayList.add(scheduledExecutorServiceA);
                u61 u61VarX = nr4.x(scheduledExecutorServiceA);
                ScheduledExecutorService scheduledExecutorServiceA2 = uh.a(new sh(i, uh.b(threadFactory, "CXCP-BG-")), 4);
                arrayList.add(scheduledExecutorServiceA2);
                u61 u61VarX2 = nr4.x(scheduledExecutorServiceA2);
                ScheduledExecutorService scheduledExecutorServiceA3 = uh.a(new sh(-3, uh.b(threadFactory, "CXCP-")), b8Var.b);
                arrayList.add(scheduledExecutorServiceA3);
                u61 u61VarX3 = nr4.x(scheduledExecutorServiceA3);
                wj0Var2.a(uj0.Z, new fl6((Object) arrayList, (byte) 13));
                v38 v38Var = new v38(b8Var, wj0Var2);
                f98 f98Var = new f98(b8Var, wj0Var2, objArr == true ? 1 : 0);
                ea6 ea6Var = new ea6();
                ea6 ea6Var2 = new ea6();
                ea6Var.X = gv3.c(g33.K(new ow7(bm3Var), u61VarX3).B0(new x61("CXCP")));
                ea6Var2.X = gv3.c(g33.K(new ow7(bm3Var), new x61("CXCP-Dispatch")));
                wj0Var2.a(uj0.Y, new sc4((Object) ea6Var, (Object) ea6Var2, (byte) 15));
                return new s98((b71) ea6Var.X, (b71) ea6Var2.X, scheduledExecutorServiceA, u61VarX, scheduledExecutorServiceA2, u61VarX2, scheduledExecutorServiceA3, u61VarX3, v38Var, f98Var);
            case 6:
                return new zf0(r91Var.g, (s98) r91Var.f.get(), r91Var.a(), (PackageManager) r91Var.h.get(), (eg0) r91Var.i.get(), r91Var.j, (wj0) r91Var.e.get(), (bm3) r91Var.d.get());
            case 7:
                Object systemService = r91Var.a().getSystemService("camera");
                systemService.getClass();
                return (CameraManager) systemService;
            case 8:
                PackageManager packageManager = r91Var.a().getPackageManager();
                packageManager.getClass();
                return packageManager;
            case 9:
                return new eg0();
            case 10:
                Context contextA2 = r91Var.a();
                xh0 xh0Var = new xh0();
                if (Build.VERSION.SDK_INT >= 35) {
                    xh0Var.b = new gf0(contextA2);
                }
                try {
                    ServiceInfo[] serviceInfoArr = contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    bt.i("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                gf0Var = (gf0) Class.forName(str2).getConstructor(Context.class).newInstance(contextA2);
                            } catch (Exception e) {
                                throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                            }
                        }
                    }
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                xh0Var.a = gf0Var;
                return xh0Var;
            case 11:
                return new hg0(r91Var.a(), (s98) r91Var.f.get(), (hl5) r91Var.l.get(), ((nj0) r91Var.a.Y).c, (u08) r91Var.m.get());
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new hl5(r91Var.a());
            case 13:
                return new u08();
            case 14:
                return new s16((hl5) r91Var.l.get(), (hk6) r91Var.s.get(), (bg0) r91Var.t.get(), (eg0) r91Var.i.get(), (s98) r91Var.f.get());
            case 15:
                u06 u06Var = r91Var.g;
                wl6 wl6Var = r91Var.a;
                return new hk6(new d6(new dq(u06Var, (s98) r91Var.f.get()), (ig0) r91Var.n.get(), (eg0) r91Var.i.get(), (jg0) r91Var.p.get(), (u08) r91Var.m.get(), ((nj0) wl6Var.Y).e, (s98) r91Var.f.get()), (eg0) r91Var.i.get(), new z47(r91Var.g, (s98) r91Var.f.get(), (bm3) r91Var.d.get()), (u08) r91Var.m.get(), (ed) r91Var.q.get(), (pw) r91Var.r.get(), ((nj0) wl6Var.Y).e, (s98) r91Var.f.get());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new jg0((ig0) r91Var.n.get(), (tl7) r91Var.o.get());
            case 17:
                wl6 wl6Var2 = r91Var.a;
                return new tl7();
            case 18:
                Object systemService2 = r91Var.a().getSystemService("device_policy");
                systemService2.getClass();
                return new ed((DevicePolicyManager) systemService2);
            case 19:
                return new pw((s98) r91Var.f.get(), (wj0) r91Var.e.get(), (bm3) r91Var.d.get());
            case 20:
                return new bg0((s98) r91Var.f.get(), (jg0) r91Var.p.get(), (hk6) r91Var.s.get());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                r91Var.getClass();
                s98 s98Var2 = (s98) r91Var.f.get();
                og0 og0Var = (og0) r91Var.w.get();
                s98Var2.getClass();
                og0Var.getClass();
                return new yj0();
            case 22:
                return new jl0();
            case 23:
                return new j11();
            default:
                throw new AssertionError((int) b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j70(Object obj, int i) {
        this.Y = obj;
        this.X = i;
    }
}
