package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.gn2;
import defpackage.i79;
import defpackage.s91;
import defpackage.u15;
import defpackage.vg0;
import defpackage.wv0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.d0;
import io.sentry.android.replay.w;
import io.sentry.i1;
import io.sentry.p;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t6;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {
    public final s6 v;
    public final i1 w;
    public final io.sentry.transport.f x;
    public final ArrayList y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SentryAndroidOptions sentryAndroidOptions, i1 i1Var, io.sentry.transport.d dVar, io.sentry.android.replay.util.g gVar, io.sentry.android.replay.util.g gVar2) {
        super(sentryAndroidOptions, i1Var, dVar, gVar, gVar2);
        sentryAndroidOptions.getClass();
        dVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        this.v = sentryAndroidOptions;
        this.w = i1Var;
        this.x = dVar;
        this.y = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.c
    public final void a(gn2 gn2Var, boolean z) {
        s91 s91VarD;
        s6 s6Var = this.v;
        if (z) {
            this.g.set(true);
            s6Var.getLogger().h(s5.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
            return;
        }
        i1 i1Var = this.w;
        if (i1Var == null || (s91VarD = i1Var.d()) == null || !(s91VarD.k(p.All) || s91VarD.k(p.Replay))) {
            p("capture_replay", new i79(this, gn2Var, (byte) 1));
        } else {
            s6Var.getLogger().h(s5.INFO, "Replay is rate-limited, not capturing for event", new Object[0]);
            s6Var.getClientReportRecorder().a(io.sentry.clientreport.d.RATELIMIT_BACKOFF, p.Replay);
        }
    }

    @Override // io.sentry.android.replay.capture.c
    public final c b() {
        s91 s91VarD;
        if (this.g.get()) {
            this.v.getLogger().h(s5.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        i1 i1Var = this.w;
        boolean z = (i1Var == null || (s91VarD = i1Var.d()) == null || (!s91VarD.k(p.All) && !s91VarD.k(p.Replay))) ? false : true;
        s6 s6Var = this.v;
        if (z) {
            s6Var.getLogger().h(s5.DEBUG, "Not converting to session mode, because replay is rate-limited", new Object[0]);
            return this;
        }
        m mVar = new m(s6Var, this.w, this.x, this.d, this.e);
        mVar.l(f());
        mVar.n(e(), d(), t6.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.c
    public final void g(d0 d0Var) {
        p("configuration_changed", new e(this, (byte) 0));
        l(d0Var);
    }

    @Override // io.sentry.android.replay.capture.c
    public final void h(w wVar) {
        this.d.submit(new io.sentry.android.replay.util.h(new vg0(this, wVar, this.x.d(), (byte) 3), "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.c
    public final void i(MotionEvent motionEvent) {
        super.i(motionEvent);
        long jD = this.x.d() - ((long) this.v.getSessionReplay().h);
        ConcurrentLinkedDeque concurrentLinkedDeque = this.q;
        concurrentLinkedDeque.getClass();
        Iterator it = concurrentLinkedDeque.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).Y < jD) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.c
    public final void j() {
        p("pause", new e(this, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    public final void p(String str, final gn2 gn2Var) {
        final Date date;
        final d0 d0VarF = f();
        s6 s6Var = this.v;
        if (d0VarF == null) {
            s6Var.getLogger().h(s5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j = s6Var.getSessionReplay().h;
        long jD = this.x.d();
        io.sentry.android.replay.l lVar = this.h;
        if (lVar != null) {
            io.sentry.util.a aVar = lVar.g0;
            aVar.g();
            try {
                io.sentry.android.replay.m mVar = (io.sentry.android.replay.m) wv0.t0(lVar.j0);
                Long lValueOf = mVar != null ? Long.valueOf(mVar.b) : null;
                u15.h(aVar, null);
                if (lValueOf != null) {
                    date = new Date(lValueOf.longValue());
                } else {
                    date = new Date(jD - j);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(aVar, th);
                    throw th2;
                }
            }
        } else {
            date = new Date(jD - j);
        }
        final long time = jD - date.getTime();
        final io.sentry.protocol.w wVarD = d();
        this.d.submit(new io.sentry.android.replay.util.h(new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.X;
                int iE = fVar.e();
                d0 d0Var = d0VarF;
                gn2Var.B(c.c(fVar, time, date, wVarD, iE, d0Var.b, d0Var.a, d0Var.e, d0Var.f));
            }
        }, "BufferCaptureStrategy.".concat(str)));
    }
}
