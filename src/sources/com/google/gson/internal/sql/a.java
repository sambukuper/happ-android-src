package com.google.gson.internal.sql;

import defpackage.eg7;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final List a;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (!z) {
            a = Collections.EMPTY_LIST;
            return;
        }
        new eg7(Date.class, (byte) 0);
        new eg7(Timestamp.class, (byte) 1);
        a = Collections.unmodifiableList(Arrays.asList(SqlTimeTypeAdapter.b, SqlDateTypeAdapter.b, SqlTimestampTypeAdapter.b));
    }
}
