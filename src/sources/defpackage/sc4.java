package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.camera.view.PreviewView;
import androidx.core.widget.NestedScrollView;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import com.google.android.material.button.MaterialButton;
import io.sentry.ILogger;
import io.sentry.ShutdownHookIntegration;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a;
import io.sentry.android.core.c2;
import io.sentry.android.core.g0;
import io.sentry.android.core.y1;
import io.sentry.m1;
import io.sentry.o4;
import io.sentry.q1;
import io.sentry.s5;
import io.sentry.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ sc4(ActivityLifecycleIntegration activityLifecycleIntegration, q1 q1Var, q1 q1Var2) {
        this.X = (byte) 24;
        this.Y = q1Var;
        this.Z = q1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        c2 c2Var = null;
        switch (this.X) {
            case 0:
                Map.Entry entry = (Map.Entry) this.Y;
                tc4 tc4Var = (tc4) this.Z;
                n85 n85Var = (n85) entry.getKey();
                tc4Var.getClass();
                n85Var.a(tc4Var.a);
                return;
            case 1:
                f63 f63Var = (f63) this.Y;
                n85 n85Var2 = (n85) this.Z;
                tc4 tc4Var2 = (tc4) ((yz4) f63Var.Y).d();
                if (tc4Var2 == null) {
                    return;
                }
                n85Var2.a(tc4Var2.a);
                return;
            case 2:
                MaterialButton materialButton = (MaterialButton) this.Y;
                Runnable runnable = (Runnable) this.Z;
                int[] iArr = MaterialButton.T0;
                runnable.run();
                LinearLayout.LayoutParams layoutParams = materialButton.I0;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.I0 = null;
                    materialButton.F0 = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 3:
                ((p63) this.Z).k((cv4) this.Y);
                return;
            case 4:
                Surface surface = (Surface) this.Y;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.Z;
                surface.release();
                surfaceTexture.release();
                return;
            case 5:
                ((kt5) this.Y).o((hy7) this.Z);
                return;
            case 6:
                ((PreviewView) ((y45) this.Y).X).q0.o((hy7) this.Z);
                return;
            case 7:
                fv5 fv5Var = (fv5) this.Y;
                s39 s39Var = (s39) this.Z;
                synchronized (fv5Var.k) {
                    arrayList = new ArrayList(fv5Var.j);
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((p52) it.next()).b(s39Var, false);
                }
                return;
            case 8:
                RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) this.Y;
                xb4 xb4Var = (xb4) this.Z;
                kp5 kp5Var = RemoteWorkManagerClient.j;
                try {
                    xb4Var.get();
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException unused) {
                    remoteWorkManagerClient.d();
                    return;
                }
            case 9:
                ((wl7) this.Y).T((Typeface) this.Z);
                return;
            case 10:
                NestedScrollView nestedScrollView = (NestedScrollView) this.Y;
                View view = (View) this.Z;
                Rect rect = new Rect();
                nestedScrollView.getDrawingRect(rect);
                int iHeight = (int) (rect.height() * 0.5f);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                nestedScrollView.u(0 - nestedScrollView.getScrollX(), ((nestedScrollView.getScrollY() + (iArr2[1] - nestedScrollView.getTop())) - iHeight) - nestedScrollView.getScrollY(), false);
                return;
            case 11:
                ScrollView scrollView = (ScrollView) this.Y;
                View view2 = (View) this.Z;
                Rect rect2 = new Rect();
                scrollView.getDrawingRect(rect2);
                int iHeight2 = (int) (rect2.height() * 0.5f);
                int[] iArr3 = new int[2];
                view2.getLocationOnScreen(iArr3);
                scrollView.smoothScrollTo(0, ((scrollView.getScrollY() + (iArr3[1] - scrollView.getTop())) - iHeight2) - (view2.getHeight() / 2));
                return;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                yr6 yr6Var = (yr6) this.Y;
                List list = (List) this.Z;
                list.getClass();
                if (((ExecutorService) yr6Var.g0).isShutdown()) {
                    return;
                }
                ((wi) yr6Var.Z).B(list);
                return;
            case 13:
                ((d41) ((AtomicReference) this.Z).get()).accept(new kz((by7) this.Y));
                return;
            case 14:
                b98 b98Var = (b98) this.Y;
                hy7 hy7Var = (hy7) this.Z;
                hy7 hy7Var2 = b98Var.h;
                if (hy7Var2 != null && hy7Var2 == hy7Var) {
                    b98Var.h = null;
                    b98Var.g = null;
                }
                mf1 mf1Var = b98Var.l;
                if (mf1Var != null) {
                    mf1Var.c();
                    b98Var.l = null;
                    return;
                }
                return;
            case 15:
                ea6 ea6Var = (ea6) this.Y;
                ea6 ea6Var2 = (ea6) this.Z;
                gv3.i((b71) ea6Var.X, null);
                gv3.i((b71) ea6Var2.X, null);
                return;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                c1 c1Var = (c1) this.Y;
                CountDownLatch countDownLatch = (CountDownLatch) this.Z;
                try {
                    c1Var.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 17:
                ((xd6) ((yr6) this.Y).Z).J((bh7) this.Z, 3);
                return;
            case 18:
                Runnable runnable2 = (Runnable) this.Y;
                lp lpVar = (lp) this.Z;
                try {
                    runnable2.run();
                    return;
                } finally {
                    lpVar.a();
                }
            case 19:
                pr8 pr8Var = (pr8) this.Y;
                Runnable runnable3 = (Runnable) this.Z;
                ThreadLocal threadLocal = pr8Var.d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable3.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 20:
                h59 h59Var = (h59) this.Y;
                g94 g94Var = (g94) this.Z;
                if (h59Var.Z) {
                    return;
                }
                h59Var.f0 = g94Var;
                g94Var.a(h59Var);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                Context context = (Context) this.Y;
                String str = (String) this.Z;
                int i = fb8.b;
                Toast toastMakeText = Toast.makeText(context, str, 0);
                fb8.a(toastMakeText.getView(), new fv6(context));
                new fb8(context, toastMakeText).show();
                return;
            case 22:
                ((m1) this.Z).a(((o4) this.Y).i().getShutdownTimeoutMillis());
                return;
            case 23:
                ShutdownHookIntegration shutdownHookIntegration = (ShutdownHookIntegration) this.Y;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.Z;
                shutdownHookIntegration.X.addShutdownHook(shutdownHookIntegration.Y);
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
                b.a("ShutdownHook");
                return;
            case 24:
                ActivityLifecycleIntegration.k((q1) this.Y, (q1) this.Z);
                return;
            case 25:
                AnrIntegration anrIntegration = (AnrIntegration) this.Y;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.Z;
                a aVar = AnrIntegration.g0;
                io.sentry.util.a aVar2 = anrIntegration.Z;
                aVar2.g();
                try {
                    if (!anrIntegration.Y) {
                        anrIntegration.g(sentryAndroidOptions2);
                        break;
                    }
                    aVar2.close();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 26:
                ((g0) this.Y).k((ILogger) this.Z);
                return;
            case 27:
                FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.Y;
                SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) this.Z;
                y1 y1Var = feedbackShakeIntegration.Y;
                Application application = feedbackShakeIntegration.X;
                ILogger logger = sentryAndroidOptions3.getLogger();
                synchronized (y1Var) {
                    y1Var.f = logger;
                    y1Var.b(application);
                }
                return;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                FeedbackShakeIntegration feedbackShakeIntegration2 = (FeedbackShakeIntegration) this.Y;
                Activity activity = (Activity) this.Z;
                if (!feedbackShakeIntegration2.f0 || feedbackShakeIntegration2.g(activity) || activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                try {
                    c2 c2Var2 = new c2(activity);
                    try {
                        c2Var2.show();
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        c2Var = c2Var2;
                        if (c2Var != null) {
                            feedbackShakeIntegration2.k(c2Var);
                        }
                        feedbackShakeIntegration2.Z.getLogger().e(s5.ERROR, "Failed to show feedback dialog on shake.", th);
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            default:
                c2 c2Var3 = (c2) this.Y;
                Activity activity2 = (Activity) this.Z;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                c2Var3.show();
                return;
        }
    }

    public /* synthetic */ sc4(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }
}
