package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class io1 extends d8 {
    public final Bitmap A1;
    public final dn2 B1;
    public fc8 C1;
    public final ho1 z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public io1(ho1 ho1Var, Bitmap bitmap, dn2 dn2Var) {
        super(t46.fragment_binding_dialog, 34, 17, Integer.valueOf(p56.WrapContentDialog));
        this.z1 = ho1Var;
        this.A1 = bitmap;
        this.B1 = dn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G() {
        CharSequence string;
        CharSequence string2;
        Context contextK;
        Resources resources;
        Context contextK2;
        Resources resources2;
        Window window;
        super.G();
        Dialog dialog = ((sn1) this).o1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -2;
            attributes.width = -2;
            window.setAttributes(attributes);
        }
        Dialog dialog2 = ((sn1) this).o1;
        final byte b = 1;
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
        int iOrdinal = this.z1.ordinal();
        final byte b2 = 0;
        CharSequence charSequence = "";
        if (iOrdinal == 0) {
            fc8 fc8Var = this.C1;
            if (fc8Var == null) {
                dh3.T("binding");
                throw null;
            }
            ((ConstraintLayout) fc8Var.f0).setVisibility(8);
            fc8 fc8Var2 = this.C1;
            if (fc8Var2 == null) {
                dh3.T("binding");
                throw null;
            }
            ((ConstraintLayout) fc8Var2.g0).setVisibility(0);
            fc8 fc8Var3 = this.C1;
            if (fc8Var3 == null) {
                dh3.T("binding");
                throw null;
            }
            AppCompatTextView appCompatTextView = (HappTextView) fc8Var3.j0;
            Context contextK3 = k();
            if (contextK3 != null && (string = contextK3.getString(y46.toast_success)) != null) {
                charSequence = string;
            }
            appCompatTextView.setText(charSequence);
            return;
        }
        if (iOrdinal == 1) {
            fc8 fc8Var4 = this.C1;
            if (fc8Var4 == null) {
                dh3.T("binding");
                throw null;
            }
            ((ConstraintLayout) fc8Var4.f0).setVisibility(8);
            fc8 fc8Var5 = this.C1;
            if (fc8Var5 == null) {
                dh3.T("binding");
                throw null;
            }
            ((ConstraintLayout) fc8Var5.g0).setVisibility(0);
            fc8 fc8Var6 = this.C1;
            if (fc8Var6 == null) {
                dh3.T("binding");
                throw null;
            }
            AppCompatTextView appCompatTextView2 = (HappTextView) fc8Var6.j0;
            Context contextK4 = k();
            if (contextK4 != null && (string2 = contextK4.getString(y46.toast_failure)) != null) {
                charSequence = string2;
            }
            appCompatTextView2.setText(charSequence);
            return;
        }
        Bitmap bitmap = this.A1;
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                b61.c();
                return;
            }
            fc8 fc8Var7 = this.C1;
            if (fc8Var7 == null) {
                dh3.T("binding");
                throw null;
            }
            ((ConstraintLayout) fc8Var7.f0).setVisibility(0);
            fc8 fc8Var8 = this.C1;
            if (fc8Var8 == null) {
                dh3.T("binding");
                throw null;
            }
            ((ConstraintLayout) fc8Var8.g0).setVisibility(8);
            fc8 fc8Var9 = this.C1;
            if (fc8Var9 == null) {
                dh3.T("binding");
                throw null;
            }
            ((AppCompatImageView) fc8Var9.h0).setOnClickListener(new View.OnClickListener(this) { // from class: fo1
                public final /* synthetic */ io1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    io1 io1Var = this.Y;
                    switch (b3) {
                        case 0:
                            io1Var.B1.invoke();
                            io1Var.R(false, false);
                            break;
                        default:
                            io1Var.B1.invoke();
                            io1Var.R(false, false);
                            break;
                    }
                }
            });
            if (bitmap == null || (contextK2 = k()) == null || (resources2 = contextK2.getResources()) == null) {
                return;
            }
            float fApplyDimension = TypedValue.applyDimension(1, 10.0f, resources2.getDisplayMetrics());
            hm6 hm6Var = new hm6(resources2, bitmap);
            hm6Var.a(fApplyDimension);
            fc8 fc8Var10 = this.C1;
            if (fc8Var10 == null) {
                dh3.T("binding");
                throw null;
            }
            ((AppCompatImageView) fc8Var10.Z).setImageDrawable(hm6Var);
            fc8 fc8Var11 = this.C1;
            if (fc8Var11 != null) {
                ((AppCompatImageView) fc8Var11.i0).setVisibility(8);
                return;
            } else {
                dh3.T("binding");
                throw null;
            }
        }
        fc8 fc8Var12 = this.C1;
        if (fc8Var12 == null) {
            dh3.T("binding");
            throw null;
        }
        ((ConstraintLayout) fc8Var12.f0).setVisibility(0);
        fc8 fc8Var13 = this.C1;
        if (fc8Var13 == null) {
            dh3.T("binding");
            throw null;
        }
        ((ConstraintLayout) fc8Var13.g0).setVisibility(8);
        fc8 fc8Var14 = this.C1;
        if (fc8Var14 == null) {
            dh3.T("binding");
            throw null;
        }
        ((AppCompatImageView) fc8Var14.h0).setOnClickListener(new View.OnClickListener(this) { // from class: fo1
            public final /* synthetic */ io1 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                io1 io1Var = this.Y;
                switch (b3) {
                    case 0:
                        io1Var.B1.invoke();
                        io1Var.R(false, false);
                        break;
                    default:
                        io1Var.B1.invoke();
                        io1Var.R(false, false);
                        break;
                }
            }
        });
        if (bitmap == null || (contextK = k()) == null || (resources = contextK.getResources()) == null) {
            return;
        }
        float fApplyDimension2 = TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        hm6 hm6Var2 = new hm6(resources, bitmap);
        hm6Var2.a(fApplyDimension2);
        fc8 fc8Var15 = this.C1;
        if (fc8Var15 == null) {
            dh3.T("binding");
            throw null;
        }
        ((AppCompatImageView) fc8Var15.Z).setImageDrawable(hm6Var2);
        fc8 fc8Var16 = this.C1;
        if (fc8Var16 == null) {
            dh3.T("binding");
            throw null;
        }
        ((AppCompatImageView) fc8Var16.i0).setVisibility(0);
        fc8 fc8Var17 = this.C1;
        if (fc8Var17 != null) {
            ((AppCompatImageView) fc8Var17.i0).setOnClickListener(new go1(this, hm6Var2, (byte) 0));
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Dialog T(Bundle bundle) {
        ConstraintLayout constraintLayoutB;
        ConstraintLayout constraintLayoutB2;
        AppCompatImageView appCompatImageViewB;
        AppCompatImageView appCompatImageViewB2;
        Dialog dialogT = super.T(bundle);
        CardView cardViewInflate = l().inflate(t46.fragment_dialog_subscription_share, (ViewGroup) null, false);
        int i = e46.dialog_share_qr_content;
        AppCompatImageView appCompatImageViewB3 = ln7.b(cardViewInflate, i);
        if (appCompatImageViewB3 != null && (constraintLayoutB = ln7.b(cardViewInflate, (i = e46.dialog_share_qr_main))) != null && (constraintLayoutB2 = ln7.b(cardViewInflate, (i = e46.dialog_state))) != null && (appCompatImageViewB = ln7.b(cardViewInflate, (i = e46.dialog_state_close))) != null) {
            i = e46.dialog_state_image;
            if (ln7.b(cardViewInflate, i) != null && (appCompatImageViewB2 = ln7.b(cardViewInflate, (i = e46.dialog_state_share))) != null) {
                i = e46.dialog_state_text;
                HappTextView happTextView = (HappTextView) ln7.b(cardViewInflate, i);
                if (happTextView != null) {
                    this.C1 = new fc8(cardViewInflate, appCompatImageViewB3, constraintLayoutB, constraintLayoutB2, appCompatImageViewB, appCompatImageViewB2, happTextView);
                    FrameLayout frameLayout = (FrameLayout) Y().findViewById(e46.frame);
                    fc8 fc8Var = this.C1;
                    if (fc8Var != null) {
                        frameLayout.addView((CardView) fc8Var.Y);
                        return dialogT;
                    }
                    dh3.T("binding");
                    throw null;
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(cardViewInflate.getResources().getResourceName(i)));
        return null;
    }
}
