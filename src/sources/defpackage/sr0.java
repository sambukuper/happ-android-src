package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 extends j62 {
    public final /* synthetic */ Chip s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(Chip chip, Chip chip2) {
        super(chip2);
        this.s0 = chip;
    }

    @Override // defpackage.j62
    public final int n(float f, float f2) {
        int i = Chip.B0;
        Chip chip = this.s0;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.j62
    public final void o(ArrayList arrayList) {
        ur0 ur0Var;
        arrayList.add(0);
        int i = Chip.B0;
        Chip chip = this.s0;
        if (!chip.d() || (ur0Var = chip.j0) == null || !ur0Var.V0 || chip.m0 == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // defpackage.j62
    public final boolean r(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.s0;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.m0;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.x0) {
                    chip.w0.w(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.j62
    public final void s(h4 h4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = h4Var.a;
        Chip chip = this.s0;
        ur0 ur0Var = chip.j0;
        accessibilityNodeInfo.setCheckable(ur0Var != null && ur0Var.b1);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        h4Var.m(chip.getAccessibilityClassName());
        h4Var.x(chip.getText());
    }

    @Override // defpackage.j62
    public final void t(int i, h4 h4Var) {
        CharSequence charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        if (i != 1) {
            h4Var.p(_UrlKt.FRAGMENT_ENCODE_SET);
            h4Var.k(Chip.C0);
            return;
        }
        Chip chip = this.s0;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            h4Var.p(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            int i2 = h56.mtrl_chip_close_icon_content_description;
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            h4Var.p(context.getString(i2, charSequence).trim());
        }
        h4Var.k(chip.getCloseIconTouchBoundsInt());
        h4Var.b(a4.g);
        h4Var.a.setEnabled(chip.isEnabled());
        h4Var.m(Button.class.getName());
    }

    @Override // defpackage.j62
    public final void u(int i, boolean z) {
        Chip chip = this.s0;
        if (i == 1) {
            chip.r0 = z;
        }
        ur0 ur0Var = chip.j0;
        boolean z2 = chip.r0;
        boolean zD0 = false;
        if (ur0Var.W0 != null) {
            zD0 = ur0Var.d0(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : ur0.Q1);
        }
        if (zD0) {
            chip.refreshDrawableState();
        }
    }
}
