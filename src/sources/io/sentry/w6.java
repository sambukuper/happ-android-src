package io.sentry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w6 extends defpackage.v3 {
    public static final List u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public volatile boolean c;
    public Double d;
    public Double e;
    public v6 f;
    public boolean g;
    public short h;
    public short i;
    public int j;
    public boolean k;
    public io.sentry.protocol.u l;
    public boolean m;
    public q4 n;
    public boolean o;
    public List p;
    public List q;
    public boolean r;
    public List s;
    public List t;

    public final void A(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void B(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.t = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void C(Double d) {
        if (io.sentry.util.b.n(d, true)) {
            this.e = d;
        } else {
            c2.j("The value ", d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
    }

    public final void D(Double d) {
        if (io.sentry.util.b.n(d, true)) {
            this.d = d;
        } else {
            c2.j("The value ", d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
    }

    @Override // defpackage.v3
    public final void s(boolean z) {
        if (!z) {
            w();
        }
        super.s(z);
    }

    @Override // defpackage.v3
    public final void t(boolean z) {
        if (!z) {
            w();
        }
        super.t(z);
    }

    @Override // defpackage.v3
    public final void w() {
        if (this.c) {
            return;
        }
        this.c = true;
        io.sentry.util.b.a("ReplayCustomMasking");
    }

    public final void y(ArrayList arrayList) {
        this.p = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void z(ArrayList arrayList) {
        this.q = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
