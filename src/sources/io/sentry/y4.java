package io.sentry;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y4 {
    public io.sentry.protocol.w X;
    public final io.sentry.protocol.e Y;
    public io.sentry.protocol.u Z;
    public io.sentry.protocol.r f0;
    public AbstractMap g0;
    public String h0;
    public String i0;
    public String j0;
    public io.sentry.protocol.i0 k0;
    public transient Exception l0;
    public String m0;
    public String n0;
    public List o0;
    public io.sentry.protocol.f p0;
    public AbstractMap q0;

    public y4(io.sentry.protocol.w wVar) {
        this.Y = new io.sentry.protocol.e();
        this.X = wVar;
    }

    public final Throwable a() {
        Exception exc = this.l0;
        return exc instanceof io.sentry.exception.a ? ((io.sentry.exception.a) exc).Y : exc;
    }

    public final void b(String str, String str2) {
        AbstractMap map = this.g0;
        if (map == null) {
            map = new HashMap();
            this.g0 = map;
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public final void c(Map map) {
        this.g0 = map != null ? new HashMap(map) : null;
    }

    public y4() {
        this(new io.sentry.protocol.w());
    }
}
