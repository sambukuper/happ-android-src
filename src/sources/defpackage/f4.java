package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 implements v06, o75 {
    public Object X;

    public /* synthetic */ f4(Object obj) {
        this.X = obj;
    }

    public static f4 a(int i, int i2, int i3) {
        return new f4(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    @Override // defpackage.v06
    public Object get() {
        return this.X;
    }

    @Override // defpackage.o75
    public String k0() {
        return "attempted to overwrite the existing value '" + this.X + '\'';
    }
}
