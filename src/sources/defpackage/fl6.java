package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.a;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.d;
import io.sentry.android.core.f0;
import io.sentry.android.core.g0;
import io.sentry.android.core.h;
import io.sentry.android.core.j1;
import io.sentry.android.core.m1;
import io.sentry.android.core.n0;
import io.sentry.android.core.u;
import io.sentry.android.core.x1;
import io.sentry.android.core.y0;
import io.sentry.android.core.y1;
import io.sentry.c2;
import io.sentry.profiling.c;
import io.sentry.s5;
import io.sentry.util.b;
import io.sentry.util.g;
import io.sentry.v4;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.metrics.StatsLogImpl;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditActivity;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl6 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ fl6(a aVar, c2 c2Var) {
        this.X = (byte) 19;
        this.Y = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        Object rj6Var;
        View viewFindFocus;
        io.sentry.android.core.internal.profiling.a aVar;
        byte b = this.X;
        boolean z = true;
        Boolean bool = null;
        Object obj = this.Y;
        switch (b) {
            case 0:
                gl6.setRippleState$lambda$2((gl6) obj);
                return;
            case 1:
                RoutingSettingsEditActivity routingSettingsEditActivity = (RoutingSettingsEditActivity) obj;
                fu6 fu6Var = routingSettingsEditActivity.Q0;
                if (fu6Var != null) {
                    ((AppCompatEditText) fu6Var.Z).addTextChangedListener(new x42(routingSettingsEditActivity, (byte) 5));
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
            case 2:
                ScannerActivity scannerActivity = (ScannerActivity) obj;
                int i = ScannerActivity.T0;
                try {
                    zo0 zo0Var = scannerActivity.R0;
                    if (zo0Var == null) {
                        dh3.T("cameraProviderFuture");
                        throw null;
                    }
                    Object obj2 = zo0Var.get();
                    obj2.getClass();
                    scannerActivity.A((xu5) obj2);
                    rj6Var = dn8.a;
                    Throwable thA = sj6.a(rj6Var);
                    if (thA != null) {
                        if ((thA instanceof ExecutionException) || (thA instanceof InterruptedException)) {
                            x79.h(scannerActivity, y46.toast_camera_failure);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    rj6Var = new rj6(th);
                }
                break;
            case 3:
                f63 f63Var = (f63) obj;
                synchronized (((ArrayDeque) f63Var.Z)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) f63Var.Y).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) f63Var.Z).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(",");
                    }
                    editorEdit.putString("topic_operation_queue", sb.toString()).apply();
                    break;
                }
                return;
            case 4:
                m70 m70Var = (m70) obj;
                m70Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) m70Var.e;
                mw8 mw8Var = sideSheetBehavior.i;
                if (mw8Var != null && mw8Var.g()) {
                    m70Var.d(m70Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.w(m70Var.b);
                        return;
                    }
                    return;
                }
            case 5:
                ((StatsLogImpl) obj).lambda$startWriterThread$0();
                return;
            case 6:
                yr6 yr6Var = (yr6) obj;
                try {
                    ((Handler) yr6Var.f0).post(new sc4((Object) yr6Var, ((hg) yr6Var.Y).invoke(), (byte) 12));
                    return;
                } catch (Throwable th2) {
                    th2.getMessage();
                    return;
                }
            case 7:
                ex1 ex1Var = (ex1) ((zv7) obj).Z;
                if (ex1Var != null) {
                    Iterator it2 = ex1Var.values().iterator();
                    while (it2.hasNext()) {
                        ((xx7) it2.next()).b();
                    }
                    return;
                }
                return;
            case 8:
                ((mf1) obj).c();
                return;
            case 9:
                b08 b08Var = ((d08) obj).a;
                ViewParent parent = b08Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(b08Var);
                    return;
                }
                return;
            case 10:
                ((g18) obj).b();
                return;
            case 11:
                int i2 = TextInputLayout.F1;
                ((TextInputLayout) obj).j0.requestLayout();
                return;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                q78 q78Var = (q78) obj;
                f63 f63Var2 = q78Var.b;
                q78Var.e = null;
                c15 c15Var = q78Var.d;
                View view = q78Var.a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    c15Var.g();
                    return;
                }
                Object[] objArr = c15Var.X;
                int i3 = c15Var.Z;
                Boolean boolValueOf = null;
                for (int i4 = 0; i4 < i3; i4++) {
                    p78 p78Var = (p78) objArr[i4];
                    int iOrdinal = p78Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            b61.c();
                            return;
                        } else if (!dh3.f(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(p78Var == p78.Z);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                c15Var.g();
                if (dh3.f(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((g44) f63Var2.Z).getValue()).restartInput((View) f63Var2.Y);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((y45) ((lr5) f63Var2.f0).Y).O();
                    } else {
                        ((y45) ((lr5) f63Var2.f0).Y).H();
                    }
                }
                if (dh3.f(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((g44) f63Var2.Z).getValue()).restartInput((View) f63Var2.Y);
                    return;
                }
                return;
            case 13:
                ArrayList arrayList = (ArrayList) obj;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((ExecutorService) it3.next()).shutdownNow();
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((ExecutorService) it4.next()).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
            case 14:
                HandlerThread handlerThread = (HandlerThread) obj;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
            case 15:
                ExecutorService executorService = (ExecutorService) obj;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                i39 i39Var = (i39) obj;
                i39Var.a.getAction();
                i39Var.b.c(null);
                return;
            case 17:
                yr6 yr6Var2 = (yr6) obj;
                ((wr6) yr6Var2.g0).C(new j78(yr6Var2, (byte) 7));
                return;
            case 18:
                File[] fileArrListFiles = ((File) obj).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file : fileArrListFiles) {
                    if (file.lastModified() < v4.f - 300000) {
                        b.g(file);
                    }
                }
                return;
            case 19:
                a aVar2 = (a) obj;
                aVar2.j0 = SystemClock.uptimeMillis();
                aVar2.k0.set(false);
                return;
            case 20:
                eb9 eb9Var = ((FrameMetricsAggregator) ((g) ((d) obj).a).a()).a;
                ArrayList arrayList2 = (ArrayList) eb9Var.f0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) arrayList2.get(size);
                    Activity activity = (Activity) weakReference.get();
                    if (weakReference.get() != null) {
                        activity.getWindow().removeOnFrameMetricsAvailableListener((lm2) eb9Var.g0);
                        arrayList2.remove(size);
                    }
                }
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((h) obj).h(true);
                return;
            case 22:
                ((u) obj).a(null, true);
                return;
            case 23:
                f0 f0Var = (f0) obj;
                if (f0Var != null) {
                    ProcessLifecycleOwner.k0.h0.f(f0Var);
                    return;
                }
                return;
            case 24:
                if (((y0) obj).g0) {
                    v4.b().k();
                }
                v4.b().i().getReplayController().U();
                v4.b().i().getContinuousProfiler().close(false);
                return;
            case 25:
                j1 j1Var = (j1) obj;
                io.sentry.util.a aVar3 = j1Var.t0;
                aVar3.g();
                try {
                    j1Var.i(true);
                    aVar3.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        aVar3.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 26:
                final m1 m1Var = (m1) obj;
                synchronized (m1Var.e) {
                    try {
                        if (m1Var.g != null) {
                            m1Var.a.h(s5.WARNING, "Timed out waiting for Perfetto profiling result.", new Object[0]);
                            m1Var.g.accept(null);
                            m1Var.g = new Consumer() { // from class: io.sentry.android.core.l1
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj3) {
                                    File file2 = (File) obj3;
                                    m1 m1Var2 = m1Var;
                                    m1Var2.getClass();
                                    if (file2 == null || file2.delete()) {
                                        return;
                                    }
                                    m1Var2.a.h(s5.WARNING, "Failed to delete late Perfetto trace file %s", file2.getPath());
                                }
                            };
                        } else {
                            z = false;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                    break;
                }
                if (!z || (aVar = m1Var.i) == null) {
                    return;
                }
                aVar.a(c.NOT_RECORDED);
                return;
            case 27:
                di diVar = ((y1) obj).h;
                while (true) {
                    x1 x1Var = (x1) diVar.b;
                    if (x1Var == null) {
                        diVar.e = null;
                        diVar.a = 0;
                        diVar.c = 0;
                        return;
                    } else {
                        diVar.b = x1Var.c;
                        n0 n0Var = (n0) diVar.d;
                        x1Var.c = (x1) n0Var.a;
                        n0Var.a = x1Var;
                    }
                }
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) obj;
                systemEventsBreadcrumbsIntegration.p(systemEventsBreadcrumbsIntegration.Z);
                return;
            default:
                ((AnrProfilingIntegration) obj).g0 = SystemClock.uptimeMillis();
                return;
        }
    }

    public /* synthetic */ fl6(g0 g0Var, f0 f0Var) {
        this.X = (byte) 23;
        this.Y = f0Var;
    }

    public /* synthetic */ fl6(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
