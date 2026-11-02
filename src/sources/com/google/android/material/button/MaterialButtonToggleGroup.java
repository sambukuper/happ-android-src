package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.e;
import defpackage.c0;
import defpackage.c98;
import defpackage.cw8;
import defpackage.f4;
import defpackage.mr4;
import defpackage.o56;
import defpackage.r20;
import defpackage.sh7;
import defpackage.u26;
import defpackage.v56;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    public static final int y0 = o56.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final LinkedHashSet s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final int w0;
    public HashSet x0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = y0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        this.s0 = new LinkedHashSet();
        this.t0 = false;
        this.x0 = new HashSet();
        TypedArray typedArrayD = c98.d(getContext(), attributeSet, v56.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(v56.MaterialButtonToggleGroup_singleSelection, false));
        this.w0 = typedArrayD.getResourceId(v56.MaterialButtonToggleGroup_checkedButton, -1);
        this.v0 = typedArrayD.getBoolean(v56.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.k0 == null) {
            this.k0 = sh7.b(new c0(0.0f));
        }
        setEnabled(typedArrayD.getBoolean(v56.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayD.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.u0 ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setupButtonChild(materialButton);
            k(materialButton.getId(), materialButton.A0);
            cw8.n(materialButton, new r20(this, (byte) 5));
        }
    }

    public int getCheckedButtonId() {
        if (!this.u0 || this.x0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.x0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.x0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void k(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.x0);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.u0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.v0 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        l(hashSet);
    }

    public final void l(Set set) {
        HashSet hashSet = this.x0;
        this.x0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.t0 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.t0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.s0.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.w0;
        if (i != -1) {
            l(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.a(1, getVisibleButtonCount(), this.u0 ? 1 : 2).X);
    }

    public void setSelectionRequired(boolean z) {
        this.v0 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.u0 != z) {
            this.u0 = z;
            l(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.materialButtonToggleGroupStyle);
    }
}
