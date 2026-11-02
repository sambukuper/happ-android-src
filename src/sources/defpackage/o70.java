package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o70 extends k70 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ o70(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // defpackage.k70
    public final void b(View view) {
        byte b = this.a;
    }

    @Override // defpackage.k70
    public final void c(View view, int i) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                if (i == 5) {
                    ((q70) callback).cancel();
                }
                break;
            default:
                int i2 = BottomSheetDragHandleView.s0;
                ((BottomSheetDragHandleView) callback).d(i);
                break;
        }
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
