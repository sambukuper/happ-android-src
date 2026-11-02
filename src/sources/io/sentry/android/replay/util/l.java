package io.sentry.android.replay.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import defpackage.fm7;
import defpackage.g44;
import defpackage.mf5;
import defpackage.qg5;
import defpackage.v3;
import io.sentry.ILogger;
import io.sentry.s5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final qg5 a(View view) {
        if (!view.isAttachedToWindow()) {
            return new qg5(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new qg5(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new qg5(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return new qg5(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(View view, io.sentry.android.replay.viewhierarchy.g gVar, v3 v3Var, ILogger iLogger, List list) {
        LayoutNode root;
        v3Var.getClass();
        iLogger.getClass();
        if (view instanceof ViewGroup) {
            g44 g44Var = io.sentry.android.replay.viewhierarchy.b.a;
            if (fm7.d0(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    mf5 mf5Var = view instanceof mf5 ? (mf5) view : null;
                    if (mf5Var != null && (root = mf5Var.getRoot()) != null) {
                        io.sentry.android.replay.viewhierarchy.b.b(root, gVar, true, v3Var, iLogger);
                        return;
                    }
                } catch (Throwable th) {
                    iLogger.d(s5.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                    if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                        throw th;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    io.sentry.android.replay.viewhierarchy.g gVarE = io.sentry.config.a.e(childAt, gVar, v3Var);
                    arrayList.add(gVarE);
                    if (list != null && (gVarE instanceof io.sentry.android.replay.viewhierarchy.e) && gVarE.e) {
                        list.add(gVarE);
                    }
                    b(childAt, gVarE, v3Var, iLogger, list);
                }
            }
            gVar.g = arrayList;
        }
    }
}
