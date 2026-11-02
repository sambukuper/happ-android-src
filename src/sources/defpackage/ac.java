package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gc Y;

    public /* synthetic */ ac(gc gcVar, byte b) {
        this.X = b;
        this.Y = gcVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        gc gcVar = this.Y;
        switch (b) {
            case 0:
                View view = gcVar.f0;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                wx6 wx6Var = (wx6) obj;
                if (wx6Var.Y.contains(wx6Var)) {
                    of5 snapshotObserver = gcVar.f0.getSnapshotObserver();
                    snapshotObserver.a.c(wx6Var, gcVar.O0, new p5(wx6Var, gcVar, (byte) 2));
                }
                return dn8.a;
        }
    }
}
