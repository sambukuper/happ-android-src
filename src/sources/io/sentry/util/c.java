package io.sentry.util;

import defpackage.j78;
import io.sentry.g1;
import io.sentry.l4;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l4 {
    public static /* synthetic */ void a(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void b(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // io.sentry.l4
    public void h(g1 g1Var) {
        g1Var.B(new j78(g1Var, (byte) 26));
    }
}
