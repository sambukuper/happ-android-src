.class public final Lrs2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final o:Lcom/google/android/gms/common/api/Status;

.field public static final p:Lcom/google/android/gms/common/api/Status;

.field public static final q:Ljava/lang/Object;

.field public static r:Lrs2;


# instance fields
.field public a:J

.field public b:Z

.field public c:Li28;

.field public d:Lh99;

.field public final e:Landroid/content/Context;

.field public final f:Lns2;

.field public final g:Lrb8;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Lbu;

.field public final l:Lbu;

.field public final m:Lf99;

.field public volatile n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lx11;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lrs2;->o:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lx11;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lrs2;->p:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lrs2;->q:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Lns2;->d:Lns2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lrs2;->a:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lrs2;->b:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lrs2;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lrs2;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lrs2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, Lbu;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lbu;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lrs2;->k:Lbu;

    .line 44
    .line 45
    new-instance v2, Lbu;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lbu;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Lrs2;->l:Lbu;

    .line 51
    .line 52
    iput-boolean v3, p0, Lrs2;->n:Z

    .line 53
    .line 54
    iput-object p1, p0, Lrs2;->e:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v2, Lf99;

    .line 57
    .line 58
    invoke-direct {v2, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lrs2;->m:Lf99;

    .line 65
    .line 66
    iput-object v0, p0, Lrs2;->f:Lns2;

    .line 67
    .line 68
    new-instance p2, Lrb8;

    .line 69
    .line 70
    const/16 v0, 0xa

    .line 71
    .line 72
    invoke-direct {p2, v0}, Lrb8;-><init>(B)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lrs2;->g:Lrb8;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p2, Ljm4;->l0:Ljava/lang/Boolean;

    .line 82
    .line 83
    if-nez p2, :cond_1

    .line 84
    .line 85
    invoke-static {}, Lzc1;->T()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_0

    .line 90
    .line 91
    const-string p2, "android.hardware.type.automotive"

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move v3, v1

    .line 101
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    sput-object p2, Ljm4;->l0:Ljava/lang/Boolean;

    .line 106
    .line 107
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_2

    .line 112
    .line 113
    iput-boolean v1, p0, Lrs2;->n:Z

    .line 114
    .line 115
    :cond_2
    const/4 p0, 0x6

    .line 116
    invoke-virtual {v2, p0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {v2, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public static b(Lqn;Lx11;)Lcom/google/android/gms/common/api/Status;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lqn;->b:Ldq;

    .line 4
    .line 5
    iget-object p0, p0, Ldq;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x3f

    .line 24
    .line 25
    add-int/2addr v2, v3

    .line 26
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const-string v2, "API: "

    .line 30
    .line 31
    const-string v3, " is not available on this device. Connection failed with: "

    .line 32
    .line 33
    invoke-static {v4, v2, p0, v3, v1}, Loi0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/16 v1, 0x11

    .line 38
    .line 39
    iget-object v2, p1, Lx11;->Z:Landroid/app/PendingIntent;

    .line 40
    .line 41
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lx11;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lrs2;
    .locals 5

    .line 1
    sget-object v0, Lrs2;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lrs2;->r:Lrs2;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lya9;->g:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Lya9;->i:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Lya9;->i:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lya9;->i:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lrs2;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, Lns2;->c:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, Lrs2;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lrs2;->r:Lrs2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    move-object v1, v2

    .line 54
    goto :goto_2

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    goto :goto_3

    .line 57
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    :try_start_4
    throw p0

    .line 59
    :cond_1
    :goto_2
    monitor-exit v0

    .line 60
    return-object v1

    .line 61
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 62
    throw p0
.end method


# virtual methods
.method public final a(Lms2;)Li89;
    .locals 3

    .line 1
    iget-object v0, p1, Lms2;->f:Lqn;

    .line 2
    .line 3
    iget-object v1, p0, Lrs2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Li89;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Li89;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Li89;-><init>(Lrs2;Lms2;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, Li89;->h:Lis2;

    .line 22
    .line 23
    invoke-virtual {p1}, Lu10;->n()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Lrs2;->l:Lbu;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lbu;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, Li89;->q()V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lrs2;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lwl6;->P()Lwl6;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lwl6;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lxl6;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Lxl6;->Y:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, Lrs2;->g:Lrb8;

    .line 21
    .line 22
    iget-object p0, p0, Lrb8;->Y:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    monitor-enter p0

    .line 27
    const/4 v0, -0x1

    .line 28
    const v1, 0xc1fa340

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p0, v1, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    monitor-exit p0

    .line 36
    if-eq v1, v0, :cond_3

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw v0
.end method

.method public final e(Lx11;I)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lrs2;->f:Lns2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lrs2;->e:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p0}, Lue3;->A(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    iget v1, p1, Lx11;->Y:I

    .line 18
    .line 19
    iget-object v2, p1, Lx11;->Z:Landroid/app/PendingIntent;

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move v3, v9

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v3, v8

    .line 29
    :goto_0
    if-eqz v3, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v0, v1, p0, v2}, Lns2;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/high16 v2, 0xc000000

    .line 41
    .line 42
    invoke-static {p0, v8, v3, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_1
    if-eqz v2, :cond_6

    .line 47
    .line 48
    sget v3, Lcom/google/android/gms/common/api/GoogleApiActivity;->Y:I

    .line 49
    .line 50
    new-instance v3, Landroid/content/Intent;

    .line 51
    .line 52
    const-class v4, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 53
    .line 54
    invoke-direct {v3, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "pending_intent"

    .line 58
    .line 59
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const-string v2, "failing_client_id"

    .line 63
    .line 64
    invoke-virtual {v3, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    const-string p2, "notify_manager"

    .line 68
    .line 69
    invoke-virtual {v3, p2, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    sget p2, Ld99;->a:I

    .line 73
    .line 74
    const/high16 v2, 0x8000000

    .line 75
    .line 76
    or-int/2addr p2, v2

    .line 77
    invoke-static {p0, v8, v3, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {v0, p0, v1, p2}, Lns2;->f(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p1, Lx11;->g0:Ljava/lang/Integer;

    .line 85
    .line 86
    new-instance v2, Le89;

    .line 87
    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    const/4 p2, -0x1

    .line 91
    :goto_2
    move v3, p2

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    goto :goto_2

    .line 98
    :goto_3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    iget v7, p1, Lx11;->Y:I

    .line 107
    .line 108
    invoke-direct/range {v2 .. v8}, Le89;-><init>(ILjava/lang/String;JIZ)V

    .line 109
    .line 110
    .line 111
    iget-object p1, v0, Lns2;->b:Lh99;

    .line 112
    .line 113
    if-nez p1, :cond_5

    .line 114
    .line 115
    new-instance p1, Lh99;

    .line 116
    .line 117
    sget-object p2, Lh99;->j:Ldq;

    .line 118
    .line 119
    sget-object v1, Lbn;->a:Lan;

    .line 120
    .line 121
    sget-object v3, Lls2;->b:Lls2;

    .line 122
    .line 123
    invoke-direct {p1, p0, p2, v1, v3}, Lms2;-><init>(Landroid/content/Context;Ldq;Lbn;Lls2;)V

    .line 124
    .line 125
    .line 126
    iput-object p1, v0, Lns2;->b:Lh99;

    .line 127
    .line 128
    :cond_5
    new-instance p0, Ly18;

    .line 129
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    const/4 p2, 0x0

    .line 134
    iput-char p2, p0, Ly18;->c:C

    .line 135
    .line 136
    sget-object v0, Lch3;->g:Lk82;

    .line 137
    .line 138
    filled-new-array {v0}, [Lk82;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Ly18;->a:[Lk82;

    .line 143
    .line 144
    iput-boolean p2, p0, Ly18;->b:Z

    .line 145
    .line 146
    new-instance p2, Lq09;

    .line 147
    .line 148
    invoke-direct {p2, v2}, Lq09;-><init>(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iput-object p2, p0, Ly18;->d:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-virtual {p0}, Ly18;->a()Ly18;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    const/4 p2, 0x2

    .line 158
    invoke-virtual {p1, p2, p0}, Lms2;->b(ILy18;)Lfb9;

    .line 159
    .line 160
    .line 161
    return v9

    .line 162
    :cond_6
    :goto_4
    return v8
.end method

.method public final f(Lx11;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lrs2;->e(Lx11;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object p0, p0, Lrs2;->m:Lf99;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lrs2;->m:Lf99;

    .line 6
    .line 7
    iget-object v3, v0, Lrs2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    iget v4, v1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const/16 v5, 0xb

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const-wide/32 v7, 0x493e0

    .line 15
    .line 16
    .line 17
    const/16 v9, 0x11

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v12, 0x1

    .line 22
    packed-switch v4, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x14

    .line 36
    .line 37
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 38
    .line 39
    .line 40
    return v10

    .line 41
    :pswitch_0
    iput-boolean v10, v0, Lrs2;->b:Z

    .line 42
    .line 43
    return v12

    .line 44
    :pswitch_1
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lm89;

    .line 47
    .line 48
    iget-wide v3, v1, Lm89;->c:J

    .line 49
    .line 50
    iget-object v7, v1, Lm89;->a:Lov4;

    .line 51
    .line 52
    iget v8, v1, Lm89;->b:I

    .line 53
    .line 54
    const-wide/16 v13, 0x0

    .line 55
    .line 56
    cmp-long v13, v3, v13

    .line 57
    .line 58
    if-nez v13, :cond_1

    .line 59
    .line 60
    new-instance v1, Li28;

    .line 61
    .line 62
    filled-new-array {v7}, [Lov4;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v1, v8, v2}, Li28;-><init>(ILjava/util/List;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, Lrs2;->d:Lh99;

    .line 74
    .line 75
    if-nez v2, :cond_0

    .line 76
    .line 77
    iget-object v2, v0, Lrs2;->e:Landroid/content/Context;

    .line 78
    .line 79
    sget-object v3, Lj28;->b:Lj28;

    .line 80
    .line 81
    new-instance v4, Lh99;

    .line 82
    .line 83
    sget-object v7, Lh99;->k:Ldq;

    .line 84
    .line 85
    sget-object v8, Lls2;->b:Lls2;

    .line 86
    .line 87
    invoke-direct {v4, v2, v7, v3, v8}, Lms2;-><init>(Landroid/content/Context;Ldq;Lbn;Lls2;)V

    .line 88
    .line 89
    .line 90
    iput-object v4, v0, Lrs2;->d:Lh99;

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    :cond_0
    new-instance v0, Ly18;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-char v10, v0, Ly18;->c:C

    .line 99
    .line 100
    sget-object v3, Lch3;->f:Lk82;

    .line 101
    .line 102
    filled-new-array {v3}, [Lk82;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    iput-object v3, v0, Ly18;->a:[Lk82;

    .line 107
    .line 108
    iput-boolean v10, v0, Ly18;->b:Z

    .line 109
    .line 110
    new-instance v3, Lrb8;

    .line 111
    .line 112
    invoke-direct {v3, v1, v5}, Lrb8;-><init>(Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    iput-object v3, v0, Ly18;->d:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-virtual {v0}, Ly18;->a()Ly18;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v2, v6, v0}, Lms2;->b(ILy18;)Lfb9;

    .line 122
    .line 123
    .line 124
    return v12

    .line 125
    :cond_1
    iget-object v13, v0, Lrs2;->c:Li28;

    .line 126
    .line 127
    if-eqz v13, :cond_4

    .line 128
    .line 129
    iget-object v14, v13, Li28;->Y:Ljava/util/List;

    .line 130
    .line 131
    iget v13, v13, Li28;->X:I

    .line 132
    .line 133
    if-ne v13, v8, :cond_5

    .line 134
    .line 135
    if-eqz v14, :cond_2

    .line 136
    .line 137
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    iget v1, v1, Lm89;->d:I

    .line 142
    .line 143
    if-lt v13, v1, :cond_2

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_2
    iget-object v1, v0, Lrs2;->c:Li28;

    .line 147
    .line 148
    iget-object v5, v1, Li28;->Y:Ljava/util/List;

    .line 149
    .line 150
    if-nez v5, :cond_3

    .line 151
    .line 152
    new-instance v5, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v5, v1, Li28;->Y:Ljava/util/List;

    .line 158
    .line 159
    :cond_3
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :cond_4
    move/from16 v16, v12

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_5
    :goto_0
    invoke-virtual {v2, v9}, Landroid/os/Handler;->removeMessages(I)V

    .line 166
    .line 167
    .line 168
    iget-object v1, v0, Lrs2;->c:Li28;

    .line 169
    .line 170
    if-eqz v1, :cond_4

    .line 171
    .line 172
    iget v13, v1, Li28;->X:I

    .line 173
    .line 174
    if-gtz v13, :cond_7

    .line 175
    .line 176
    invoke-virtual {v0}, Lrs2;->d()Z

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    if-eqz v13, :cond_6

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    move/from16 v16, v12

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_7
    :goto_1
    iget-object v13, v0, Lrs2;->d:Lh99;

    .line 187
    .line 188
    if-nez v13, :cond_8

    .line 189
    .line 190
    iget-object v13, v0, Lrs2;->e:Landroid/content/Context;

    .line 191
    .line 192
    sget-object v14, Lj28;->b:Lj28;

    .line 193
    .line 194
    new-instance v15, Lh99;

    .line 195
    .line 196
    move/from16 v16, v12

    .line 197
    .line 198
    sget-object v12, Lh99;->k:Ldq;

    .line 199
    .line 200
    sget-object v9, Lls2;->b:Lls2;

    .line 201
    .line 202
    invoke-direct {v15, v13, v12, v14, v9}, Lms2;-><init>(Landroid/content/Context;Ldq;Lbn;Lls2;)V

    .line 203
    .line 204
    .line 205
    iput-object v15, v0, Lrs2;->d:Lh99;

    .line 206
    .line 207
    move-object v13, v15

    .line 208
    goto :goto_2

    .line 209
    :cond_8
    move/from16 v16, v12

    .line 210
    .line 211
    :goto_2
    new-instance v9, Ly18;

    .line 212
    .line 213
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    iput-char v10, v9, Ly18;->c:C

    .line 217
    .line 218
    sget-object v12, Lch3;->f:Lk82;

    .line 219
    .line 220
    filled-new-array {v12}, [Lk82;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    iput-object v12, v9, Ly18;->a:[Lk82;

    .line 225
    .line 226
    iput-boolean v10, v9, Ly18;->b:Z

    .line 227
    .line 228
    new-instance v10, Lrb8;

    .line 229
    .line 230
    invoke-direct {v10, v1, v5}, Lrb8;-><init>(Ljava/lang/Object;B)V

    .line 231
    .line 232
    .line 233
    iput-object v10, v9, Ly18;->d:Ljava/lang/Object;

    .line 234
    .line 235
    invoke-virtual {v9}, Ly18;->a()Ly18;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v13, v6, v1}, Lms2;->b(ILy18;)Lfb9;

    .line 240
    .line 241
    .line 242
    :goto_3
    iput-object v11, v0, Lrs2;->c:Li28;

    .line 243
    .line 244
    :goto_4
    iget-object v1, v0, Lrs2;->c:Li28;

    .line 245
    .line 246
    if-nez v1, :cond_24

    .line 247
    .line 248
    new-instance v1, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    new-instance v5, Li28;

    .line 257
    .line 258
    invoke-direct {v5, v8, v1}, Li28;-><init>(ILjava/util/List;)V

    .line 259
    .line 260
    .line 261
    iput-object v5, v0, Lrs2;->c:Li28;

    .line 262
    .line 263
    const/16 v0, 0x11

    .line 264
    .line 265
    invoke-virtual {v2, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 270
    .line 271
    .line 272
    return v16

    .line 273
    :pswitch_2
    move/from16 v16, v12

    .line 274
    .line 275
    iget-object v1, v0, Lrs2;->c:Li28;

    .line 276
    .line 277
    if-eqz v1, :cond_24

    .line 278
    .line 279
    iget v2, v1, Li28;->X:I

    .line 280
    .line 281
    if-gtz v2, :cond_9

    .line 282
    .line 283
    invoke-virtual {v0}, Lrs2;->d()Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_b

    .line 288
    .line 289
    :cond_9
    iget-object v2, v0, Lrs2;->d:Lh99;

    .line 290
    .line 291
    if-nez v2, :cond_a

    .line 292
    .line 293
    iget-object v2, v0, Lrs2;->e:Landroid/content/Context;

    .line 294
    .line 295
    sget-object v3, Lj28;->b:Lj28;

    .line 296
    .line 297
    new-instance v4, Lh99;

    .line 298
    .line 299
    sget-object v7, Lh99;->k:Ldq;

    .line 300
    .line 301
    sget-object v8, Lls2;->b:Lls2;

    .line 302
    .line 303
    invoke-direct {v4, v2, v7, v3, v8}, Lms2;-><init>(Landroid/content/Context;Ldq;Lbn;Lls2;)V

    .line 304
    .line 305
    .line 306
    iput-object v4, v0, Lrs2;->d:Lh99;

    .line 307
    .line 308
    move-object v2, v4

    .line 309
    :cond_a
    new-instance v3, Ly18;

    .line 310
    .line 311
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    iput-char v10, v3, Ly18;->c:C

    .line 315
    .line 316
    sget-object v4, Lch3;->f:Lk82;

    .line 317
    .line 318
    filled-new-array {v4}, [Lk82;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    iput-object v4, v3, Ly18;->a:[Lk82;

    .line 323
    .line 324
    iput-boolean v10, v3, Ly18;->b:Z

    .line 325
    .line 326
    new-instance v4, Lrb8;

    .line 327
    .line 328
    invoke-direct {v4, v1, v5}, Lrb8;-><init>(Ljava/lang/Object;B)V

    .line 329
    .line 330
    .line 331
    iput-object v4, v3, Ly18;->d:Ljava/lang/Object;

    .line 332
    .line 333
    invoke-virtual {v3}, Ly18;->a()Ly18;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v2, v6, v1}, Lms2;->b(ILy18;)Lfb9;

    .line 338
    .line 339
    .line 340
    :cond_b
    iput-object v11, v0, Lrs2;->c:Li28;

    .line 341
    .line 342
    return v16

    .line 343
    :pswitch_3
    move/from16 v16, v12

    .line 344
    .line 345
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Lj89;

    .line 348
    .line 349
    iget-object v1, v0, Lj89;->a:Lqn;

    .line 350
    .line 351
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_24

    .line 356
    .line 357
    iget-object v1, v0, Lj89;->a:Lqn;

    .line 358
    .line 359
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    check-cast v1, Li89;

    .line 364
    .line 365
    iget-object v2, v1, Li89;->p:Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_24

    .line 372
    .line 373
    iget-object v2, v1, Li89;->s:Lrs2;

    .line 374
    .line 375
    iget-object v3, v2, Lrs2;->m:Lf99;

    .line 376
    .line 377
    const/16 v4, 0xf

    .line 378
    .line 379
    invoke-virtual {v3, v4, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    iget-object v2, v2, Lrs2;->m:Lf99;

    .line 383
    .line 384
    const/16 v3, 0x10

    .line 385
    .line 386
    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    iget-object v0, v0, Lj89;->b:Lk82;

    .line 390
    .line 391
    iget-object v2, v1, Li89;->g:Ljava/util/LinkedList;

    .line 392
    .line 393
    new-instance v3, Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    :cond_c
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    if-eqz v5, :cond_e

    .line 411
    .line 412
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    check-cast v5, Lo89;

    .line 417
    .line 418
    if-eqz v5, :cond_c

    .line 419
    .line 420
    invoke-virtual {v5, v1}, Lo89;->a(Li89;)[Lk82;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    if-eqz v6, :cond_c

    .line 425
    .line 426
    array-length v7, v6

    .line 427
    move v8, v10

    .line 428
    :goto_6
    if-ge v8, v7, :cond_c

    .line 429
    .line 430
    aget-object v9, v6, v8

    .line 431
    .line 432
    invoke-static {v9, v0}, Lzc1;->F(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    if-eqz v9, :cond_d

    .line 437
    .line 438
    if-ltz v8, :cond_c

    .line 439
    .line 440
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_5

    .line 444
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    :goto_7
    if-ge v10, v1, :cond_24

    .line 452
    .line 453
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Lo89;

    .line 458
    .line 459
    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    new-instance v5, Llo8;

    .line 463
    .line 464
    invoke-direct {v5, v0}, Llo8;-><init>(Lk82;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v4, v5}, Lo89;->e(Ljava/lang/Exception;)V

    .line 468
    .line 469
    .line 470
    add-int/lit8 v10, v10, 0x1

    .line 471
    .line 472
    goto :goto_7

    .line 473
    :pswitch_4
    move/from16 v16, v12

    .line 474
    .line 475
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v0, Lj89;

    .line 478
    .line 479
    iget-object v1, v0, Lj89;->a:Lqn;

    .line 480
    .line 481
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-eqz v1, :cond_24

    .line 486
    .line 487
    iget-object v1, v0, Lj89;->a:Lqn;

    .line 488
    .line 489
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    check-cast v1, Li89;

    .line 494
    .line 495
    iget-object v2, v1, Li89;->p:Ljava/util/ArrayList;

    .line 496
    .line 497
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-nez v0, :cond_f

    .line 502
    .line 503
    goto/16 :goto_11

    .line 504
    .line 505
    :cond_f
    iget-boolean v0, v1, Li89;->o:Z

    .line 506
    .line 507
    if-nez v0, :cond_24

    .line 508
    .line 509
    iget-object v0, v1, Li89;->h:Lis2;

    .line 510
    .line 511
    check-cast v0, Lu10;

    .line 512
    .line 513
    invoke-virtual {v0}, Lu10;->l()Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-nez v0, :cond_10

    .line 518
    .line 519
    invoke-virtual {v1}, Li89;->q()V

    .line 520
    .line 521
    .line 522
    return v16

    .line 523
    :cond_10
    invoke-virtual {v1}, Li89;->e()V

    .line 524
    .line 525
    .line 526
    return v16

    .line 527
    :pswitch_5
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 528
    .line 529
    invoke-static {v0}, Lpc6;->i(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    throw v0

    .line 534
    :pswitch_6
    move/from16 v16, v12

    .line 535
    .line 536
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 537
    .line 538
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    if-eqz v0, :cond_24

    .line 543
    .line 544
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 545
    .line 546
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, Li89;

    .line 551
    .line 552
    iget-object v1, v0, Li89;->s:Lrs2;

    .line 553
    .line 554
    iget-object v1, v1, Lrs2;->m:Lf99;

    .line 555
    .line 556
    invoke-static {v1}, Lw45;->p(Landroid/os/Handler;)V

    .line 557
    .line 558
    .line 559
    iget-object v1, v0, Li89;->h:Lis2;

    .line 560
    .line 561
    move-object v2, v1

    .line 562
    check-cast v2, Lu10;

    .line 563
    .line 564
    invoke-virtual {v2}, Lu10;->l()Z

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-eqz v2, :cond_13

    .line 569
    .line 570
    iget-object v2, v0, Li89;->l:Ljava/util/HashMap;

    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    if-eqz v2, :cond_13

    .line 577
    .line 578
    iget-object v2, v0, Li89;->j:Lc89;

    .line 579
    .line 580
    iget-object v3, v2, Lc89;->X:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v3, Ljava/util/Map;

    .line 583
    .line 584
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 585
    .line 586
    .line 587
    move-result v3

    .line 588
    if-eqz v3, :cond_12

    .line 589
    .line 590
    iget-object v2, v2, Lc89;->Y:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v2, Ljava/util/Map;

    .line 593
    .line 594
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    if-nez v2, :cond_11

    .line 599
    .line 600
    goto :goto_8

    .line 601
    :cond_11
    const-string v0, "Timing out service connection."

    .line 602
    .line 603
    check-cast v1, Lu10;

    .line 604
    .line 605
    invoke-virtual {v1, v0}, Lu10;->c(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    return v16

    .line 609
    :cond_12
    :goto_8
    invoke-virtual {v0}, Li89;->k()V

    .line 610
    .line 611
    .line 612
    :cond_13
    return v16

    .line 613
    :pswitch_7
    move/from16 v16, v12

    .line 614
    .line 615
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 616
    .line 617
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v0

    .line 621
    if-eqz v0, :cond_24

    .line 622
    .line 623
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 624
    .line 625
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    check-cast v0, Li89;

    .line 630
    .line 631
    iget-object v1, v0, Li89;->s:Lrs2;

    .line 632
    .line 633
    iget-object v2, v1, Lrs2;->m:Lf99;

    .line 634
    .line 635
    invoke-static {v2}, Lw45;->p(Landroid/os/Handler;)V

    .line 636
    .line 637
    .line 638
    iget-boolean v2, v0, Li89;->o:Z

    .line 639
    .line 640
    if-eqz v2, :cond_24

    .line 641
    .line 642
    if-eqz v2, :cond_14

    .line 643
    .line 644
    iget-object v2, v0, Li89;->s:Lrs2;

    .line 645
    .line 646
    iget-object v3, v0, Li89;->i:Lqn;

    .line 647
    .line 648
    iget-object v4, v2, Lrs2;->m:Lf99;

    .line 649
    .line 650
    invoke-virtual {v4, v5, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    iget-object v2, v2, Lrs2;->m:Lf99;

    .line 654
    .line 655
    const/16 v4, 0x9

    .line 656
    .line 657
    invoke-virtual {v2, v4, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    iput-boolean v10, v0, Li89;->o:Z

    .line 661
    .line 662
    :cond_14
    iget-object v2, v1, Lrs2;->e:Landroid/content/Context;

    .line 663
    .line 664
    iget-object v1, v1, Lrs2;->f:Lns2;

    .line 665
    .line 666
    sget v3, Los2;->a:I

    .line 667
    .line 668
    invoke-virtual {v1, v2, v3}, Los2;->b(Landroid/content/Context;I)I

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    const/16 v2, 0x12

    .line 673
    .line 674
    if-ne v1, v2, :cond_15

    .line 675
    .line 676
    const-string v1, "Connection timed out waiting for Google Play services update to complete."

    .line 677
    .line 678
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 679
    .line 680
    const/16 v3, 0x15

    .line 681
    .line 682
    invoke-direct {v2, v3, v1, v11, v11}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lx11;)V

    .line 683
    .line 684
    .line 685
    goto :goto_9

    .line 686
    :cond_15
    const-string v1, "API failed to connect while resuming due to an unknown error."

    .line 687
    .line 688
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 689
    .line 690
    const/16 v3, 0x16

    .line 691
    .line 692
    invoke-direct {v2, v3, v1, v11, v11}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lx11;)V

    .line 693
    .line 694
    .line 695
    :goto_9
    invoke-virtual {v0, v2}, Li89;->j(Lcom/google/android/gms/common/api/Status;)V

    .line 696
    .line 697
    .line 698
    iget-object v0, v0, Li89;->h:Lis2;

    .line 699
    .line 700
    const-string v1, "Timing out connection while resuming."

    .line 701
    .line 702
    check-cast v0, Lu10;

    .line 703
    .line 704
    invoke-virtual {v0, v1}, Lu10;->c(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    return v16

    .line 708
    :pswitch_8
    move/from16 v16, v12

    .line 709
    .line 710
    iget-object v0, v0, Lrs2;->l:Lbu;

    .line 711
    .line 712
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    new-instance v1, Lqt;

    .line 716
    .line 717
    invoke-direct {v1, v0}, Lqt;-><init>(Lbu;)V

    .line 718
    .line 719
    .line 720
    :cond_16
    :goto_a
    invoke-virtual {v1}, Lqt;->hasNext()Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-eqz v2, :cond_17

    .line 725
    .line 726
    invoke-virtual {v1}, Lqt;->next()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    check-cast v2, Lqn;

    .line 731
    .line 732
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    check-cast v2, Li89;

    .line 737
    .line 738
    if-eqz v2, :cond_16

    .line 739
    .line 740
    invoke-virtual {v2}, Li89;->p()V

    .line 741
    .line 742
    .line 743
    goto :goto_a

    .line 744
    :cond_17
    invoke-virtual {v0}, Lbu;->clear()V

    .line 745
    .line 746
    .line 747
    return v16

    .line 748
    :pswitch_9
    move/from16 v16, v12

    .line 749
    .line 750
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 751
    .line 752
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    if-eqz v0, :cond_24

    .line 757
    .line 758
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 759
    .line 760
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    check-cast v0, Li89;

    .line 765
    .line 766
    iget-object v1, v0, Li89;->s:Lrs2;

    .line 767
    .line 768
    iget-object v1, v1, Lrs2;->m:Lf99;

    .line 769
    .line 770
    invoke-static {v1}, Lw45;->p(Landroid/os/Handler;)V

    .line 771
    .line 772
    .line 773
    iget-boolean v1, v0, Li89;->o:Z

    .line 774
    .line 775
    if-eqz v1, :cond_24

    .line 776
    .line 777
    invoke-virtual {v0}, Li89;->q()V

    .line 778
    .line 779
    .line 780
    return v16

    .line 781
    :pswitch_a
    move/from16 v16, v12

    .line 782
    .line 783
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v1, Lms2;

    .line 786
    .line 787
    invoke-virtual {v0, v1}, Lrs2;->a(Lms2;)Li89;

    .line 788
    .line 789
    .line 790
    return v16

    .line 791
    :pswitch_b
    move/from16 v16, v12

    .line 792
    .line 793
    iget-object v1, v0, Lrs2;->e:Landroid/content/Context;

    .line 794
    .line 795
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    instance-of v2, v2, Landroid/app/Application;

    .line 800
    .line 801
    if-eqz v2, :cond_1c

    .line 802
    .line 803
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    check-cast v1, Landroid/app/Application;

    .line 808
    .line 809
    invoke-static {v1}, Lw00;->a(Landroid/app/Application;)V

    .line 810
    .line 811
    .line 812
    sget-object v1, Lw00;->g0:Lw00;

    .line 813
    .line 814
    new-instance v2, Lh89;

    .line 815
    .line 816
    invoke-direct {v2, v0}, Lh89;-><init>(Lrs2;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    monitor-enter v1

    .line 823
    :try_start_0
    iget-object v3, v1, Lw00;->Z:Ljava/util/ArrayList;

    .line 824
    .line 825
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 829
    iget-object v2, v1, Lw00;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 830
    .line 831
    iget-object v1, v1, Lw00;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 832
    .line 833
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    if-nez v3, :cond_19

    .line 838
    .line 839
    invoke-static {}, Len;->c0()Z

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    if-nez v3, :cond_18

    .line 844
    .line 845
    new-instance v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 846
    .line 847
    invoke-direct {v3}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 848
    .line 849
    .line 850
    invoke-static {v3}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 851
    .line 852
    .line 853
    move/from16 v4, v16

    .line 854
    .line 855
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    if-nez v1, :cond_1a

    .line 860
    .line 861
    iget v1, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 862
    .line 863
    const/16 v3, 0x64

    .line 864
    .line 865
    if-le v1, v3, :cond_1a

    .line 866
    .line 867
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 868
    .line 869
    .line 870
    goto :goto_b

    .line 871
    :cond_18
    move/from16 v4, v16

    .line 872
    .line 873
    goto :goto_c

    .line 874
    :cond_19
    move/from16 v4, v16

    .line 875
    .line 876
    :cond_1a
    :goto_b
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 877
    .line 878
    .line 879
    move-result v16

    .line 880
    :goto_c
    if-nez v16, :cond_1b

    .line 881
    .line 882
    iput-wide v7, v0, Lrs2;->a:J

    .line 883
    .line 884
    return v4

    .line 885
    :cond_1b
    move/from16 v16, v4

    .line 886
    .line 887
    goto/16 :goto_11

    .line 888
    .line 889
    :catchall_0
    move-exception v0

    .line 890
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 891
    throw v0

    .line 892
    :cond_1c
    const/16 v16, 0x1

    .line 893
    .line 894
    goto/16 :goto_11

    .line 895
    .line 896
    :pswitch_c
    iget v2, v1, Landroid/os/Message;->arg1:I

    .line 897
    .line 898
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v1, Lx11;

    .line 901
    .line 902
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 907
    .line 908
    .line 909
    move-result-object v3

    .line 910
    :cond_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 911
    .line 912
    .line 913
    move-result v4

    .line 914
    if-eqz v4, :cond_1e

    .line 915
    .line 916
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v4

    .line 920
    check-cast v4, Li89;

    .line 921
    .line 922
    iget v5, v4, Li89;->m:I

    .line 923
    .line 924
    if-ne v5, v2, :cond_1d

    .line 925
    .line 926
    goto :goto_d

    .line 927
    :cond_1e
    move-object v4, v11

    .line 928
    :goto_d
    if-eqz v4, :cond_20

    .line 929
    .line 930
    iget v2, v1, Lx11;->Y:I

    .line 931
    .line 932
    const/16 v3, 0xd

    .line 933
    .line 934
    if-ne v2, v3, :cond_1f

    .line 935
    .line 936
    iget-object v0, v0, Lrs2;->f:Lns2;

    .line 937
    .line 938
    new-instance v3, Lcom/google/android/gms/common/api/Status;

    .line 939
    .line 940
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    sget v0, Lss2;->c:I

    .line 944
    .line 945
    invoke-static {v2}, Lx11;->c(I)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    iget-object v1, v1, Lx11;->f0:Ljava/lang/String;

    .line 950
    .line 951
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v5

    .line 959
    add-int/lit8 v2, v2, 0x45

    .line 960
    .line 961
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 962
    .line 963
    .line 964
    move-result v5

    .line 965
    new-instance v6, Ljava/lang/StringBuilder;

    .line 966
    .line 967
    add-int/2addr v2, v5

    .line 968
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 969
    .line 970
    .line 971
    const-string v2, "Error resolution was canceled by the user, original error message: "

    .line 972
    .line 973
    const-string v5, ": "

    .line 974
    .line 975
    invoke-static {v6, v2, v0, v5, v1}, Loi0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    const/16 v1, 0x11

    .line 980
    .line 981
    invoke-direct {v3, v1, v0, v11, v11}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lx11;)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v4, v3}, Li89;->j(Lcom/google/android/gms/common/api/Status;)V

    .line 985
    .line 986
    .line 987
    const/16 v16, 0x1

    .line 988
    .line 989
    return v16

    .line 990
    :cond_1f
    const/16 v16, 0x1

    .line 991
    .line 992
    iget-object v0, v4, Li89;->i:Lqn;

    .line 993
    .line 994
    invoke-static {v0, v1}, Lrs2;->b(Lqn;Lx11;)Lcom/google/android/gms/common/api/Status;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-virtual {v4, v0}, Li89;->j(Lcom/google/android/gms/common/api/Status;)V

    .line 999
    .line 1000
    .line 1001
    return v16

    .line 1002
    :cond_20
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    add-int/lit8 v0, v0, 0x41

    .line 1013
    .line 1014
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1015
    .line 1016
    .line 1017
    const-string v0, "Could not find API instance "

    .line 1018
    .line 1019
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    .line 1025
    const-string v0, " while trying to fail enqueued calls."

    .line 1026
    .line 1027
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    new-instance v1, Ljava/lang/Exception;

    .line 1035
    .line 1036
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 1037
    .line 1038
    .line 1039
    const-string v2, "GoogleApiManager"

    .line 1040
    .line 1041
    invoke-static {v2, v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1042
    .line 1043
    .line 1044
    const/16 v16, 0x1

    .line 1045
    .line 1046
    return v16

    .line 1047
    :pswitch_d
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1048
    .line 1049
    check-cast v1, Lp89;

    .line 1050
    .line 1051
    iget-object v2, v1, Lp89;->c:Lms2;

    .line 1052
    .line 1053
    iget-object v4, v1, Lp89;->a:Lx89;

    .line 1054
    .line 1055
    iget-object v5, v2, Lms2;->f:Lqn;

    .line 1056
    .line 1057
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v3

    .line 1061
    check-cast v3, Li89;

    .line 1062
    .line 1063
    if-nez v3, :cond_21

    .line 1064
    .line 1065
    invoke-virtual {v0, v2}, Lrs2;->a(Lms2;)Li89;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v3

    .line 1069
    :cond_21
    iget-object v2, v3, Li89;->h:Lis2;

    .line 1070
    .line 1071
    invoke-virtual {v2}, Lu10;->n()Z

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    if-eqz v2, :cond_22

    .line 1076
    .line 1077
    iget-object v0, v0, Lrs2;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1078
    .line 1079
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1080
    .line 1081
    .line 1082
    move-result v0

    .line 1083
    iget v1, v1, Lp89;->b:I

    .line 1084
    .line 1085
    if-eq v0, v1, :cond_22

    .line 1086
    .line 1087
    sget-object v0, Lrs2;->o:Lcom/google/android/gms/common/api/Status;

    .line 1088
    .line 1089
    invoke-virtual {v4, v0}, Lx89;->d(Lcom/google/android/gms/common/api/Status;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v3}, Li89;->p()V

    .line 1093
    .line 1094
    .line 1095
    const/16 v16, 0x1

    .line 1096
    .line 1097
    return v16

    .line 1098
    :cond_22
    const/16 v16, 0x1

    .line 1099
    .line 1100
    invoke-virtual {v3, v4}, Li89;->o(Lo89;)V

    .line 1101
    .line 1102
    .line 1103
    return v16

    .line 1104
    :pswitch_e
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1113
    .line 1114
    .line 1115
    move-result v1

    .line 1116
    if-eqz v1, :cond_1c

    .line 1117
    .line 1118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    check-cast v1, Li89;

    .line 1123
    .line 1124
    iget-object v2, v1, Li89;->s:Lrs2;

    .line 1125
    .line 1126
    iget-object v2, v2, Lrs2;->m:Lf99;

    .line 1127
    .line 1128
    invoke-static {v2}, Lw45;->p(Landroid/os/Handler;)V

    .line 1129
    .line 1130
    .line 1131
    iput-object v11, v1, Li89;->q:Lx11;

    .line 1132
    .line 1133
    invoke-virtual {v1}, Li89;->q()V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_e

    .line 1137
    :pswitch_f
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1138
    .line 1139
    invoke-static {v0}, Lpc6;->i(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    throw v0

    .line 1144
    :pswitch_10
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1145
    .line 1146
    check-cast v1, Ljava/lang/Boolean;

    .line 1147
    .line 1148
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v1

    .line 1152
    const/4 v4, 0x1

    .line 1153
    if-eq v4, v1, :cond_23

    .line 1154
    .line 1155
    goto :goto_f

    .line 1156
    :cond_23
    const-wide/16 v7, 0x2710

    .line 1157
    .line 1158
    :goto_f
    iput-wide v7, v0, Lrs2;->a:J

    .line 1159
    .line 1160
    const/16 v1, 0xc

    .line 1161
    .line 1162
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v3

    .line 1173
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v4

    .line 1177
    if-eqz v4, :cond_1c

    .line 1178
    .line 1179
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v4

    .line 1183
    check-cast v4, Lqn;

    .line 1184
    .line 1185
    invoke-virtual {v2, v1, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v4

    .line 1189
    iget-wide v5, v0, Lrs2;->a:J

    .line 1190
    .line 1191
    invoke-virtual {v2, v4, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1192
    .line 1193
    .line 1194
    goto :goto_10

    .line 1195
    :cond_24
    :goto_11
    return v16

    .line 1196
    nop

    .line 1197
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
