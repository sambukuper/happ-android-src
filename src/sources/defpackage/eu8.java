package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eu8 extends vt8 {
    public static final PorterDuff.Mode l0 = PorterDuff.Mode.SRC_IN;
    public cu8 Y;
    public PorterDuffColorFilter Z;
    public ColorFilter f0;
    public boolean g0;
    public boolean h0;
    public final float[] i0;
    public final Matrix j0;
    public final Rect k0;

    public eu8() {
        this.h0 = true;
        this.i0 = new float[9];
        this.j0 = new Matrix();
        this.k0 = new Rect();
        cu8 cu8Var = new cu8();
        cu8Var.c = null;
        cu8Var.d = l0;
        cu8Var.b = new bu8();
        this.Y = cu8Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.X;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.k0;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f0;
        if (colorFilter == null) {
            colorFilter = this.Z;
        }
        Matrix matrix = this.j0;
        canvas.getMatrix(matrix);
        float[] fArr = this.i0;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        cu8 cu8Var = this.Y;
        Bitmap bitmap = cu8Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != cu8Var.f.getHeight()) {
            cu8Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            cu8Var.k = true;
        }
        boolean z = this.h0;
        cu8 cu8Var2 = this.Y;
        if (!z) {
            cu8Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(cu8Var2.f);
            bu8 bu8Var = cu8Var2.b;
            bu8Var.a(bu8Var.g, bu8.p, canvas2, iMin, iMin2);
        } else if (cu8Var2.k || cu8Var2.g != cu8Var2.c || cu8Var2.h != cu8Var2.d || cu8Var2.j != cu8Var2.e || cu8Var2.i != cu8Var2.b.getRootAlpha()) {
            cu8 cu8Var3 = this.Y;
            cu8Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(cu8Var3.f);
            bu8 bu8Var2 = cu8Var3.b;
            bu8Var2.a(bu8Var2.g, bu8.p, canvas3, iMin, iMin2);
            cu8 cu8Var4 = this.Y;
            cu8Var4.g = cu8Var4.c;
            cu8Var4.h = cu8Var4.d;
            cu8Var4.i = cu8Var4.b.getRootAlpha();
            cu8Var4.j = cu8Var4.e;
            cu8Var4.k = false;
        }
        cu8 cu8Var5 = this.Y;
        if (cu8Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (cu8Var5.l == null) {
                Paint paint2 = new Paint();
                cu8Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            cu8Var5.l.setAlpha(cu8Var5.b.getRootAlpha());
            cu8Var5.l.setColorFilter(colorFilter);
            paint = cu8Var5.l;
        }
        canvas.drawBitmap(cu8Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getAlpha() : this.Y.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.Y.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getColorFilter() : this.f0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.X != null) {
            return new du8(this.X.getConstantState());
        }
        this.Y.a = getChangingConfigurations();
        return this.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.Y.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.Y.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        cu8 cu8Var = this.Y;
        cu8Var.b = new bu8();
        TypedArray typedArrayQ = a28.q(resources, theme, attributeSet, i21.a);
        cu8 cu8Var2 = this.Y;
        bu8 bu8Var = cu8Var2.b;
        int i5 = !a28.i(xmlPullParser, "tintMode") ? -1 : typedArrayQ.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        cu8Var2.d = mode;
        ColorStateList colorStateListG = a28.g(typedArrayQ, xmlPullParser, theme);
        if (colorStateListG != null) {
            cu8Var2.c = colorStateListG;
        }
        boolean z = cu8Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayQ.getBoolean(5, z);
        }
        cu8Var2.e = z;
        float f = bu8Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayQ.getFloat(7, f);
        }
        bu8Var.j = f;
        float f2 = bu8Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayQ.getFloat(8, f2);
        }
        bu8Var.k = f2;
        if (bu8Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayQ.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayQ.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        bu8Var.h = typedArrayQ.getDimension(3, bu8Var.h);
        int i7 = 2;
        float dimension = typedArrayQ.getDimension(2, bu8Var.i);
        bu8Var.i = dimension;
        if (bu8Var.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayQ.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayQ.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = bu8Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayQ.getFloat(4, alpha);
        }
        bu8Var.setAlpha(alpha);
        String string = typedArrayQ.getString(0);
        if (string != null) {
            bu8Var.m = string;
            bu8Var.o.put(string, bu8Var);
        }
        typedArrayQ.recycle();
        cu8Var.a = getChangingConfigurations();
        int i8 = 1;
        cu8Var.k = true;
        cu8 cu8Var3 = this.Y;
        bu8 bu8Var2 = cu8Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        yt8 yt8Var = bu8Var2.g;
        vt vtVar = bu8Var2.o;
        arrayDeque.push(yt8Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                yt8 yt8Var2 = (yt8) arrayDeque.peek();
                if (yt8Var2 != null) {
                    ArrayList arrayList = yt8Var2.b;
                    i = depth;
                    if ("path".equals(name)) {
                        xt8 xt8Var = new xt8();
                        xt8Var.e = 0.0f;
                        xt8Var.g = 1.0f;
                        xt8Var.h = 1.0f;
                        xt8Var.i = 0.0f;
                        xt8Var.j = 1.0f;
                        xt8Var.k = 0.0f;
                        Paint.Cap cap2 = Paint.Cap.BUTT;
                        xt8Var.l = cap2;
                        Paint.Join join2 = Paint.Join.MITER;
                        xt8Var.m = join2;
                        xt8Var.n = 4.0f;
                        TypedArray typedArrayQ2 = a28.q(resources, theme, attributeSet, i21.c);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            String string2 = typedArrayQ2.getString(0);
                            if (string2 != null) {
                                xt8Var.b = string2;
                            }
                            String string3 = typedArrayQ2.getString(2);
                            if (string3 != null) {
                                xt8Var.a = yn0.B(string3);
                            }
                            xt8Var.f = a28.h(typedArrayQ2, xmlPullParser, theme, "fillColor", 1);
                            float f3 = xt8Var.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                f3 = typedArrayQ2.getFloat(12, f3);
                            }
                            xt8Var.h = f3;
                            int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayQ2.getInt(8, -1) : -1;
                            Paint.Cap cap3 = xt8Var.l;
                            if (i9 == 0) {
                                cap = cap2;
                            } else if (i9 != 1) {
                                cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                            } else {
                                cap = Paint.Cap.ROUND;
                            }
                            xt8Var.l = cap;
                            int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayQ2.getInt(9, -1) : -1;
                            Paint.Join join3 = xt8Var.m;
                            if (i10 == 0) {
                                join = join2;
                            } else if (i10 != 1) {
                                join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                            } else {
                                join = Paint.Join.ROUND;
                            }
                            xt8Var.m = join;
                            float f4 = xt8Var.n;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                f4 = typedArrayQ2.getFloat(10, f4);
                            }
                            xt8Var.n = f4;
                            xt8Var.d = a28.h(typedArrayQ2, xmlPullParser, theme, "strokeColor", 3);
                            float f5 = xt8Var.g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                f5 = typedArrayQ2.getFloat(11, f5);
                            }
                            xt8Var.g = f5;
                            float f6 = xt8Var.e;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                f6 = typedArrayQ2.getFloat(4, f6);
                            }
                            xt8Var.e = f6;
                            float f7 = xt8Var.j;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                f7 = typedArrayQ2.getFloat(6, f7);
                            }
                            xt8Var.j = f7;
                            float f8 = xt8Var.k;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                f8 = typedArrayQ2.getFloat(7, f8);
                            }
                            xt8Var.k = f8;
                            float f9 = xt8Var.i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                f9 = typedArrayQ2.getFloat(5, f9);
                            }
                            xt8Var.i = f9;
                            int i11 = xt8Var.c;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                i11 = typedArrayQ2.getInt(13, i11);
                            }
                            xt8Var.c = i11;
                        }
                        typedArrayQ2.recycle();
                        arrayList.add(xt8Var);
                        if (xt8Var.getPathName() != null) {
                            vtVar.put(xt8Var.getPathName(), xt8Var);
                        }
                        cu8Var3.a = cu8Var3.a;
                        i4 = 1;
                        z2 = false;
                    } else {
                        if ("clip-path".equals(name)) {
                            wt8 wt8Var = new wt8();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray typedArrayQ3 = a28.q(resources, theme, attributeSet, i21.d);
                                String string4 = typedArrayQ3.getString(0);
                                if (string4 != null) {
                                    wt8Var.b = string4;
                                }
                                String string5 = typedArrayQ3.getString(1);
                                if (string5 != null) {
                                    wt8Var.a = yn0.B(string5);
                                }
                                wt8Var.c = !a28.i(xmlPullParser, "fillType") ? 0 : typedArrayQ3.getInt(2, 0);
                                typedArrayQ3.recycle();
                            }
                            arrayList.add(wt8Var);
                            if (wt8Var.getPathName() != null) {
                                vtVar.put(wt8Var.getPathName(), wt8Var);
                            }
                            cu8Var3.a = cu8Var3.a;
                        } else if ("group".equals(name)) {
                            yt8 yt8Var3 = new yt8();
                            TypedArray typedArrayQ4 = a28.q(resources, theme, attributeSet, i21.b);
                            float f10 = yt8Var3.c;
                            if (a28.i(xmlPullParser, "rotation")) {
                                f10 = typedArrayQ4.getFloat(5, f10);
                            }
                            yt8Var3.c = f10;
                            i4 = 1;
                            yt8Var3.d = typedArrayQ4.getFloat(1, yt8Var3.d);
                            yt8Var3.e = typedArrayQ4.getFloat(2, yt8Var3.e);
                            float f11 = yt8Var3.f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f11 = typedArrayQ4.getFloat(3, f11);
                            }
                            yt8Var3.f = f11;
                            float f12 = yt8Var3.g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f12 = typedArrayQ4.getFloat(4, f12);
                            }
                            yt8Var3.g = f12;
                            float f13 = yt8Var3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f13 = typedArrayQ4.getFloat(6, f13);
                            }
                            yt8Var3.h = f13;
                            float f14 = yt8Var3.i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f14 = typedArrayQ4.getFloat(7, f14);
                            }
                            yt8Var3.i = f14;
                            String string6 = typedArrayQ4.getString(0);
                            if (string6 != null) {
                                yt8Var3.k = string6;
                            }
                            yt8Var3.c();
                            typedArrayQ4.recycle();
                            arrayList.add(yt8Var3);
                            arrayDeque.push(yt8Var3);
                            if (yt8Var3.getGroupName() != null) {
                                vtVar.put(yt8Var3.getGroupName(), yt8Var3);
                            }
                            cu8Var3.a = cu8Var3.a;
                        }
                        i4 = 1;
                    }
                } else {
                    i = depth;
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.Z = a(cu8Var.c, cu8Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.isAutoMirrored() : this.Y.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        cu8 cu8Var = this.Y;
        if (cu8Var == null) {
            return false;
        }
        bu8 bu8Var = cu8Var.b;
        Boolean boolValueOf = bu8Var.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(bu8Var.g.a());
            bu8Var.n = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.Y.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g0 && super.mutate() == this) {
            cu8 cu8Var = this.Y;
            cu8 cu8Var2 = new cu8();
            cu8Var2.c = null;
            cu8Var2.d = l0;
            if (cu8Var != null) {
                cu8Var2.a = cu8Var.a;
                bu8 bu8Var = new bu8(cu8Var.b);
                cu8Var2.b = bu8Var;
                if (cu8Var.b.e != null) {
                    bu8Var.e = new Paint(cu8Var.b.e);
                }
                if (cu8Var.b.d != null) {
                    cu8Var2.b.d = new Paint(cu8Var.b.d);
                }
                cu8Var2.c = cu8Var.c;
                cu8Var2.d = cu8Var.d;
                cu8Var2.e = cu8Var.e;
            }
            this.Y = cu8Var2;
            this.g0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        cu8 cu8Var = this.Y;
        ColorStateList colorStateList = cu8Var.c;
        if (colorStateList == null || (mode = cu8Var.d) == null) {
            z = false;
        } else {
            this.Z = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        bu8 bu8Var = cu8Var.b;
        Boolean boolValueOf = bu8Var.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(bu8Var.g.a());
            bu8Var.n = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            boolean zB = cu8Var.b.g.b(iArr);
            cu8Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.Y.b.getRootAlpha() != i) {
            this.Y.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.Y.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        cu8 cu8Var = this.Y;
        if (cu8Var.c != colorStateList) {
            cu8Var.c = colorStateList;
            this.Z = a(colorStateList, cu8Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        cu8 cu8Var = this.Y;
        if (cu8Var.d != mode) {
            cu8Var.d = mode;
            this.Z = a(cu8Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.X;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public eu8(cu8 cu8Var) {
        this.h0 = true;
        this.i0 = new float[9];
        this.j0 = new Matrix();
        this.k0 = new Rect();
        this.Y = cu8Var;
        this.Z = a(cu8Var.c, cu8Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
