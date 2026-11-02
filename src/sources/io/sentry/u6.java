package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 extends y4 implements n2 {
    public HashMap C0;
    public File r0;
    public int v0;
    public Date x0;
    public io.sentry.protocol.w u0 = new io.sentry.protocol.w();
    public String s0 = "replay_event";
    public t6 t0 = t6.SESSION;
    public List z0 = new ArrayList();
    public List A0 = new ArrayList();
    public List B0 = new ArrayList();
    public List y0 = new ArrayList();
    public Date w0 = new Date();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u6.class != obj.getClass()) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return this.v0 == u6Var.v0 && io.sentry.util.b.i(this.s0, u6Var.s0) && this.t0 == u6Var.t0 && io.sentry.util.b.i(this.u0, u6Var.u0) && io.sentry.util.b.i(this.y0, u6Var.y0) && io.sentry.util.b.i(this.z0, u6Var.z0) && io.sentry.util.b.i(this.A0, u6Var.A0) && io.sentry.util.b.i(this.B0, u6Var.B0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.s0, this.t0, this.u0, Integer.valueOf(this.v0), this.y0, this.z0, this.A0, this.B0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("type");
        cVar.y(this.s0);
        cVar.p("replay_type");
        cVar.v(iLogger, this.t0);
        cVar.p("segment_id");
        cVar.u(this.v0);
        cVar.p("timestamp");
        cVar.v(iLogger, this.w0);
        if (this.u0 != null) {
            cVar.p("replay_id");
            cVar.v(iLogger, this.u0);
        }
        if (this.x0 != null) {
            cVar.p("replay_start_timestamp");
            cVar.v(iLogger, this.x0);
        }
        if (this.y0 != null) {
            cVar.p("urls");
            cVar.v(iLogger, this.y0);
        }
        if (this.z0 != null) {
            cVar.p("error_ids");
            cVar.v(iLogger, this.z0);
        }
        if (this.A0 != null) {
            cVar.p("trace_ids");
            cVar.v(iLogger, this.A0);
        }
        if (this.B0 != null) {
            cVar.p("segment_names");
            cVar.v(iLogger, this.B0);
        }
        io.sentry.config.a.s(this, cVar, iLogger);
        HashMap map = this.C0;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.C0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
