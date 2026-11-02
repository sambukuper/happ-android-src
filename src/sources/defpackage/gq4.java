package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gq4 extends ArrayAdapter {
    public ColorStateList X;
    public ColorStateList Y;
    public final /* synthetic */ MaterialAutoCompleteTextView Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq4(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.Z = materialAutoCompleteTextView;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.Z;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.r0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.Y = colorStateList;
        if (materialAutoCompleteTextView.q0 != 0 && materialAutoCompleteTextView.r0 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{qw0.b(materialAutoCompleteTextView.r0.getColorForState(iArr3, 0), materialAutoCompleteTextView.q0), qw0.b(materialAutoCompleteTextView.r0.getColorForState(iArr2, 0), materialAutoCompleteTextView.q0), materialAutoCompleteTextView.q0});
        }
        this.X = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.Z;
            Drawable drawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.q0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.q0);
                if (this.Y != null) {
                    colorDrawable.setTintList(this.X);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.Y, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableF = FocusRingDrawable.f(getContext(), rippleDrawable, null);
                    if (focusRingDrawableF != null) {
                        focusRingDrawableF.q0.x = materialAutoCompleteTextView.l0;
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
