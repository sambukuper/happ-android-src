package androidx.leanback.widget;

import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((StreamingTextView) obj).getStreamPosition());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((StreamingTextView) obj).setStreamPosition(((Integer) obj2).intValue());
    }
}
