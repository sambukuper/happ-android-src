package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hq implements nq, DialogInterface.OnClickListener {
    public c8 X;
    public iq Y;
    public CharSequence Z;
    public final /* synthetic */ AppCompatSpinner f0;

    public hq(AppCompatSpinner appCompatSpinner) {
        this.f0 = appCompatSpinner;
    }

    @Override // defpackage.nq
    public final boolean a() {
        c8 c8Var = this.X;
        if (c8Var != null) {
            return c8Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.nq
    public final int b() {
        return 0;
    }

    @Override // defpackage.nq
    public final void dismiss() {
        c8 c8Var = this.X;
        if (c8Var != null) {
            c8Var.dismiss();
            this.X = null;
        }
    }

    @Override // defpackage.nq
    public final CharSequence e() {
        return this.Z;
    }

    @Override // defpackage.nq
    public final Drawable g() {
        return null;
    }

    @Override // defpackage.nq
    public final void h(CharSequence charSequence) {
        this.Z = charSequence;
    }

    @Override // defpackage.nq
    public final void n(int i, int i2) {
        if (this.Y == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f0;
        b8 b8Var = new b8(appCompatSpinner.getPopupContext());
        x7 x7Var = (x7) b8Var.c;
        CharSequence charSequence = this.Z;
        if (charSequence != null) {
            x7Var.f = charSequence;
        }
        iq iqVar = this.Y;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        x7Var.j = iqVar;
        x7Var.k = this;
        x7Var.a = selectedItemPosition;
        x7Var.b = true;
        c8 c8VarD = b8Var.d();
        this.X = c8VarD;
        AlertController$RecycleListView alertController$RecycleListView = c8VarD.i0.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.X.show();
    }

    @Override // defpackage.nq
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.f0;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.Y.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.nq
    public final void p(ListAdapter listAdapter) {
        this.Y = (iq) listAdapter;
    }

    @Override // defpackage.nq
    public final void d(int i) {
    }

    @Override // defpackage.nq
    public final void i(Drawable drawable) {
    }

    @Override // defpackage.nq
    public final void l(int i) {
    }

    @Override // defpackage.nq
    public final void m(int i) {
    }
}
