package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.a66;
import defpackage.f10;
import defpackage.m31;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int m0;
    public f10 n0;

    public Barrier(Context context) {
        super(context);
        this.f0 = new int[32];
        this.l0 = new HashMap();
        this.h0 = context;
        g(null);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        f10 f10Var = new f10();
        f10Var.s0 = 0;
        f10Var.t0 = true;
        f10Var.u0 = 0;
        f10Var.v0 = false;
        this.n0 = f10Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a66.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == a66.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == a66.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.n0.t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == a66.ConstraintLayout_Layout_barrierMargin) {
                    this.n0.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i0 = this.n0;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.n0.t0;
    }

    public int getMargin() {
        return this.n0.u0;
    }

    public int getType() {
        return this.m0;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(m31 m31Var, boolean z) {
        int i = this.m0;
        if (z) {
            if (i == 5) {
                i = 1;
            } else if (i == 6) {
                i = 0;
            }
        } else if (i == 5) {
            i = 0;
        } else if (i == 6) {
            i = 1;
        }
        if (m31Var instanceof f10) {
            ((f10) m31Var).s0 = i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.n0.t0 = z;
    }

    public void setDpMargin(int i) {
        this.n0.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.n0.u0 = i;
    }

    public void setType(int i) {
        this.m0 = i;
    }
}
