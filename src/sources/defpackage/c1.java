package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.view.ActionMode;
import android.view.Choreographer;
import android.widget.EditText;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ c1(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    private final void a() {
        r53 r53Var = (r53) this.Y;
        synchronized (r53Var.y0) {
            try {
                r53Var.A0 = null;
                n63 n63Var = r53Var.z0;
                if (n63Var != null) {
                    r53Var.z0 = null;
                    r53Var.e(n63Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        d6 d6Var = (d6) this.Y;
        if (((zl0) d6Var.i0) != null) {
            Trace.beginSection("CX:unbindAll");
            try {
                s08.b();
                d6Var.e(0);
                t84 t84Var = (t84) d6Var.j0;
                t84Var.getClass();
                t84Var.j((HashSet) d6Var.f0);
                Trace.endSection();
                t84 t84Var2 = (t84) d6Var.j0;
                t84Var2.getClass();
                HashSet<sy> hashSet = (HashSet) d6Var.f0;
                synchronized (t84Var2.a) {
                    try {
                        for (sy syVar : hashSet) {
                            if (t84Var2.b.containsKey(syVar)) {
                                t84Var2.k((p84) t84Var2.b.get(syVar));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0223  */
    /* JADX WARN: Code duplicated, block: B:155:0x0247  */
    /* JADX WARN: Code duplicated, block: B:156:0x024f  */
    /* JADX WARN: Code duplicated, block: B:158:0x025e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0264  */
    /* JADX WARN: Code duplicated, block: B:163:0x0271  */
    /* JADX WARN: Code duplicated, block: B:165:0x0275  */
    /* JADX WARN: Code duplicated, block: B:167:0x028d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0297  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:176:0x0321  */
    /* JADX WARN: Code duplicated, block: B:179:0x0339  */
    /* JADX WARN: Code duplicated, block: B:219:0x0408  */
    /* JADX WARN: Code duplicated, block: B:326:0x033c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r3;
        AndroidComposeView androidComposeView;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        uf7 uf7Var;
        float f3;
        float f4;
        float f5;
        float f6;
        uf7 uf7Var2;
        byte b = 2;
        int i = 0;
        q51 q51Var = null;
        boolean z2 = true;
        switch (this.X) {
            case 0:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.Y;
                int i2 = AbstractComposeView.o0;
                abstractComposeView.b();
                return;
            case 1:
                Application application = 1;
                Activity activity = (Activity) this.Y;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = f6.g;
                Method method = f6.f;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i3 != 26 && i3 != 27) || method != null) && (f6.e != null || f6.d != null)) {
                    try {
                        Object obj2 = f6.c.get(activity);
                        if (obj2 != null && (obj = f6.b.get(activity)) != null) {
                            application = activity.getApplication();
                            e6 e6Var = new e6(activity);
                            application.registerActivityLifecycleCallbacks(e6Var);
                            handler.post(new zo2(e6Var, obj2, b));
                            e6Var = (i3 == 26 || i3 == 27) ? 1 : 0;
                            byte b2 = 3;
                            try {
                                if (e6Var != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = application;
                                        r5 = e6Var;
                                        handler.post(new zo2(r3, r5, b2));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new zo2(application, e6Var, b2));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = application;
                                r5 = e6Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                gc gcVar = (gc) this.Y;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    gcVar.f0.q(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        gcVar.n();
                        Trace.endSection();
                        gcVar.K0 = false;
                        return;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 3:
                vc vcVar = (vc) this.Y;
                boolean zD = vcVar.d();
                AndroidComposeView androidComposeView2 = vcVar.X;
                if (zD) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView2.q(true);
                        vz4 vz4Var = vcVar.l0;
                        int[] iArr = vz4Var.b;
                        long[] jArr = vz4Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j5 = jArr[i4];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = i;
                                    while (i6 < i5) {
                                        if ((255 & j5) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!vcVar.c().a(i7)) {
                                                vcVar.f0.add(new f41(i7, vcVar.k0, g41.Y, null));
                                                vcVar.i0.b(dn8.a);
                                            }
                                        }
                                        j5 >>= 8;
                                        i6++;
                                        androidComposeView2 = androidComposeView2;
                                    }
                                    androidComposeView = androidComposeView2;
                                    if (i5 == 8) {
                                    }
                                } else {
                                    androidComposeView = androidComposeView2;
                                }
                                if (i4 != length) {
                                    i4++;
                                    androidComposeView2 = androidComposeView;
                                    i = 0;
                                }
                            }
                        } else {
                            androidComposeView = androidComposeView2;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            vcVar.f(androidComposeView.getSemanticsOwner().a(), vcVar.m0);
                            Trace.endSection();
                            vcVar.b(vcVar.c());
                            vcVar.j();
                            vcVar.n0 = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 4:
                ActionMode actionMode = ((ch) this.Y).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 5:
                lk lkVar = (lk) ((lk) this.Y).c.Y;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = lkVar.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    tf7 tf7Var = (tf7) arrayList.get(i8);
                    if (tf7Var == null) {
                        z2 = z2;
                        jUptimeMillis2 = jUptimeMillis2;
                    } else {
                        l97 l97Var = lkVar.a;
                        Long l = (Long) l97Var.get(tf7Var);
                        if (l == null) {
                            j = tf7Var.i;
                            if (j == 0) {
                                tf7Var.i = jUptimeMillis;
                                tf7Var.e(tf7Var.b);
                                z2 = z2;
                                jUptimeMillis2 = jUptimeMillis2;
                            } else {
                                j2 = jUptimeMillis - j;
                                tf7Var.i = jUptimeMillis;
                                f = tf7.c().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = tf7Var.o;
                                f2 = tf7Var.n;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        tf7Var.m.i = f2;
                                        tf7Var.n = Float.MAX_VALUE;
                                    }
                                    tf7Var.b = (float) tf7Var.m.i;
                                    tf7Var.a = 0.0f;
                                    tf7Var.o = false;
                                    z2 = z2;
                                    jUptimeMillis2 = jUptimeMillis2;
                                } else {
                                    uf7Var = tf7Var.m;
                                    f3 = tf7Var.b;
                                    f4 = tf7Var.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j6 = j4 / 2;
                                        nx1 nx1VarC = uf7Var.c(f3, f4, j6);
                                        uf7 uf7Var3 = tf7Var.m;
                                        uf7Var3.i = tf7Var.n;
                                        tf7Var.n = Float.MAX_VALUE;
                                        nx1 nx1VarC2 = uf7Var3.c(nx1VarC.a, nx1VarC.b, j6);
                                        f5 = nx1VarC2.a;
                                        tf7Var.b = f5;
                                        tf7Var.a = nx1VarC2.b;
                                    } else {
                                        nx1 nx1VarC3 = uf7Var.c(f3, f4, j4);
                                        f5 = nx1VarC3.a;
                                        tf7Var.b = f5;
                                        tf7Var.a = nx1VarC3.b;
                                    }
                                    float fMax = Math.max(f5, tf7Var.h);
                                    tf7Var.b = fMax;
                                    float fMin = Math.min(fMax, tf7Var.g);
                                    tf7Var.b = fMin;
                                    f6 = tf7Var.a;
                                    uf7Var2 = tf7Var.m;
                                    uf7Var2.getClass();
                                    if (Math.abs(f6) < uf7Var2.e) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                }
                                float fMin2 = Math.min(tf7Var.b, tf7Var.g);
                                tf7Var.b = fMin2;
                                float fMax2 = Math.max(fMin2, tf7Var.h);
                                tf7Var.b = fMax2;
                                tf7Var.e(fMax2);
                                if (z2) {
                                    tf7Var.b(false);
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            l97Var.remove(tf7Var);
                            j = tf7Var.i;
                            if (j == 0) {
                                tf7Var.i = jUptimeMillis;
                                tf7Var.e(tf7Var.b);
                                z2 = z2;
                                jUptimeMillis2 = jUptimeMillis2;
                            } else {
                                j2 = jUptimeMillis - j;
                                tf7Var.i = jUptimeMillis;
                                f = tf7.c().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = tf7Var.o;
                                f2 = tf7Var.n;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        tf7Var.m.i = f2;
                                        tf7Var.n = Float.MAX_VALUE;
                                    }
                                    tf7Var.b = (float) tf7Var.m.i;
                                    tf7Var.a = 0.0f;
                                    tf7Var.o = false;
                                    z2 = z2;
                                    jUptimeMillis2 = jUptimeMillis2;
                                } else {
                                    uf7Var = tf7Var.m;
                                    f3 = tf7Var.b;
                                    f4 = tf7Var.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j7 = j4 / 2;
                                        nx1 nx1VarC4 = uf7Var.c(f3, f4, j7);
                                        uf7 uf7Var4 = tf7Var.m;
                                        uf7Var4.i = tf7Var.n;
                                        tf7Var.n = Float.MAX_VALUE;
                                        nx1 nx1VarC5 = uf7Var4.c(nx1VarC4.a, nx1VarC4.b, j7);
                                        f5 = nx1VarC5.a;
                                        tf7Var.b = f5;
                                        tf7Var.a = nx1VarC5.b;
                                    } else {
                                        nx1 nx1VarC6 = uf7Var.c(f3, f4, j4);
                                        f5 = nx1VarC6.a;
                                        tf7Var.b = f5;
                                        tf7Var.a = nx1VarC6.b;
                                    }
                                    float fMax3 = Math.max(f5, tf7Var.h);
                                    tf7Var.b = fMax3;
                                    float fMin3 = Math.min(fMax3, tf7Var.g);
                                    tf7Var.b = fMin3;
                                    f6 = tf7Var.a;
                                    uf7Var2 = tf7Var.m;
                                    uf7Var2.getClass();
                                    if (Math.abs(f6) < uf7Var2.e || Math.abs(fMin3 - ((float) uf7Var2.i)) >= uf7Var2.d) {
                                        z2 = false;
                                    } else {
                                        tf7Var.b = (float) tf7Var.m.i;
                                        tf7Var.a = 0.0f;
                                        z2 = z2;
                                    }
                                }
                                float fMin4 = Math.min(tf7Var.b, tf7Var.g);
                                tf7Var.b = fMin4;
                                float fMax4 = Math.max(fMin4, tf7Var.h);
                                tf7Var.b = fMax4;
                                tf7Var.e(fMax4);
                                if (z2) {
                                    tf7Var.b(false);
                                }
                            }
                        } else {
                            z2 = z2;
                            jUptimeMillis2 = jUptimeMillis2;
                        }
                    }
                    i8++;
                    z2 = z2;
                    jUptimeMillis2 = jUptimeMillis2;
                }
                if (lkVar.f) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        lkVar.h.a();
                    }
                    lkVar.f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) lkVar.e.Y).postFrameCallback(new kk(lkVar.d));
                    return;
                }
                return;
            case 6:
                gv3.i(((pw) this.Y).a, null);
                return;
            case 7:
                gv3.i(((zf0) this.Y).e, null);
                return;
            case 8:
                i21.S(new r5(this.Y, q51Var, (byte) 4));
                return;
            case 9:
                Runnable runnable = (Runnable) this.Y;
                Process.setThreadPriority(-3);
                runnable.run();
                return;
            case 10:
                ((CarouselLayoutManager) this.Y).K0();
                return;
            case 11:
                ((wt0) this.Y).s(true);
                return;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ky0 ky0Var = (ky0) this.Y;
                Runnable runnable2 = ky0Var.Y;
                if (runnable2 != null) {
                    runnable2.run();
                    ky0Var.Y = null;
                    return;
                }
                return;
            case 13:
                py0.e((py0) this.Y);
                return;
            case 14:
                jg1 jg1Var = (jg1) this.Y;
                jg1Var.j = true;
                jg1Var.d();
                return;
            case 15:
                ((by7) this.Y).close();
                return;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                y5 y5Var = ((kn1) this.Y).u1;
                if (y5Var != null) {
                    ((HappTextButton) y5Var.f0).requestFocus();
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
            case 17:
                yw1 yw1Var = (yw1) this.Y;
                boolean zIsPopupShowing = yw1Var.h.isPopupShowing();
                yw1Var.s(zIsPopupShowing);
                yw1Var.m = zIsPopupShowing;
                return;
            case 18:
                cx1 cx1Var = (cx1) this.Y;
                cx1Var.f = true;
                cx1Var.d();
                return;
            case 19:
                ex1 ex1Var = (ex1) ((y5) this.Y).f0;
                if (ex1Var != null) {
                    Iterator it = ex1Var.values().iterator();
                    while (it.hasNext()) {
                        ((xx7) it.next()).b();
                    }
                    return;
                }
                return;
            case 20:
                oi2 oi2Var = (oi2) this.Y;
                synchronized (oi2Var.c) {
                    try {
                        if (oi2Var.g == null) {
                            return;
                        }
                        try {
                            gj2 gj2VarC = oi2Var.c();
                            int i9 = gj2VarC.f;
                            if (i9 == 2) {
                                synchronized (oi2Var.c) {
                                }
                            }
                            if (i9 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                Method method2 = wc8.b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = oi2Var.a;
                                gj2[] gj2VarArr = {gj2VarC};
                                g28 g28Var = hj8.a;
                                Trace.beginSection("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceF = hj8.a.f(context, gj2VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferK = u28.k(oi2Var.a, gj2VarC.a);
                                    if (mappedByteBufferK == null || typefaceF == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        z47 z47Var = new z47(typefaceF, os4.G(mappedByteBufferK));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (oi2Var.c) {
                                            try {
                                                pu puVar = oi2Var.g;
                                                if (puVar != null) {
                                                    puVar.E(z47Var);
                                                }
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                            break;
                                        }
                                        oi2Var.b();
                                        return;
                                    } catch (Throwable th7) {
                                        Method method3 = wc8.b;
                                        Trace.endSection();
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Trace.endSection();
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Method method4 = wc8.b;
                                Trace.endSection();
                                throw th9;
                            }
                            break;
                        } catch (Throwable th10) {
                            synchronized (oi2Var.c) {
                                try {
                                    pu puVar2 = oi2Var.g;
                                    if (puVar2 != null) {
                                        puVar2.D(th10);
                                    }
                                    oi2Var.b();
                                    return;
                                } catch (Throwable th11) {
                                    throw th11;
                                }
                            }
                        }
                    } catch (Throwable th12) {
                        throw th12;
                    }
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                Iterator it2 = ((ml2) this.Y).n.iterator();
                if (it2.hasNext()) {
                    throw p61.k(it2);
                }
                return;
            case 22:
                a();
                return;
            case 23:
                ((EditText) this.Y).requestFocus();
                return;
            case 24:
                b();
                return;
            case 25:
                bm3 bm3Var = (bm3) this.Y;
                if (bm3Var != null) {
                    bm3Var.m(null);
                    return;
                }
                return;
            case 26:
                MaterialButton materialButton = (MaterialButton) this.Y;
                int[] iArr2 = MaterialButton.T0;
                materialButton.r();
                return;
            case 27:
                ((lt5) this.Y).r();
                return;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.Y;
                g94 g94Var = processLifecycleOwner.h0;
                if (processLifecycleOwner.Y == 0) {
                    processLifecycleOwner.Z = true;
                    g94Var.d(n84.ON_PAUSE);
                }
                if (processLifecycleOwner.X == 0 && processLifecycleOwner.Z) {
                    g94Var.d(n84.ON_STOP);
                    processLifecycleOwner.f0 = true;
                    return;
                }
                return;
            default:
                RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) this.Y;
                kp5 kp5Var = RemoteWorkManagerClient.j;
                ((Handler) remoteWorkManagerClient.h.Y).postDelayed(remoteWorkManagerClient.i, remoteWorkManagerClient.g);
                return;
        }
    }
}
