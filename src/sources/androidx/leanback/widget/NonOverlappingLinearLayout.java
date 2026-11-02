package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {
    public boolean f0;
    public boolean g0;
    public final ArrayList h0;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f0 = false;
        this.h0 = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        int iIndexOfChild;
        if (!this.g0) {
            super.focusableViewAvailable(view);
            return;
        }
        View view2 = view;
        while (true) {
            if (view2 == this || view2 == null) {
                iIndexOfChild = -1;
                break;
            } else {
                if (view2.getParent() == this) {
                    iIndexOfChild = indexOfChild(view2);
                    break;
                }
                view2 = (View) view2.getParent();
            }
        }
        if (iIndexOfChild != -1) {
            ((ArrayList) this.h0.get(iIndexOfChild)).add(view);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[Catch: all -> 0x0016, LOOP:0: B:16:0x0020->B:18:0x002a, LOOP_START, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x0008, B:8:0x000e, B:16:0x0020, B:18:0x002a, B:19:0x0033, B:21:0x003d), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002a A[Catch: all -> 0x0016, LOOP:0: B:16:0x0020->B:18:0x002a, LOOP_END, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x0008, B:8:0x000e, B:16:0x0020, B:18:0x002a, B:19:0x0033, B:21:0x003d), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[Catch: all -> 0x0016, LOOP:1: B:19:0x0033->B:21:0x003d, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x0008, B:8:0x000e, B:16:0x0020, B:18:0x002a, B:19:0x0033, B:21:0x003d), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:24:0x004c, B:27:0x0054, B:30:0x005b, B:32:0x0067), top: B:57:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[LOOP:5: B:40:0x0085->B:42:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7 A[LOOP:2: B:49:0x00a1->B:51:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        NonOverlappingLinearLayout nonOverlappingLinearLayout;
        Throwable th;
        boolean z2;
        int i5;
        int i6;
        ArrayList arrayList = this.h0;
        int i7 = 0;
        try {
            if (!this.f0) {
                z2 = false;
                this.g0 = z2;
                if (z2) {
                    while (arrayList.size() > getChildCount()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    while (arrayList.size() < getChildCount()) {
                        arrayList.add(new ArrayList());
                    }
                }
                nonOverlappingLinearLayout = this;
                super.onLayout(z, i, i2, i3, i4);
                if (nonOverlappingLinearLayout.g0) {
                    for (i5 = 0; i5 < arrayList.size(); i5++) {
                        for (i6 = 0; i6 < ((ArrayList) arrayList.get(i5)).size(); i6++) {
                            super.focusableViewAvailable((View) ((ArrayList) arrayList.get(i5)).get(i6));
                        }
                    }
                }
                if (nonOverlappingLinearLayout.g0) {
                    nonOverlappingLinearLayout.g0 = false;
                    while (i7 < arrayList.size()) {
                        ((ArrayList) arrayList.get(i7)).clear();
                        i7++;
                    }
                    return;
                }
                return;
            }
            try {
                if (getOrientation() == 0 && getLayoutDirection() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.g0 = z2;
                if (z2) {
                    while (arrayList.size() > getChildCount()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    while (arrayList.size() < getChildCount()) {
                        arrayList.add(new ArrayList());
                    }
                }
                nonOverlappingLinearLayout = this;
                try {
                    super.onLayout(z, i, i2, i3, i4);
                    if (nonOverlappingLinearLayout.g0) {
                        while (i5 < arrayList.size()) {
                            while (i6 < ((ArrayList) arrayList.get(i5)).size()) {
                                super.focusableViewAvailable((View) ((ArrayList) arrayList.get(i5)).get(i6));
                            }
                        }
                    }
                    if (nonOverlappingLinearLayout.g0) {
                        nonOverlappingLinearLayout.g0 = false;
                        while (i7 < arrayList.size()) {
                            ((ArrayList) arrayList.get(i7)).clear();
                            i7++;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    if (nonOverlappingLinearLayout.g0) {
                        throw th;
                    }
                    nonOverlappingLinearLayout.g0 = false;
                    while (i7 < arrayList.size()) {
                        ((ArrayList) arrayList.get(i7)).clear();
                        i7++;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                nonOverlappingLinearLayout = this;
            }
        } catch (Throwable th4) {
            th = th4;
            nonOverlappingLinearLayout = this;
        }
        if (nonOverlappingLinearLayout.g0) {
            throw th;
        }
        nonOverlappingLinearLayout.g0 = false;
        while (i7 < arrayList.size()) {
            ((ArrayList) arrayList.get(i7)).clear();
            i7++;
        }
        throw th;
    }

    public void setFocusableViewAvailableFixEnabled(boolean z) {
        this.f0 = z;
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
