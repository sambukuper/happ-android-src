package io.sentry.android.replay.util;

import android.os.Build;
import defpackage.b61;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static String a(i iVar) {
        String str;
        iVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i = j.a[iVar.ordinal()];
        if (i == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i != 2) {
                b61.c();
                return null;
            }
            str = Build.SOC_MANUFACTURER;
        }
        str.getClass();
        return str;
    }
}
