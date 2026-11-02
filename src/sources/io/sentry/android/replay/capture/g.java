package io.sentry.android.replay.capture;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((io.sentry.rrweb.b) obj).Y).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).Y));
    }
}
