package io.sentry.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import defpackage.i82;
import defpackage.jn0;
import defpackage.r6;
import defpackage.st0;
import io.sentry.m5;
import io.sentry.n5;
import io.sentry.q5;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.v4;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends AlertDialog {
    public boolean X;
    public io.sentry.protocol.w Y;
    public DialogInterface.OnDismissListener Z;
    public final n5 f0;
    public y1 g0;
    public b2 h0;
    public n0 i0;
    public Uri j0;

    public c2(Context context) {
        Activity activityA;
        super(context, 0);
        this.X = false;
        n5 feedbackOptions = v4.b().i().getFeedbackOptions();
        n5 n5Var = new n5();
        n5Var.a = false;
        n5Var.b = true;
        n5Var.c = false;
        n5Var.d = true;
        n5Var.e = true;
        n5Var.f = true;
        n5Var.g = false;
        n5Var.h = true;
        n5Var.a = feedbackOptions.a;
        n5Var.b = feedbackOptions.b;
        n5Var.c = feedbackOptions.c;
        n5Var.d = feedbackOptions.d;
        n5Var.e = feedbackOptions.e;
        n5Var.f = feedbackOptions.f;
        n5Var.g = feedbackOptions.g;
        n5Var.h = feedbackOptions.h;
        n5Var.i = feedbackOptions.i;
        n5Var.j = feedbackOptions.j;
        this.f0 = n5Var;
        q5.d().a("UserFeedbackWidget");
        n5 feedbackOptions2 = v4.b().i().getFeedbackOptions();
        if (!n5Var.g || feedbackOptions2.i.p() || (activityA = a(context)) == null) {
            return;
        }
        this.g0 = new y1(v4.b().i().getLogger());
        WeakReference weakReference = new WeakReference(activityA);
        this.g0.c(activityA, new jn0(this, weakReference, (byte) 23));
        Application application = activityA.getApplication();
        b2 b2Var = new b2(this, weakReference);
        this.h0 = b2Var;
        application.registerActivityLifecycleCallbacks(b2Var);
    }

    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static FeedbackShakeIntegration b() {
        m5 m5Var = v4.b().i().getFeedbackOptions().i;
        if (m5Var instanceof FeedbackShakeIntegration) {
            return (FeedbackShakeIntegration) m5Var;
        }
        return null;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        io.sentry.protocol.i0 i0VarH;
        super.onCreate(bundle);
        setContentView(q1.sentry_dialog_user_feedback);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        setCancelable(this.X);
        TextView textView = (TextView) findViewById(p1.sentry_dialog_user_feedback_title);
        ImageView imageView = (ImageView) findViewById(p1.sentry_dialog_user_feedback_logo);
        final TextView textView2 = (TextView) findViewById(p1.sentry_dialog_user_feedback_txt_name);
        final EditText editText = (EditText) findViewById(p1.sentry_dialog_user_feedback_edt_name);
        final TextView textView3 = (TextView) findViewById(p1.sentry_dialog_user_feedback_txt_email);
        final EditText editText2 = (EditText) findViewById(p1.sentry_dialog_user_feedback_edt_email);
        final TextView textView4 = (TextView) findViewById(p1.sentry_dialog_user_feedback_txt_description);
        final EditText editText3 = (EditText) findViewById(p1.sentry_dialog_user_feedback_edt_description);
        Button button = (Button) findViewById(p1.sentry_dialog_user_feedback_btn_send);
        Button button2 = (Button) findViewById(p1.sentry_dialog_user_feedback_btn_cancel);
        final Button button3 = (Button) findViewById(p1.sentry_dialog_user_feedback_btn_add_screenshot);
        button3.setVisibility(8);
        final n5 n5Var = this.f0;
        button3.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c2 c2Var = this.X;
                if (c2Var.j0 != null) {
                    c2Var.j0 = null;
                    n5Var.getClass();
                    button3.setText("Add a screenshot");
                    return;
                }
                n0 n0Var = c2Var.i0;
                if (n0Var != null) {
                    try {
                        n0Var.c();
                    } catch (LinkageError e) {
                        v4.b().i().getLogger().e(s5.ERROR, "Failed to launch the screenshot picker.", e);
                    } catch (Throwable th) {
                        io.sentry.util.b.t(th);
                        v4.b().i().getLogger().e(s5.ERROR, "Failed to launch the screenshot picker.", th);
                    }
                }
            }
        });
        if (n5Var.f) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (n5Var.b || n5Var.a) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText("Name");
            editText.setHint("Your Name");
            if (n5Var.a) {
                textView2.append(" (Required)");
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (n5Var.d || n5Var.c) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText("Email");
            editText2.setHint("your.email@example.org");
            if (n5Var.c) {
                textView3.append(" (Required)");
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (n5Var.e && (i0VarH = v4.b().t().H()) != null) {
            editText.setText(i0VarH.Z);
            editText2.setText(i0VarH.X);
        }
        textView4.setText("Description");
        textView4.append(" (Required)");
        editText3.setHint("What's the bug? What did you expect?");
        textView.setText("Report a Bug");
        button.setText("Send Bug Report");
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText4 = editText;
                String strTrim = editText4.getText().toString().trim();
                EditText editText5 = editText2;
                String strTrim2 = editText5.getText().toString().trim();
                EditText editText6 = editText3;
                String strTrim3 = editText6.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                n5 n5Var2 = n5Var;
                if (zIsEmpty && n5Var2.a) {
                    editText4.setError(textView2.getText());
                    return;
                }
                if (strTrim2.isEmpty() && n5Var2.c) {
                    editText5.setError(textView3.getText());
                    return;
                }
                if (strTrim3.isEmpty()) {
                    editText6.setError(textView4.getText());
                    return;
                }
                io.sentry.protocol.k kVar = new io.sentry.protocol.k(strTrim3);
                kVar.Z = strTrim;
                kVar.Y = strTrim2;
                c2 c2Var = this.X;
                io.sentry.protocol.w wVar = c2Var.Y;
                if (wVar != null) {
                    kVar.g0 = wVar;
                }
                io.sentry.n0 n0Var = new io.sentry.n0();
                Uri uri = c2Var.j0;
                if (uri != null) {
                    try {
                        ContentResolver contentResolver = c2Var.getContext().getContentResolver();
                        String type = contentResolver.getType(uri);
                        if (type == null) {
                            type = "image/png";
                        }
                        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                        if (extensionFromMimeType == null) {
                            extensionFromMimeType = "png";
                        }
                        n0Var.b.add(new io.sentry.a(new i82(contentResolver, uri, (byte) 8), "screenshot.".concat(extensionFromMimeType), type));
                    } catch (Throwable th) {
                        io.sentry.util.b.t(th);
                        v4.b().i().getLogger().e(s5.ERROR, "Failed to attach image to feedback.", th);
                    }
                }
                if (v4.b().u().c(kVar, n0Var).equals(io.sentry.protocol.w.Y)) {
                    n5Var2.getClass();
                } else {
                    Context context = c2Var.getContext();
                    n5Var2.getClass();
                    Toast.makeText(context, "Thank you for your report!", 0).show();
                }
                c2Var.cancel();
            }
        });
        button2.setText("Cancel");
        button2.setOnClickListener(new st0(this, (byte) 18));
        setOnDismissListener(this.Z);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FeedbackShakeIntegration feedbackShakeIntegrationB = b();
        if (feedbackShakeIntegrationB != null) {
            feedbackShakeIntegrationB.k(this);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(p1.sentry_dialog_user_feedback_edt_description);
        editText.getText().clear();
        editText.setError(null);
        s6 s6VarI = v4.b().i();
        Button button = (Button) findViewById(p1.sentry_dialog_user_feedback_btn_add_screenshot);
        this.j0 = null;
        n5 n5Var = this.f0;
        n5Var.getClass();
        button.setText("Add a screenshot");
        if (n5Var.h) {
            Activity activityA = a(getContext());
            if (activityA != null) {
                n5Var.j.getClass();
                if (io.sentry.util.h.b(s6VarI, "androidx.activity.ComponentActivity") && io.sentry.util.h.b(s6VarI, "androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia")) {
                    try {
                        this.i0 = n0.d(activityA, new e(this, s6VarI, button));
                    } catch (LinkageError e) {
                        s6VarI.getLogger().e(s5.INFO, "androidx.activity is too old for the screenshot picker.", e);
                    } catch (Throwable th) {
                        io.sentry.util.b.t(th);
                        s6VarI.getLogger().e(s5.ERROR, "Failed to register the screenshot picker.", th);
                    }
                }
            }
            if (this.i0 != null) {
                button.setVisibility(0);
            } else {
                button.setVisibility(8);
                s6VarI.getLogger().h(s5.WARNING, "Feedback screenshot button won't be shown. It requires the androidx.activity dependency and the feedback form being shown from a ComponentActivity.", new Object[0]);
            }
        }
        n5 feedbackOptions = s6VarI.getFeedbackOptions();
        FeedbackShakeIntegration feedbackShakeIntegrationB = b();
        Activity activityA2 = a(getContext());
        if (feedbackShakeIntegrationB != null && activityA2 != null) {
            feedbackShakeIntegrationB.h0.add(new v0(activityA2, this));
            feedbackShakeIntegrationB.Y.d();
        }
        feedbackOptions.getClass();
        s6VarI.getReplayController().k(Boolean.FALSE);
        this.Y = s6VarI.getReplayController().g();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        n0 n0Var = this.i0;
        if (n0Var != null) {
            ((r6) n0Var.a).i0();
            this.i0 = null;
        }
        FeedbackShakeIntegration feedbackShakeIntegrationB = b();
        if (feedbackShakeIntegrationB != null) {
            feedbackShakeIntegrationB.k(this);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.X = z;
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.Z = onDismissListener;
        v4.b().i().getFeedbackOptions().getClass();
        super.setOnDismissListener(this.Z);
    }

    @Override // android.app.Dialog
    public final void show() {
        io.sentry.i1 i1VarB = v4.b();
        s6 s6VarI = i1VarB.i();
        if (i1VarB.isEnabled() && s6VarI.isEnabled()) {
            super.show();
        } else {
            s6VarI.getLogger().h(s5.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
