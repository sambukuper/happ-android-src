package defpackage;

import android.view.View;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rb0 {
    public int a;
    public int b;

    public /* synthetic */ rb0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(l lVar) {
        View view = lVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
