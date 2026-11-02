package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.Window;
import io.sentry.s5;
import io.sentry.s6;
import java.util.Collections;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j {
    public final Window.Callback Y;
    public final g Z;
    public final c f0;
    public final s6 g0;
    public volatile boolean h0;

    public h(Window.Callback callback, Activity activity, g gVar, s6 s6Var) {
        c cVar = new c(activity, gVar);
        super(callback);
        this.Y = callback;
        this.Z = gVar;
        this.g0 = s6Var;
        this.f0 = cVar;
    }

    public final void a(MotionEvent motionEvent) {
        String str;
        if (this.h0) {
            return;
        }
        c cVar = this.f0;
        int i = cVar.c;
        g gVar = cVar.a;
        io.sentry.util.a aVar = cVar.m;
        aVar.g();
        try {
            int actionMasked = motionEvent.getActionMasked();
            VelocityTracker velocityTrackerObtain = cVar.l;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = VelocityTracker.obtain();
                cVar.l = velocityTrackerObtain;
            }
            velocityTrackerObtain.addMovement(motionEvent);
            if (actionMasked == 0) {
                cVar.g = motionEvent.getX();
                float y = motionEvent.getY();
                cVar.h = y;
                cVar.i = cVar.g;
                cVar.j = y;
                cVar.e = true;
                cVar.f = false;
                MotionEvent motionEvent2 = cVar.k;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                cVar.k = MotionEvent.obtain(motionEvent);
                gVar.onDown(motionEvent);
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x - cVar.g;
                    float f2 = y2 - cVar.h;
                    if ((f2 * f2) + (f * f) > cVar.b) {
                        gVar.onScroll(cVar.k, motionEvent, cVar.i - x, cVar.j - y2);
                        cVar.e = false;
                        cVar.i = x;
                        cVar.j = y2;
                    }
                } else if (actionMasked == 3) {
                    cVar.a();
                } else if (actionMasked == 5) {
                    cVar.e = false;
                    cVar.f = true;
                }
            } else if (cVar.f) {
                cVar.a();
            } else {
                if (cVar.e) {
                    gVar.onSingleTapUp(motionEvent);
                } else {
                    int pointerId = motionEvent.getPointerId(0);
                    cVar.l.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, cVar.d);
                    float xVelocity = cVar.l.getXVelocity(pointerId);
                    float yVelocity = cVar.l.getYVelocity(pointerId);
                    float f3 = i;
                    if (Math.abs(xVelocity) > f3 || Math.abs(yVelocity) > f3) {
                        gVar.onFling(cVar.k, motionEvent, xVelocity, yVelocity);
                    }
                }
                cVar.a();
            }
            aVar.close();
            if (motionEvent.getActionMasked() == 1) {
                g gVar2 = this.Z;
                View viewB = gVar2.b("onUp");
                f fVar = gVar2.g;
                io.sentry.internal.gestures.b bVar = fVar.b;
                if (viewB == null || bVar == null) {
                    return;
                }
                e eVar = fVar.a;
                e eVar2 = e.Unknown;
                if (eVar == eVar2) {
                    gVar2.c.getLogger().h(s5.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                    return;
                }
                float x2 = motionEvent.getX() - fVar.c;
                float y3 = motionEvent.getY() - fVar.d;
                if (Math.abs(x2) > Math.abs(y3)) {
                    str = x2 > 0.0f ? "right" : "left";
                } else {
                    str = y3 > 0.0f ? "down" : "up";
                }
                gVar2.a(bVar, fVar.a, Collections.singletonMap("direction", str), motionEvent);
                gVar2.c(bVar, fVar.a);
                fVar.b = null;
                fVar.a = eVar2;
                fVar.c = 0.0f;
                fVar.d = 0.0f;
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            try {
                a(motionEventObtain);
            } catch (Throwable th) {
                s6 s6Var = this.g0;
                if (s6Var != null) {
                    try {
                        s6Var.getLogger().e(s5.ERROR, "Error dispatching touch event", th);
                    } finally {
                        motionEventObtain.recycle();
                    }
                }
            }
        }
        return this.X.dispatchTouchEvent(motionEvent);
    }
}
