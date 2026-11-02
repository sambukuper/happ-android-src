.class public final La71;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic j0:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final k0:Lz31;

.field public static final synthetic l0:J

.field public static final synthetic m0:J

.field public static final synthetic n0:J


# instance fields
.field public final X:I

.field public final Y:I

.field public final Z:J

.field private volatile synthetic _isTerminated$volatile:I

.field private volatile synthetic controlState$volatile:J

.field public final f0:Ljava/lang/String;

.field public final g0:Lbs2;

.field public final h0:Lbs2;

.field public final i0:Lcf6;

.field private volatile synthetic parkedWorkersStack$volatile:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, La71;

    .line 4
    .line 5
    const-string v2, "parkedWorkersStack$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    sput-wide v2, La71;->n0:J

    .line 16
    .line 17
    const-string v2, "controlState$volatile"

    .line 18
    .line 19
    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sput-object v3, La71;->j0:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    sput-wide v2, La71;->m0:J

    .line 34
    .line 35
    const-string v2, "_isTerminated$volatile"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    sput-wide v0, La71;->l0:J

    .line 46
    .line 47
    new-instance v0, Lz31;

    .line 48
    .line 49
    const-string v1, "NOT_IN_STACK"

    .line 50
    .line 51
    const/4 v2, 0x3

    .line 52
    invoke-direct {v0, v1, v2}, Lz31;-><init>(Ljava/lang/String;B)V

    .line 53
    .line 54
    .line 55
    sput-object v0, La71;->k0:Lz31;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p4, p0, La71;->X:I

    .line 5
    .line 6
    iput p5, p0, La71;->Y:I

    .line 7
    .line 8
    iput-wide p1, p0, La71;->Z:J

    .line 9
    .line 10
    iput-object p3, p0, La71;->f0:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p3, 0x1

    .line 13
    if-lt p4, p3, :cond_3

    .line 14
    .line 15
    const-string p3, "Max pool size "

    .line 16
    .line 17
    if-lt p5, p4, :cond_2

    .line 18
    .line 19
    const v0, 0x1ffffe

    .line 20
    .line 21
    .line 22
    if-gt p5, v0, :cond_1

    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    cmp-long p3, p1, v0

    .line 27
    .line 28
    if-lez p3, :cond_0

    .line 29
    .line 30
    new-instance p1, Lbs2;

    .line 31
    .line 32
    invoke-direct {p1}, Lxe4;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La71;->g0:Lbs2;

    .line 36
    .line 37
    new-instance p1, Lbs2;

    .line 38
    .line 39
    invoke-direct {p1}, Lxe4;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La71;->h0:Lbs2;

    .line 43
    .line 44
    new-instance p1, Lcf6;

    .line 45
    .line 46
    add-int/lit8 p2, p4, 0x1

    .line 47
    .line 48
    mul-int/lit8 p2, p2, 0x2

    .line 49
    .line 50
    invoke-direct {p1, p2}, Lcf6;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, La71;->i0:Lcf6;

    .line 54
    .line 55
    int-to-long p1, p4

    .line 56
    const/16 p3, 0x2a

    .line 57
    .line 58
    shl-long/2addr p1, p3

    .line 59
    iput-wide p1, p0, La71;->controlState$volatile:J

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "Idle worker keep alive time "

    .line 63
    .line 64
    const-string p3, " must be positive"

    .line 65
    .line 66
    invoke-static {p0, p1, p2, p3}, Lb61;->j(Ljava/lang/String;JLjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0

    .line 71
    :cond_1
    const-string p0, " should not exceed maximal supported number of threads 2097150"

    .line 72
    .line 73
    invoke-static {p3, p5, p0}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    throw p0

    .line 82
    :cond_2
    const-string p0, " should be greater than or equals to core pool size "

    .line 83
    .line 84
    invoke-static {p3, p5, p4, p0}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    throw p0

    .line 93
    :cond_3
    const-string p0, "Core pool size "

    .line 94
    .line 95
    const-string p1, " should be at least 1"

    .line 96
    .line 97
    invoke-static {p0, p4, p1}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    throw p0
.end method

.method public static synthetic m(La71;Ljava/lang/Runnable;I)V
    .locals 1

    .line 1
    and-int/lit8 p2, p2, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x1

    .line 9
    :goto_0
    invoke-virtual {p0, p1, v0, p2}, La71;->k(Ljava/lang/Runnable;ZZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 15

    .line 1
    :cond_0
    :goto_0
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v2, La71;->n0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    const-wide/32 v6, 0x1fffff

    .line 10
    .line 11
    .line 12
    and-long/2addr v6, v4

    .line 13
    long-to-int v1, v6

    .line 14
    iget-object v6, p0, La71;->i0:Lcf6;

    .line 15
    .line 16
    invoke-virtual {v6, v1}, Lcf6;->b(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v8, v1

    .line 21
    check-cast v8, Ly61;

    .line 22
    .line 23
    const/4 v9, -0x1

    .line 24
    const/4 v10, 0x0

    .line 25
    if-nez v8, :cond_1

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    move-object v0, p0

    .line 29
    goto :goto_3

    .line 30
    :cond_1
    const-wide/32 v6, 0x200000

    .line 31
    .line 32
    .line 33
    add-long/2addr v6, v4

    .line 34
    const-wide/32 v11, -0x200000

    .line 35
    .line 36
    .line 37
    and-long/2addr v6, v11

    .line 38
    invoke-virtual {v8}, Ly61;->c()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_1
    sget-object v11, La71;->k0:Lz31;

    .line 43
    .line 44
    if-ne v1, v11, :cond_2

    .line 45
    .line 46
    move v12, v9

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    if-nez v1, :cond_3

    .line 49
    .line 50
    move v12, v10

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    check-cast v1, Ly61;

    .line 53
    .line 54
    invoke-virtual {v1}, Ly61;->b()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    if-eqz v12, :cond_6

    .line 59
    .line 60
    :goto_2
    if-ltz v12, :cond_0

    .line 61
    .line 62
    int-to-long v12, v12

    .line 63
    or-long/2addr v6, v12

    .line 64
    move-object v1, p0

    .line 65
    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    move-object v0, v1

    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    invoke-virtual {v8, v11}, Ly61;->g(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :goto_3
    if-nez v8, :cond_4

    .line 76
    .line 77
    return v10

    .line 78
    :cond_4
    sget-object p0, Ly61;->k0:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 79
    .line 80
    invoke-virtual {p0, v8, v9, v10}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_5

    .line 85
    .line 86
    invoke-static {v8}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x1

    .line 90
    return p0

    .line 91
    :cond_5
    move-object p0, v0

    .line 92
    goto :goto_0

    .line 93
    :cond_6
    move-object v14, v0

    .line 94
    move-object v0, p0

    .line 95
    move-object p0, v14

    .line 96
    invoke-virtual {v1}, Ly61;->c()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v14, v0

    .line 101
    move-object v0, p0

    .line 102
    move-object p0, v14

    .line 103
    goto :goto_1
.end method

.method public final close()V
    .locals 10

    .line 1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v2, La71;->l0:J

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x1

    .line 7
    move-object v1, p0

    .line 8
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    move-object v2, v1

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of v1, p0, Ly61;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    check-cast p0, Ly61;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object p0, v3

    .line 29
    :goto_0
    if-eqz p0, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Ly61;->j0:La71;

    .line 32
    .line 33
    if-eq v1, v2, :cond_3

    .line 34
    .line 35
    :cond_2
    move-object p0, v3

    .line 36
    :cond_3
    iget-object v1, v2, La71;->i0:Lcf6;

    .line 37
    .line 38
    monitor-enter v1

    .line 39
    :try_start_0
    sget-wide v4, La71;->m0:J

    .line 40
    .line 41
    invoke-virtual {v0, v2, v4, v5}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    const-wide/32 v6, 0x1fffff

    .line 46
    .line 47
    .line 48
    and-long/2addr v4, v6

    .line 49
    long-to-int v0, v4

    .line 50
    monitor-exit v1

    .line 51
    const/4 v4, 0x1

    .line 52
    if-gt v4, v0, :cond_8

    .line 53
    .line 54
    move v1, v4

    .line 55
    :goto_1
    iget-object v5, v2, La71;->i0:Lcf6;

    .line 56
    .line 57
    invoke-virtual {v5, v1}, Lcf6;->b(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast v5, Ly61;

    .line 65
    .line 66
    if-eq v5, p0, :cond_7

    .line 67
    .line 68
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    sget-object v7, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    .line 73
    .line 74
    if-eq v6, v7, :cond_4

    .line 75
    .line 76
    invoke-static {v5}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 77
    .line 78
    .line 79
    const-wide/16 v6, 0x2710

    .line 80
    .line 81
    invoke-virtual {v5, v6, v7}, Ljava/lang/Thread;->join(J)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    iget-object v5, v5, Ly61;->X:Lf49;

    .line 86
    .line 87
    iget-object v6, v2, La71;->h0:Lbs2;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v7, Liu;->a:Lsun/misc/Unsafe;

    .line 93
    .line 94
    sget-wide v8, Lf49;->f:J

    .line 95
    .line 96
    invoke-virtual {v7, v5, v8, v9, v3}, Lsun/misc/Unsafe;->getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    check-cast v7, Lx18;

    .line 101
    .line 102
    if-eqz v7, :cond_5

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Lxe4;->a(Ljava/lang/Runnable;)Z

    .line 105
    .line 106
    .line 107
    :cond_5
    :goto_3
    invoke-virtual {v5}, Lf49;->c()Lx18;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    if-nez v7, :cond_6

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    invoke-virtual {v6, v7}, Lxe4;->a(Ljava/lang/Runnable;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    :goto_4
    if-eq v1, v0, :cond_8

    .line 119
    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_8
    iget-object v0, v2, La71;->h0:Lbs2;

    .line 124
    .line 125
    invoke-virtual {v0}, Lxe4;->b()V

    .line 126
    .line 127
    .line 128
    iget-object v0, v2, La71;->g0:Lbs2;

    .line 129
    .line 130
    invoke-virtual {v0}, Lxe4;->b()V

    .line 131
    .line 132
    .line 133
    :goto_5
    if-eqz p0, :cond_9

    .line 134
    .line 135
    invoke-virtual {p0, v4}, Ly61;->a(Z)Lx18;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-nez v0, :cond_b

    .line 140
    .line 141
    :cond_9
    iget-object v0, v2, La71;->g0:Lbs2;

    .line 142
    .line 143
    invoke-virtual {v0}, Lxe4;->d()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Lx18;

    .line 148
    .line 149
    if-nez v0, :cond_b

    .line 150
    .line 151
    iget-object v0, v2, La71;->h0:Lbs2;

    .line 152
    .line 153
    invoke-virtual {v0}, Lxe4;->d()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lx18;

    .line 158
    .line 159
    if-nez v0, :cond_b

    .line 160
    .line 161
    if-eqz p0, :cond_a

    .line 162
    .line 163
    sget-object v0, Lz61;->g0:Lz61;

    .line 164
    .line 165
    invoke-virtual {p0, v0}, Ly61;->h(Lz61;)Z

    .line 166
    .line 167
    .line 168
    :cond_a
    sget-object v1, Liu;->a:Lsun/misc/Unsafe;

    .line 169
    .line 170
    sget-wide v3, La71;->n0:J

    .line 171
    .line 172
    const-wide/16 v5, 0x0

    .line 173
    .line 174
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLongVolatile(Ljava/lang/Object;JJ)V

    .line 175
    .line 176
    .line 177
    sget-wide v3, La71;->m0:J

    .line 178
    .line 179
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLongVolatile(Ljava/lang/Object;JJ)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_b
    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :catchall_0
    move-exception v0

    .line 188
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v3, v1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :catchall_1
    move-exception v0

    .line 201
    move-object p0, v0

    .line 202
    monitor-exit v1

    .line 203
    throw p0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-static {p0, p1, v0}, La71;->m(La71;Ljava/lang/Runnable;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final g()I
    .locals 12

    .line 1
    iget-object v0, p0, La71;->i0:Lcf6;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, La71;->isTerminated()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    :try_start_1
    sget-object v1, La71;->j0:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    sget-object v2, Liu;->a:Lsun/misc/Unsafe;

    .line 16
    .line 17
    sget-wide v3, La71;->m0:J

    .line 18
    .line 19
    invoke-virtual {v2, p0, v3, v4}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    const-wide/32 v7, 0x1fffff

    .line 24
    .line 25
    .line 26
    and-long v9, v5, v7

    .line 27
    .line 28
    long-to-int v9, v9

    .line 29
    const-wide v10, 0x3ffffe00000L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v5, v10

    .line 35
    const/16 v10, 0x15

    .line 36
    .line 37
    shr-long/2addr v5, v10

    .line 38
    long-to-int v5, v5

    .line 39
    sub-int v5, v9, v5

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    if-gez v5, :cond_1

    .line 43
    .line 44
    move v5, v6

    .line 45
    :cond_1
    iget v10, p0, La71;->X:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    if-lt v5, v10, :cond_2

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return v6

    .line 51
    :cond_2
    :try_start_2
    iget v10, p0, La71;->Y:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    if-lt v9, v10, :cond_3

    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return v6

    .line 57
    :cond_3
    :try_start_3
    invoke-virtual {v2, p0, v3, v4}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    and-long/2addr v2, v7

    .line 62
    long-to-int v2, v2

    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    if-lez v2, :cond_5

    .line 66
    .line 67
    iget-object v3, p0, La71;->i0:Lcf6;

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Lcf6;->b(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_5

    .line 74
    .line 75
    new-instance v3, Ly61;

    .line 76
    .line 77
    invoke-direct {v3, p0, v2}, Ly61;-><init>(La71;I)V

    .line 78
    .line 79
    .line 80
    iget-object v4, p0, La71;->i0:Lcf6;

    .line 81
    .line 82
    invoke-virtual {v4, v2, v3}, Lcf6;->c(ILy61;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    and-long v6, v9, v7

    .line 90
    .line 91
    long-to-int p0, v6

    .line 92
    if-ne v2, p0, :cond_4

    .line 93
    .line 94
    add-int/lit8 v5, v5, 0x1

    .line 95
    .line 96
    monitor-exit v0

    .line 97
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 98
    .line 99
    .line 100
    return v5

    .line 101
    :cond_4
    :try_start_4
    const-string p0, "Failed requirement."

    .line 102
    .line 103
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v1

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    goto :goto_0

    .line 111
    :cond_5
    const-string p0, "Failed requirement."

    .line 112
    .line 113
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 119
    :goto_0
    monitor-exit v0

    .line 120
    throw p0
.end method

.method public final isTerminated()Z
    .locals 3

    .line 1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, La71;->l0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final k(Ljava/lang/Runnable;ZZ)V
    .locals 7

    .line 1
    sget-object v0, Lh28;->f:Lqe4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    instance-of v2, p1, Lx18;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast p1, Lx18;

    .line 15
    .line 16
    iput-wide v0, p1, Lx18;->X:J

    .line 17
    .line 18
    iput-boolean p2, p1, Lx18;->Y:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v2, Lc28;

    .line 22
    .line 23
    invoke-direct {v2, p1, v0, v1, p2}, Lc28;-><init>(Ljava/lang/Runnable;JZ)V

    .line 24
    .line 25
    .line 26
    move-object p1, v2

    .line 27
    :goto_0
    iget-boolean p2, p1, Lx18;->Y:Z

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    sget-object v0, La71;->j0:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 32
    .line 33
    const-wide/32 v1, 0x200000

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-wide/16 v0, 0x0

    .line 42
    .line 43
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    instance-of v3, v2, Ly61;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    check-cast v2, Ly61;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v2, v4

    .line 56
    :goto_2
    if-eqz v2, :cond_3

    .line 57
    .line 58
    iget-object v3, v2, Ly61;->j0:La71;

    .line 59
    .line 60
    if-eq v3, p0, :cond_4

    .line 61
    .line 62
    :cond_3
    move-object v2, v4

    .line 63
    :cond_4
    if-nez v2, :cond_5

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    iget-object v3, v2, Ly61;->Z:Lz61;

    .line 67
    .line 68
    sget-object v5, Lz61;->g0:Lz61;

    .line 69
    .line 70
    if-ne v3, v5, :cond_6

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_6
    iget-boolean v5, p1, Lx18;->Y:Z

    .line 74
    .line 75
    if-nez v5, :cond_7

    .line 76
    .line 77
    sget-object v5, Lz61;->Y:Lz61;

    .line 78
    .line 79
    if-ne v3, v5, :cond_7

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    const/4 v3, 0x1

    .line 83
    iput-boolean v3, v2, Ly61;->i0:Z

    .line 84
    .line 85
    iget-object v2, v2, Ly61;->X:Lf49;

    .line 86
    .line 87
    if-eqz p3, :cond_8

    .line 88
    .line 89
    invoke-virtual {v2, p1}, Lf49;->a(Lx18;)Lx18;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto :goto_3

    .line 94
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object p3, Liu;->a:Lsun/misc/Unsafe;

    .line 98
    .line 99
    sget-wide v5, Lf49;->f:J

    .line 100
    .line 101
    invoke-virtual {p3, v2, v5, v6, p1}, Lsun/misc/Unsafe;->getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lx18;

    .line 106
    .line 107
    if-nez p1, :cond_9

    .line 108
    .line 109
    move-object p1, v4

    .line 110
    goto :goto_3

    .line 111
    :cond_9
    invoke-virtual {v2, p1}, Lf49;->a(Lx18;)Lx18;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :goto_3
    if-eqz p1, :cond_c

    .line 116
    .line 117
    iget-boolean p3, p1, Lx18;->Y:Z

    .line 118
    .line 119
    if-eqz p3, :cond_a

    .line 120
    .line 121
    iget-object p3, p0, La71;->h0:Lbs2;

    .line 122
    .line 123
    invoke-virtual {p3, p1}, Lxe4;->a(Ljava/lang/Runnable;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    goto :goto_4

    .line 128
    :cond_a
    iget-object p3, p0, La71;->g0:Lbs2;

    .line 129
    .line 130
    invoke-virtual {p3, p1}, Lxe4;->a(Ljava/lang/Runnable;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    :goto_4
    if-eqz p1, :cond_b

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_b
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    .line 138
    .line 139
    new-instance p2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    iget-object p0, p0, La71;->f0:Ljava/lang/String;

    .line 145
    .line 146
    const-string p3, " was terminated"

    .line 147
    .line 148
    invoke-static {p2, p0, p3}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-direct {p1, p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_c
    :goto_5
    if-eqz p2, :cond_f

    .line 157
    .line 158
    invoke-virtual {p0}, La71;->C()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_d

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_d
    invoke-virtual {p0, v0, v1}, La71;->u(J)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_e

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_e
    invoke-virtual {p0}, La71;->C()Z

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_f
    invoke-virtual {p0}, La71;->C()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_10

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_10
    sget-object p1, Liu;->a:Lsun/misc/Unsafe;

    .line 184
    .line 185
    sget-wide p2, La71;->m0:J

    .line 186
    .line 187
    invoke-virtual {p1, p0, p2, p3}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 188
    .line 189
    .line 190
    move-result-wide p1

    .line 191
    invoke-virtual {p0, p1, p2}, La71;->u(J)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_11

    .line 196
    .line 197
    :goto_6
    return-void

    .line 198
    :cond_11
    invoke-virtual {p0}, La71;->C()Z

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public final p(Ly61;II)V
    .locals 11

    .line 1
    :cond_0
    :goto_0
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, La71;->n0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v7

    .line 9
    const-wide/32 v0, 0x1fffff

    .line 10
    .line 11
    .line 12
    and-long/2addr v0, v7

    .line 13
    long-to-int v0, v0

    .line 14
    const-wide/32 v1, 0x200000

    .line 15
    .line 16
    .line 17
    add-long/2addr v1, v7

    .line 18
    const-wide/32 v3, -0x200000

    .line 19
    .line 20
    .line 21
    and-long/2addr v1, v3

    .line 22
    if-ne v0, p2, :cond_5

    .line 23
    .line 24
    if-nez p3, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1}, Ly61;->c()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_1
    sget-object v3, La71;->k0:Lz31;

    .line 31
    .line 32
    if-ne v0, v3, :cond_1

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    if-nez v0, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    check-cast v0, Ly61;

    .line 41
    .line 42
    invoke-virtual {v0}, Ly61;->b()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    move v0, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    invoke-virtual {v0}, Ly61;->c()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_1

    .line 55
    :cond_4
    move v0, p3

    .line 56
    :cond_5
    :goto_2
    if-ltz v0, :cond_0

    .line 57
    .line 58
    int-to-long v3, v0

    .line 59
    or-long v9, v1, v3

    .line 60
    .line 61
    sget-object v3, Liu;->a:Lsun/misc/Unsafe;

    .line 62
    .line 63
    sget-wide v5, La71;->n0:J

    .line 64
    .line 65
    move-object v4, p0

    .line 66
    invoke-virtual/range {v3 .. v10}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_6

    .line 71
    .line 72
    return-void

    .line 73
    :cond_6
    move-object p0, v4

    .line 74
    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La71;->i0:Lcf6;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcf6;->a()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    move v5, v3

    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    move v8, v7

    .line 18
    move v9, v4

    .line 19
    :goto_0
    if-ge v9, v2, :cond_8

    .line 20
    .line 21
    invoke-virtual {v1, v9}, Lcf6;->b(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    check-cast v10, Ly61;

    .line 26
    .line 27
    if-nez v10, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    iget-object v11, v10, Ly61;->X:Lf49;

    .line 32
    .line 33
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v12, Liu;->a:Lsun/misc/Unsafe;

    .line 37
    .line 38
    sget-wide v13, Lf49;->f:J

    .line 39
    .line 40
    invoke-virtual {v12, v11, v13, v14}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    invoke-virtual {v11}, Lf49;->b()I

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v12, :cond_1

    .line 49
    .line 50
    add-int/2addr v11, v4

    .line 51
    :cond_1
    iget-object v10, v10, Ly61;->Z:Lz61;

    .line 52
    .line 53
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_6

    .line 58
    .line 59
    if-eq v10, v4, :cond_5

    .line 60
    .line 61
    const/4 v12, 0x2

    .line 62
    if-eq v10, v12, :cond_4

    .line 63
    .line 64
    const/4 v12, 0x3

    .line 65
    if-eq v10, v12, :cond_3

    .line 66
    .line 67
    const/4 v11, 0x4

    .line 68
    if-ne v10, v11, :cond_2

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    return-object p0

    .line 78
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 79
    .line 80
    if-lez v11, :cond_7

    .line 81
    .line 82
    new-instance v10, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const/16 v11, 0x64

    .line 91
    .line 92
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    new-instance v10, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v11, 0x62

    .line 117
    .line 118
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    new-instance v10, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const/16 v11, 0x63

    .line 140
    .line 141
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_7
    :goto_1
    add-int/lit8 v9, v9, 0x1

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_8
    sget-object v1, Liu;->a:Lsun/misc/Unsafe;

    .line 156
    .line 157
    sget-wide v9, La71;->m0:J

    .line 158
    .line 159
    invoke-virtual {v1, p0, v9, v10}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v1

    .line 163
    new-instance v4, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    iget-object v9, p0, La71;->f0:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const/16 v9, 0x40

    .line 174
    .line 175
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-static {p0}, Lzc1;->L(Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v9, "[Pool Size {core = "

    .line 186
    .line 187
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    iget v9, p0, La71;->X:I

    .line 191
    .line 192
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v10, ", max = "

    .line 196
    .line 197
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v10, "}, Worker States {CPU = "

    .line 201
    .line 202
    const-string v11, ", blocking = "

    .line 203
    .line 204
    iget v12, p0, La71;->Y:I

    .line 205
    .line 206
    invoke-static {v4, v12, v10, v3, v11}, Loi0;->x(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const-string v3, ", parked = "

    .line 210
    .line 211
    const-string v10, ", dormant = "

    .line 212
    .line 213
    invoke-static {v4, v5, v3, v6, v10}, Loi0;->x(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string v3, ", terminated = "

    .line 217
    .line 218
    const-string v5, "}, running workers queues = "

    .line 219
    .line 220
    invoke-static {v4, v7, v3, v8, v5}, Loi0;->x(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v0, ", global CPU queue size = "

    .line 227
    .line 228
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, La71;->g0:Lbs2;

    .line 232
    .line 233
    invoke-virtual {v0}, Lxe4;->c()I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v0, ", global blocking queue size = "

    .line 241
    .line 242
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    iget-object p0, p0, La71;->h0:Lbs2;

    .line 246
    .line 247
    invoke-virtual {p0}, Lxe4;->c()I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string p0, ", Control State {created workers= "

    .line 255
    .line 256
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-wide/32 v5, 0x1fffff

    .line 260
    .line 261
    .line 262
    and-long/2addr v5, v1

    .line 263
    long-to-int p0, v5

    .line 264
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string p0, ", blocking tasks = "

    .line 268
    .line 269
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-wide v5, 0x3ffffe00000L

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    and-long/2addr v5, v1

    .line 278
    const/16 p0, 0x15

    .line 279
    .line 280
    shr-long/2addr v5, p0

    .line 281
    long-to-int p0, v5

    .line 282
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string p0, ", CPUs acquired = "

    .line 286
    .line 287
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-wide v5, 0x7ffffc0000000000L

    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    and-long v0, v1, v5

    .line 296
    .line 297
    const/16 p0, 0x2a

    .line 298
    .line 299
    shr-long/2addr v0, p0

    .line 300
    long-to-int p0, v0

    .line 301
    sub-int/2addr v9, p0

    .line 302
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string p0, "}]"

    .line 306
    .line 307
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0
.end method

.method public final u(J)Z
    .locals 3

    .line 1
    const-wide/32 v0, 0x1fffff

    .line 2
    .line 3
    .line 4
    and-long/2addr v0, p1

    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0x3ffffe00000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v1

    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    shr-long/2addr p1, v1

    .line 15
    long-to-int p1, p1

    .line 16
    sub-int/2addr v0, p1

    .line 17
    const/4 p1, 0x0

    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    move v0, p1

    .line 21
    :cond_0
    iget p2, p0, La71;->X:I

    .line 22
    .line 23
    if-ge v0, p2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, La71;->g()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    if-le p2, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, La71;->g()I

    .line 35
    .line 36
    .line 37
    :cond_1
    if-lez v0, :cond_2

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    return p1
.end method
