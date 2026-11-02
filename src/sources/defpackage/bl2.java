package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bl2 implements LayoutInflater.Factory2 {
    public final ml2 X;

    public bl2(ml2 ml2Var) {
        this.X = ml2Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        wl2 wl2VarH;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        ml2 ml2Var = this.X;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, ml2Var);
        }
        if (MetaParams.FRAGMENT.equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e66.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(e66.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(e66.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(e66.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = qk2.class.isAssignableFrom(gl2.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    qk2 qk2VarD = resourceId != -1 ? ml2Var.D(resourceId) : null;
                    if (qk2VarD == null && string != null) {
                        qk2VarD = ml2Var.E(string);
                    }
                    if (qk2VarD == null && id != -1) {
                        qk2VarD = ml2Var.D(id);
                    }
                    if (qk2VarD == null) {
                        gl2 gl2VarI = ml2Var.I();
                        context.getClassLoader();
                        qk2VarD = gl2VarI.a(attributeValue);
                        qk2VarD.p0 = true;
                        qk2VarD.z0 = resourceId != 0 ? resourceId : id;
                        qk2VarD.A0 = id;
                        qk2VarD.B0 = string;
                        qk2VarD.q0 = true;
                        qk2VarD.v0 = ml2Var;
                        tk2 tk2Var = ml2Var.w;
                        qk2VarD.w0 = tk2Var;
                        AppCompatActivity appCompatActivity = tk2Var.C0;
                        qk2VarD.H0 = true;
                        if ((tk2Var == null ? null : tk2Var.B0) != null) {
                            qk2VarD.H0 = true;
                        }
                        wl2VarH = ml2Var.a(qk2VarD);
                        if (ml2.K(2)) {
                            qk2VarD.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (qk2VarD.q0) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        qk2VarD.q0 = true;
                        qk2VarD.v0 = ml2Var;
                        tk2 tk2Var2 = ml2Var.w;
                        qk2VarD.w0 = tk2Var2;
                        AppCompatActivity appCompatActivity2 = tk2Var2.C0;
                        qk2VarD.H0 = true;
                        if ((tk2Var2 == null ? null : tk2Var2.B0) != null) {
                            qk2VarD.H0 = true;
                        }
                        wl2VarH = ml2Var.h(qk2VarD);
                        if (ml2.K(2)) {
                            qk2VarD.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    zl2 zl2Var = am2.a;
                    am2.b(new bm2(qk2VarD, "Attempting to use <fragment> tag to add fragment " + qk2VarD + " to container " + viewGroup));
                    am2.a(qk2VarD).getClass();
                    qk2VarD.I0 = viewGroup;
                    wl2VarH.k();
                    wl2VarH.j();
                    View view2 = qk2VarD.J0;
                    if (view2 == null) {
                        bt.i(pc6.p("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (qk2VarD.J0.getTag() == null) {
                        qk2VarD.J0.setTag(string);
                    }
                    qk2VarD.J0.addOnAttachStateChangeListener(new al2(this, wl2VarH));
                    return qk2VarD.J0;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
