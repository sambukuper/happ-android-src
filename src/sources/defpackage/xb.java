package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.a;
import androidx.leanback.widget.GridLayoutManager;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.snackbar.HappSnackbarView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xb implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public xb(q89 q89Var) {
        this.X = (byte) 29;
        Objects.requireNonNull(q89Var);
        this.Y = q89Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r4.toString();
        defpackage.hi5.z0("SequentialExecutor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.Y     // Catch: java.lang.Throwable -> L4f
            c37 r2 = (defpackage.c37) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.X     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.Y     // Catch: java.lang.Throwable -> L20
            c37 r0 = (defpackage.c37) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f0     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L44
        L20:
            r10 = move-exception
            goto L5a
        L22:
            long r6 = r0.g0     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.g0 = r6     // Catch: java.lang.Throwable -> L20
            r0.f0 = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.Y     // Catch: java.lang.Throwable -> L20
            c37 r4 = (defpackage.c37) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.X     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r10 = r10.Y     // Catch: java.lang.Throwable -> L20
            c37 r10 = (defpackage.c37) r10     // Catch: java.lang.Throwable -> L20
            r10.f0 = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r10 = move-exception
            goto L5c
        L51:
            java.lang.String r2 = "SequentialExecutor"
            r4.toString()     // Catch: java.lang.Throwable -> L4f
            defpackage.hi5.z0(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L5a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L4f
        L5c:
            if (r1 == 0) goto L65
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L65:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb.a():void");
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0227  */
    /* JADX WARN: Code duplicated, block: B:233:0x041f  */
    /* JADX WARN: Code duplicated, block: B:242:0x043e  */
    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        boolean z;
        boolean z2;
        View viewD;
        int width;
        int iH;
        Object obj;
        w18 w18VarB;
        long jNanoTime;
        int iH2 = 0;
        switch (this.X) {
            case 0:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.Y;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.o1;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7) {
                    if (actionMasked == 8) {
                        i = 9;
                    } else if (actionMasked != 9) {
                        i = 2;
                    }
                }
                androidComposeView.G(motionEvent, i, androidComposeView.p1, false);
                return;
            case 1:
                ub4 ub4Var = (ub4) this.Y;
                qw1 qw1Var = ub4Var.Z;
                lx lxVar = ub4Var.X;
                if (ub4Var.p0) {
                    if (ub4Var.n0) {
                        ub4Var.n0 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        lxVar.e = jCurrentAnimationTimeMillis;
                        lxVar.g = -1L;
                        lxVar.f = jCurrentAnimationTimeMillis;
                        lxVar.h = 0.5f;
                    }
                    if ((lxVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > lxVar.g + ((long) lxVar.i)) || !ub4Var.e()) {
                        ub4Var.p0 = false;
                        return;
                    }
                    if (ub4Var.o0) {
                        ub4Var.o0 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        qw1Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (lxVar.f == 0) {
                        kp5.t("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = lxVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - lxVar.f;
                    lxVar.f = jCurrentAnimationTimeMillis2;
                    ub4Var.r0.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * lxVar.d));
                    WeakHashMap weakHashMap = cw8.a;
                    qw1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                m70 m70Var = (m70) this.Y;
                m70Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) m70Var.e;
                mw8 mw8Var = bottomSheetBehavior.Q;
                if (mw8Var != null && mw8Var.g()) {
                    m70Var.d(m70Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.O(m70Var.b);
                        return;
                    }
                    return;
                }
            case 3:
                DatePicker datePicker = (DatePicker) this.Y;
                int[] iArr = {datePicker.z0, datePicker.y0, datePicker.A0};
                boolean z3 = true;
                boolean z4 = true;
                for (int i2 = 2; i2 >= 0; i2--) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        int i4 = DatePicker.H0[i2];
                        ArrayList arrayList = datePicker.h0;
                        cn5 cn5Var = arrayList == null ? null : (cn5) arrayList.get(i3);
                        if (z3) {
                            int i5 = datePicker.D0.get(i4);
                            if (i5 != cn5Var.b) {
                                cn5Var.b = i5;
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            int actualMinimum = datePicker.F0.getActualMinimum(i4);
                            if (actualMinimum != cn5Var.b) {
                                cn5Var.b = actualMinimum;
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z4) {
                            int i6 = datePicker.E0.get(i4);
                            if (i6 != cn5Var.c) {
                                cn5Var.c = i6;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            int actualMaximum = datePicker.F0.getActualMaximum(i4);
                            if (actualMaximum != cn5Var.c) {
                                cn5Var.c = actualMaximum;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        boolean z5 = z | z2;
                        z3 &= datePicker.F0.get(i4) == datePicker.D0.get(i4);
                        z4 &= datePicker.F0.get(i4) == datePicker.E0.get(i4);
                        if (z5) {
                            datePicker.a(iArr[i2], cn5Var);
                        }
                        int i7 = iArr[i2];
                        int i8 = datePicker.F0.get(i4);
                        cn5 cn5Var2 = (cn5) datePicker.h0.get(i7);
                        if (cn5Var2.a != i8) {
                            cn5Var2.a = i8;
                            VerticalGridView verticalGridView = (VerticalGridView) datePicker.g0.get(i7);
                            if (verticalGridView != null) {
                                verticalGridView.setSelectedPosition(i8 - ((cn5) datePicker.h0.get(i7)).b);
                            }
                        }
                    }
                }
                return;
            case 4:
                sn1 sn1Var = (sn1) this.Y;
                sn1Var.g1.onDismiss(sn1Var.o1);
                return;
            case 5:
                a aVar = (a) this.Y;
                DrawerLayout drawerLayout = aVar.d;
                int i9 = aVar.b.o;
                byte b = aVar.a;
                boolean z6 = b == 3;
                if (z6) {
                    viewD = drawerLayout.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i9;
                } else {
                    viewD = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i9;
                }
                if (viewD != null) {
                    if (((!z6 || viewD.getLeft() >= width) && (z6 || viewD.getLeft() <= width)) || drawerLayout.f(viewD) != 0) {
                        return;
                    }
                    DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) viewD.getLayoutParams();
                    aVar.b.r(viewD, width, viewD.getTop());
                    layoutParams.c = true;
                    drawerLayout.invalidate();
                    View viewD2 = drawerLayout.d(b == 3 ? 5 : 3);
                    if (viewD2 != null) {
                        drawerLayout.b(viewD2);
                    }
                    if (drawerLayout.v0) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    while (iH2 < childCount) {
                        drawerLayout.getChildAt(iH2).dispatchTouchEvent(motionEventObtain2);
                        iH2++;
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.v0 = true;
                    return;
                }
                return;
            case 6:
                qw1 qw1Var2 = (qw1) this.Y;
                qw1Var2.q0 = null;
                qw1Var2.drawableStateChanged();
                return;
            case 7:
                g82 g82Var = (g82) this.Y;
                ValueAnimator valueAnimator = g82Var.z;
                byte b2 = g82Var.A;
                if (b2 == 1) {
                    valueAnimator.cancel();
                } else if (b2 != 2) {
                    return;
                }
                g82Var.A = (byte) 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 8:
                qk2 qk2Var = (qk2) this.Y;
                if (qk2Var.M0 != null) {
                    qk2Var.g();
                    return;
                }
                return;
            case 9:
                ((ml2) this.Y).A(true);
                return;
            case 10:
                kk7 kk7Var = (kk7) this.Y;
                kk7Var.j = false;
                kk7Var.n();
                return;
            case 11:
                ((xb4) this.Y).cancel(true);
                return;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((GridLayoutManager) this.Y).K0();
                return;
            case 13:
                lr lrVar = (lr) this.Y;
                kv2 kv2Var = (kv2) lrVar.f0;
                if (kv2Var.X.getAndSet(null) != null) {
                    ((Handler) lrVar.Y).removeCallbacks(kv2Var);
                    return;
                }
                return;
            case 14:
                ((HappSnackbarView) this.Y).i0.requestFocus();
                return;
            case 15:
                yi3 yi3Var = (yi3) this.Y;
                y42 y42Var = yi3Var.m;
                if (yi3Var.c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = yi3Var.B;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    j layoutManager = yi3Var.r.getLayoutManager();
                    Rect rect = yi3Var.A;
                    if (rect == null) {
                        rect = new Rect();
                        yi3Var.A = rect;
                    }
                    layoutManager.o(yi3Var.c.a, rect);
                    if (layoutManager.p()) {
                        int i10 = (int) (yi3Var.j + yi3Var.h);
                        int paddingLeft = (i10 - yi3Var.A.left) - yi3Var.r.getPaddingLeft();
                        float f = yi3Var.h;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((yi3Var.c.a.getWidth() + i10) + yi3Var.A.right) - (yi3Var.r.getWidth() - yi3Var.r.getPaddingRight())) <= 0)) {
                            iH = 0;
                        } else {
                            iH = paddingLeft;
                        }
                    } else {
                        iH = 0;
                    }
                    if (layoutManager.q()) {
                        int i11 = (int) (yi3Var.k + yi3Var.i);
                        int paddingTop = (i11 - yi3Var.A.top) - yi3Var.r.getPaddingTop();
                        float f2 = yi3Var.i;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((yi3Var.c.a.getHeight() + i11) + yi3Var.A.bottom) - (yi3Var.r.getHeight() - yi3Var.r.getPaddingBottom())) > 0)) {
                            iH2 = paddingTop;
                        }
                    }
                    if (iH != 0) {
                        RecyclerView recyclerView = yi3Var.r;
                        int width2 = yi3Var.c.a.getWidth();
                        yi3Var.r.getWidth();
                        iH = y42Var.h(recyclerView, width2, iH, j3);
                    }
                    int i12 = iH;
                    if (iH2 != 0) {
                        RecyclerView recyclerView2 = yi3Var.r;
                        int height = yi3Var.c.a.getHeight();
                        yi3Var.r.getHeight();
                        iH2 = y42Var.h(recyclerView2, height, iH2, j3);
                    }
                    if (i12 == 0 && iH2 == 0) {
                        yi3Var.B = Long.MIN_VALUE;
                        return;
                    }
                    if (yi3Var.B == Long.MIN_VALUE) {
                        yi3Var.B = jCurrentTimeMillis;
                    }
                    yi3Var.r.scrollBy(i12, iH2);
                    l lVar = yi3Var.c;
                    if (lVar != null) {
                        yi3Var.p(lVar);
                    }
                    yi3Var.r.removeCallbacks(yi3Var.s);
                    RecyclerView recyclerView3 = yi3Var.r;
                    WeakHashMap weakHashMap2 = cw8.a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                kb4 kb4Var = (kb4) this.Y;
                kb4Var.Y = null;
                kb4Var.X = null;
                return;
            case 17:
                synchronized (((qc4) this.Y).a) {
                    obj = ((qc4) this.Y).f;
                    ((qc4) this.Y).f = qc4.k;
                    break;
                }
                ((qc4) this.Y).j(obj);
                return;
            case 18:
                SearchBar searchBar = (SearchBar) ((xy6) this.Y).b;
                searchBar.o0 = true;
                searchBar.g0.requestFocus();
                return;
            case 19:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((c37) this.Y).X) {
                        ((c37) this.Y).f0 = 1;
                        throw e;
                    }
                }
            case 20:
                ((StaggeredGridLayoutManager) this.Y).a1();
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                break;
            case 22:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.Y).h0.l0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 23:
                ((Toolbar) this.Y).u();
                return;
            case 24:
                sb8 sb8Var = (sb8) this.Y;
                Window.Callback callback = sb8Var.h;
                Menu menuU0 = sb8Var.u0();
                nt4 nt4Var = menuU0 instanceof nt4 ? (nt4) menuU0 : null;
                if (nt4Var != null) {
                    nt4Var.w();
                }
                try {
                    menuU0.clear();
                    if (!callback.onCreatePanelMenu(0, menuU0) || !callback.onPreparePanel(0, null, menuU0)) {
                        menuU0.clear();
                    }
                    if (nt4Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (nt4Var != null) {
                        nt4Var.v();
                    }
                }
                break;
            case 25:
                synchronized (this) {
                    ((kw8) this.Y).Y = false;
                    break;
                }
                while (kw8.k0.poll() != null) {
                }
                boolean zIsAttachedToWindow = ((kw8) this.Y).Z.isAttachedToWindow();
                kw8 kw8Var = (kw8) this.Y;
                if (!zIsAttachedToWindow) {
                    View view = kw8Var.Z;
                    iw8 iw8Var = kw8.l0;
                    view.removeOnAttachStateChangeListener(iw8Var);
                    ((kw8) this.Y).Z.addOnAttachStateChangeListener(iw8Var);
                    return;
                }
                if (kw8Var.f0) {
                    kw8Var.f();
                    return;
                } else {
                    if (kw8Var.b()) {
                        kw8Var.f0 = true;
                        kw8Var.a();
                        kw8Var.f0 = false;
                        return;
                    }
                    return;
                }
            case 26:
                ((mw8) this.Y).o(0);
                return;
            case 27:
                ((i89) this.Y).a();
                return;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                is2 is2Var = ((i89) ((q09) this.Y).X).h;
                is2Var.c(is2Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            default:
                ((q89) this.Y).n.j(new x11(4, null, null));
                return;
        }
        while (true) {
            f28 f28Var = (f28) this.Y;
            synchronized (f28Var) {
                w18VarB = f28Var.b();
            }
            if (w18VarB == null) {
                return;
            }
            e28 e28Var = w18VarB.c;
            e28Var.getClass();
            f28 f28Var2 = (f28) this.Y;
            boolean zIsLoggable = f28.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                d28.e(w18VarB, e28Var, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                f28Var2.e(w18VarB);
                if (zIsLoggable) {
                    d28.e(w18VarB, e28Var, "finished run in ".concat(d28.d(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) f28Var2.a.X).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        d28.e(w18VarB, e28Var, "failed a run in ".concat(d28.d(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ xb(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
