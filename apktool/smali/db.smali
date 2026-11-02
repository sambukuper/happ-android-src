.class public final Ldb;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljj0;

.field public final c:I

.field public final d:J

.field public final e:Lu08;

.field public final f:Leg0;

.field public final g:Lbg0;

.field public final h:Ljg0;

.field public final i:Ls98;

.field public final j:Lpw;

.field public final k:Landroid/hardware/camera2/CameraDevice$StateCallback;

.field public final l:Ldq;

.field public final m:I

.field public final n:Ljava/lang/Object;

.field public o:Z

.field public p:Lcb;

.field public q:Z

.field public final r:Ljava/util/concurrent/CountDownLatch;

.field public final s:J

.field public t:Lya8;

.field public final u:Loh7;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljj0;IJLu08;Leg0;Lbg0;Ljg0;Ls98;Lpw;Landroid/hardware/camera2/CameraDevice$StateCallback;Ldq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Ldb;->a:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p2, p0, Ldb;->b:Ljj0;

    .line 31
    .line 32
    iput p3, p0, Ldb;->c:I

    .line 33
    .line 34
    iput-wide p4, p0, Ldb;->d:J

    .line 35
    .line 36
    iput-object p6, p0, Ldb;->e:Lu08;

    .line 37
    .line 38
    iput-object p7, p0, Ldb;->f:Leg0;

    .line 39
    .line 40
    iput-object p8, p0, Ldb;->g:Lbg0;

    .line 41
    .line 42
    iput-object p9, p0, Ldb;->h:Ljg0;

    .line 43
    .line 44
    iput-object p10, p0, Ldb;->i:Ls98;

    .line 45
    .line 46
    iput-object p11, p0, Ldb;->j:Lpw;

    .line 47
    .line 48
    iput-object p12, p0, Ldb;->k:Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 49
    .line 50
    iput-object p13, p0, Ldb;->l:Ldq;

    .line 51
    .line 52
    sget-object p2, Lry8;->b:Lqv;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object p6, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 58
    .line 59
    invoke-virtual {p6, p2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iput p2, p0, Ldb;->m:I

    .line 64
    .line 65
    new-instance p2, Ljava/lang/Object;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Ldb;->n:Ljava/lang/Object;

    .line 71
    .line 72
    new-instance p2, Ljava/util/concurrent/CountDownLatch;

    .line 73
    .line 74
    const/4 p6, 0x1

    .line 75
    invoke-direct {p2, p6}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p2, p0, Ldb;->r:Ljava/util/concurrent/CountDownLatch;

    .line 79
    .line 80
    sget-object p2, Lyk0;->a:Lyk0;

    .line 81
    .line 82
    invoke-static {p2}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iput-object p2, p0, Ldb;->u:Loh7;

    .line 87
    .line 88
    invoke-static {p1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    if-ne p3, p6, :cond_0

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 95
    .line 96
    .line 97
    move-result-wide p4

    .line 98
    :goto_0
    iput-wide p4, p0, Ldb;->s:J

    .line 99
    .line 100
    return-void
.end method

.method public static e(Ljg0;Ljava/lang/String;Lai0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ljg0;->b:Ltl7;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1d

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    sget-object v0, Ljj0;->h:Lij0;

    .line 19
    .line 20
    iget-object p0, p0, Ljg0;->a:Lig0;

    .line 21
    .line 22
    check-cast p0, Lhg0;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lhg0;->a(Ljava/lang/String;)Ljj0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lij0;->c(Ljj0;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldb;->u:Loh7;

    .line 2
    .line 3
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lmk0;

    .line 8
    .line 9
    instance-of v1, v0, Lrk0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lrk0;

    .line 15
    .line 16
    iget-object v0, v0, Lrk0;->a:Lyh0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v2

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-class v1, Landroid/hardware/camera2/CameraDevice;

    .line 23
    .line 24
    sget-object v3, Lyb6;->a:Lzb6;

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Lbo8;->C0(Lzu3;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v0, v2

    .line 38
    :goto_1
    new-instance v1, Lcb;

    .line 39
    .line 40
    sget-object v3, Lwu0;->X:Lwu0;

    .line 41
    .line 42
    const/16 v4, 0xe

    .line 43
    .line 44
    invoke-direct {v1, v3, v2, v2, v4}, Lcb;-><init>(Lwu0;Lai0;Ljava/lang/Exception;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0, v1}, Ldb;->b(Landroid/hardware/camera2/CameraDevice;Lcb;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final b(Landroid/hardware/camera2/CameraDevice;Lcb;)V
    .locals 10

    .line 1
    iget-object v0, p0, Ldb;->u:Loh7;

    .line 2
    .line 3
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lmk0;

    .line 8
    .line 9
    instance-of v1, v0, Lrk0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lrk0;

    .line 15
    .line 16
    iget-object v0, v0, Lrk0;->a:Lyh0;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v4, v2

    .line 21
    :goto_0
    iget-object v1, p0, Ldb;->n:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    iget-object v0, p0, Ldb;->p:Lcb;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iput-object p2, p0, Ldb;->p:Lcb;

    .line 29
    .line 30
    iget-boolean v0, p0, Ldb;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p0, v0

    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_1
    move-object p2, v2

    .line 40
    :goto_1
    monitor-exit v1

    .line 41
    if-eqz p2, :cond_6

    .line 42
    .line 43
    iget-object v0, p2, Lcb;->c:Lai0;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v3, p2, Lcb;->a:Lwu0;

    .line 49
    .line 50
    sget-object v5, Lwu0;->h0:Lwu0;

    .line 51
    .line 52
    if-eq v3, v5, :cond_2

    .line 53
    .line 54
    iget-object v3, p0, Ldb;->f:Leg0;

    .line 55
    .line 56
    iget-object v5, p0, Ldb;->a:Ljava/lang/String;

    .line 57
    .line 58
    iget v0, v0, Lai0;->a:I

    .line 59
    .line 60
    invoke-virtual {v3, v0, v5, v1}, Leg0;->a(ILjava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-object v0, p0, Ldb;->u:Loh7;

    .line 64
    .line 65
    new-instance v3, Lqk0;

    .line 66
    .line 67
    iget-object v5, p2, Lcb;->c:Lai0;

    .line 68
    .line 69
    invoke-direct {v3, v5}, Lqk0;-><init>(Lai0;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2, v3}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v0, p2, Lcb;->a:Lwu0;

    .line 76
    .line 77
    sget-object v3, Lwu0;->Z:Lwu0;

    .line 78
    .line 79
    if-eq v0, v3, :cond_5

    .line 80
    .line 81
    iget-object v0, p0, Ldb;->h:Ljg0;

    .line 82
    .line 83
    iget-object v3, p0, Ldb;->a:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v5, p2, Lcb;->c:Lai0;

    .line 86
    .line 87
    invoke-static {v0, v3, v5}, Ldb;->e(Ljg0;Ljava/lang/String;Lai0;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const/4 v6, 0x1

    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljg0;->a(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    move v8, v6

    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move v8, v1

    .line 103
    :goto_2
    if-eqz v8, :cond_4

    .line 104
    .line 105
    iget-object v1, p0, Ldb;->n:Ljava/lang/Object;

    .line 106
    .line 107
    monitor-enter v1

    .line 108
    :try_start_1
    iput-boolean v6, p0, Ldb;->q:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    .line 110
    monitor-exit v1

    .line 111
    goto :goto_3

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    move-object p0, v0

    .line 114
    monitor-exit v1

    .line 115
    throw p0

    .line 116
    :cond_4
    :goto_3
    iget-object v3, p0, Ldb;->g:Lbg0;

    .line 117
    .line 118
    iget-object v7, p0, Ldb;->j:Lpw;

    .line 119
    .line 120
    iget-object v0, p0, Ldb;->h:Ljg0;

    .line 121
    .line 122
    iget-object v1, p0, Ldb;->a:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v5, p2, Lcb;->c:Lai0;

    .line 125
    .line 126
    invoke-static {v0, v1, v5}, Ldb;->e(Ljg0;Ljava/lang/String;Lai0;)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    move-object v6, p0

    .line 131
    move-object v5, p1

    .line 132
    invoke-virtual/range {v3 .. v9}, Lbg0;->a(Lyh0;Landroid/hardware/camera2/CameraDevice;Ldb;Lpw;ZZ)V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move-object v6, p0

    .line 137
    :goto_4
    iget-object p0, v6, Ldb;->u:Loh7;

    .line 138
    .line 139
    invoke-virtual {v6, p2}, Ldb;->c(Lcb;)Lpk0;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, v2, p1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    :cond_6
    return-void

    .line 147
    :goto_5
    monitor-exit v1

    .line 148
    throw p0
.end method

.method public final c(Lcb;)Lpk0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldb;->e:Lu08;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iget-object v4, v0, Ldb;->t:Lya8;

    .line 15
    .line 16
    iget-wide v5, v1, Lcb;->b:J

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    iget-wide v8, v4, Lya8;->a:J

    .line 22
    .line 23
    iget-wide v10, v0, Ldb;->d:J

    .line 24
    .line 25
    sub-long/2addr v8, v10

    .line 26
    new-instance v10, Ljx1;

    .line 27
    .line 28
    invoke-direct {v10, v8, v9}, Ljx1;-><init>(J)V

    .line 29
    .line 30
    .line 31
    move-object v15, v10

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v15, v7

    .line 34
    :goto_0
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-wide v8, v4, Lya8;->a:J

    .line 37
    .line 38
    iget-wide v10, v0, Ldb;->s:J

    .line 39
    .line 40
    sub-long/2addr v8, v10

    .line 41
    new-instance v10, Ljx1;

    .line 42
    .line 43
    invoke-direct {v10, v8, v9}, Ljx1;-><init>(J)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v17, v10

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object/from16 v17, v7

    .line 50
    .line 51
    :goto_1
    if-nez v4, :cond_2

    .line 52
    .line 53
    move-object/from16 v18, v7

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-wide v7, v4, Lya8;->a:J

    .line 57
    .line 58
    sub-long v7, v5, v7

    .line 59
    .line 60
    new-instance v4, Ljx1;

    .line 61
    .line 62
    invoke-direct {v4, v7, v8}, Ljx1;-><init>(J)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v18, v4

    .line 66
    .line 67
    :goto_2
    sub-long/2addr v2, v5

    .line 68
    iget-object v13, v1, Lcb;->a:Lwu0;

    .line 69
    .line 70
    iget v4, v0, Ldb;->c:I

    .line 71
    .line 72
    add-int/lit8 v4, v4, -0x1

    .line 73
    .line 74
    iget-object v5, v1, Lcb;->c:Lai0;

    .line 75
    .line 76
    iget-object v1, v1, Lcb;->d:Ljava/lang/Throwable;

    .line 77
    .line 78
    new-instance v11, Lpk0;

    .line 79
    .line 80
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    new-instance v4, Ljx1;

    .line 85
    .line 86
    invoke-direct {v4, v2, v3}, Ljx1;-><init>(J)V

    .line 87
    .line 88
    .line 89
    iget-object v12, v0, Ldb;->a:Ljava/lang/String;

    .line 90
    .line 91
    move-object/from16 v16, v1

    .line 92
    .line 93
    move-object/from16 v19, v4

    .line 94
    .line 95
    move-object/from16 v20, v5

    .line 96
    .line 97
    invoke-direct/range {v11 .. v20}, Lpk0;-><init>(Ljava/lang/String;Lwu0;Ljava/lang/Integer;Ljx1;Ljava/lang/Throwable;Ljx1;Ljx1;Ljx1;Lai0;)V

    .line 98
    .line 99
    .line 100
    return-object v11
.end method

.method public final d(Landroid/hardware/camera2/CameraDevice;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldb;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "#onFinalized"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ldb;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    new-instance v0, Lcb;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/16 v2, 0xe

    .line 34
    .line 35
    sget-object v3, Lwu0;->Z:Lwu0;

    .line 36
    .line 37
    invoke-direct {v0, v3, v1, v1, v2}, Lcb;-><init>(Lwu0;Lai0;Ljava/lang/Exception;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Ldb;->b(Landroid/hardware/camera2/CameraDevice;Lcb;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Ldb;->k:Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 44
    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onClosed(Landroid/hardware/camera2/CameraDevice;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Ldb;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Ldb;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Ldb;->r:Ljava/util/concurrent/CountDownLatch;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Ldb;->n:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    iget-boolean v1, p0, Ldb;->q:Z

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Ldb;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    monitor-exit v0

    .line 41
    invoke-virtual {p0, p1}, Ldb;->d(Landroid/hardware/camera2/CameraDevice;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_0
    monitor-exit v0

    .line 46
    throw p0

    .line 47
    :cond_1
    const-string p0, "Check failed."

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Ldb;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, "#onDisconnected"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Ldb;->r:Ljava/util/concurrent/CountDownLatch;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lcb;

    .line 49
    .line 50
    new-instance v1, Lai0;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v1, v2}, Lai0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    const/16 v3, 0xa

    .line 58
    .line 59
    sget-object v4, Lwu0;->f0:Lwu0;

    .line 60
    .line 61
    invoke-direct {v0, v4, v1, v2, v3}, Lcb;-><init>(Lwu0;Lai0;Ljava/lang/Exception;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, v0}, Ldb;->b(Landroid/hardware/camera2/CameraDevice;Lcb;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Ldb;->k:Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 68
    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onDisconnected(Landroid/hardware/camera2/CameraDevice;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    const-string p0, "Check failed."

    .line 79
    .line 80
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Ldb;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, "#onError-"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Ldb;->r:Ljava/util/concurrent/CountDownLatch;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcb;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    if-eq p2, v1, :cond_1

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    if-eq p2, v1, :cond_1

    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    if-eq p2, v1, :cond_1

    .line 61
    .line 62
    const/4 v1, 0x4

    .line 63
    if-eq p2, v1, :cond_1

    .line 64
    .line 65
    const/4 v1, 0x5

    .line 66
    if-ne p2, v1, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const-string p0, "Unexpected StateCallback error code: "

    .line 70
    .line 71
    invoke-static {p2, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    :goto_0
    new-instance v2, Lai0;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Lai0;-><init>(I)V

    .line 82
    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    const/16 v3, 0xa

    .line 86
    .line 87
    sget-object v4, Lwu0;->g0:Lwu0;

    .line 88
    .line 89
    invoke-direct {v0, v4, v2, v1, v3}, Lcb;-><init>(Lwu0;Lai0;Ljava/lang/Exception;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, v0}, Ldb;->b(Landroid/hardware/camera2/CameraDevice;Lcb;)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Ldb;->k:Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 96
    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    invoke-virtual {p0, p1, p2}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onError(Landroid/hardware/camera2/CameraDevice;I)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    const-string p0, "Check failed."

    .line 107
    .line 108
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Ldb;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_9

    .line 15
    .line 16
    iget-object v0, p0, Ldb;->e:Lu08;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    new-instance v2, Lya8;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lya8;-><init>(J)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Ldb;->t:Lya8;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Ldb;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v4, "#onOpened"

    .line 47
    .line 48
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-wide v4, p0, Ldb;->s:J

    .line 59
    .line 60
    sub-long v4, v0, v4

    .line 61
    .line 62
    iget-wide v6, p0, Ldb;->d:J

    .line 63
    .line 64
    sub-long/2addr v0, v6

    .line 65
    iget v2, p0, Ldb;->c:I

    .line 66
    .line 67
    iget-object v6, p0, Ldb;->a:Ljava/lang/String;

    .line 68
    .line 69
    const-wide v7, 0x412e848000000000L    # 1000000.0

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    const/4 v9, 0x1

    .line 75
    const/4 v10, 0x0

    .line 76
    if-ne v2, v9, :cond_0

    .line 77
    .line 78
    invoke-static {v6}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    const-string v0, "%.3f ms"

    .line 82
    .line 83
    long-to-double v1, v4

    .line 84
    div-double/2addr v1, v7

    .line 85
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v10, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-static {v6}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    const-string v2, "%.3f ms"

    .line 105
    .line 106
    long-to-double v4, v4

    .line 107
    div-double/2addr v4, v7

    .line 108
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v10, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    const-string v2, "%.3f ms"

    .line 124
    .line 125
    long-to-double v0, v0

    .line 126
    div-double/2addr v0, v7

    .line 127
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v10, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    :goto_0
    iget-object v1, p0, Ldb;->n:Ljava/lang/Object;

    .line 143
    .line 144
    monitor-enter v1

    .line 145
    :try_start_0
    iget-object v0, p0, Ldb;->p:Lcb;

    .line 146
    .line 147
    if-nez v0, :cond_1

    .line 148
    .line 149
    iput-boolean v9, p0, Ldb;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_1
    :goto_1
    monitor-exit v1

    .line 156
    iget-object v1, p0, Ldb;->k:Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 157
    .line 158
    if-eqz v1, :cond_2

    .line 159
    .line 160
    invoke-virtual {v1, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onOpened(Landroid/hardware/camera2/CameraDevice;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    const/4 v1, 0x0

    .line 164
    if-eqz v0, :cond_4

    .line 165
    .line 166
    iget-object v4, p0, Ldb;->g:Lbg0;

    .line 167
    .line 168
    move-object v5, v4

    .line 169
    iget-object v4, p0, Ldb;->j:Lpw;

    .line 170
    .line 171
    iget-object v6, p0, Ldb;->h:Ljg0;

    .line 172
    .line 173
    iget-object v7, p0, Ldb;->a:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v8, v0, Lcb;->c:Lai0;

    .line 176
    .line 177
    invoke-static {v6, v7, v8}, Ldb;->e(Ljg0;Ljava/lang/String;Lai0;)Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-eqz v8, :cond_3

    .line 182
    .line 183
    invoke-virtual {v6, v7}, Ljg0;->a(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_3

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_3
    move v9, v1

    .line 191
    :goto_2
    iget-object v1, p0, Ldb;->h:Ljg0;

    .line 192
    .line 193
    iget-object v6, p0, Ldb;->a:Ljava/lang/String;

    .line 194
    .line 195
    iget-object v0, v0, Lcb;->c:Lai0;

    .line 196
    .line 197
    invoke-static {v1, v6, v0}, Ldb;->e(Ljg0;Ljava/lang/String;Lai0;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    const/4 v1, 0x0

    .line 202
    move-object v3, p0

    .line 203
    move-object v2, p1

    .line 204
    move-object v0, v5

    .line 205
    move v5, v9

    .line 206
    invoke-virtual/range {v0 .. v6}, Lbg0;->a(Lyh0;Landroid/hardware/camera2/CameraDevice;Ldb;Lpw;ZZ)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_4
    new-instance v2, Lza;

    .line 211
    .line 212
    iget-object v3, p0, Ldb;->b:Ljj0;

    .line 213
    .line 214
    iget-object v5, p0, Ldb;->a:Ljava/lang/String;

    .line 215
    .line 216
    iget-object v6, p0, Ldb;->f:Leg0;

    .line 217
    .line 218
    iget-object v7, p0, Ldb;->l:Ldq;

    .line 219
    .line 220
    iget-object v8, p0, Ldb;->i:Ls98;

    .line 221
    .line 222
    move-object v4, p1

    .line 223
    invoke-direct/range {v2 .. v8}, Lza;-><init>(Ljj0;Landroid/hardware/camera2/CameraDevice;Ljava/lang/String;Leg0;Ldq;Ls98;)V

    .line 224
    .line 225
    .line 226
    iget-object v3, p0, Ldb;->j:Lpw;

    .line 227
    .line 228
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 232
    .line 233
    const/16 v5, 0x1e

    .line 234
    .line 235
    if-ge v4, v5, :cond_5

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_5
    iget-object v4, v3, Lpw;->c:Ljava/lang/Object;

    .line 239
    .line 240
    monitor-enter v4

    .line 241
    :try_start_1
    iget-object v5, v3, Lpw;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 242
    .line 243
    invoke-virtual {v5, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, Lpw;->a()Lqw;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    if-eqz v5, :cond_6

    .line 251
    .line 252
    iget-object v6, v3, Lpw;->b:Lwl6;

    .line 253
    .line 254
    iget-object v3, v3, Lpw;->a:Lm51;

    .line 255
    .line 256
    new-instance v7, Lk;

    .line 257
    .line 258
    invoke-direct {v7, v2, v5, v10, v9}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    sget-object v5, Le71;->f0:Le71;

    .line 268
    .line 269
    new-instance v8, Lwu1;

    .line 270
    .line 271
    const/4 v11, 0x4

    .line 272
    invoke-direct {v8, v6, v7, v10, v11}, Lwu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 273
    .line 274
    .line 275
    invoke-static {v3, v10, v5, v8, v9}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 276
    .line 277
    .line 278
    goto :goto_3

    .line 279
    :catchall_1
    move-exception v0

    .line 280
    goto :goto_6

    .line 281
    :cond_6
    :goto_3
    monitor-exit v4

    .line 282
    :goto_4
    iget-object v3, p0, Ldb;->u:Loh7;

    .line 283
    .line 284
    new-instance v4, Lrk0;

    .line 285
    .line 286
    invoke-direct {v4, v2}, Lrk0;-><init>(Lyh0;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v10, v4}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    iget-object v3, p0, Ldb;->n:Ljava/lang/Object;

    .line 293
    .line 294
    monitor-enter v3

    .line 295
    :try_start_2
    iput-boolean v1, p0, Ldb;->o:Z

    .line 296
    .line 297
    iget-object v7, p0, Ldb;->p:Lcb;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 298
    .line 299
    monitor-exit v3

    .line 300
    if-eqz v7, :cond_8

    .line 301
    .line 302
    iget-object v3, p0, Ldb;->u:Loh7;

    .line 303
    .line 304
    new-instance v4, Lqk0;

    .line 305
    .line 306
    iget-object v5, v7, Lcb;->c:Lai0;

    .line 307
    .line 308
    invoke-direct {v4, v5}, Lqk0;-><init>(Lai0;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v10, v4}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    iget-object v3, p0, Ldb;->g:Lbg0;

    .line 315
    .line 316
    iget-object v4, p0, Ldb;->j:Lpw;

    .line 317
    .line 318
    iget-object v5, p0, Ldb;->h:Ljg0;

    .line 319
    .line 320
    iget-object v6, p0, Ldb;->a:Ljava/lang/String;

    .line 321
    .line 322
    iget-object v8, v7, Lcb;->c:Lai0;

    .line 323
    .line 324
    invoke-static {v5, v6, v8}, Ldb;->e(Ljg0;Ljava/lang/String;Lai0;)Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-eqz v8, :cond_7

    .line 329
    .line 330
    invoke-virtual {v5, v6}, Ljg0;->a(Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    if-eqz v5, :cond_7

    .line 335
    .line 336
    move v5, v9

    .line 337
    goto :goto_5

    .line 338
    :cond_7
    move v5, v1

    .line 339
    :goto_5
    iget-object v1, p0, Ldb;->h:Ljg0;

    .line 340
    .line 341
    iget-object v6, p0, Ldb;->a:Ljava/lang/String;

    .line 342
    .line 343
    iget-object v8, v7, Lcb;->c:Lai0;

    .line 344
    .line 345
    invoke-static {v1, v6, v8}, Ldb;->e(Ljg0;Ljava/lang/String;Lai0;)Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    move-object v1, v2

    .line 350
    move-object v0, v3

    .line 351
    move-object v3, p0

    .line 352
    move-object v2, p1

    .line 353
    invoke-virtual/range {v0 .. v6}, Lbg0;->a(Lyh0;Landroid/hardware/camera2/CameraDevice;Ldb;Lpw;ZZ)V

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, Ldb;->u:Loh7;

    .line 357
    .line 358
    invoke-virtual {p0, v7}, Ldb;->c(Lcb;)Lpk0;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v0, v10, v1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    :cond_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :catchall_2
    move-exception v0

    .line 370
    monitor-exit v3

    .line 371
    throw v0

    .line 372
    :goto_6
    monitor-exit v4

    .line 373
    throw v0

    .line 374
    :goto_7
    monitor-exit v1

    .line 375
    throw v0

    .line 376
    :cond_9
    const-string v0, "Check failed."

    .line 377
    .line 378
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CameraState-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Ldb;->m:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
