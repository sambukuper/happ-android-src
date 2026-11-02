package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import su.happ.proxyutility.feature.stories.StoryProgressView;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xk2 extends wk2 {
    public static final SparseIntArray y0;
    public long x0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(e46.story_pager, 4);
        sparseIntArray.put(e46.story_progress_view, 5);
        sparseIntArray.put(e46.force_story_countdown_indicator, 6);
        sparseIntArray.put(e46.force_story_countdown, 7);
        sparseIntArray.put(e46.touch_zone_back, 8);
        sparseIntArray.put(e46.touch_zone_ignore, 9);
        sparseIntArray.put(e46.touch_zone_forward, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public xk2(View view) {
        Object[] objArrE = kw8.e(view, 11, y0);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) objArrE[2];
        HappTextButton happTextButton = (HappTextButton) objArrE[3];
        HappTextView happTextView = (HappTextView) objArrE[7];
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) objArrE[6];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrE[1];
        ViewPager2 viewPager2 = (ViewPager2) objArrE[4];
        StoryProgressView storyProgressView = (StoryProgressView) objArrE[5];
        View view2 = (View) objArrE[8];
        View view3 = (View) objArrE[10];
        super(view, appCompatImageButton, happTextButton, happTextView, circularProgressIndicator, constraintLayout, viewPager2, storyProgressView, view2, view3);
        this.x0 = -1L;
        this.m0.setTag(null);
        this.n0.setTag(null);
        ((ConstraintLayout) objArrE[0]).setTag(null);
        this.q0.setTag(null);
        g(view);
        synchronized (this) {
            this.x0 = 2L;
        }
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a() {
        long j;
        int i;
        int i2;
        boolean z;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        pk7 pk7Var = this.v0;
        long j2 = j & 3;
        if (j2 == 0 || pk7Var == null) {
            i = 0;
            i2 = 0;
            z = false;
        } else {
            i = pk7Var.h;
            i2 = pk7Var.f;
            z = pk7Var.e;
        }
        if (j2 != 0) {
            this.m0.setEnabled(z);
            this.n0.setVisibility(i);
            this.q0.setVisibility(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.x0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
