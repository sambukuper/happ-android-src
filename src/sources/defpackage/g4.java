package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 {
    public Object a;

    public /* synthetic */ g4(Object obj) {
        this.a = obj;
    }

    public static g4 a(int i, boolean z, int i2, int i3, int i4) {
        return new g4(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
