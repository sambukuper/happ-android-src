.class public final synthetic Lio/sentry/android/core/z1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:Lio/sentry/android/core/c2;

.field public final synthetic Y:Landroid/widget/Button;

.field public final synthetic Z:Lio/sentry/n5;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/c2;Landroid/widget/Button;Lio/sentry/n5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/z1;->X:Lio/sentry/android/core/c2;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/z1;->Y:Landroid/widget/Button;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/android/core/z1;->Z:Lio/sentry/n5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string p1, "Failed to launch the screenshot picker."

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/android/core/z1;->X:Lio/sentry/android/core/c2;

    .line 4
    .line 5
    iget-object v1, v0, Lio/sentry/android/core/c2;->j0:Landroid/net/Uri;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object p0, v0, Lio/sentry/android/core/c2;->i0:Lio/sentry/android/core/n0;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/n0;->c()V
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-static {p0}, Lio/sentry/util/b;->t(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 34
    .line 35
    invoke-interface {v0, v1, p1, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p0

    .line 40
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 53
    .line 54
    invoke-interface {v0, v1, p1, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    :goto_0
    return-void

    .line 58
    :cond_1
    const/4 p1, 0x0

    .line 59
    iput-object p1, v0, Lio/sentry/android/core/c2;->j0:Landroid/net/Uri;

    .line 60
    .line 61
    iget-object p1, p0, Lio/sentry/android/core/z1;->Z:Lio/sentry/n5;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const-string p1, "Add a screenshot"

    .line 67
    .line 68
    iget-object p0, p0, Lio/sentry/android/core/z1;->Y:Landroid/widget/Button;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method
