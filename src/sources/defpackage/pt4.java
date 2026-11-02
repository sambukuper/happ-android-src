package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pt4 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, hu4 {
    public nt4 X;
    public c8 Y;
    public nb4 Z;

    @Override // defpackage.hu4
    public final boolean N(nt4 nt4Var) {
        return false;
    }

    @Override // defpackage.hu4
    public final void b(nt4 nt4Var, boolean z) {
        c8 c8Var;
        if ((z || nt4Var == this.X) && (c8Var = this.Y) != null) {
            c8Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        nt4 nt4Var = this.X;
        nb4 nb4Var = this.Z;
        mb4 mb4Var = nb4Var.i0;
        if (mb4Var == null) {
            mb4Var = new mb4(nb4Var);
            nb4Var.i0 = mb4Var;
        }
        nt4Var.q(mb4Var.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.Z.b(this.X, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        nt4 nt4Var = this.X;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.Y.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.Y.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                nt4Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return nt4Var.performShortcut(i, keyEvent, 0);
    }
}
