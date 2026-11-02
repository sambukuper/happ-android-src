package com.google.gson.internal.bind;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$27 extends TypeAdapters$IntegerFieldsTypeAdapter<Calendar> {
    @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
    public final Object d(long[] jArr) {
        return new GregorianCalendar(b.g(jArr[0]), b.g(jArr[1]), b.g(jArr[2]), b.g(jArr[3]), b.g(jArr[4]), b.g(jArr[5]));
    }

    @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
    public final long[] e(Object obj) {
        Calendar calendar = (Calendar) obj;
        return new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
    }
}
