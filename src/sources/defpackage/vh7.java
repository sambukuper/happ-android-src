package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vh7 {
    public int a;
    public lr5 b;
    public int[][] c;
    public lr5[] d;

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        uh7 uh7Var;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                boolean z = false;
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, v56.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, v56.StateListSizeChange, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(v56.StateListSizeChange_widthChange);
                if (typedValuePeekValue != null) {
                    int i = typedValuePeekValue.type;
                    if (i == 5) {
                        uh7Var = new uh7(2, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i == 6) {
                        uh7Var = new uh7(1, typedValuePeekValue.getFraction(1.0f, 1.0f));
                    } else {
                        uh7Var = null;
                    }
                } else {
                    uh7Var = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != u26.widthChange) {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i2] = attributeNameResource;
                        i2 = i4;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i2);
                lr5 lr5Var = new lr5((byte) 16, z);
                lr5Var.Y = uh7Var;
                int i5 = this.a;
                if (i5 == 0 || iArrTrimStateSet.length == 0) {
                    this.b = lr5Var;
                }
                int[][] iArr2 = this.c;
                if (i5 >= iArr2.length) {
                    int i6 = i5 + 10;
                    int[][] iArr3 = new int[i6][];
                    System.arraycopy(iArr2, 0, iArr3, 0, i5);
                    this.c = iArr3;
                    lr5[] lr5VarArr = new lr5[i6];
                    System.arraycopy(this.d, 0, lr5VarArr, 0, i5);
                    this.d = lr5VarArr;
                }
                int[][] iArr4 = this.c;
                int i7 = this.a;
                iArr4[i7] = iArrTrimStateSet;
                this.d[i7] = lr5Var;
                this.a = i7 + 1;
            }
        }
    }
}
