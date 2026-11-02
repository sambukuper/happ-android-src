package defpackage;

import android.view.ViewGroup;
import androidx.transition.AutoTransition;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import io.sentry.c2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ie8 {
    public static final AutoTransition a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.E0 = new ArrayList();
        autoTransition.H0 = false;
        autoTransition.I0 = 0;
        autoTransition.F0 = false;
        autoTransition.K(new Fade(2));
        autoTransition.K(new ChangeBounds());
        autoTransition.K(new Fade(1));
        a = autoTransition;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = a;
        }
        Transition transitionClone = transition.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).w(viewGroup);
            }
        }
        transitionClone.g(viewGroup, true);
        if (viewGroup.getTag(a46.transition_current_scene) != null) {
            c2.m();
            return;
        }
        viewGroup.setTag(a46.transition_current_scene, null);
        he8 he8Var = new he8();
        he8Var.X = transitionClone;
        he8Var.Y = viewGroup;
        viewGroup.addOnAttachStateChangeListener(he8Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(he8Var);
    }

    public static vt b() {
        vt vtVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (vtVar = (vt) weakReference.get()) != null) {
            return vtVar;
        }
        vt vtVar2 = new vt(0);
        threadLocal.set(new WeakReference(vtVar2));
        return vtVar2;
    }
}
