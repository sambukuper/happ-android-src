package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n2 {
    public String X;
    public String Y;
    public String Z;
    public Boolean f0;
    public AbstractMap g0;
    public AbstractMap h0;
    public Boolean i0;
    public Integer j0;
    public Integer k0;
    public Boolean l0;
    public HashMap m0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("type");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("description");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("help_link");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("handled");
            cVar.w(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("meta");
            cVar.v(iLogger, this.g0);
        }
        if (this.h0 != null) {
            cVar.p("data");
            cVar.v(iLogger, this.h0);
        }
        if (this.i0 != null) {
            cVar.p("synthetic");
            cVar.w(this.i0);
        }
        if (this.j0 != null) {
            cVar.p("exception_id");
            cVar.v(iLogger, this.j0);
        }
        if (this.k0 != null) {
            cVar.p("parent_id");
            cVar.v(iLogger, this.k0);
        }
        if (this.l0 != null) {
            cVar.p("is_exception_group");
            cVar.w(this.l0);
        }
        HashMap map = this.m0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.m0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
