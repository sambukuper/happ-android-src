package io.sentry.android.replay.capture;

import defpackage.gn2;
import defpackage.i79;
import defpackage.ix0;
import defpackage.j78;
import defpackage.ug0;
import io.sentry.android.replay.d0;
import io.sentry.android.replay.w;
import io.sentry.c2;
import io.sentry.i1;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t6;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends c {
    public final s6 v;
    public final i1 w;
    public final io.sentry.transport.f x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s6 s6Var, i1 i1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        super(s6Var, i1Var, fVar, scheduledExecutorService, scheduledExecutorService2);
        s6Var.getClass();
        fVar.getClass();
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        this.v = s6Var;
        this.w = i1Var;
        this.x = fVar;
    }

    @Override // io.sentry.android.replay.capture.c
    public final void a(gn2 gn2Var, boolean z) {
        s6 s6Var = this.v;
        if (s6Var.getSessionReplay().m) {
            s6Var.getLogger().h(s5.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.g.set(z);
    }

    @Override // io.sentry.android.replay.capture.c
    public final void g(d0 d0Var) {
        p("onConfigurationChanged", new l(this, (byte) 0));
        l(d0Var);
    }

    @Override // io.sentry.android.replay.capture.c
    public final void h(w wVar) {
        this.d.submit(new io.sentry.android.replay.util.h(new ix0(this, wVar, this.x.d(), f(), (byte) 2), "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.c
    public final void j() {
        p("pause", new l(this, (byte) 1));
    }

    @Override // io.sentry.android.replay.capture.c
    public final void n(int i, io.sentry.protocol.w wVar, t6 t6Var) {
        wVar.getClass();
        super.n(i, wVar, t6Var);
        i1 i1Var = this.w;
        if (i1Var != null) {
            i1Var.o(new j78(this, (byte) 22));
        }
    }

    @Override // io.sentry.android.replay.capture.c
    public final void o() {
        io.sentry.android.replay.l lVar = this.h;
        p("stop", new i79(this, lVar != null ? lVar.m() : null, (byte) 2));
        i1 i1Var = this.w;
        if (i1Var != null) {
            i1Var.o(new c2((byte) 27));
        }
        this.d.submit(new io.sentry.android.replay.util.h(new io.sentry.android.core.internal.modules.a((Object) this, (byte) 4), "CaptureStrategy.stop"));
    }

    public final void p(String str, gn2 gn2Var) {
        d0 d0VarF = f();
        if (d0VarF == null) {
            this.v.getLogger().h(s5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long jD = this.x.d();
        io.sentry.protocol.w wVarD = d();
        this.d.submit(new io.sentry.android.replay.util.h(new ug0(this, jD, wVarD, d0VarF, gn2Var), "SessionCaptureStrategy.".concat(str)));
    }
}
