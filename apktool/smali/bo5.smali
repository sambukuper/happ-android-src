.class public final Lbo5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lr85;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public Z:Ljava/util/List;

.field public f0:Ljava/lang/Throwable;

.field public g0:Z

.field public final h0:Lxe2;

.field public final i0:Lm51;

.field public final j0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public k0:Log7;

.field public final l0:Landroid/hardware/camera2/CameraManager;


# direct methods
.method public constructor <init>(Lf76;Lm51;Ljava/util/List;Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lbo5;->X:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lbo5;->f0:Ljava/lang/Throwable;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-boolean v1, p0, Lbo5;->g0:Z

    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v0, v0}, Lz68;->v(Ljava/lang/String;Ljava/lang/String;Lny;)Lwi0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iput-object v2, p0, Lbo5;->Z:Ljava/util/List;

    .line 60
    .line 61
    iput-object p1, p0, Lbo5;->h0:Lxe2;

    .line 62
    .line 63
    iput-object p2, p0, Lbo5;->i0:Lm51;

    .line 64
    .line 65
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 66
    .line 67
    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lbo5;->j0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    .line 72
    const-string p1, "camera"

    .line 73
    .line 74
    invoke-virtual {p4, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast p1, Landroid/hardware/camera2/CameraManager;

    .line 82
    .line 83
    iput-object p1, p0, Lbo5;->l0:Landroid/hardware/camera2/CameraManager;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final a()Lxb4;
    .locals 7

    .line 1
    const-string v0, "FetchData for PipeCameraPresence0"

    .line 2
    .line 3
    new-instance v1, Lqd0;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lif6;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, Lqd0;->c:Lif6;

    .line 14
    .line 15
    new-instance v2, Lud0;

    .line 16
    .line 17
    invoke-direct {v2, v1}, Lud0;-><init>(Lqd0;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, Lqd0;->b:Lud0;

    .line 21
    .line 22
    const-class v3, Lp61;

    .line 23
    .line 24
    iput-object v3, v1, Lqd0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    iget-object v3, p0, Lbo5;->i0:Lm51;

    .line 27
    .line 28
    new-instance v4, Lk;

    .line 29
    .line 30
    const/16 v5, 0x1a

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-direct {v4, p0, v1, v6, v5}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x3

    .line 37
    invoke-static {v3, v6, v6, v4, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 38
    .line 39
    .line 40
    iput-object v0, v1, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    return-object v2

    .line 43
    :catch_0
    move-exception p0

    .line 44
    invoke-virtual {v2, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 45
    .line 46
    .line 47
    return-object v2
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lbo5;->j0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lbo5;->k0:Log7;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    new-instance v0, Laa6;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-boolean v2, v0, Laa6;->X:Z

    .line 26
    .line 27
    new-instance v2, Lo;

    .line 28
    .line 29
    const/16 v3, 0x15

    .line 30
    .line 31
    iget-object v4, p0, Lbo5;->h0:Lxe2;

    .line 32
    .line 33
    invoke-direct {v2, v4, v3}, Lo;-><init>(Lxe2;B)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lqk4;

    .line 37
    .line 38
    const/16 v4, 0xa

    .line 39
    .line 40
    invoke-direct {v3, p0, v0, v1, v4}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Lsf2;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-direct {v0, v2, v3, v4}, Lsf2;-><init>(Lxe2;Lrn2;B)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Ldl4;

    .line 50
    .line 51
    invoke-direct {v2, p0, v1}, Ldl4;-><init>(Lbo5;Lq51;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Llf2;

    .line 55
    .line 56
    invoke-direct {v3, v0, v2, v4}, Llf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lr5;

    .line 60
    .line 61
    const/16 v2, 0xc

    .line 62
    .line 63
    invoke-direct {v0, v3, v1, v2}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x3

    .line 67
    iget-object v3, p0, Lbo5;->i0:Lm51;

    .line 68
    .line 69
    invoke-static {v3, v1, v1, v0, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lbo5;->k0:Log7;

    .line 74
    .line 75
    return-void
.end method

.method public final c(Ljava/util/concurrent/Executor;Ln85;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    new-instance v1, Lk0;

    .line 7
    .line 8
    invoke-direct {v1, p1, p2}, Lk0;-><init>(Ljava/util/concurrent/Executor;Ln85;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lbo5;->X:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-boolean v1, p0, Lbo5;->g0:Z

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Lbo5;->g0:Z

    .line 31
    .line 32
    invoke-virtual {p0}, Lbo5;->b()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    iget-object v1, p0, Lbo5;->Z:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object p0, p0, Lbo5;->f0:Ljava/lang/Throwable;

    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    new-instance v0, Lk0;

    .line 48
    .line 49
    invoke-direct {v0, p1, p2}, Lk0;-><init>(Ljava/util/concurrent/Executor;Ln85;)V

    .line 50
    .line 51
    .line 52
    new-instance p2, Lj0;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-direct {p2, p0, v0, v1, v2}, Lj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p0
.end method

.method public final d(Ljava/util/List;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbo5;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    :try_start_0
    iget-object p1, p0, Lbo5;->f0:Ljava/lang/Throwable;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lbo5;->Z:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_4

    .line 25
    :cond_1
    :goto_0
    iput-object p2, p0, Lbo5;->f0:Ljava/lang/Throwable;

    .line 26
    .line 27
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 28
    .line 29
    iput-object p1, p0, Lbo5;->Z:Ljava/util/List;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lbo5;->f0:Ljava/lang/Throwable;

    .line 36
    .line 37
    if-nez p2, :cond_4

    .line 38
    .line 39
    iget-object p2, p0, Lbo5;->Z:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    move v1, v2

    .line 49
    :cond_4
    :goto_1
    const/4 p2, 0x0

    .line 50
    iput-object p2, p0, Lbo5;->f0:Ljava/lang/Throwable;

    .line 51
    .line 52
    iput-object p1, p0, Lbo5;->Z:Ljava/util/List;

    .line 53
    .line 54
    :goto_2
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p2, p0, Lbo5;->f0:Ljava/lang/Throwable;

    .line 59
    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    iget-object v0, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lk0;

    .line 85
    .line 86
    iget-object v1, v0, Lk0;->a:Ljava/util/concurrent/Executor;

    .line 87
    .line 88
    new-instance v3, Lj0;

    .line 89
    .line 90
    invoke-direct {v3, p2, v0, p1, v2}, Lj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    return-void

    .line 98
    :goto_4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    throw p0
.end method

.method public final i(Ln85;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lk0;

    .line 19
    .line 20
    iget-object v3, v1, Lk0;->b:Ln85;

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v2

    .line 30
    :goto_0
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object p1, p0, Lbo5;->X:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p1

    .line 40
    :try_start_0
    iget-boolean v0, p0, Lbo5;->g0:Z

    .line 41
    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    iget-object v0, p0, Lbo5;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Lbo5;->g0:Z

    .line 54
    .line 55
    iget-object v1, p0, Lbo5;->j0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object v0, p0, Lbo5;->k0:Log7;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    iput-object v2, p0, Lbo5;->k0:Log7;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_1
    monitor-exit p1

    .line 78
    return-void

    .line 79
    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    throw p0
.end method
