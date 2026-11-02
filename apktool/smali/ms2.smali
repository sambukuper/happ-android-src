.class public abstract Lms2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lyr2;

.field public final d:Ldq;

.field public final e:Lbn;

.field public final f:Lqn;

.field public final g:I

.field public final h:Lra;

.field public final i:Lrs2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldq;Lbn;Lls2;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p2, v0}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p4, v0}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lms2;->a:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/16 v3, 0x1e

    .line 34
    .line 35
    if-lt v1, v3, :cond_0

    .line 36
    .line 37
    if-lt v1, v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getAttributionTag()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v3, v2

    .line 45
    :goto_0
    iput-object v3, p0, Lms2;->b:Ljava/lang/String;

    .line 46
    .line 47
    const/16 v4, 0x1f

    .line 48
    .line 49
    if-lt v1, v4, :cond_1

    .line 50
    .line 51
    new-instance v2, Lyr2;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getAttributionSource()Landroid/content/AttributionSource;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/16 v1, 0x8

    .line 58
    .line 59
    invoke-direct {v2, p1, v1}, Lyr2;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    :cond_1
    iput-object v2, p0, Lms2;->c:Lyr2;

    .line 63
    .line 64
    iput-object p2, p0, Lms2;->d:Ldq;

    .line 65
    .line 66
    iput-object p3, p0, Lms2;->e:Lbn;

    .line 67
    .line 68
    new-instance p1, Lqn;

    .line 69
    .line 70
    invoke-direct {p1, p2, p3, v3}, Lqn;-><init>(Ldq;Lbn;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lms2;->f:Lqn;

    .line 74
    .line 75
    new-instance p1, Lk89;

    .line 76
    .line 77
    invoke-static {v0}, Lrs2;->c(Landroid/content/Context;)Lrs2;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lms2;->i:Lrs2;

    .line 82
    .line 83
    iget-object p2, p1, Lrs2;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iput p2, p0, Lms2;->g:I

    .line 90
    .line 91
    iget-object p2, p4, Lls2;->a:Lra;

    .line 92
    .line 93
    iput-object p2, p0, Lms2;->h:Lra;

    .line 94
    .line 95
    iget-object p1, p1, Lrs2;->m:Lf99;

    .line 96
    .line 97
    const/4 p2, 0x7

    .line 98
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p1, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 103
    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final a()Llr;
    .locals 4

    .line 1
    new-instance v0, Llr;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Llr;-><init>(BZ)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v3, v0, Llr;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lbu;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    new-instance v3, Lbu;

    .line 18
    .line 19
    invoke-direct {v3, v2}, Lbu;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v3, v0, Llr;->Y:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v3, v1}, Lbu;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lms2;->a:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, v0, Llr;->f0:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iput-object p0, v0, Llr;->Z:Ljava/lang/Object;

    .line 44
    .line 45
    return-object v0
.end method

.method public final b(ILy18;)Lfb9;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lz18;

    .line 6
    .line 7
    invoke-direct {v2}, Lz18;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Lz18;->a:Lfb9;

    .line 11
    .line 12
    iget-object v4, v0, Lms2;->h:Lra;

    .line 13
    .line 14
    iget-object v6, v0, Lms2;->i:Lrs2;

    .line 15
    .line 16
    iget-object v13, v6, Lrs2;->m:Lf99;

    .line 17
    .line 18
    iget-char v7, v1, Ly18;->c:C

    .line 19
    .line 20
    if-eqz v7, :cond_6

    .line 21
    .line 22
    iget-object v8, v0, Lms2;->f:Lqn;

    .line 23
    .line 24
    invoke-virtual {v6}, Lrs2;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, Lwl6;->P()Lwl6;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget-object v5, v5, Lwl6;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lxl6;

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    iget-boolean v10, v5, Lxl6;->Y:Z

    .line 43
    .line 44
    if-eqz v10, :cond_2

    .line 45
    .line 46
    iget-boolean v5, v5, Lxl6;->Z:Z

    .line 47
    .line 48
    iget-object v10, v6, Lrs2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-virtual {v10, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    check-cast v10, Li89;

    .line 55
    .line 56
    if-eqz v10, :cond_1

    .line 57
    .line 58
    iget-object v11, v10, Li89;->h:Lis2;

    .line 59
    .line 60
    instance-of v12, v11, Lu10;

    .line 61
    .line 62
    if-eqz v12, :cond_2

    .line 63
    .line 64
    check-cast v11, Lu10;

    .line 65
    .line 66
    iget-object v12, v11, Lu10;->v:Lqa9;

    .line 67
    .line 68
    if-eqz v12, :cond_1

    .line 69
    .line 70
    invoke-virtual {v11}, Lu10;->m()Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    if-nez v12, :cond_1

    .line 75
    .line 76
    invoke-static {v10, v11, v7}, Ll89;->a(Li89;Lu10;I)Lc21;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    iget v11, v10, Li89;->r:I

    .line 83
    .line 84
    add-int/2addr v11, v9

    .line 85
    iput v11, v10, Li89;->r:I

    .line 86
    .line 87
    iget-boolean v9, v5, Lc21;->Z:Z

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v9, v5

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    :goto_1
    new-instance v5, Ll89;

    .line 95
    .line 96
    const-wide/16 v10, 0x0

    .line 97
    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move-wide v14, v10

    .line 106
    :goto_2
    if-eqz v9, :cond_5

    .line 107
    .line 108
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v10

    .line 112
    :cond_5
    move-wide v11, v10

    .line 113
    move-wide v9, v14

    .line 114
    invoke-direct/range {v5 .. v12}, Ll89;-><init>(Lrs2;ILqn;JJ)V

    .line 115
    .line 116
    .line 117
    :goto_3
    if-eqz v5, :cond_6

    .line 118
    .line 119
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    new-instance v7, Lhv;

    .line 123
    .line 124
    invoke-direct {v7, v13}, Lhv;-><init>(Lf99;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v7, v5}, Lfb9;->b(Ljava/util/concurrent/Executor;Lfa5;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    new-instance v5, Lx89;

    .line 131
    .line 132
    move/from16 v7, p1

    .line 133
    .line 134
    invoke-direct {v5, v7, v1, v2, v4}, Lx89;-><init>(ILy18;Lz18;Lra;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, v6, Lrs2;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 138
    .line 139
    new-instance v2, Lp89;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-direct {v2, v5, v1, v0}, Lp89;-><init>(Lx89;ILms2;)V

    .line 146
    .line 147
    .line 148
    const/4 v0, 0x4

    .line 149
    invoke-virtual {v13, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v13, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 154
    .line 155
    .line 156
    return-object v3
.end method
