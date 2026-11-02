.class public final Lf92;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lje7;


# instance fields
.field public final X:Lg92;

.field public Y:J

.field public Z:Z


# direct methods
.method public constructor <init>(Lg92;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf92;->X:Lg92;

    .line 5
    .line 6
    iput-wide p2, p0, Lf92;->Y:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf92;->Z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lf92;->Z:Z

    .line 8
    .line 9
    iget-object p0, p0, Lf92;->X:Lg92;

    .line 10
    .line 11
    iget-object v0, p0, Lg92;->Z:Ljava/util/concurrent/locks/ReentrantLock;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget v1, p0, Lg92;->Y:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    iput v1, p0, Lg92;->Y:I

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    iget-boolean v1, p0, Lg92;->X:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lg92;->g()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 43
    .line 44
    .line 45
    throw p0
.end method

.method public final read(Li90;J)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-boolean v4, v0, Lf92;->Z:Z

    .line 11
    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    if-nez v4, :cond_6

    .line 15
    .line 16
    iget-wide v7, v0, Lf92;->Y:J

    .line 17
    .line 18
    cmp-long v4, v2, v5

    .line 19
    .line 20
    if-ltz v4, :cond_5

    .line 21
    .line 22
    add-long/2addr v2, v7

    .line 23
    move-wide v10, v7

    .line 24
    :goto_0
    cmp-long v4, v10, v2

    .line 25
    .line 26
    if-gez v4, :cond_2

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-virtual {v1, v4}, Li90;->u0(I)Lmz6;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v12, v4, Lmz6;->a:[B

    .line 34
    .line 35
    iget v13, v4, Lmz6;->c:I

    .line 36
    .line 37
    sub-long v14, v2, v10

    .line 38
    .line 39
    rsub-int v9, v13, 0x2000

    .line 40
    .line 41
    const-wide/16 p2, -0x1

    .line 42
    .line 43
    int-to-long v5, v9

    .line 44
    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    long-to-int v14, v5

    .line 49
    iget-object v9, v0, Lf92;->X:Lg92;

    .line 50
    .line 51
    invoke-virtual/range {v9 .. v14}, Lg92;->k(J[BII)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/4 v6, -0x1

    .line 56
    if-ne v5, v6, :cond_1

    .line 57
    .line 58
    iget v2, v4, Lmz6;->b:I

    .line 59
    .line 60
    iget v3, v4, Lmz6;->c:I

    .line 61
    .line 62
    if-ne v2, v3, :cond_0

    .line 63
    .line 64
    invoke-virtual {v4}, Lmz6;->a()Lmz6;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iput-object v2, v1, Li90;->X:Lmz6;

    .line 69
    .line 70
    invoke-static {v4}, Lpz6;->a(Lmz6;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    cmp-long v1, v7, v10

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    move-wide/from16 v10, p2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    iget v6, v4, Lmz6;->c:I

    .line 81
    .line 82
    add-int/2addr v6, v5

    .line 83
    iput v6, v4, Lmz6;->c:I

    .line 84
    .line 85
    int-to-long v4, v5

    .line 86
    add-long/2addr v10, v4

    .line 87
    iget-wide v12, v1, Li90;->Y:J

    .line 88
    .line 89
    add-long/2addr v12, v4

    .line 90
    iput-wide v12, v1, Li90;->Y:J

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    const-wide/16 p2, -0x1

    .line 94
    .line 95
    :cond_3
    sub-long/2addr v10, v7

    .line 96
    :goto_1
    cmp-long v1, v10, p2

    .line 97
    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    iget-wide v1, v0, Lf92;->Y:J

    .line 101
    .line 102
    add-long/2addr v1, v10

    .line 103
    iput-wide v1, v0, Lf92;->Y:J

    .line 104
    .line 105
    :cond_4
    return-wide v10

    .line 106
    :cond_5
    const-string v0, "byteCount < 0: "

    .line 107
    .line 108
    invoke-static {v2, v3, v0}, Lie2;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lem7;->c(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-wide v5

    .line 116
    :cond_6
    const-string v0, "closed"

    .line 117
    .line 118
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-wide v5
.end method

.method public final timeout()Lta8;
    .locals 0

    .line 1
    sget-object p0, Lta8;->NONE:Lta8;

    .line 2
    .line 3
    return-object p0
.end method
