package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum o38 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(R.string.cut, R.attr.actionModeCutDrawable, w79.c),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(R.string.copy, R.attr.actionModeCopyDrawable, w79.d),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(R.string.paste, R.attr.actionModePasteDrawable, w79.e),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(R.string.selectAll, R.attr.actionModeSelectAllDrawable, w79.f),
    Autofill(Build.VERSION.SDK_INT <= 26 ? z46.androidx_compose_foundation_autofill : R.string.autofill, 0, w79.g);

    public final Object X;
    public final int Y;
    public final int Z;

    o38(int i, int i2, Object obj) {
        this.X = obj;
        this.Y = i;
        this.Z = i2;
    }
}
