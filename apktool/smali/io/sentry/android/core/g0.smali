.class public final Lio/sentry/android/core/g0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final g0:Lio/sentry/android/core/g0;


# instance fields
.field public final X:Lio/sentry/util/a;

.field public volatile Y:Lio/sentry/android/core/f0;

.field public final Z:Lio/sentry/android/core/n0;

.field public volatile f0:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/core/g0;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/core/g0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/android/core/g0;->g0:Lio/sentry/android/core/g0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/g0;->X:Lio/sentry/util/a;

    .line 10
    .line 11
    new-instance v0, Lio/sentry/android/core/n0;

    .line 12
    .line 13
    invoke-direct {v0}, Lio/sentry/android/core/n0;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/android/core/g0;->Z:Lio/sentry/android/core/n0;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lio/sentry/android/core/g0;->f0:Ljava/lang/Boolean;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/g0;->u()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lio/sentry/android/core/d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/g0;->X:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lio/sentry/a3;->X:Lio/sentry/a3;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lio/sentry/android/core/g0;->m(Lio/sentry/ILogger;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 16
    .line 17
    iget-object p0, p0, Lio/sentry/android/core/f0;->X:Lio/sentry/android/core/e0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lio/sentry/android/core/e0;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_1
    move-exception p1

    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :goto_2
    throw p0
.end method

.method public final k(Lio/sentry/ILogger;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Landroidx/lifecycle/ProcessLifecycleOwner;->k0:Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/lifecycle/ProcessLifecycleOwner;->h0:Lg94;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lg94;->a(Lc94;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 16
    .line 17
    sget-object p0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 18
    .line 19
    const-string v1, "AppState failed to get Lifecycle and could not install lifecycle observer."

    .line 20
    .line 21
    invoke-interface {p1, p0, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final m(Lio/sentry/ILogger;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    :try_start_0
    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->k0:Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 7
    .line 8
    new-instance v0, Lio/sentry/android/core/f0;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lio/sentry/android/core/f0;-><init>(Lio/sentry/android/core/g0;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 14
    .line 15
    sget-object v0, Lio/sentry/android/core/internal/util/f;->a:Lio/sentry/android/core/internal/util/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/f;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lio/sentry/android/core/g0;->k(Lio/sentry/ILogger;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/g0;->Z:Lio/sentry/android/core/n0;

    .line 30
    .line 31
    new-instance v1, Lsc4;

    .line 32
    .line 33
    const/16 v2, 0x1a

    .line 34
    .line 35
    invoke-direct {v1, p0, p1, v2}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    iget-object p0, v0, Lio/sentry/android/core/n0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_0
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 47
    .line 48
    const-string v1, "AppState could not register lifecycle observer"

    .line 49
    .line 50
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catch_0
    sget-object p0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    new-array v0, v0, [Ljava/lang/Object;

    .line 58
    .line 59
    const-string v1, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc."

    .line 60
    .line 61
    invoke-interface {p1, p0, v1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    return-void
.end method

.method public final p(Lio/sentry/android/core/d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/g0;->X:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 11
    .line 12
    iget-object p0, p0, Lio/sentry/android/core/f0;->X:Lio/sentry/android/core/e0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_2
    throw p0
.end method

.method public final u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/g0;->X:Lio/sentry/util/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 12
    .line 13
    iget-object v2, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;

    .line 14
    .line 15
    iget-object v2, v2, Lio/sentry/android/core/f0;->X:Lio/sentry/android/core/e0;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lio/sentry/android/core/g0;->Y:Lio/sentry/android/core/f0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lio/sentry/android/core/internal/util/f;->a:Lio/sentry/android/core/internal/util/f;

    .line 27
    .line 28
    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/f;->c()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    sget-object p0, Landroidx/lifecycle/ProcessLifecycleOwner;->k0:Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 37
    .line 38
    iget-object p0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->h0:Lg94;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lg94;->f(Lc94;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/g0;->Z:Lio/sentry/android/core/n0;

    .line 45
    .line 46
    new-instance v2, Lfl6;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, Lfl6;-><init>(Lio/sentry/android/core/g0;Lio/sentry/android/core/f0;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v0, Lio/sentry/android/core/n0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Landroid/os/Handler;

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    throw p0
.end method
