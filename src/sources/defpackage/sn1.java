package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class sn1 extends qk2 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler d1;
    public boolean m1;
    public Dialog o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public final xb e1 = new xb(this, 4);
    public final on1 f1 = new on1(this);
    public final pn1 g1 = new pn1(this);
    public int h1 = 0;
    public int i1 = 0;
    public boolean j1 = true;
    public boolean k1 = true;
    public int l1 = -1;
    public final qn1 n1 = new qn1(this);
    public boolean s1 = false;

    @Override // defpackage.qk2
    public final void A() {
        this.H0 = true;
        Dialog dialog = this.o1;
        if (dialog != null) {
            this.p1 = true;
            dialog.setOnDismissListener(null);
            this.o1.dismiss();
            if (!this.q1) {
                onDismiss(this.o1);
            }
            this.o1 = null;
            this.s1 = false;
        }
    }

    @Override // defpackage.qk2
    public final void B() {
        this.H0 = true;
        if (!this.r1 && !this.q1) {
            this.q1 = true;
        }
        this.V0.i(this.n1);
    }

    @Override // defpackage.qk2
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater layoutInflaterC = super.C(bundle);
        boolean z = this.k1;
        if (z && !this.m1) {
            if (z && !this.s1) {
                try {
                    this.m1 = true;
                    Dialog dialogT = T(bundle);
                    this.o1 = dialogT;
                    if (this.k1) {
                        W(dialogT, this.h1);
                        Context contextK = k();
                        if (contextK != null) {
                            this.o1.setOwnerActivity((Activity) contextK);
                        }
                        this.o1.setCancelable(this.j1);
                        this.o1.setOnCancelListener(this.f1);
                        this.o1.setOnDismissListener(this.g1);
                        this.s1 = true;
                    } else {
                        this.o1 = null;
                    }
                    this.m1 = false;
                } catch (Throwable th) {
                    this.m1 = false;
                    throw th;
                }
            }
            if (ml2.K(2)) {
                toString();
            }
            Dialog dialog = this.o1;
            if (dialog != null) {
                return layoutInflaterC.cloneInContext(dialog.getContext());
            }
        } else if (ml2.K(2)) {
            toString();
        }
        return layoutInflaterC;
    }

    @Override // defpackage.qk2
    public void F(Bundle bundle) {
        Dialog dialog = this.o1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.h1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.i1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.j1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.k1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.l1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.qk2
    public void G() {
        this.H0 = true;
        Dialog dialog = this.o1;
        if (dialog != null) {
            this.p1 = false;
            dialog.show();
            View decorView = this.o1.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(v36.view_tree_lifecycle_owner, this);
            decorView.setTag(w36.view_tree_view_model_store_owner, this);
            decorView.setTag(z36.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.qk2
    public void H() {
        this.H0 = true;
        Dialog dialog = this.o1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.qk2
    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.H0 = true;
        if (this.o1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o1.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.qk2
    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.J0 != null || this.o1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o1.onRestoreInstanceState(bundle2);
    }

    public final void R(boolean z, boolean z2) {
        if (this.q1) {
            return;
        }
        this.q1 = true;
        this.r1 = false;
        Dialog dialog = this.o1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.o1.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.d1.getLooper()) {
                    onDismiss(this.o1);
                } else {
                    this.d1.post(this.e1);
                }
            }
        }
        this.p1 = true;
        if (this.l1 >= 0) {
            ml2 ml2VarN = n();
            int i = this.l1;
            if (i < 0) {
                bt.q(pc6.j(i, "Bad id: "));
                return;
            } else {
                ml2VarN.y(new kl2(ml2VarN, i), z);
                this.l1 = -1;
                return;
            }
        }
        r00 r00Var = new r00(n());
        r00Var.o = true;
        r00Var.i(this);
        if (z) {
            r00Var.f(true, true);
        } else {
            r00Var.e();
        }
    }

    public int S() {
        return this.i1;
    }

    public Dialog T(Bundle bundle) {
        if (ml2.K(3)) {
            toString();
        }
        return new py0(N(), S());
    }

    public final Dialog U() {
        Dialog dialog = this.o1;
        if (dialog != null) {
            return dialog;
        }
        b61.k("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    public final void V() {
        if (ml2.K(2)) {
            toString();
        }
        this.h1 = 2;
        this.i1 = R.style.Theme.Panel;
    }

    public void W(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void X(ml2 ml2Var, String str) {
        this.q1 = false;
        this.r1 = true;
        ml2Var.getClass();
        r00 r00Var = new r00(ml2Var);
        r00Var.o = true;
        r00Var.g(0, this, str, 1);
        r00Var.e();
    }

    @Override // defpackage.qk2
    public final vj8 a() {
        return new rn1(this, new mk2(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.p1) {
            return;
        }
        if (ml2.K(3)) {
            toString();
        }
        R(true, true);
    }

    @Override // defpackage.qk2
    public final void v() {
        this.H0 = true;
    }

    @Override // defpackage.qk2
    public void x(Context context) {
        super.x(context);
        this.V0.f(this.n1);
        if (this.r1) {
            return;
        }
        this.q1 = false;
    }

    @Override // defpackage.qk2
    public void y(Bundle bundle) {
        super.y(bundle);
        this.d1 = new Handler();
        this.k1 = this.A0 == 0;
        if (bundle != null) {
            this.h1 = bundle.getInt("android:style", 0);
            this.i1 = bundle.getInt("android:theme", 0);
            this.j1 = bundle.getBoolean("android:cancelable", true);
            this.k1 = bundle.getBoolean("android:showsDialog", this.k1);
            this.l1 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
