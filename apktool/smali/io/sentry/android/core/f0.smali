.class public final Lio/sentry/android/core/f0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final X:Lio/sentry/android/core/e0;

.field public final synthetic Y:Lio/sentry/android/core/g0;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/g0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/f0;->Y:Lio/sentry/android/core/g0;

    .line 5
    .line 6
    new-instance p1, Lio/sentry/android/core/e0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lio/sentry/android/core/e0;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/android/core/f0;->X:Lio/sentry/android/core/e0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onStart(Ld94;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/sentry/android/core/f0;->Y:Lio/sentry/android/core/g0;

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iput-object v0, p1, Lio/sentry/android/core/g0;->f0:Ljava/lang/Boolean;

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/android/core/f0;->X:Lio/sentry/android/core/e0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lio/sentry/android/core/d0;

    .line 24
    .line 25
    invoke-interface {p1}, Lio/sentry/android/core/d0;->g()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public final onStop(Ld94;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/sentry/android/core/f0;->Y:Lio/sentry/android/core/g0;

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iput-object v0, p1, Lio/sentry/android/core/g0;->f0:Ljava/lang/Boolean;

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/android/core/f0;->X:Lio/sentry/android/core/e0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lio/sentry/android/core/d0;

    .line 24
    .line 25
    invoke-interface {p1}, Lio/sentry/android/core/d0;->k()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method
