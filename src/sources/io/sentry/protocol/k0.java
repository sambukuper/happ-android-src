package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements n2 {
    public String X;
    public String Y;
    public String Z;
    public String f0;
    public Double g0;
    public Double h0;
    public Double i0;
    public Double j0;
    public String k0;
    public Double l0;
    public List m0;
    public HashMap n0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("rendering_system");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("type");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("identifier");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("tag");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("width");
            cVar.x(this.g0);
        }
        if (this.h0 != null) {
            cVar.p("height");
            cVar.x(this.h0);
        }
        if (this.i0 != null) {
            cVar.p("x");
            cVar.x(this.i0);
        }
        if (this.j0 != null) {
            cVar.p("y");
            cVar.x(this.j0);
        }
        if (this.k0 != null) {
            cVar.p("visibility");
            cVar.y(this.k0);
        }
        if (this.l0 != null) {
            cVar.p("alpha");
            cVar.x(this.l0);
        }
        List list = this.m0;
        if (list != null && !list.isEmpty()) {
            cVar.p("children");
            cVar.v(iLogger, this.m0);
        }
        HashMap map = this.n0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.n0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
