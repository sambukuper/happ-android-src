package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a77 implements y67 {
    public z91 a = new lm6();
    public z91 b = new lm6();
    public z91 c = new lm6();
    public z91 d = new lm6();
    public m61 e = new c0(0.0f);
    public m61 f = new c0(0.0f);
    public m61 g = new c0(0.0f);
    public m61 h = new c0(0.0f);
    public oy1 i;
    public oy1 j;
    public oy1 k;
    public oy1 l;

    public a77() {
        byte b = 0;
        this.i = new oy1(b);
        this.j = new oy1(b);
        this.k = new oy1(b);
        this.l = new oy1(b);
    }

    public static z67 g(Context context, AttributeSet attributeSet, int i, int i2) {
        c0 c0Var = new c0(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(v56.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(v56.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(v56.ShapeAppearance), c0Var);
    }

    public static z67 h(TypedArray typedArray, c0 c0Var) {
        try {
            int i = typedArray.getInt(v56.ShapeAppearance_cornerFamily, 0);
            int i2 = typedArray.getInt(v56.ShapeAppearance_cornerFamilyTopLeft, i);
            int i3 = typedArray.getInt(v56.ShapeAppearance_cornerFamilyTopRight, i);
            int i4 = typedArray.getInt(v56.ShapeAppearance_cornerFamilyBottomRight, i);
            int i5 = typedArray.getInt(v56.ShapeAppearance_cornerFamilyBottomLeft, i);
            m61 m61VarI = i(typedArray, v56.ShapeAppearance_cornerSize, c0Var);
            m61 m61VarI2 = i(typedArray, v56.ShapeAppearance_cornerSizeTopLeft, m61VarI);
            m61 m61VarI3 = i(typedArray, v56.ShapeAppearance_cornerSizeTopRight, m61VarI);
            m61 m61VarI4 = i(typedArray, v56.ShapeAppearance_cornerSizeBottomRight, m61VarI);
            m61 m61VarI5 = i(typedArray, v56.ShapeAppearance_cornerSizeBottomLeft, m61VarI);
            z67 z67Var = new z67();
            z67Var.a = i21.q(i2);
            z67Var.e = m61VarI2;
            z67Var.b = i21.q(i3);
            z67Var.f = m61VarI3;
            z67Var.c = i21.q(i4);
            z67Var.g = m61VarI4;
            z67Var.d = i21.q(i5);
            z67Var.h = m61VarI5;
            return z67Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static m61 i(TypedArray typedArray, int i, m61 m61Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new c0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new rc6(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return m61Var;
    }

    @Override // defpackage.y67
    public final a77 a(float f) {
        z67 z67VarK = k();
        z67VarK.b(f);
        return z67VarK.a();
    }

    @Override // defpackage.y67
    public final a77[] c() {
        return new a77[]{this};
    }

    @Override // defpackage.y67
    public final a77 e(rc6 rc6Var) {
        z67 z67VarK = k();
        z67VarK.e = rc6Var;
        z67VarK.f = rc6Var;
        z67VarK.g = rc6Var;
        z67VarK.h = rc6Var;
        return z67VarK.a();
    }

    @Override // defpackage.y67
    public final boolean f() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z = this.l.getClass().equals(oy1.class) && this.j.getClass().equals(oy1.class) && this.i.getClass().equals(oy1.class) && this.k.getClass().equals(oy1.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && (this.b instanceof lm6) && (this.a instanceof lm6) && (this.c instanceof lm6) && (this.d instanceof lm6);
    }

    public final z67 k() {
        z67 z67Var = new z67();
        z67Var.a = this.a;
        z67Var.b = this.b;
        z67Var.c = this.c;
        z67Var.d = this.d;
        z67Var.e = this.e;
        z67Var.f = this.f;
        z67Var.g = this.g;
        z67Var.h = this.h;
        z67Var.i = this.i;
        z67Var.j = this.j;
        z67Var.k = this.k;
        z67Var.l = this.l;
        return z67Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.y67
    public final a77 d() {
        return this;
    }

    @Override // defpackage.y67
    public final a77 b(int[] iArr) {
        return this;
    }
}
