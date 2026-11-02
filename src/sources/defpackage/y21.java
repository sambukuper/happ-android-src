package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y21 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public y21(Context context, XmlResourceParser xmlResourceParser) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), a66.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == a66.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new d().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == a66.Variant_region_heightLessThan) {
                this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
            } else if (index == a66.Variant_region_heightMoreThan) {
                this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
            } else if (index == a66.Variant_region_widthLessThan) {
                this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
            } else if (index == a66.Variant_region_widthMoreThan) {
                this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
