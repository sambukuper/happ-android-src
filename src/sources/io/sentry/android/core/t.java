package io.sentry.android.core;

import defpackage.oi0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final long a;
    public final long b;
    public final Object c;

    public t(List list) {
        this.c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io.sentry.android.core.anr.g gVar = (io.sentry.android.core.anr.g) it.next();
            if (gVar != null) {
                ((ArrayList) this.c).add(gVar);
            }
        }
        Collections.sort((ArrayList) this.c);
        if (((ArrayList) this.c).isEmpty()) {
            this.a = 0L;
            this.b = 0L;
        } else {
            this.a = ((io.sentry.android.core.anr.g) ((ArrayList) this.c).get(0)).Y;
            this.b = ((io.sentry.android.core.anr.g) oi0.h(1, (ArrayList) this.c)).Y + 10000;
        }
    }

    public t(long j, long j2, Date date) {
        this.a = j;
        this.b = j2;
        this.c = date;
    }
}
