package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import defpackage.f66;
import defpackage.hw7;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class ResizingTextView extends TextView {
    public final int f0;
    public final int g0;
    public final boolean h0;
    public final int i0;
    public final int j0;
    public boolean k0;
    public int l0;
    public float m0;
    public int n0;
    public int o0;

    public ResizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66.lbResizingTextView, i, 0);
        try {
            this.f0 = typedArrayObtainStyledAttributes.getInt(f66.lbResizingTextView_resizeTrigger, 1);
            this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(f66.lbResizingTextView_resizedTextSize, -1);
            this.h0 = typedArrayObtainStyledAttributes.getBoolean(f66.lbResizingTextView_maintainLineSpacing, false);
            this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f66.lbResizingTextView_resizedPaddingAdjustmentTop, 0);
            this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f66.lbResizingTextView_resizedPaddingAdjustmentBottom, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i, int i2) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i, getPaddingEnd(), i2);
        } else {
            setPadding(getPaddingLeft(), i, getPaddingRight(), i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[PHI: r2
  0x00cd: PHI (r2v6 boolean) = (r2v2 boolean), (r2v8 boolean) binds: [B:40:0x00ca, B:27:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        if (!this.k0) {
            this.l0 = (int) getTextSize();
            this.m0 = getLineSpacingExtra();
            this.n0 = getPaddingTop();
            this.o0 = getPaddingBottom();
            this.k0 = true;
        }
        boolean z3 = false;
        setTextSize(0, this.l0);
        setLineSpacing(this.m0, getLineSpacingMultiplier());
        a(this.n0, this.o0);
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (this.f0 & 1) <= 0) {
            z = false;
        } else {
            int lineCount = layout.getLineCount();
            int maxLines = getMaxLines();
            if (maxLines <= 1 || lineCount != maxLines) {
                z = false;
            } else {
                z = true;
            }
        }
        int textSize = (int) getTextSize();
        boolean z4 = this.h0;
        int i4 = this.g0;
        if (z) {
            if (i4 != -1 && textSize != i4) {
                setTextSize(0, i4);
                z3 = true;
            }
            float f = (this.m0 + this.l0) - i4;
            if (z4 && getLineSpacingExtra() != f) {
                setLineSpacing(f, getLineSpacingMultiplier());
                z3 = true;
            }
            int i5 = this.n0 + this.i0;
            int i6 = this.o0 + this.j0;
            if (getPaddingTop() == i5 && getPaddingBottom() == i6) {
                z2 = z3;
            } else {
                a(i5, i6);
            }
        } else {
            if (i4 != -1 && textSize != (i3 = this.l0)) {
                setTextSize(0, i3);
                z3 = true;
            }
            if (z4) {
                float lineSpacingExtra = getLineSpacingExtra();
                float f2 = this.m0;
                if (lineSpacingExtra != f2) {
                    setLineSpacing(f2, getLineSpacingMultiplier());
                    z3 = true;
                }
            }
            if (getPaddingTop() == this.n0 && getPaddingBottom() == this.o0) {
                z2 = z3;
            } else {
                a(this.n0, this.o0);
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hw7.k(callback, this));
    }

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
