package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ne {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    public ne(kf3 kf3Var, y64 y64Var) {
        Object gf1Var;
        this.a = (byte) 6;
        ne neVar = y64Var.a;
        int i = kf3Var.X;
        if (i < 0) {
            zc3.c("negative nearestRange.first");
        }
        int iMin = Math.min(kf3Var.Y, neVar.b - 1);
        if (iMin < i) {
            f05 f05Var = g85.a;
            f05Var.getClass();
            this.c = f05Var;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        f05 f05Var2 = new f05(i2);
        c15 c15Var = (c15) neVar.c;
        if (i < 0 || i >= neVar.b) {
            zc3.e("Index " + i + ", size " + neVar.b);
        }
        if (iMin < 0 || iMin >= neVar.b) {
            zc3.e("Index " + iMin + ", size " + neVar.b);
        }
        if (iMin < i) {
            zc3.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
        }
        int iO = hi5.O(i, c15Var);
        int i3 = ((rg3) c15Var.X[iO]).a;
        while (i3 <= iMin) {
            rg3 rg3Var = (rg3) c15Var.X[iO];
            gn2 gn2Var = (gn2) rg3Var.c.Y;
            int i4 = rg3Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (rg3Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (gn2Var != null) {
                        gf1Var = gn2Var.B(Integer.valueOf(iMax - i4));
                        gf1Var = gf1Var == null ? new gf1(iMax) : gf1Var;
                    }
                    f05Var2.g(iMax, gf1Var);
                    ((Object[]) this.d)[iMax - this.b] = gf1Var;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += rg3Var.b;
            iO++;
        }
        this.c = f05Var2;
    }

    public static ne c(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        Resources resources2 = resources;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = ow0.b(resources2, xml, attributeSetAsAttributeSet, theme);
                return new ne((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayQ = a28.q(resources2, theme, attributeSetAsAttributeSet, c66.GradientColor);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayQ.getFloat(c66.GradientColor_android_startX, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayQ.getFloat(c66.GradientColor_android_startY, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayQ.getFloat(c66.GradientColor_android_endX, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayQ.getFloat(c66.GradientColor_android_endY, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayQ.getFloat(c66.GradientColor_android_centerX, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayQ.getFloat(c66.GradientColor_android_centerY, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayQ.getInt(c66.GradientColor_android_type, 0) : 0;
        int i3 = 1;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayQ.getColor(c66.GradientColor_android_startColor, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayQ.getColor(c66.GradientColor_android_centerColor, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayQ.getColor(c66.GradientColor_android_endColor, 0) : 0;
        float f9 = f3;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayQ.getInt(c66.GradientColor_android_tileMode, 0) : 0;
        float f10 = f4;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayQ.getFloat(c66.GradientColor_android_gradientRadius, 0.0f) : 0.0f;
        typedArrayQ.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f11;
            if (next2 == i3) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2) {
                if (depth2 > depth) {
                    resources2 = resources;
                } else if (xml.getName().equals("item")) {
                    TypedArray typedArrayQ2 = a28.q(resources2, theme, attributeSetAsAttributeSet, c66.GradientColorItem);
                    boolean zHasValue = typedArrayQ2.hasValue(c66.GradientColorItem_android_color);
                    boolean zHasValue2 = typedArrayQ2.hasValue(c66.GradientColorItem_android_offset);
                    if (!zHasValue || !zHasValue2) {
                        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                    }
                    int color4 = typedArrayQ2.getColor(c66.GradientColorItem_android_color, 0);
                    float f12 = typedArrayQ2.getFloat(c66.GradientColorItem_android_offset, 0.0f);
                    typedArrayQ2.recycle();
                    arrayList2.add(Integer.valueOf(color4));
                    arrayList.add(Float.valueOf(f12));
                    resources2 = resources;
                } else {
                    continue;
                }
            }
            f11 = f;
            f5 = f2;
            i3 = 1;
        }
        mj0 mj0Var = arrayList2.size() > 0 ? new mj0(arrayList2, arrayList) : null;
        if (mj0Var == null) {
            mj0Var = z ? new mj0(color, color2, color3) : new mj0(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) mj0Var.Y;
                float[] fArr = (float[]) mj0Var.Z;
                if (i4 != 1) {
                    tileMode2 = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f9, f10, f2, f6, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) mj0Var.Y, (float[]) mj0Var.Z);
            }
        } else {
            if (f <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) mj0Var.Y;
            float[] fArr2 = (float[]) mj0Var.Z;
            if (i4 != 1) {
                tileMode = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f, iArr2, fArr2, tileMode);
        }
        return new ne(radialGradient, (ColorStateList) null, 0);
    }

    public void a(int i, f63 f63Var) {
        if (i < 0) {
            zc3.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        rg3 rg3Var = new rg3(this.b, i, f63Var);
        this.b += i;
        ((c15) this.c).b(rg3Var);
    }

    public void b() {
        z11 z11Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            dw1.a(drawable);
        }
        if (drawable == null || (z11Var = (z11) this.d) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = aq.b;
        rf6.h(drawable, z11Var, drawableState);
    }

    public rg3 d(int i) {
        if (i < 0 || i >= this.b) {
            zc3.e("Index " + i + ", size " + this.b);
        }
        rg3 rg3Var = (rg3) this.d;
        if (rg3Var != null) {
            int i2 = rg3Var.a;
            if (i < rg3Var.b + i2 && i2 <= i) {
                return rg3Var;
            }
        }
        c15 c15Var = (c15) this.c;
        rg3 rg3Var2 = (rg3) c15Var.X[hi5.O(i, c15Var)];
        this.d = rg3Var2;
        return rg3Var2;
    }

    public int e(Object obj) {
        f05 f05Var = (f05) this.c;
        int iD = f05Var.d(obj);
        if (iD >= 0) {
            return f05Var.c[iD];
        }
        return -1;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 2:
                int i = this.b;
                if (obj != this) {
                    if (!it0.o((Class) this.c, obj) || Array.getLength(obj) != i) {
                        return false;
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        Object obj2 = Array.get(this.d, i2);
                        Object obj3 = Array.get(obj, i2);
                        if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i9 = this.b;
        int i10 = i9 + 3;
        this.b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.c = Arrays.copyOf(jArr, iMax);
            this.d = Arrays.copyOf((long[]) this.d, iMax);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            wc3.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            wc3.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = t86.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public boolean g() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void h(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        zv7 zv7VarR = zv7.r(i, 0, imageView.getContext(), attributeSet, h66.AppCompatImageView);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        cw8.m(imageView, imageView.getContext(), h66.AppCompatImageView, attributeSet, (TypedArray) zv7VarR.Y, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(h66.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = u70.O(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                dw1.a(drawable);
            }
            if (typedArray.hasValue(h66.AppCompatImageView_tint)) {
                imageView.setImageTintList(zv7VarR.c(h66.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(h66.AppCompatImageView_tintMode)) {
                imageView.setImageTintMode(dw1.c(typedArray.getInt(h66.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            zv7VarR.v();
        }
    }

    public void i(long j, int i, int i2, int i3) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = t86.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i7 = this.b;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = t86.b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    i6 = i14;
                    c3 = c;
                    c2 = c4;
                    j3 = j2;
                }
                i6 = i6;
                c3 = c3;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder();
                if (((p06) this.c) == p06.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ne(Serializable serializable, int i, Object obj, byte b) {
        this.a = b;
        this.c = serializable;
        this.b = i;
        this.d = obj;
    }

    public ne(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = (byte) 0;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            bt.q("changes cannot be empty");
            throw null;
        }
    }

    public ne(ImageView imageView) {
        this.a = (byte) 1;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ ne(byte b) {
        this.a = b;
    }

    public ne(Shader shader, ColorStateList colorStateList, int i) {
        this.a = (byte) 4;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public ne() {
        this.a = (byte) 5;
        this.c = new c15(0, new rg3[16]);
    }

    public ne(fw8 fw8Var) {
        this.a = (byte) 3;
        this.c = fw8Var;
    }
}
