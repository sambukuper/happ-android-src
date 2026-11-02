package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import defpackage.j78;
import defpackage.jn0;
import defpackage.oi0;
import defpackage.pc6;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.i1;
import io.sentry.j7;
import io.sentry.n0;
import io.sentry.n7;
import io.sentry.o7;
import io.sentry.protocol.h0;
import io.sentry.s1;
import io.sentry.s5;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements GestureDetector.OnGestureListener {
    public final WeakReference a;
    public final i1 b;
    public final SentryAndroidOptions c;
    public io.sentry.internal.gestures.b d = null;
    public s1 e = null;
    public e f;
    public final f g;

    public g(Activity activity, i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
        e eVar = e.Unknown;
        this.f = eVar;
        f fVar = new f();
        fVar.a = eVar;
        fVar.c = 0.0f;
        fVar.d = 0.0f;
        this.g = fVar;
        this.a = new WeakReference(activity);
        this.b = i1Var;
        this.c = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.b bVar, e eVar, Map map, MotionEvent motionEvent) {
        String str;
        if (this.c.isEnableUserInteractionBreadcrumbs()) {
            int i = d.a[eVar.ordinal()];
            if (i == 1) {
                str = "click";
            } else if (i != 2) {
                str = i != 3 ? "unknown" : "swipe";
            } else {
                str = "scroll";
            }
            n0 n0Var = new n0();
            n0Var.d(motionEvent, "android:motionEvent");
            n0Var.d(bVar.a.get(), "android:view");
            String str2 = bVar.c;
            String str3 = bVar.b;
            io.sentry.g gVar = new io.sentry.g();
            gVar.g0 = "user";
            gVar.i0 = "ui.".concat(str);
            gVar.d(str2, "view.id");
            if (str3 != null) {
                gVar.d(str3, "view.class");
            }
            for (Map.Entry entry : map.entrySet()) {
                gVar.d(entry.getValue(), (String) entry.getKey());
            }
            gVar.k0 = s5.INFO;
            this.b.a(gVar, n0Var);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.a.get();
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, pc6.p("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, pc6.p("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            return viewPeekDecorView;
        }
        sentryAndroidOptions.getLogger().h(s5.DEBUG, pc6.p("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.b bVar, e eVar) {
        String str;
        boolean z = eVar == e.Click || !(eVar == this.f && bVar.equals(this.d));
        SentryAndroidOptions sentryAndroidOptions = this.c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        i1 i1Var = this.b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    i1Var.o(new io.sentry.util.c());
                }
                this.d = bVar;
                this.f = eVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str2 = bVar.c;
        s1 s1Var = this.e;
        if (s1Var != null) {
            if (!z && !s1Var.e()) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, pc6.p("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.e.q();
                    return;
                }
                return;
            }
            d(j7.OK);
        }
        s1[] s1VarArr = {null};
        i1Var.o(new j78(s1VarArr, (byte) 19));
        if (s1VarArr[0] != null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Transaction won't be created for view with id: %s since there's already a transaction bound to the Scope.", str2);
            return;
        }
        String strP = oi0.p(new StringBuilder(activity.getClass().getSimpleName()), ".", str2);
        int i = d.a[eVar.ordinal()];
        if (i == 1) {
            str = "click";
        } else if (i != 2) {
            str = i != 3 ? "unknown" : "swipe";
        } else {
            str = "scroll";
        }
        String strConcat = "ui.action.".concat(str);
        o7 o7Var = new o7();
        o7Var.f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        o7Var.h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        o7Var.g = sentryAndroidOptions.getIdleTimeout();
        o7Var.c = true;
        o7Var.d = "auto.ui.gesture_listener.old_view_system";
        s1 s1VarM = i1Var.m(new n7(strP, h0.COMPONENT, strConcat, null), o7Var);
        i1Var.o(new jn0(this, s1VarM, (byte) 24));
        this.e = s1VarM;
        this.d = bVar;
        this.f = eVar;
    }

    public final void d(j7 j7Var) {
        s1 s1Var = this.e;
        if (s1Var != null) {
            j7 j7VarT = s1Var.t();
            s1 s1Var2 = this.e;
            if (j7VarT == null) {
                s1Var2.h(j7Var);
            } else {
                s1Var2.i();
            }
        }
        this.b.o(new j78(this, (byte) 18));
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = e.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        f fVar = this.g;
        fVar.b = null;
        fVar.a = e.Unknown;
        fVar.c = 0.0f;
        fVar.d = 0.0f;
        fVar.c = motionEvent.getX();
        fVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.g.a = e.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            f fVar = this.g;
            if (fVar.a == e.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.c;
                io.sentry.internal.gestures.b bVarD = io.sentry.config.a.d(sentryAndroidOptions, viewB, x, y, aVar);
                if (bVarD == null) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    fVar.a = e.Scroll;
                    return false;
                }
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Scroll target found: ".concat(bVarD.c), new Object[0]);
                fVar.b = bVarD;
                fVar.a = e.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            io.sentry.internal.gestures.b bVarD = io.sentry.config.a.d(sentryAndroidOptions, viewB, x, y, aVar);
            if (bVarD == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            e eVar = e.Click;
            a(bVarD, eVar, Collections.EMPTY_MAP, motionEvent);
            c(bVarD, eVar);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
