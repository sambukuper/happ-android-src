package io.sentry;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public Boolean a;
    public q2 b;
    public q2 c;
    public Set d;
    public Boolean e;
    public Boolean f;
    public final io.sentry.internal.debugmeta.c g = new io.sentry.internal.debugmeta.c((byte) 2);
    public final io.sentry.internal.debugmeta.c h = new io.sentry.internal.debugmeta.c((byte) 1);

    public final boolean a() {
        if (this.a != null || this.b != null || this.c != null || this.d != null || this.e != null || this.f != null) {
            return true;
        }
        io.sentry.internal.debugmeta.c cVar = this.g;
        if (((q2) cVar.Y) != null || ((q2) cVar.Z) != null) {
            return true;
        }
        io.sentry.internal.debugmeta.c cVar2 = this.h;
        return (((Boolean) cVar2.Y) == null && ((Boolean) cVar2.Z) == null) ? false : true;
    }

    public final void b(Set set) {
        Set setUnmodifiableSet;
        if (set == null) {
            setUnmodifiableSet = null;
        } else {
            setUnmodifiableSet = set.isEmpty() ? Collections.EMPTY_SET : Collections.unmodifiableSet(EnumSet.copyOf((Collection) set));
        }
        this.d = setUnmodifiableSet;
    }
}
